/* package day15;

public class CheckPalindrom {
    public static void main(String[] args) {
        /*Написать свой метод проверки строки на палиндром.
Учесть, что палиндром может быть предложением с пробелами.
При решении задачи используйте цикл.
Нельзя использовать методы replace(), reverse() и конструкции, которые вы не учили *//*

        System.out.println(checkPalindrom("А роза упала на лапу Азора")); // -> true
        System.out.println(checkPalindrom("поп"));// -> true
        System.out.println(checkPalindrom("школа")); // -> false
    }


    private static boolean checkPalindrom(String str) {
        String strReverce = "";
        for (int i = str.length()-1; i >= 0; i++) {
            strReverce += str.substring(i);
        }
        for (int i = 0; i < str.length(); i++) {
            String strRevers;
            String strReverse;
            if (strReverse.charAt(i)!=str.charAt(i)) {
                
            }

        }
        return false;
    }
    }
*/
