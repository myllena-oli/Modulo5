package Exercicio3e4;

public class Conta {
    private double saldo;
    private double limite;

    public Conta(){

    }

    public void deposita(double deposito) {
        saldo += deposito;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void saca(double saque) throws ContaExcecao {
            if (saque > saldo) {
                throw new ContaExcecao();
            }
            else saldo -= saque;

    }
}
