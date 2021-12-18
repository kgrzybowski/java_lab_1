import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */

        double liczbaA;
        double liczbaB;
        double liczbaC;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę:");
        liczbaA = scan.nextDouble();
        System.out.println("Podaj drugą liczbę:");
        liczbaB = scan.nextDouble();
        System.out.println("Podaj trzecia liczbę:");
        liczbaC = scan.nextDouble();

        System.out.println("A * B/C = " + liczbaA * liczbaB / liczbaC);
        System.out.println("(A + B)/C = " + (liczbaA + liczbaB) / liczbaC);
        System.out.println("(A - B)/C = " + (liczbaA - liczbaB) / liczbaC);
        System.out.println("3*A + B/C = " + 3*liczbaA + liczbaB / liczbaC);
        System.out.println("A + B + C = " + liczbaA + liczbaB + liczbaC);
        boolean result = liczbaA == liczbaB;
        System.out.println(result);
        System.out.println(liczbaA >= 0);
        System.out.println(liczbaB!= 10);

    }
}
