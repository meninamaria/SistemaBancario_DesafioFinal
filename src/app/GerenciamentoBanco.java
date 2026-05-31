package app;

public class GerenciamentoBanco{
    private double sacar;
    private double depositar;

    public GerenciamentoBanco() {
        this.sacar = sacar;
        this.depositar = depositar;
    }

    public double getSacar() {
        return sacar;
    }

    public void setSacar(double sacar) {
        this.sacar = sacar;
    }

    public double getDepositar() {
        return depositar;
    }

    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }

    public double sacarDinheiro(double saldo, double valor) {
            return saldo - valor;
    }

    public double depositarDinheiro(double saldo, double valor) {
        return saldo + valor;
    }
}
