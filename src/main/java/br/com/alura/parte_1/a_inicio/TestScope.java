package br.com.alura.parte_1.inicio;

import org.apache.commons.lang3.Range;

import java.lang.reflect.Array;


public class TestScope {
    public static void main(String[] args) {

        System.out.println(calculatorIR(1500));
        System.out.println(calculatorIR(2300));
        System.out.println(calculatorIR(9000));
    }


    public static Double calculatorIR(double salary) {

        String typeAliquot = "";
        double aliquotIR = 0;
        double valueDeduction = 0;

        if (salary < 1900) {
            return valueDeduction;
        }


        // Utilizando bibliotecas externas
        Range<Double> aliquotA = Range.between(1900.0, 2800.0);
        Range<Double> aliquotB = Range.between(2800.1, 3751.0);
        Range<Double> aliquotC = Range.between(3751.1, 4664.0);


        typeAliquot = aliquotA.contains(salary) ? "ALIQUOT_A" : aliquotB.contains(salary) ? "ALIQUOT_B" : aliquotC.contains(salary) ? "ALIQUOT_C" : "ALIQUOT_D";

        if (typeAliquot.equals("ALIQUOT_A")) {
            aliquotIR = 7.5;
            valueDeduction = 142.0;

        } else if (typeAliquot.equals("ALIQUOT_B")) {
            aliquotIR = 15.0;
            valueDeduction = 350.0;

        } else if (typeAliquot.equals("ALIQUOT_C")) {
            aliquotIR = 22.5;
            valueDeduction = 636.0;

        } else if (typeAliquot.equals("ALIQUOT_D")) {
            aliquotIR = 30;
            valueDeduction = salary * 0.3;
        }

        return valueDeduction;
    }
}
