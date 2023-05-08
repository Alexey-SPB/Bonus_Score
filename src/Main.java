public class Main {
    public static void main(String[] args) {

        int score = 500;
        int payment = 1605;
        int bonus;

        if (payment > 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        System.out.println(bonus + " сумма бонусов");
        System.out.println(score + payment + bonus + " итоговая сумма на счёте");

    }
}