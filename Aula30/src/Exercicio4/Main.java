package Exercicio4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int usuario=0;


        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(123, "321");
        usuarios.put(456, "654");
        usuarios.put(789, "987");

        while (true) {
            System.out.print("Digite o número da conta: ");
            usuario = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();

            if (usuarios.containsKey(usuario) && usuarios.get(usuario).equals(senha)) {
                System.out.println("Login realizado com sucesso!");
                break;
            } else {
                System.out.println("Usuário ou senha incorretos.");
            }
        }


        ContaPoupanca poupanca = new ContaPoupanca(123, "Marcella", "01234567890", 200);
        ContaCorrente corrente = new ContaCorrente(456, "Luana", "23456789012", 150);
        SeguroDeVida seguraVida = new SeguroDeVida(789, "Teresa", "34567890123", 180);

        if (usuario==poupanca.getNumeroConta()){
            System.out.printf("O imposto da poupança é: R$%.2f\n", poupanca.calcularTributo(poupanca.getSaldo()));
        } else if (usuario==corrente.getNumeroConta()) {
            System.out.printf("O imposto da conta corrente é: R$%.2f\n", corrente.calcularTributo(corrente.getSaldo()));
        } else if(usuario==seguraVida.getNumeroConta()){
            System.out.printf("O imposto do Seguro de Vida é: R$%.2f\n", seguraVida.calcularTributo(seguraVida.getSaldo()));
        }else {
            System.out.println("Não a conta à analisar.");
        }

    }
}
