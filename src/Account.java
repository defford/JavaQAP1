public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        System.out.println("Balance for " + name + ": " + balance);
        return balance;
    }

    public void credit(int amount) {
        balance += amount;
    }

    public void debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance.");
        }
    }

    public void transferTo(Account acc, int amount) {
        if (amount > this.balance) {
            System.out.println("Transfer failed: insufficient balance!");
            return;
        }
        this.debit(amount);
        acc.credit(amount);
        System.out.println("Transferred " + amount + " to " + acc.getName());
    }

}
