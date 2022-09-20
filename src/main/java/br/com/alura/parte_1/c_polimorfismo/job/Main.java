package br.com.alura.parte_1.polimorfismo.job;

public class Main {
    public static void main(String[] args) {

        Employee employeeNico = new Employee("Nico Rosberg", "000.999.888-11", 2000);
        System.out.println(employeeNico.getBonification());

        Manager managerMauro = new Manager("Mauro da Silveira", "111.222.111-33");
        System.out.println(managerMauro.getSalary());

        managerMauro.setLogin("mauro@mail.com");
        managerMauro.setPassword("123456");
        managerMauro.setSalary(10000.0);

        System.out.println(managerMauro.getSalary());
        System.out.println(managerMauro.getBonification());
        System.out.println(managerMauro.authenticationAccess("mauro@mail.com", "123456"));

        AccessControl accessControl = new AccessControl();
        System.out.println(accessControl.registerAccess(employeeNico));
        System.out.println(accessControl.registerAccess(managerMauro));
    }
}
