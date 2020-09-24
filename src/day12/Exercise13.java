package day12;

public class Exercise13 {
    public static void main(String[] args) {
        // System.out.println(theEnd("Hello", true));// → "H"
        // System.out.println(theEnd("Hello", false));// → "o"
        // System.out.println(theEnd("oh", true));// → "o"

        // System.out.println(endsLy("oddly")); // → true
        // System.out.println(endsLy("y")); // → false
        // System.out.println(endsLy("oddy")); // → false

        // System.out.println(lastChars("last", "chars"));// → "ls"
        // System.out.println(lastChars("yo", "java"));// → "ya"
        // System.out.println(lastChars("hi", ""));// → "h@"

        //System.out.println(seeColor("redxx")); // → "red"
        //System.out.println(seeColor("xxred"));// → ""
        //System.out.println(seeColor("blueTimes"));// → "blue"

        // System.out.println(extraFront("Hello")); // → "HeHeHe"
        // System.out.println(extraFront("ab")); // → "ababab"
        // System.out.println(extraFront("H")); // → "HHH"

        /* System.out.println(startWord("hippo", "hi")); // → "hi"
        System.out.println(startWord("hippo", "xip"));// → "hip"
        System.out.println(startWord("hippo", "i"));// → "h" */

        /*System.out.println(extraEnd("Hello")); // → "lololo"
        System.out.println(extraEnd("ab")); // → "ababab"
        System.out.println(extraEnd("Hi"));// → "HiHiHi"*/

        /* System.out.println(withoutEnd("Hello")); // → "ell"
        System.out.println(withoutEnd("java"));// → "av"
        System.out.println(withoutEnd("coding"));// → "odin" */

        System.out.println(left2("Hello"));// → "lloHe"
        System.out.println(left2("java"));// → "vaja"
        System.out.println(left2("Hi"));// → "Hi"

    }

    private static String left2(String str) {
        return str.substring(2)+str.substring(0,2);
    }

    private static String withoutEnd(String str) {
        return str.substring(1,str.length()-1);
    }

    private static String extraEnd(String str) {
        String temp = str.substring(str.length() - 2);
        return temp + temp + temp;
    }

    private static String startWord(String str, String word) {
       /* if (str.startsWith(word)) {
          return word; */
        if (str.substring(1).startsWith(word.substring(1))) {
            return str.substring(0, 1) + word.substring(1);
        } else {
            return str.substring(0, 1);
        }
    }

    private static String extraFront(String str) {
        if (str.length() < 2) {
            return str + str + str;
        } else {
            return str.substring(0, 2);
        }

    }

    private static String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.substring(0, 4).equals("blue")) {
            return "blue";
        } else {
            return "";
        }
    }

    private static String lastChars(String a, String b) {
        if (a.length() == 0) {
            a = "@";
        }
        if (b.length() == 0) {
            b = "@";
        }
        return a.substring(0, 1) + b.substring(b.length() - 1);
    }

    private static boolean endsLy(String str) {
        return str.endsWith("ly");
    }


    private static String theEnd(String str, boolean b) {
        if (b) {
            return str.substring(str.length() - 1);
        } else {
            return str.substring(0, 1);
        }
    }
}
