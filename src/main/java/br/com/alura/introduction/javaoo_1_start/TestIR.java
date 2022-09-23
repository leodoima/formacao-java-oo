package br.com.alura.introduction.javaoo_1_start;


public class TestIR {
    public static void main(String[] args) {

        Employee leonardo = new Employee("Leonardo", 4000);
        CalculatorIR leonardoCalculator = new CalculatorIR(leonardo);

        System.out.println(leonardoCalculator.getEmployee().getName());
        System.out.println(leonardoCalculator.getEmployee().getSalary());
        System.out.println(leonardoCalculator.getValueDeduction());
        System.out.println(leonardoCalculator.getAliquotIR());
    }
}
