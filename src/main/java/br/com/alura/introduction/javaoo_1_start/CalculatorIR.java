package br.com.alura.introduction.javaoo_1_start;

import org.apache.commons.lang3.Range;

/**
 * Aplicando conceitos de funções conforme Clean Code
 */

enum TypeAliquot {
    ALIQUOT_A,
    ALIQUOT_B,
    ALIQUOT_C,
    ALIQUOT_D
}

public class CalculatorIR {

    private double aliquotIR;
    private double valueDeduction;
    private Employee employee;
    private TypeAliquot typeAliquot;


    public CalculatorIR(Employee employee) {
        this.employee = employee;

        defineRangeAliquot(employee.getSalary());
        defineValueIR(this.typeAliquot);
    }

    public double getAliquotIR() {
        return aliquotIR;
    }

    public double getValueDeduction() {
        return valueDeduction;
    }

    public Employee getEmployee() {
        return employee;
    }

    public TypeAliquot getTypeAliquot() {
        return typeAliquot;
    }

    public void defineValueIR(TypeAliquot typeAliquot) {

        switch (typeAliquot) {
            case ALIQUOT_A -> calculateAliquotA();
            case ALIQUOT_B -> calculateAliquotB();
            case ALIQUOT_C -> calculateAliquotC();
            case ALIQUOT_D -> calculateAliquotD();
        }
    }


    public void defineRangeAliquot(double salary) {

        Range<Double> aliquotA = Range.between(1900.0, 2800.0);
        Range<Double> aliquotB = Range.between(2800.1, 3751.0);
        Range<Double> aliquotC = Range.between(3751.1, 4664.0);

        this.typeAliquot = aliquotA.contains(salary) ? TypeAliquot.ALIQUOT_A : aliquotB.contains(salary) ? TypeAliquot.ALIQUOT_B : aliquotC.contains(salary) ? TypeAliquot.ALIQUOT_C : TypeAliquot.ALIQUOT_D;
    }

    public void calculateAliquotA() {
        this.aliquotIR = 7.5;
        this.valueDeduction = 142.0;
    }

    public void calculateAliquotB() {
        this.aliquotIR = 15.0;
        this.valueDeduction = 350.0;
    }

    public void calculateAliquotC() {
        this.aliquotIR = 22.5;
        this.valueDeduction = 636.0;
    }

    public void calculateAliquotD() {

        if (employee == null) {
            return;
        }

        this.aliquotIR = 30;
        this.valueDeduction = employee.getSalary() * 0.3;
    }
}
