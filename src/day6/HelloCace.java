package day6;

import java.util.Locale;

public class HelloCace {
    public static void main(String[] args) {
        String phrase1 = "london is the capital of great britain";
        System.out.println(phrase1);
        String phrase2 =phrase1.toUpperCase();
        System.out.println(phrase2);
        String phrase3 = phrase1.substring(0,1).toUpperCase() //возьми L и сделай ее заглавнной
                + phrase1.substring(1).toLowerCase();
        System.out.println(phrase3);
    }
    private static void anotherHello(){
        System.out.println("andrej".toUpperCase()); // неправильно
        String teacher = "Андрей"; // корректное записание задачи
        System.out.println(teacher.toUpperCase());
    }

    }
