import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double pear = 2.14;
        double apple = 3.67;
        double tomato = 1.11;
        double banana = 0.95;
        double eggplant = 5;
        double result;

        double pearKg, appleKg, tomatoKg, bananaKg, eggplantKg;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? ");
        pearKg = input.nextDouble();

        System.out.print("Elma Kaç Kilo ? ");
        appleKg = input.nextDouble();

        System.out.print("Domates Kaç Kilo ? ");
        tomatoKg = input.nextDouble();

        System.out.print("Muz Kaç Kilo ? ");
        bananaKg = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? ");
        eggplantKg = input.nextDouble();

        result = (pear * pearKg) + (apple * appleKg) + (tomato * tomatoKg) + (banana * bananaKg) + (eggplant * eggplantKg);

        System.out.println("Toplam Tutar : " + result + " TL");
    }
}
