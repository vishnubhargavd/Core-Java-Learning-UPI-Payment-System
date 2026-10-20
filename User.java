import java.util.*;

public class User {

    private String name;
    public String UpiID;
    private BankAccount bankAccount;

    User(String name, String UpiID, BankAccount bankAccount) {
        this.name = name;
        this.UpiID = UpiID;
        this.bankAccount = bankAccount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUpiID(String UpiID) {
        this.UpiID = UpiID;
    }

    public void setbankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getName() {
        return name;
    }

    public String getUpiID() {
        return UpiID;
    }

    public BankAccount getbankAccount() {
        return bankAccount;
    }

    public void checkBalance() {
        System.out.println(
            name + " Balance is rupees: " + bankAccount.getbalance()
        );
    }
}
