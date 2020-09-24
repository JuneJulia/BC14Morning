package day8;

public class HelloModulo {
    public static void main(String[] args) {
        System.out.println(56 / 24); // целая двойка
        System.out.println(56 % 24); // модуло - это остаток от деления
        // Например 7%3 = 1
        // 13%7 = 6
        int a = 5;
        int b = 3;
        a %= b;
        System.out.println(a);

    }
}
