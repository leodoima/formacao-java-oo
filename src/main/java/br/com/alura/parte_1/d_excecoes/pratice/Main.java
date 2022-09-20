package br.com.alura.parte_1.d_excecoes.pratice;

public class Main {
    public static void main(String[] args) {

        BankAccount accountLeonardo = new BankAccount("Leonardo dos Santos", 56893);

        try {
            accountLeonardo.depositAccount(-25.0);
        } catch (BankAccountException e) {
            System.out.println(e.getMessage());
        }
    }
}
