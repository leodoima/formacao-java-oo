package br.com.alura.parte_1.c_polimorfismo.bank_account;

public abstract class Account {

    private String name;
    private int bankBranch;
    private int accountNumber;
    private double accountBalance;
    private static int totalAccounts = 1000;

    public Account(int bankBranch, String name) {

        this(bankBranch, name, 0);
    }

    public Account(int bankBranch, String name, double openingBalance) {
        totalAccounts++;

        this.name = name;
        this.bankBranch = bankBranch;
        this.accountBalance = openingBalance;
        this.accountNumber = totalAccounts;
    }

    public abstract boolean transfer(double value, Account destinationAccount);


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getBankBranch() {
        return this.bankBranch;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public int getNumberAccount() {
        return this.accountNumber;
    }

    public boolean deposit(double value) {

        if (value > 0) {
            this.accountBalance += value;
            return true;
        }

        return false;
    }

    public boolean withdraw(double value) {
        if (value <= this.accountBalance) {
            this.accountBalance -= value;
            return true;
        }

        return false;
    }
}
