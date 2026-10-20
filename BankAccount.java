public class BankAccount {

    private String AccountNumber;
    private double balance;

    public BankAccount(String AccountNumber, double balance) {
        this.AccountNumber = AccountNumber;
        this.balance = balance;
    }

    public void setAccountNumber(String AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public void setbalance(double balance) {
        this.balance = balance;
    }

    public double getbalance() {
        return balance;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void credit(double amount) {
        balance += amount;
    }

    public boolean debit(double amount) {
        if (balance < amount) {
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }
}
