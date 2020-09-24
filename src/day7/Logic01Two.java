package day7;

public class Logic01Two {
    public static void main(String[] args) {
        System.out.println(doorBell(true, true)); //f
        System.out.println(doorBell(false, false)); //f
        System.out.println(doorBell(true, false));//t
        split();
        boolean electro = true;
        boolean internet = true;
        System.out.println(smartDoorCheckKey(true, true)); //f
        System.out.println(smartDoorCheckKey(true, false)); //f
        System.out.println(smartDoorCheckKey(false, true)); //f
        System.out.println(smartDoorCheckKey(false, false)); //t
    }

    private static boolean smartDoorCheckKey(boolean electro, boolean internet) {
        return electro || internet;
    }

    private static void split() {
        System.out.println("***********----------");
}

    private static boolean doorBell(boolean bellOne, boolean bellTwo) {
        return bellOne ^ bellTwo;
    }
}
