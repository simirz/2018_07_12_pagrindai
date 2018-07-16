package days.third;

import utils.NumberUtils;

import java.util.Scanner;

public class Uzduotis_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double km = NumberUtils.getCorrectNumber(scanner, "Iveskite nuvaziuotus kilometrus");
        double sanaudos = NumberUtils.getCorrectNumber(scanner, "Iveskite kuro sanaudas nuvaziuotam atstumui");
        double result = countVidurkis(km, sanaudos);
        System.out.println("Kuro sanaudos yra: " + result);
    }

    private static double countVidurkis(double km, double sanaudos) {
      //Formulė vidurkis = (kuro sąnaudos *100)/ nuvažiuoto atstumo.
        return (sanaudos*100)/km;
    }
}
