public class AccountNode {
    int accountNumber;
    double balance;
    AccountNode left;
    AccountNode right;

    // Constructor
    public AccountNode(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.left = null;
        this.right = null;
    }
}
