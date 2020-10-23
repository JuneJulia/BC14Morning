package day14;

public class HomeWork14 {
    public static void main(String[] args) {
        chessboard(8, 8);

        triangle (10);

    }

    private static void triangle(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println("Triangle");
    }




    private static void chessboard(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("*");
                else
                    System.out.print("_");
            }
            System.out.println("Chessboard"); //как сделать, чтобы "Chessboard"
            // шел отдельной строкой начале вывода?
        }

    }
}
