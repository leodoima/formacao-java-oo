package br.com.alura.parte_1.c_polimorfismo.bank_account;

public class Main {

    public static void main(String[] args) {

        CheckingAccount ccLeonardo = new CheckingAccount(2505, "Leonardo dos Santos");
        SavingsAccount saLeonardo = new SavingsAccount(2505, "Leonardo dos Santos");

        System.out.println(ccLeonardo.getBankBranch() + " | " + ccLeonardo.getNumberAccount() + " - Balance: " + ccLeonardo.getAccountBalance());
        System.out.println(saLeonardo.getBankBranch() + " | " + saLeonardo.getNumberAccount() + " - Balance: " + saLeonardo.getAccountBalance());

        saLeonardo.transfer(2, ccLeonardo);
        saLeonardo.transfer(20, ccLeonardo);
        ccLeonardo.transfer(5, saLeonardo);

        System.out.println(ccLeonardo.getBankBranch() + " | " + ccLeonardo.getNumberAccount() + " - Balance: " + ccLeonardo.getAccountBalance());
        System.out.println(saLeonardo.getBankBranch() + " | " + saLeonardo.getNumberAccount() + " - Balance: " + saLeonardo.getAccountBalance());


        Client clientLeonardo = new Client("Leonardo", "leodoima", "456456");
        System.out.println(clientLeonardo.authenticated("leodoima", "45456"));
        System.out.println(clientLeonardo.getAuthentication().getLogin());
    }
}
