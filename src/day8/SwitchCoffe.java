package day8;

public class SwitchCoffe {
    public static void main(String[] args) {
        int button = 5; // номер кнопки в вендингмашине
        vendingMachine(button);
    }

    public static void coffeeWithMilk() {
        System.out.println("Вода кипятится");
        System.out.println("Кофе мелется");
        System.out.println("Сливки добавляются");

    }

    private static void vendingMachine(int customerChoose) {
        switch (customerChoose) {
            case 1:
                System.out.println("Coffe Americano is being prepared");
                break;
            case 2:
                System.out.println("boiling water is being prepared");
                break;
            case 3:
                System.out.println("Coffe with milk is being prepared");
                break;
            case 4:
                System.out.println("Cacao is being prepared");
                break;
            case 5:
                System.out.println("the water is boiling");
                System.out.println("coffee is ground");
                System.out.println("cream is added");
                break;
            default:
                System.out.println(
                        "please repeat your choice," +
                                "drink under the number" + customerChoose
                                + "is temporarily unavailable"
                );
                break;
        }
        System.out.println("the program run without errors");
    }
}
