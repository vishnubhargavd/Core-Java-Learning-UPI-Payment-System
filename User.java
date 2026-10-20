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

}
