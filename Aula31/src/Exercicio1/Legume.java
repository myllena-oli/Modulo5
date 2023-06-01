package Exercicio1;

import java.util.InputMismatchException;

class Legume extends Alimento {
    public Legume(String nome, double quantidade) {
        super(nome, quantidade);
    }

    @Override
    public String getTipo() {
        return "LEGUME";
    }

    public Legume adicionarLegume() {

        int quantidade;
        while (true) {
            try {
                System.out.print("Informe a quantidade de legume em unidade: ");

                quantidade = ler.nextInt();

                if (quantidade == 0) {
                    throw new UnsupportedOperationException("Não é permitido inserir valor vazio");
                }
                if (quantidade < 0) {
                    System.out.println("Não é possível inserir números negativos!");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                throw new NumberFormatException("Para legume, a quantidade deve ser informada em unidades inteiras.");
            }
        }
        ler.nextLine();
        String nome;

        while (true) {
            try {
                System.out.print("Informe o nome do legume: ");
                nome = ler.nextLine();

                if (nome.isEmpty()) {
                    throw new UnsupportedOperationException("Não é permitido inserir nome vazio");
                } else {
                    break;
                }
            } catch (UnsupportedOperationException e) {
                System.out.println("Erro NumberFormatException: " + e.getMessage());
            }
        }

        return new Legume(nome, quantidade);

    }
}