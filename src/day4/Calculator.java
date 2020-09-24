package Day4;

public class Calculator {
    public static void main(String[] args) {
        addition1();
        int a = 100;
        int b = 200;
        addition2(a, b);
        int ergebniss = addition3(a, b);
        System.out.println(ergebniss);
        System.out.println(addition4(a, b));
    }

    private static int addition4(int a, int b) {
        return a + b;
    }

    private static int addition3(int a, int b) {
        int c = a + b;
        return c;
    }

    private static void addition2(int a, int b) {
        int result = a + b;
        System.out.println("результат работы метода - " + result);
    }

    private static void addition1() {
    }

    private static void addition() {
       // int a = a;
       // int b = b;
       // int c = a + b;
    }
}
