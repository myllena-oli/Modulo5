package Exercicio4;

public class SeguroDeVida extends TiposDeConta implements Tributos {
    public SeguroDeVida(int numeroConta, String nome, String cpf, double saldo) {
        super(numeroConta, nome, cpf, saldo);
    }

    @Override
    public double calcularTributo(double valor) {
        return 42;
    }
}
