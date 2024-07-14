public class AccountTree {
    AccountNode root;

    // Constructor
    public AccountTree() {
        this.root = null;
    }

    // Method to insert a new account
    public void insert(int accountNumber, double balance) {
        root = insertRec(root, accountNumber, balance);
    }

    // Recursive method to insert a new account
    private AccountNode insertRec(AccountNode root, int accountNumber, double balance) {
        if (root == null) {
            root = new AccountNode(accountNumber, balance);
            return root;
        }
        if (accountNumber < root.accountNumber) {
            root.left = insertRec(root.left, accountNumber, balance);
        } else if (accountNumber > root.accountNumber) {
            root.right = insertRec(root.right, accountNumber, balance);
        }
        return root;
    }

    // Method to find an account by account number
    public AccountNode find(int accountNumber) {
        return findRec(root, accountNumber);
    }

    // Recursive method to find an account
    private AccountNode findRec(AccountNode root, int accountNumber) {
        if (root == null || root.accountNumber == accountNumber) {
            return root;
        }
        if (accountNumber < root.accountNumber) {
            return findRec(root.left, accountNumber);
        }
        return findRec(root.right, accountNumber);
    }
}
