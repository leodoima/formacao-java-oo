package br.com.alura.introduction.javaoo_2_objects;

public class Conta {

    private int agencia;
    private int conta;
    private static int sequencialConta = 1000;
    private Cliente cliente;
    private double saldo;

    public Conta(int agencia, Cliente cliente) {
        this(agencia, cliente, 0);
    }

    public Conta(int agencia, Cliente cliente, double saldo) {

        sequencialConta++;

        this.agencia = agencia;
        this.cliente = cliente;
        this.saldo = saldo;
        this.conta = sequencialConta;

        System.out.println("Conta criada: " +
                this.agencia + "/" + this.conta + " - " + this.cliente.getNome() + ". Saldo: " + this.saldo);
    }


    public int getAgencia() {
        return this.agencia;
    }

    public int getConta() {
        return this.conta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean sacarValor(double valor) {

        boolean saqueDisponivel = valor > 0 ? (this.saldo >= valor ? true : false) : false;

        if (saqueDisponivel) {
            this.saldo -= valor;
        }

        return saqueDisponivel;

        /*
        Uma abordagem mais simples, porém, menos verbosa das tratativas

        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
         */
    }

    // Definindo um novo estilo de abordagem mais declarativo
    public boolean depositarValor(double valor) {

        boolean depositoPermitido = valor > 0 ? true : false;

        if (depositoPermitido) {
            this.saldo += valor;
        }

        return depositoPermitido;
    }
}
