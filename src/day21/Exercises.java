package day21;

public class Exercises {
    public static void main(String[] args) {
        // Даны два целых числа,
        // создайте массив с чётными числами в этом диапазоне.
        // создайте массив с простыми числами в этом диапазоне.
        int a = 30;
        int b = 50;
        int[] arr = createEvenArray(a, b);
    }

    private static int[] createEvenArray(int a, int b) {
        // int size = ((b - a) % 2 == 0) ? ((b - a) / 2) : ((b - a + 1) / 2);
        int size = 0;
        if ((b - a) % 2 == 0) {

        }
        System.out.println("Размер массива: " + size);
        int[] output = new int[size];
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) ;
            output[count] = i;
            count++;

        }
        return output;


    }
}


