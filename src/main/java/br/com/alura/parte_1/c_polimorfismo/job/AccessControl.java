package br.com.alura.parte_1.c_polimorfismo.job;

import java.util.Date;

public class AccessControl {

    public String registerAccess(Employee employee) {
        return "Access successful: " + new Date();
    }
}
