package br.com.alura.parte_1.b_objetos;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Endereco enderecoLeonardo = new Endereco("Joaçaba", "Frei Rogério", "sc");
        System.out.println(enderecoLeonardo);

        Cliente clienteLeonardo = new Cliente("Leonardo dos Santos", new Date(), enderecoLeonardo);
        System.out.println(clienteLeonardo.getNome() + " - " + clienteLeonardo.getNascimento());

        Conta contaLeonardo = new Conta(20935, clienteLeonardo);

        System.out.println(contaLeonardo.sacarValor(50));
        System.out.println(contaLeonardo.depositarValor(50));
        System.out.println(contaLeonardo.getSaldo());
        System.out.println(contaLeonardo.sacarValor(25));
        System.out.println(contaLeonardo.getSaldo());
    }
}
