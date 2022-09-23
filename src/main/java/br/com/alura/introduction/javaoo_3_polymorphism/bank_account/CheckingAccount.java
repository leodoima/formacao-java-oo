package br.com.alura.introduction.javaoo_3_polymorphism.bank_account;

public class CheckingAccount extends Account {

    private static final double TRANSFER_RATE = 0.02;

    public CheckingAccount(int bankBranch, String name) {
        super(bankBranch, name);
    }

    public boolean transfer(double value, Account destinationAccount) {
        double addedValue = value + (value * TRANSFER_RATE);

        return super.withdraw(addedValue) && destinationAccount.deposit(value);
    }
}
