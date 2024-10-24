public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int initialAccount = 123;
        int accountReplenishment = 500;
        int bonusRUB = accountReplenishment / 100;

        int account;
        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        if (accountReplenishment >= 1000) {
            account = bonusRUB + accountReplenishment + initialAccount;
        } else {
            account = accountReplenishment + initialAccount;
        }
        System.out.println("Сумма пополнения " + accountReplenishment + " на счету " + account);

    }
}