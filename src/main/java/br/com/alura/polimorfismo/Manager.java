package br.com.alura.polimorfismo;

public class Manager extends Employee {


    private String login;
    private String password;


    public Manager(String name, String cpf, double salary) {
        super(name, cpf, salary);
    }

    public Manager(String name, String cpf) {
        super(name, cpf);
    }

    public double getBonification() {
        return super.getBonification() + super.getSalary() * 0.3;
    }

    public boolean authenticationAccess(String login, String password) {

        boolean loginAccess = (login.equalsIgnoreCase(this.login));
        boolean passwordAccess = (password.equals(this.password));

        return (loginAccess && passwordAccess);
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
