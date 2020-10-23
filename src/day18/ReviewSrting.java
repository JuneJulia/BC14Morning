package day18;

public class ReviewSrting {
    public static void main(String[] args) {
        firstReview();
    }

    private static void firstReview() {
        String hm = "Василия";
        System.out.println(hm.indexOf(1102));
        System.out.println(hm.indexOf('я')); // на каком месте находится искомая буква в слове
        System.out.println(hm.codePointAt(6)); // какой индекс у буквы, находящейся на 6 месте в слове
        System.out.println('ю' + 0);

        if (hm.codePointAt(6) == 'я') {
            System.out.println("popal");
        }

    }
}
