package Day4;

public class MyLovelyString {
    public static void main(String[] args) {
        String myFirstString = "Это мое первое предолжение";
        System.out.println(myFirstString);
        String s1 = "";
        String s2 = " ";

        String result =
                "Мое второе предложение"
                        + myFirstString +
                        "Мое третье предложение"
                        + s2;
        System.out.println(result);
    }
}
