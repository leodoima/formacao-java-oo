package br.com.alura.parte_1.c_polimorfismo.bank_account;

public abstract interface UserAccess {

    public abstract boolean authenticated(String login, String password);
}
