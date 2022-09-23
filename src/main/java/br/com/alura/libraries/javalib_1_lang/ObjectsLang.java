package br.com.alura.libraries.javalib_1_lang;

public class ObjectsLang {

    public static void main(String[] args) {


        // String trata-se de uma classe, portanto pode ser declarada da seguinte forma
        String name = new String("Este é um objeto da classe String");
        System.out.println(name);

        // Todas as classes estendem Object implícitamente
        Object cityOfJoacaba = new City("Joaçaba");
        System.out.println(cityOfJoacaba);

        // System é uma classe que imprime qualquer tipo de Object
        System.out.println(123);
        System.out.println(name);
        System.out.println("ABC");
        System.out.println(cityOfJoacaba);
    }
}
