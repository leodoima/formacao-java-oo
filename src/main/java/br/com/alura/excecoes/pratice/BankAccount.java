package br.com.alura.excecoes.pratice;

public class BankAccount {

    private String clientName;
    private int numberAccount;

    private double balanceAccount;


    public BankAccount(String clientName, int numberAccount) {
        this.clientName = clientName;
        this.numberAccount = numberAccount;
    }

    public void depositAccount(double depositValue) throws BankAccountException {
        if (depositValue <= 0) {
            throw new BankAccountException("Valor de depósito inválido");
        }

        this.balanceAccount += depositValue;
    }

    public void withdrawAccount(double withdrawValue) throws BankAccountException {
        if (this.balanceAccount < withdrawValue) {
            throw new BankAccountException("Saldo insuficiente para saque");
        }

        this.balanceAccount -= withdrawValue;
    }

    public void transferAccount(double transferValue, BankAccount bankAccountDestine) throws BankAccountException {
        this.withdrawAccount(transferValue);
        bankAccountDestine.depositAccount(transferValue);
    }
}
