package br.com.alura.polimorfismo.bank_account;

public class SavingsAccount extends Account {


    private static final double TRANSFER_RATE = 0.01;

    public SavingsAccount(int bankBranch, String name) {
        super(bankBranch, name, 100);
    }

    public SavingsAccount(int bankBranch, String name, double openingBalance) {
        super(bankBranch, name, openingBalance);
    }

    @Override
    public boolean transfer(double value, Account destinationAccount) {
        double addedValue = value + (value * TRANSFER_RATE);

        return super.withdraw(addedValue) && destinationAccount.deposit(value);
    }
}
