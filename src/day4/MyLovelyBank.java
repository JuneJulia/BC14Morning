package Day4;

public class MyLovelyBank {

    public static void main (String [] args) {
        // Если клиент положил в банк 1000 под 3,5%
        // Какая сумма будет его ждать через 7 лет?
        int customerYear = 15;
        bankAccount (1000, 7, 3.5);
}

private static void bankAccount (double money, int year, double interest){
    double result = interest * year * money / 100 + money;
    System.out.println("Сумма в конце вклада" + result);
        // 1000 евро
        // 7 лет
        // 3.5% вклад

    }
}
