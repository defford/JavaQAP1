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

    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance.");
        }
        return balance;
    }

    public int transferTo(Account acc, int amount) {
        if (amount > this.balance) {
            System.out.println("Transfer failed: insufficient balance!");
        }
        this.debit(amount);
        acc.credit(amount);
        System.out.println("Transferred " + amount + " to " + acc.getName());

        return balance;
    }

    public String toString() {
        return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }

}
