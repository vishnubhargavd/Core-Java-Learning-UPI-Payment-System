public class Transaction {

    private User sender;
    private User receiver;
    private String status;
    private double amount;

    public Transaction(
        User sender,
        User receiver,
        String status,
        double amount
    ) {
        this.sender = sender;
        this.receiver = receiver;
        this.status = status;
        this.amount = amount;
    }

    public void printTransaction() {
        System.out.println(
            "Transaction: " +
                sender.getName() +
                " -> " +
                receiver.getName() +
                " | Rs. " +
                amount +
                " | Status: " +
                status
        );
    }
}
