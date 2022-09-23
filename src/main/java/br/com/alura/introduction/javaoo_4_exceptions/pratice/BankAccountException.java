package br.com.alura.introduction.javaoo_4_exceptions.pratice;

public class BankAccountException extends Exception {

    public BankAccountException(String descriptionException) {
        super(descriptionException);
    }
}
