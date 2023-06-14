package Exercicio4;

public class ContaCorrente {
    private int numeroConta;
    private String nomeCorrentista;
    private double saldo;

    public ContaCorrente(int numeroConta, String nomeCorrentista) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0;
    }
    public ContaCorrente(int numeroConta, String nomeCorrentista, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
    }
    public void depositoConta(double valor) {
        saldo += valor;
    }

    public void saqueConta(double valor) {
        if(valor>saldo){
            System.out.println("Não há saldo suficiente.");
        } else if (saldo < 5) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            saldo-=valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
