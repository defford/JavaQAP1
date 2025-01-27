public class TestAccount {
    public static void main(String[] args) {
        Account acc1 = new Account("1", "Account #1", 5000);
        Account acc2 = new Account("2", "Account #2", 4000);

        acc1.getBalance();
        acc2.getBalance();

        acc1.transferTo(acc2, 1000);

        acc1.getBalance();
        acc2.getBalance();
    }
}
