package Exercicio1;

import java.util.InputMismatchException;

class Outro extends Alimento {
    public Outro(String nome, double quantidade) {
        super(nome, quantidade);
    }

    @Override
    public String getTipo() {
        return "OUTROS";
    }

    public Outro adicionarOutros() {
        int quantidade;
        while (true) {
            try {
                System.out.print("Informe a quantidade de outros em unidade: ");

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
                throw new NumberFormatException("Para outros, a quantidade deve ser informada em unidades inteiras.");
            }
        }
        ler.nextLine();

        System.out.print("Informe o nome do 'outros': ");
        String nome = ler.nextLine();

        if (nome.isEmpty()) {
            throw new UnsupportedOperationException("Não é permitido inserir nome vazio");
        }
        return new Outro(nome, quantidade);
    }
}
