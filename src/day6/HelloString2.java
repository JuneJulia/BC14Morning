package day6;

public class HelloString2 {
    public static void main(String[] args) {
        String poema = "Я памятник-себе воздвиг нерукотворный";
        int dlina = poema.length(); // расчитать длину текста "String poema"
        System.out.println(dlina);
        String preview = poema.substring(0, 10); // показать длину текста с 0 до 10 символов
        System.out.println(preview + "...");
        String endPoema = poema.substring(dlina - 10); // показать 10 последних символов
        System.out.println(endPoema);
        char test = poema.charAt(0);
        System.out.println(test);
        char test2 = poema.charAt(dlina-1);
        System.out.println(test2);
    }
}
