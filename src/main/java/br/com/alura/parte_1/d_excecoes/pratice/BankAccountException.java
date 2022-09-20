package br.com.alura.parte_1.d_excecoes.pratice;

public class BankAccountException extends Exception {

    public BankAccountException(String descriptionException) {
        super(descriptionException);
    }
}
