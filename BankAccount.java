public class BankAccount {

    private String AccountNumber;
    private double balance;

    public BankAccount( int AccountNumber, String balance){
        this.AccountNumber = AccountNumber;
        this.balance = balance;
    }
    public void setAccountNumber(String AccountNumber){
        this.AccountNumber = AccountNumber;
    }
    public void setbalance(double balance){
        this.balance = balance;
    }
    public void getbalance(){
        return balance;
    }
    public void getAccountNumber()){
        return AccountNumber;
    }


    public void credit(double amount){
        balance+=amount;
    }
    public boolean debit(double amount){
        if(balance < amount){
            return false;
        }else{
            balance-=amount;
            return true;
        }
    }
}
