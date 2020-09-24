package day7;

public class Logic01My {
    public static void main(String[] args) {
        System.out.println(smartDepositBox(true, false)); //true
        System.out.println(smartDepositBox(false, true)); // true
        System.out.println(smartDepositBox(false, false)); // false
        split();
        System.out.println(smartDepositBoxVersionTwo(true, false)); //f
        System.out.println(smartDepositBoxVersionTwo(false, true));//f
        System.out.println(smartDepositBoxVersionTwo(false, false)); //f
        System.out.println(smartDepositBoxVersionTwo(true, true)); //t
        split();
        boolean mamaPermission = true;
        boolean papaPermission = true;
        boolean omaPermission = false;
        System.out.println(verySmartDepositBoxVersionThree(mamaPermission, papaPermission, omaPermission));
        split();
        bigBadaBoom(true, true); // -> true
        bigBadaBoom(false, false); //-> false
        bigBadaBoom(true, false); //-> false

    }

    private static boolean bigBadaBoom(boolean b, boolean b1) {
        return b & b1;
    }

    private static boolean verySmartDepositBoxVersionThree(boolean mamaPermission, boolean papaPermission, boolean omaPermission) {
        // return mamaPermission && papaPermission || omaPermission;
        return omaPermission || smartDepositBoxVersionTwo(mamaPermission, papaPermission);
    }

    private static void split() {
        System.out.println("-----------------");
    }

    private static boolean smartDepositBoxVersionTwo(boolean b, boolean b1) {
        return b & b1;

    }

    private static boolean smartDepositBox(boolean b1, boolean b2) {
        boolean c = b1 || b2;
        return c;
    }

}
