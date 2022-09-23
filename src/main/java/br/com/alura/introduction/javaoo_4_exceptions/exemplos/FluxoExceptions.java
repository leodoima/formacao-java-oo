package br.com.alura.introduction.javaoo_4_exceptions.exemplos;

public class FluxoExceptions {

    public static void main(String[] args) {
        System.out.println("Ini do main");

        try {
            metodo1();
        } catch (NullPointerException e) {
            System.out.println("Erro no método 1: " + e.getMessage());
        }

        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        try {
            metodo2();
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Erro no método 2: " + e.getMessage());
        }

        // Lançando exceção que será tratada apenas no método superior
        Deposita deposita = null;
        deposita.deposita();

        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            int a = i / 0; // Lançando exceção
        }
        System.out.println("Fim do metodo2");
    }
}
