package day12.hw11;

public class HomeWork11_14 {
    public static void main(String[] args) {
        // Возвращает true, если number кратно 3 или 5, но не обоим.
        // использовать оператор % "mod"
        System.out.println(old35(3)); // true
        System.out.println(old35(10)); // true
        System.out.println(old35(15)); // false
    }

    private static boolean old35(int a) {
        return a % 3 == 0 ^ a % 5 == 0;
    }
}