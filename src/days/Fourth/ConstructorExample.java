package days.Fourth;

public class ConstructorExample {
    public ConstructorExample() { //nieko negrazina ir gali kazka padaryti
      this(4);
    }
    public ConstructorExample (int a) {
        System.out.println(a);
        printData();

    }

    private void printData() {
        System.out.println("Sveiki");

    }
}
