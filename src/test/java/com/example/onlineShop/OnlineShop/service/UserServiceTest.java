package com.example.onlineShop.OnlineShop.service;

import com.example.onlineShop.OnlineShop.dto.UserDto;
import com.example.onlineShop.OnlineShop.mapper.UserMapper;
import com.example.onlineShop.OnlineShop.models.User;
import com.example.onlineShop.OnlineShop.repository.UserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mapstruct.control.MappingControl;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.print.attribute.standard.Destination;

import java.util.Optional;

import static org.mockito.Mockito.verify;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    UserRepository userRepository;

    @Mock
    UserMapper userMapper;

    @InjectMocks
    UserService userService;

    @Test
    @DisplayName("User is not created because it has not the correct type.")
    void create_when_fail() {

        UserDto userDto = new UserDto();
        userDto.setUsertype("bla");
        RuntimeException runtimeException=assertThrows(RuntimeException.class,
                () -> userService.create(userDto));

        assertEquals("Usertype must be admin or client.", runtimeException.getMessage());
    }

    @Test
    @DisplayName("User is created successfully.")
    void create() {
        UserDto userDto = new UserDto();
        userDto.setName("malina");
        userDto.setSurname("ana");
        userDto.setEmail("test@gmail.com");
        userDto.setUsertype("client");
        userDto.setId(1L);

        User user = new User();
        user.setName("malina");
        user.setSurname("ana");
        user.setEmail("test@gmail.com");
        user.setUsertype("client");
        user.setId(1L);

        User savedUser = userMapper.mapToEntity(userDto);

        when(userMapper.mapToEntity(userDto)).thenReturn(user);
        when(userRepository.save(user)).thenReturn(savedUser);
        when(userMapper.mapToDto(savedUser)).thenReturn(userDto);

        UserDto result = userService.create(userDto);

        //Assert
        assertThat(result).isNotNull();
        verify(userMapper, times(1)).mapToEntity(userDto);
//        verify(userMapper, times(1)).mapToDto(savedUser);
//        verify(userRepository, times(1)).save(user);

        verifyNoMoreInteractions(userMapper, userRepository);
    }

    @Test
    @DisplayName("Get all users")
    void getAll() {
        userRepository.getAll();
    }

    @Test
    void editUserTypeSuccess() {
        String email = "maria@gmail.com";
        String type = "admin";
//        User user = new User();
//        when(userRepository.editType(email, type)).thenReturn(Optional.of(user))
    }

    @Test
    void editUserTypeFails() {
        String email = "doesn't exist";
        String type = "type";

        when(userRepository.emailExists(email)).thenReturn(false);

        //Act
        RuntimeException exception = assertThrows(RuntimeException.class,
                () -> userService.editUserType(email, type));

        assertEquals("This email doesn't exists", exception.getMessage());
    }

    @Test
    void getIdUser() {

    }
}