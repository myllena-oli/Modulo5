package Exercicio4;

public class ContaPoupanca extends TiposDeConta implements Tributos {

    public ContaPoupanca(int numeroConta, String nome, String cpf, double saldo) {
        super(numeroConta, nome, cpf, saldo);
    }

    @Override
    public double calcularTributo(double valor) {
        return 0;
    }
}
