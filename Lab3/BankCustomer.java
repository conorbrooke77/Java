package Lab3;

import java.util.ArrayList;

public class BankCustomer {
    private String name;
    private String address;
    private double balance;

    private ArrayList<SavingsAccount> savingsAccounts = new ArrayList<SavingsAccount>();

    public BankCustomer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void addAccont(SavingsAccount savingAccount) {
        if (savingsAccounts.size() <= 3) {
            savingsAccounts.add(savingAccount);
        }
    }

    public double balance() {
        for (int i =0; i < savingsAccounts.size(); i++) {
            balance += savingsAccounts.get(i).getSavingsBalance();
        }

        return balance;
    }

    public String toString() {
        String temp = "\n";

        for (int i =0; i < savingsAccounts.size();i++) {
                temp += "Savings Account " + savingsAccounts.get(i).getUniqueNumber() + " " + String.valueOf(savingsAccounts.get(i).getSavingsBalance()) + "\n";
        }

        return temp;
    }
}
