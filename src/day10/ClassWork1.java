package day10;

public class ClassWork1 {
    //11-exercises-java-logic-01
    public static void main(String[] args) {
        System.out.println(more20(20)); //→ false
        System.out.println(more20(21)); //→ true
        System.out.println(more20(22)); //→ true

    }

    private static boolean more20(int number) {
        return (number % 20) == 1 || (number % 20) == 2;
    }
}
