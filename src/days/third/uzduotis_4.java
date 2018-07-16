package days.third;

import utils.NumberUtils;

import java.util.Scanner;

public class uzduotis_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double height = NumberUtils.getCorrectNumber(scanner, "Iveskite savo ugi");
        double weight = NumberUtils.getCorrectNumber(scanner, "Iveskite savo svori");
        double result = countKmi(height, weight);
        System.out.println("Jusu KMI yra: " + result);
    }

    private static double countKmi(double height, double weight) {
        return weight / Math.pow(height, 2);
    }
}
