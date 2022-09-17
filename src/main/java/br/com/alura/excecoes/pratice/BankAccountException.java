package br.com.alura.excecoes.pratice;

public class BankAccountException extends Exception {

    public BankAccountException(String descriptionException) {
        super(descriptionException);
    }
}
