//package day17;
//
//public class Exercise14_4 {
//    public static void main(String[] args) {
//        System.out.println(repeatEnd("Hello", 3)); // → "llollollo"
//        System.out.println(repeatEnd("Hello", 2)); // → "lolo"
//        System.out.println(repeatEnd("Hello", 1)); // → "o"
//    }
//
//    private static String repeatEnd(String message, int n) {
//        String output = "";
//        for (int j = 0; j < n; j++) {
//            output += output.substring(message.length() - n);
//
//        }
//        return output;
//    }
//}
