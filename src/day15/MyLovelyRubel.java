package day15;

public class MyLovelyRubel {
    public static void main(String[] args) {
        SumInRub(1, 5);
        SumInRub(11, 35);

    }

    private static void SumInRub(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(i + "" + rightWordInrussian(i));
        }
    }

    private static String rightWordInrussian(int number) {
        String output = "";
        String input = String.valueOf(number);
        String lastsymbol = "" + input.charAt(input.length() - 1);
        int lastDigit = Integer.parseInt(lastsymbol);
        if (lastDigit == 1) {
            output = "рубль";
        } else if (lastDigit >= 5 || lastDigit == 0) {
            output = "рублей";
        } else {
            output = "рубля";

        }
        return output;
    }
}


