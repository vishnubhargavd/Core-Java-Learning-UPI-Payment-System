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

    public void getName(String name) {
        return name;
    }

    public void getUpiID(String UpiID) {
        return UpiID;
    }

    public void getbankAccount(BankAccount bankAccount) {
        return bankAccount;
    }
    public void checkBalance(){
        System.out.print(name+" Balance is ruppe: "+bankAccount.getbalance());
    }
}
