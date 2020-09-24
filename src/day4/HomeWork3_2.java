package Day4;

public class HomeWork3_2 {
    public static void main(String[] args) {
        double belarus = 207_595;
        double ukraine = 603_628;
        rate(belarus, ukraine);
        double moskow = 2511;
        double berlin = 891;
        rate(moskow, berlin);
    }

    private static void rate(double s1, double s2) {
        System.out.println("Соотношение площадей = " + s1 / s2);
    }

}
