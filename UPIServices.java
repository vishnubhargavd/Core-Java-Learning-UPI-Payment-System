import java.util.HashMap;
import java.util.Map;

public class UPIServices {

    private Map<String, User> map = new HashMap<>();

    public void registerUser(User user) {
        map.put(user.getUpiID(), user);
    }

    public void sendMoney(String senderUpi, String receiverUpi, double amount) {
        User senderUser = map.get(senderUpi);
        User receiverUser = map.get(receiverUpi);

        if (senderUser == null || receiverUser == null) {
            System.out.println("Sender or receiver not found.");
            return;
        }

        if (senderUser == receiverUser) {
            System.out.println("Cannot transfer money to yourself.");
            return;
        }

        boolean success = senderUser.getbankAccount().debit(amount);

        if (!success) {
            Transaction t = new Transaction(
                senderUser,
                receiverUser,
                "FAILED",
                amount
            );
            t.printTransaction();
        } else {
            receiverUser.getbankAccount().credit(amount);

            Transaction t = new Transaction(
                senderUser,
                receiverUser,
                "SUCCESS",
                amount
            );
            t.printTransaction();
        }
    }
}
