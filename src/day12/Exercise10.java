package day12;

public class Exercise10 {
    public static void main(String[] args) {
      /*  System.out.println(diff21(19));// → 2
        System.out.println(diff21(10));// → 11
        System.out.println(diff21(21));// → 0
        System.out.println(diff21(25)); // */

        System.out.println(nearHundred(93));// → true
        System.out.println(nearHundred(90));// → true
        System.out.println(nearHundred(89));// → false

    }

    private static boolean nearHundred(int n) {
        return (Math.abs(n-100)<=10 || Math.abs(n-200)<=10);
    }

    private static int diff21(int n) {
        if (n > 21) {
            return 2 * (n - 21);
        } else {
            return 21 - n;
        }
    }
}
