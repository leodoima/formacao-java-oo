package br.com.alura.polimorfismo;

public class Main {
    public static void main(String[] args) {

        Employee employeeNico = new Employee("Nico Risberg", "000.999.888-11", 2000);
        System.out.println(employeeNico.getBonification());

        Manager managerMauro = new Manager("Mauro da Silveira", "111.222.111-33");
        System.out.println(managerMauro.getSalary());
        managerMauro.setSalary(10000.0);
        System.out.println(managerMauro.getSalary());
        System.out.println(managerMauro.getBonification());

    }
}
