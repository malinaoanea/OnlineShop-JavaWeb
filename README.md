# Online shop
## Magazin online de postere

Aplicatia isi propune implementarea unui magazin online de postere si fotografii. Vor fi disponibile doua tipuri de utilizatori: administrator si client. Administratorul va adauga produse, imagini etc, iar clientii vor cumpara, salva item-uri.

Prin urmare, aplicatia se va utiliza pe baza de autentificare.

## Administrator

- adauga/sterge/editeaza produse
- introduce numarul de produse disponibile pentru fiecare item
- poate gestiona si monitoriza toate comenzile
- primeste notificari ce identifica produsele cele mai cautate de clienti
- poate sterge recenziile clientilor

## Client

- isi poate schimba parola in cazul in care a uitat-o
- salva/sterge produse favorite
- primeste notificari in cazul in care un produs favorit risca a ramane out of stock
- adauga in cosul de cumparaturi
- lasa recenzii pentru fiecare produs
- verifica statusul comenzii


## Modul de functionare al aplicatiei

Initial se vor implementa cele doua tipuri de utilizator. Administratorul se va autentifica ca orice alt utilizator, insa aceasta va dispune de mai multe features (cele descrise mai sus).

Un client va putea plasa o comanda chiar daca nu are cont in aplicatie, insa nu va putea salva produse favorite sau primi notificari, avand un cont de tip guest.

Utilizatorii pot salva sau adauga un numar nelimitat de produse in cos. Odata ce comanda este plasata, statusul acesteia va putea fi urmarit de client. Statusul comenzii este modificat de administrator. Din momentul in care statusul unei comenzi este `finalizata`, utilizatorii au dreptul de a lasa recenzii asupra oricarui produs din cadrul acesteia. In aceeasi ordine de idei, administratorul poate sterge orice recenzie facuta de clienti.

In momentul in care un produs salvat de un client va fi disponibil intr-un numar mai mic de 3 bucati, clientul va primi o notificare(mail). De asemena, un client ce si-a uitat parola o poate modifica oricand.

Administratorul dispune de un tab in care se pot monitoriza toate comenzile. De aici statusul acestora poate fi modificat. Mai mult, se va afisa un dashboard cu produsele favorite de clienti si produsele cautate de catre acestia, desi nu mai sunt in stoc.

In cazul in care un produs favorita devine out of stock, clientii pot cere readaugarea acestuia, adminitratorul primind o notificare.
