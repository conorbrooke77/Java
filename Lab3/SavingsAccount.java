package Lab3;

public class SavingsAccount {
    private static int uniqueNumberCounter;
    private static double annualInterestRate;

    private int uniqueNumber;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance, double annualInterestRate) {
        uniqueNumberCounter++;
        uniqueNumber = uniqueNumberCounter;

        this.savingsBalance = savingsBalance;
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public void calculateMonthlyInterest() {
        savingsBalance += (double)Math.round(((savingsBalance * annualInterestRate)/12) * 100)/100; // Rounding to the second decimal place;
    }

    public static void modifyMonthlyInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }
    
    public int getUniqueNumber() {
        return uniqueNumber;
    }
}
