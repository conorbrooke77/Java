package Lab3;

public class Bank {
    private static BankCustomer customer = new BankCustomer("Bob", "1000 High Hrothgar");
    public static void main(String[] args) {
        SavingsAccount savings1 = new SavingsAccount(400, 0.04);
        SavingsAccount savings2 = new SavingsAccount(7700, 0.04);
        SavingsAccount savings3 = new SavingsAccount(0, 0.04);

        customer.addAccont(savings1);
        customer.addAccont(savings2);
        customer.addAccont(savings3);

        System.out.println("Balance: " + customer.balance());
        System.out.println(customer.toString());
    }
}
