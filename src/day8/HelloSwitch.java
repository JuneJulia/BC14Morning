package day8;

public class HelloSwitch {
    public static void main(String[] args) {
        int schoolNote = 2;
        System.out.println(schoolNote);
        System.out.println(bonus(schoolNote));
    }

    private static String bonus(int note) {
        String output = "";

        switch (note) {
            case 5:
                output = "Bicycle";
                break;
            case 4:
                output = "GoPro7";
                break;
            case 3:
                output = "No reward";
                break;
            case 2:
                output = "Bad mood";
                break;
            case 1:
                output = "Don'tAskMe";
                break;
            default:
                output = "not existing";
                break;
        }
        return output;
    }
}
