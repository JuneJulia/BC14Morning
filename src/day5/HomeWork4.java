package day5;

public class HomeWork4 {
    public static void main(String[] args) {
        String nameAndProfession = "Name + Profession";
        System.out.println(nameAndProfession);
        String s1 = "Печкин";
        String s2 = ", почтальон";
        System.out.println(s1 + s2);
    }

    //public static void postmanPersonalData (???) {

        String personalData = "Данные почтальона Печкина";
        //System.out.println(personalData);

        String s1 = "Имя: Василий";
        String s2 = "Фамилия: Печкин";
        String s3 = "Возраст: 60 лет";
        String s4 = "Профессия: почтальон";
        String s5 = "Адрес: Streetул. Молочная, 12";
        String s6 = "Населенный пункт: с.Простоквашино, Тонкинсий р-н, Hижегородская обл.";
        String s7 = "Почтовый индекс: 606973";
        String s8 = "Страна: Россия";

        String result =
                "Name, Surname, Age, Profession, Street, Locality, Postcode, Country"
                        + s1
                        + s2
                        + s3
                        + s4
                        + s5
                        + s6
                        + s7
                        + s8;
       // System.out.println(result);
    }
