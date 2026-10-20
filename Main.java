
public class Main {

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("123", 5000.0);
        BankAccount acc2 = new BankAccount("456", 3000.0);

        User vishnu = new User("vishnu", "vishnu@upi", acc1);
        User ram = new User("ram", "ram@upi", acc2);

        UPIServices upiServices = new UPIServices();

        upiServices.registerUser(vishnu);
        upiServices.registerUser(ram);

        vishnu.checkBalance();
        ram.checkBalance();

        upiServices.sendMoney("vishnu@upi", "ram@upi", 1000.0);

        vishnu.checkBalance();
        ram.checkBalance();
    }
}
