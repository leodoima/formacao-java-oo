package br.com.alura.excecoes.pratice;

public class BankAccount {

    private String clientName;
    private int numberAccount;

    private double balanceAccount;


    public BankAccount(String clientName, int numberAccount) {
        this.clientName = clientName;
        this.numberAccount = numberAccount;
    }

    public boolean depositAccount(double valueDeposit) throws BankAccountException {
        if (valueDeposit <= 0) {
            throw new BankAccountException("Valor de depósito inválido");
        }

        this.balanceAccount += valueDeposit;
        return true;
    }
}
