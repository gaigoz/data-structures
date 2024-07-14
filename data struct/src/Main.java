public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Adicionando contas
        bank.addAccount(1001, 500.00);
        bank.addAccount(1002, 1500.00);
        bank.addAccount(1003, 2000.00);

        // Verificando saldos
        System.out.println("Saldo da conta 1001: " + bank.checkBalance(1001));
        System.out.println("Saldo da conta 1002: " + bank.checkBalance(1002));
        System.out.println("Saldo da conta 1003: " + bank.checkBalance(1003));

        // Transferindo fundos
        bank.transfer(1001, 1002, 200.00);

        // Verificando saldos após a transferência
        System.out.println("Saldo da conta 1001: " + bank.checkBalance(1001));
        System.out.println("Saldo da conta 1002: " + bank.checkBalance(1002));
    }
    }
