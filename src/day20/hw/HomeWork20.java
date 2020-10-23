package day20.hw;

public class HomeWork20 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = getSum(array); // вариации get: give, find, tell
        System.out.println();
        int min = getMin(array);
        int max = getMeMax(array);
        double average = getMeAverage(array);
    }

    private static double getMeAverage(int[] input) {
        return (double) getSum(input)/ input.length;
    }

    private static int getMeMax(int[] array) {
        int max = Integer.MIN_VALUE;
        max = array[0];
        // min = 0; это математическая ошибка!
        for (int i = 0; i < array.length; i++) {
            // min = Math.min(min, array[i]); - правильно, но эту формулу еще не учили
            max = (max > array[i]) ? max : array[i];
        }
        return max;
    }

    private static int getMin(int[] array) {
        int min = Integer.MIN_VALUE;
        min = array[0];
        // min = 0; это математическая ошибка!
        for (int i = 0; i < array.length; i++) {
            // min = Math.min(min, array[i]); - правильно, но эту формулу еще не учили
            min = (min < array[i]) ? min : array[i];
        }
        return min;
    }

    private static int getSum(int[] array) {
        return (array[0] + array[array.length - 1]) * array.length / 2;
    }
}
