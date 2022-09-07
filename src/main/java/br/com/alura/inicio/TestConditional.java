package br.com.alura.inicio;

public class TestConditional {
    public static void main(String[] args) {

        int age;
        boolean accompanied;

        age = 16;
        accompanied = false;
        System.out.println(validateEntries(age, accompanied));

        age = 18;
        accompanied = false;
        System.out.println(validateEntries(age, accompanied));

        age = 16;
        accompanied = true;
        System.out.println(validateEntries(age, accompanied));


        age = 22;
        accompanied = true;
        System.out.println(validateEntries(age, accompanied));
    }


    public static boolean validateEntries(int age, boolean accompanied) {

        boolean accessAuthorization = (age >= 18 || accompanied) ? true : false;

        return accessAuthorization;

        /*
        Código utilizado anteriormente para este mesmo caso

        if (idade >= 18 || acompanhado) {
            return true;
        } else {
            return false;
        }
        */
    }
}
