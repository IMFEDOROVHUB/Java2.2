public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int initialAccount = 123;
        int accountReplenishment = 1234;
        int bonusRUB = accountReplenishment / 100;

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        if (accountReplenishment >= 1000) {
            int account = bonusRUB + accountReplenishment + initialAccount;
            System.out.println("Сумма пополнения " + accountReplenishment + " на счету " + account);
        }
        if (accountReplenishment < 1000) {
            int account = accountReplenishment + initialAccount;
            System.out.println("Сумма пополнения " + accountReplenishment + " на счету " + account);
        }
    }
}