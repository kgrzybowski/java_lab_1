import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */


        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj imię: ");
        String imie = scan.next();
        System.out.print("Podaj nazwisko: ");
        String nazwisko = scan.next();
        System.out.print("Wiek: ");
        int wiek = scan.nextInt();
        System.out.print("Nr albumu: ");
        int nrAlbumu = scan.nextInt();

        System.out.println("Twoje imię i nazwisko to: "+ imie + " " + nazwisko + " "+ ", a wiek : " + wiek + " " + "nr albumu : " + nrAlbumu);
        System.out.printf("Twoje imię i nazwisko to: %s %s a wiek i numer indeksu %d %d \n", imie, nazwisko, wiek, nrAlbumu);

        int liczbaA = 10, liczbaB = 2;
        int dodawanie = liczbaA + liczbaB;
        int odejmowanie = liczbaA - liczbaB;
        int mnozenie = liczbaA * liczbaB;
        int dzielenie = liczbaA / liczbaB;
        int modulo = liczbaA % liczbaB;

        System.out.println("dodawanie liczby A i B wynosi " + dodawanie);
        System.out.println("odejmowanie liczby A i B wynosi " + odejmowanie);
        System.out.println("mnożenie liczby A i B wynosi " + mnozenie);
        System.out.println("dzielenie liczby A i B wynosi " + dzielenie);
        System.out.println("reszta z liczby A i B wynosi " + modulo);





    }
}
