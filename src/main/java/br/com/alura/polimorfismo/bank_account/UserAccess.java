package br.com.alura.polimorfismo.bank_account;

public abstract interface UserAccess {

    public abstract boolean authenticated(String login, String password);
}
