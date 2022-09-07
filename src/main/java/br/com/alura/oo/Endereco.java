package br.com.alura.oo;

public class Endereco {

    private String cidade;
    private String rua;
    private String uf;

    public Endereco(String cidade, String rua, String uf) {
        this.cidade = cidade;
        this.rua = rua;
        this.uf = uf.toUpperCase();
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cidade='" + cidade + '\'' +
                ", rua='" + rua + '\'' +
                ", uf='" + uf + '\'' +
                '}';
    }
}
