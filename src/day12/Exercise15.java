package day12;

public class Exercise15 {
    public static void main(String[] args) {
        // System.out.println(teenSum(3, 4)); // 7
        // System.out.println(teenSum(10, 13)); // 19
        // System.out.println(teenSum(13, 2)); // 19

        // System.out.println(fizzString("fig")); // → "Fizz"
        // System.out.println(fizzString("dib")); // → "Buzz"
        // System.out.println(fizzString("fib"));// → "FizzBuzz"

        System.out.println(inOrder(1, 2, 4, false));// → true
        System.out.println(inOrder(1, 2, 1, false));// → false
        System.out.println(inOrder(1, 1, 2, true));// → true
    }

    private static boolean inOrder(int a, int b, int c, boolean bOK) {
        //return bOK && c > b || b > a && c > b;
        if (b > a && c > b) {
            return true;
        } else if (bOK && b<=a) {
            return true;
        }
        return false;
    }

    private static String fizzString(String str) {
        if (str.startsWith("f") && str.endsWith("b")) {
            return "FizzBuzz";
        } else if (str.startsWith("f")) {
            return "Fizz";
        } else if (str.endsWith("b")) {
            return "Buzz";
        } else {
            return str;
        }

    }

    private static int teenSum(int a, int b) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        } else {
            return a + b;
        }
    }
}
