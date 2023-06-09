package Exercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x, y;
        System.out.println("Eu sei dividir!");
        while (true) {
            try {
                System.out.println("Informe o primeiro valor: ");
                x = teclado.nextInt();
            } catch (InputMismatchException excecao) {
                System.out.println("InputMismatchException: É necessário digitar um número inteiro!");
                teclado.nextLine();
                continue;
            }
            break;
        }
        while (true) {
            try {
                System.out.println("Informe o segundo valor: ");
                y = teclado.nextInt();
                if (y == 0) {
                    throw new ArithmeticException("Não é permitido dividir por 0.");
                }
            } catch (InputMismatchException excecao) {
                System.out.println("InputMismatchException: É necessário digitar um número inteiro!");
                teclado.nextLine();
                continue;
            } catch (ArithmeticException excecao) {
                System.out.println(excecao.getMessage());
                teclado.nextLine();
                continue;
            }
            break;
        }

        double r = ((double) x / (double) y);
        System.out.println("O resultado da divisão é " + r);
    }
}
