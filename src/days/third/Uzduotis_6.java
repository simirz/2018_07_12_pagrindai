package days.third;

import days.second.Uzduotis_2;
import utils.NumberUtils;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Uzduotis_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Iveskite du skaicius ir veiksma tarp ju, pvz.: '20 + 20' ");
        String line = scanner.nextLine();
        //"20 + 20" <- suskaidomas i masyva susidedanti is triju elementu;
        //2 ^ 3-iuoju laipsniu pakelta
        String[] items = line.split(" ");
        if (items.length == 3) {

            // double numb = Double.parseDouble(items[0]);<- iki klaidu gaudymo
            double numb = getNumber(scanner, items[0], "Pakartokite pirmo skaiciaus ivedima");
            //  double numb2 = Double.parseDouble(items[2]); <- iki klaidu gaudymo
            double numb2 = getNumber(scanner, items[2], "Pakartokite antro skaiciaus ivedima");
            Calculator calculator = new Calculator();

            switch (items[1]) {
                case "+":
                    double result = calculator.sum(numb, numb2);
                    System.out.println("Suma " + result);
                    break;
                case "-":
                    double result2 = calculator.substraction(numb, numb2);
                    System.out.println("Skirtumas " + result2);
                    break;
                case "/":
                    double result3 = calculator.division(numb, numb2);
                    System.out.println("Dalyba " + result3);
                    break;

                case "*":
                    double result4 = calculator.multiplication(numb, numb2);
                    System.out.println("Daugyba " + result4);
                    break;
                case "^":
                    double result5 = calculator.pow(numb, numb2);
                    System.out.println("KelimasLaipsniu " + result5);
                    break;
                default:
                    System.out.println("Nepavyko rasti");
                    break;
            }
        } else {
            System.out.println("Blogas formatas");
        }
    }

    public static double getNumber(Scanner scanner, String numb, String message) {
        double result;
        try {
            result = Double.parseDouble(numb);
        } catch (NumberFormatException e) {
            result = NumberUtils.getCorrectNumber(scanner, message);
        }
        return result;

    }
}
