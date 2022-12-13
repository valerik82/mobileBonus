public class Main {
    public static void main(String[] args) {

        int accountBalance = 2700; // account balance
        int refillSum = 5250; // account refill amount
        int bonus;

        if (refillSum > 1000) {
            bonus = refillSum * 1 / 100;

            System.out.println(("Ваш бонус: ") + (bonus) + (" руб."));

        } else bonus = 0;


        System.out.println(("Ваш баланс: ") + (accountBalance + refillSum + bonus) + (" руб."));
    }
}