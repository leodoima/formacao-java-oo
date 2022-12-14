package br.com.alura.introduction.javaoo_1_start;

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

        return age >= 18 || accompanied;
    }
}
