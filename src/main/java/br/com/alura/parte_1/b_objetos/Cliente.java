package br.com.alura.parte_1.b_objetos;

import java.util.Date;


public class Cliente {
    /**
     *
     */

    private String nome;
    private Date nascimento;
    private int telefone;
    private Endereco endereco;


    public Cliente(String nome, Date nascimento, Endereco endereco) {
        this(nome, nascimento, 99999999, endereco);
    }

    public Cliente(String nome, Date nascimento, int telefone, Endereco endereco) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.telefone = telefone;
        this.endereco = endereco;
    }


    public String getNome() {
        return this.nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public int getTelefone() {
        return this.telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
