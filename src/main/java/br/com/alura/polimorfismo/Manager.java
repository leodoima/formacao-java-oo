package br.com.alura.polimorfismo;

public class Manager extends Employee {

    public Manager(String name, String cpf, double salary) {
        super(name, cpf, salary);
    }

    public Manager(String name, String cpf) {
        super(name, cpf);
    }

    public double getBonification() {
        return this.getSalary() * 0.3;
    }
}
