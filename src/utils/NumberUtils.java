package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberUtils {
    public static double getCorrectNumber(Scanner sc, String message) {
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
