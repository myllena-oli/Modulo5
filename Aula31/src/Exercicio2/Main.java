package Exercicio2;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        while (true) {
            System.out.println("Boas vindas ao conversor de moedas");

            System.out.println("Qual moeda você deseja converter? \n1 - Dólar americano\n2 - Dólar canadense\n3 - Euro\n4 - Libra Esterlina");
            String tipoMoeda = ler.nextLine();

            if (tipoMoeda.equals("1")) {
                tipoMoeda = "Dólar americano";
            } else if (tipoMoeda.equals("2")) {
                tipoMoeda = "Dólar canadense";
            } else if (tipoMoeda.equals("3")) {
                tipoMoeda = "Euro";
            } else if (tipoMoeda.equals("4")) {
                tipoMoeda = "Libra Esterlina";
            }

            Moedas moeda = new Moedas("", 0);
            moeda = moeda.preencherMoeda(tipoMoeda);

            System.out.println("ATENÇÃO: Só posso converter " + tipoMoeda + " para real.");

            while (true) {
                try {
                    System.out.println("Digite o valor a ser convertido:");
                    String valorParaConverter = ler.nextLine();

                    BigDecimal valor = new BigDecimal(valorParaConverter);

                    if (valor.compareTo(BigDecimal.ZERO) <= 0) {
                        System.out.println("Valor inválido, por favor, tente novamente");
                        continue;
                    }

                    BigDecimal valorConvertido = moeda.converterParaReal(valor, moeda);
                    System.out.println("A " + moeda.getNome() + " na cotação de hoje " + moeda.obterDiaAtual() +
                            " está em " + moeda.getCotacao() + ", o valor que pediu para converter de " +
                            valor + " em reais é R$" + valorConvertido);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Para moeda, o valor monetário deve ser um número decimal");
                } catch (IllegalArgumentException e) {
                    System.out.println("Tipo de moeda inválido");
                }
            }

            System.out.println("Deseja fazer outra conversão? (S/N)");
            String opcao = ler.nextLine();
            if (opcao.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
}

