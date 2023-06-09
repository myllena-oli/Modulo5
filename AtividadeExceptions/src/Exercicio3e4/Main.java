package Exercicio3e4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        Scanner ler = new Scanner(System.in);

        System.out.println("Quanto você quer depositar: ");
        minhaConta.deposita(ler.nextDouble());
        minhaConta.setLimite(minhaConta.getSaldo());
        System.out.printf("O seu limite de uso de cartão será: %.2f.\n", minhaConta.getLimite());
        while (true) {
            try {
            System.out.printf("Quanto deseja sacar? Seu saldo é %.2f.\n", minhaConta.getSaldo());
            minhaConta.saca(ler.nextDouble());
            }catch (ContaExcecao excecao) {
                System.out.println("Não é permitido realizar um saque maior que o seu saldo!");
                continue;
            }
            break;
        }
        System.out.printf("Seu saldo é %.2f reais.", minhaConta.getSaldo());
    }
}
