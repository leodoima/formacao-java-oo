package br.com.alura.parte_1.polimorfismo.bank_account;

public class Employee implements UserAccess {

    private Authentication authentication;

    public Employee() {
        this.authentication = new Authentication();
    }

    @Override
    public boolean authenticated(String login, String password) {
        return this.authentication.authenticated(login, password);
    }
}
