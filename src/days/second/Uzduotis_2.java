package days.second;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
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
        //  iki klaidu gaudymo: System.out.println("Iveskite a statini");
        //  iki klaidu gaudymo: double a = scanner.nextDouble();
        double a = getCorrectNumber(scanner, "Iveskite a statini");
        // iki klaidu gaudymo: System.out.println("Iveskite b statini");
        //  iki klaidu gaudymo:double b = scanner.nextDouble();
        double b = getCorrectNumber(scanner, "Iveskite b krastine");
        return (a * b) / 2;
    }

    private double staciakampioPlotas(Scanner scanner) {
        double a = getCorrectNumber(scanner, "Iveskite a krastine");
        double b = getCorrectNumber(scanner, "Iveskite b krastine");
        return (a * b);
    }

    private double kvadratoPlotas(Scanner scanner) {
        double a = getCorrectNumber(scanner, "Iveskite a krastine");
        double b = getCorrectNumber(scanner, "Iveskite b krastine");
        return Math.pow(a, b);
    }

    private double apskritimoPlotas(Scanner scanner) {
        double a = getCorrectNumber(scanner, "Iveskite spinduli");
        return Math.PI * Math.pow(a, 2);
    }

    private double getCorrectNumber(Scanner sc, String message) {
        double result;
        while (true) {
            System.out.println(message);
            try {
                result = sc.nextDouble();
                break;
            } catch (InputMismatchException e) { //e nes exception
                System.out.println("Nepavyko, kartok dar karta");
                sc.nextLine();
            }
        }
        return result;
    }
}