package days.second;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Uzduotis_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Uzduotis_2 uzduotis_2 = new Uzduotis_2(); //sukurtas objektas


        System.out.println("pasirinkite figura\na-statusis trikampis\nb-staciakampis\nc-kvadratas\nd-apskritimas");
        String selection = scanner.nextLine();

        switch (selection) {
            case "a":
                System.out.println(uzduotis_2.trikampioPlotas(scanner));
                break;
            case "b":
                System.out.println(uzduotis_2.staciakampioPlotas(scanner));
                break;
            case "c":
                System.out.println(uzduotis_2.kvadratoPlotas(scanner));
                break;
            case "d":
                System.out.println(uzduotis_2.apskritimoPlotas(scanner));
                break;
            default:
                System.out.println("Ka tu nematai, kas pateikta?");
                break;
        }

    }

    private double trikampioPlotas(Scanner scanner) {
        System.out.println("Iveskite a statini");
        double a = scanner.nextDouble();
        System.out.println("Iveskite b statini");
        double b = scanner.nextDouble();
        return (a * b) / 2;
    }

    private double staciakampioPlotas(Scanner scanner) {
        System.out.println("Iveskite a krastine");
        double a = scanner.nextDouble();
        System.out.println("Iveskite b krastine");
        double b = scanner.nextDouble();
        return (a * b);
    }

    private double kvadratoPlotas(Scanner scanner) {
        System.out.println("Iveskite a krastine");
        double a = scanner.nextDouble();
        System.out.println("Iveskite b krastine");
        double b = scanner.nextDouble();
        return Math.pow(a, b);
    }

    private double apskritimoPlotas(Scanner scanner) {
        System.out.println("Iveskite a krastine");
        double a = scanner.nextDouble();
        return Math.PI * Math.pow(a, 2);
    }
}