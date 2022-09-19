public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и параметров программы:
        // начального счёта, суммы пополнения и тп

        // Условным оператором проверяете превысила ли сумма пополнения порог
        // и для этих двух разных сценариев рассчитываете сумму бонуса
        // и выводите на экран.

        int x = 10;
        int refill = 2222;
        int bonus;
        int total = x + refill;

        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }

        System.out.println("Баланс " + total);
        System.out.println("Начислено бонусов " + bonus);
    }
}