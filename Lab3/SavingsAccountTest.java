package Lab3;

public class SavingsAccountTest {
    private static SavingsAccount saver1 = new SavingsAccount(2000.0, 0.04);
    private static SavingsAccount saver2 = new SavingsAccount(3000.0, 0.04);

    public static void main(String[] args) {
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println(saver1.getSavingsBalance());
        System.out.println(saver2.getSavingsBalance());

        SavingsAccount.modifyMonthlyInterestRate(0.05);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println(saver1.getSavingsBalance());
        System.out.println(saver2.getSavingsBalance());
    }
}
