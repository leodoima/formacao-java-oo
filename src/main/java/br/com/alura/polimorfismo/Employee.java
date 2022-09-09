package br.com.alura.polimorfismo;

public class Employee {

    private String name;
    private String cpf;
    private double salary;


    public Employee(String name, String cpf, double salary) {
        this.name = name;
        this.cpf = cpf;
        this.salary = salary;
    }

    public Employee(String name, String cpf) {
        this(name, cpf, 0.0);
    }

    public double getBonification() {
        return this.salary * 0.1;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
