package br.com.alura.parte_1.excecoes.exemplos;

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");

        try {
            metodo1();
        } catch (Exception e) {
            System.out.println("Erro no método 1: " + e.getMessage());
        }

        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        try {
            metodo2();
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // Lançando exceção que será tratada apenas no método superior
        Deposita deposita = null;
        deposita.deposita();

        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");

        try {
            metodo3();
        } catch (MyCheckedException e) {
            System.out.println(e.getMessage());
        }

        throw new MyUncheckedException("Gerando exceção manualmente usando Unchecked Exception");
        // System.out.println("Fim do metodo2");
    }

    private static void metodo3() throws MyCheckedException {
        System.out.println("Ini do metodo3");

        throw new MyCheckedException("Gerando exceção manualmente usando Checked Exception");
    }
}
