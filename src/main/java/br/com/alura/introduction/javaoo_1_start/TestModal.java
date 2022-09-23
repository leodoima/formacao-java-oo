package br.com.alura.introduction.javaoo_1_start;

public class TestModal {
    public static void main(String[] args) {

        int totalNumbers = 100;

        for (int i = 1; i < totalNumbers; i++) {
            System.out.println(validateModal(i));
        }
    }

    public static String validateModal(int number) {

        boolean modal3 = number % 3 == 0;
        boolean modal5 = number % 5 == 0;

        return (modal3 && modal5) ? "Fizz Buzz" : (modal3) ? "Fizz" : (modal5) ? "Buzz" : String.valueOf(number);
    }

    /*
    Código criado anteriomente para realizar a mesma validação listada acima

    for (int i = 1; i <= 100; i++) {
        String resultMod = String.valueOf(i);

        if (i % 3 == 0 && i % 5 == 0) {
            resultMod = "Fizz Buzz";
        } else if (i % 3 == 0) {
            resultMod = "Fizz";
        } else if (i % 5 == 0) {
            resultMod = "Buzz";
        }

        System.out.println(resultMod);
    }
    */
}
