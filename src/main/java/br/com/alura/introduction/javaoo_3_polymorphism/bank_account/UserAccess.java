package br.com.alura.introduction.javaoo_3_polymorphism.bank_account;

public abstract interface UserAccess {

    public abstract boolean authenticated(String login, String password);
}
