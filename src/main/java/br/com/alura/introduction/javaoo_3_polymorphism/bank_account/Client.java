package br.com.alura.introduction.javaoo_3_polymorphism.bank_account;

public class Client implements UserAccess {

    private String name;

    private Authentication authentication;


    public Client(String name, String login, String password) {
        this.name = name;
        this.authentication = new Authentication(login, password);
    }

    @Override
    public boolean authenticated(String login, String password) {
        return this.authentication.authenticated(login, password);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Authentication getAuthentication() {
        return this.authentication;
    }
}
