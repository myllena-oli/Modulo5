package Exercicio4;

public class ContaCorrente extends TiposDeConta implements Tributos {
    public ContaCorrente(int numeroConta, String nome, String cpf, double saldo) {
        super(numeroConta, nome, cpf, saldo);
    }

    @Override
    public double calcularTributo(double valor) {
        return valor*0.01;
    }

}
