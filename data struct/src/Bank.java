public class Bank {
    AccountTree accounts;

    // Constructor
    public Bank() {
        accounts = new AccountTree();
    }

    // Method to add a new account
    public void addAccount(int accountNumber, double initialBalance) {
        accounts.insert(accountNumber, initialBalance);
        System.out.println("Account " + accountNumber + " added with balance " + initialBalance);
    }

    // Method to transfer money between accounts
    public void transfer(int fromAccountNumber, int toAccountNumber, double amount) {
        AccountNode fromAccount = accounts.find(fromAccountNumber);
        AccountNode toAccount = accounts.find(toAccountNumber);

        if (fromAccount == null) {
            System.out.println("Account " + fromAccountNumber + " not found.");
            return;
        }

        if (toAccount == null) {
            System.out.println("Account " + toAccountNumber + " not found.");
            return;
        }

        if (fromAccount.balance < amount) {
            System.out.println("Insufficient balance in account " + fromAccountNumber);
            return;
        }

        fromAccount.balance -= amount;
        toAccount.balance += amount;

        System.out.println("Transferred " + amount + " from account " + fromAccountNumber + " to account " + toAccountNumber);
    }

    // Method to check the balance of an account
    public double checkBalance(int accountNumber) {
        AccountNode account = accounts.find(accountNumber);
        if (account != null) {
            return account.balance;
        } else {
            System.out.println("Account " + accountNumber + " not found.");
            return -1;
        }
    }
}
