package br.com.alura.introduction.javaoo_3_polymorphism.job;

import java.util.Date;

public class AccessControl {

    public String registerAccess(Employee employee) {
        return "Access successful: " + new Date();
    }
}
