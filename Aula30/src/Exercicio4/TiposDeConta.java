package Exercicio4;
abstract class TiposDeConta{
    private int numeroConta;
    private String nome;
    private String cpf;
    private double saldo;

    public TiposDeConta(int numeroConta, String nome, String cpf, double saldo) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
}
