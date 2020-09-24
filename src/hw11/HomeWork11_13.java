package hw11;

public class HomeWork11_13 {
    public class HomeWork11_13 {
        public static void main(String[] args) {
            // true, если a  в диапазоне 1...10 включительно.
            // Если вне режима верно, возвращаем true, если a<=1 || a>= 10.
            System.out.println(in1To10(5, false)); // true
            System.out.println(in1To10(11, false)); //false
            System.out.println(in1To10(11, true)); //true
        }

        private static boolean in1To10(int a, boolean b) {
            if (a <= 10 && a >= 1){
                return true;
            }
            if (b = true && a <= 1 || a >= 10) {
                return true;
                // не знаю, как правильно записать,
                // что должны быть учтены вторые условия
            }
        }
    }


