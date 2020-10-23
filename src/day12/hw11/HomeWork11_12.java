package day12.hw11;

public class HomeWork11_12 {

    public static void main(String[] args) {
        // вернуть сумму a и b, исключая случай когда сума от 10 до 19 включительно,
        // тогда вернуть 20.
        System.out.println(sortaSum(3, 4)); // ожидаем 7
        System.out.println(sortaSum(9, 4)); // ожидаем 20
        System.out.println(sortaSum(10, 11)); // ожидаем 21

    }

    private static int sortaSum(int a, int b) {
        int mySym = a + b;
        if (a + b < 10 || a + b > 20){
            return mySym;
        }
        return 20;
    }
}
