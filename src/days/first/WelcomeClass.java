package days.first;

public class WelcomeClass {
    // psvm - sukuria main metoda
    //ctrl+alt+l - sulygiuoja
    public static void main(String[] args) {
        int a = 10; //zr 13 eil. atitinka iki lygybes, t.y. tipas+objektas ir priskiriama reiksme
        System.out.println(a);

        //kaip iskviesti statini metoda?
        minus(12, 6);
        //kaip iskviesti ne statini metoda?
        WelcomeClass welcomeClass = new WelcomeClass(); //sukuriamas objektas - tipas+objektas - sukuriamas naujas objektas
        welcomeClass.printName("Simona");

       System.out.println(minus(12,6));
       //arba
       int b=minus(12,6);
       System.out.println(b);

    }

    private void printName (String name) {
        //sout + tab sukuria System.out.println(name);
        System.out.println(name);
    }
    private static int minus (int numb1, int numb2) {
        return numb1 - numb2;
    }
}
