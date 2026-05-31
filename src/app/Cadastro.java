package app;

public class Cadastro {
    private int numConta;
    private String nomeTitular;
    private double saldo;

    public Cadastro() {}

    public Cadastro(int numConta, String nomeTitular) {
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
    }

    public Cadastro(int numConta, String nomeTitular, double saldo) {
        this(numConta, nomeTitular);
        this.saldo = saldo;
    }

    public int getnumConta() {
        return numConta;
    }

    public void setnumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getnomeTitular() {
        return nomeTitular;
    }

    public void setnomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
