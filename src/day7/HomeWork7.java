package day7;

public class HomeWork7 {
    public static void main(String[] args) {
        System.out.println(love6(6, 4)); //true
        System.out.println(love6(4, 5)); // false
        System.out.println(love6(1, 5)); // true

    }
    // true if c == a|b;
    // true if c == a+b;
    // true if c == (a-b) || (b-a);

    private static boolean love6(int a, int b) {
        boolean result = (a == 6) || (b == 6) || (a + b == 6) || (Math.abs(a - b)== 6);
        return result;

        // Логику, кажется, понимаю, а написать уравнение не могу -
        // явно не понимаю, где какое действие уместно применить.
        // Не разобралась, как и зачем использовать в задаче Math.abs(num) U+1F926
    }
}
