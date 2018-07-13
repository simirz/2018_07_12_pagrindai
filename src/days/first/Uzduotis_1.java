package days.first;

import java.util.Scanner;

public class Uzduotis_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Iveskite zodi");
        String word = scanner.nextLine();
        System.out.println(word);*/
        getCorrectWord(scanner);
    }

    private static void getCorrectWord(Scanner sc) {
        String word;
        do {
            System.out.println("Iveskite zodi");
            word = sc.nextLine().toLowerCase(); //gali buti ir toUpperCase
            //to do cia
            printWord(word);
        } while (!word.equals("pabaiga"));
    }

    private static void printWord(String word) {
        int count = countLetters(word, 'a');
        if (word.length() % 2 == 0) {
            System.out.println("Ivestas zodis - " + word + " - yra lyginis, jo ilgis yra "
                    + word.length() + " simboliai " + "a raidziu yra " + count);
        } else {
            System.out.println("Ivestas zodis yra - " + word + " - yra nelyginis, jo ilgis yra "
                    + word.length() + " simboliai "+ "a raidziu yra " + count);
        }
    }

    private static int countLetters(String word, char letter) {
        //word.charAt(0)
        int result = 0;
        for (int i = 0; i < word.length(); i++) {

            char temp = word.charAt(i);
            if (letter == temp) {
                result++;
            }
        }
        return result;
    }
}

