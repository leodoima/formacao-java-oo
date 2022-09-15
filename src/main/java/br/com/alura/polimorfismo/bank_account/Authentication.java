package br.com.alura.polimorfismo.bank_account;

public class Authentication {
    private String login;
    private String password;

    public Authentication() {
    }

    public Authentication(String login, String password) {
        this.login = login;
        this.password = password;
    }


    public boolean authenticated(String login, String password) {

        boolean isValidLogin = (this.login.equals(login));
        boolean isValidPassword = (this.password.equals(password));

        return (isValidLogin && isValidPassword);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
