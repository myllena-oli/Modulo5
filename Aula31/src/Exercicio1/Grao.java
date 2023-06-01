package Exercicio1;

class Grao extends Alimento {
    public Grao(String nome, double quantidade) {
        super(nome, quantidade);
    }

    @Override
    public String getTipo() {
        return "GRÃOS";
    }

    public Grao adicionarGrao() {

        double quantidade;
        while (true) {
            System.out.print("Informe a quantidade de graos em gramas com ponto: ");
            String quantidadeEmString = ler.nextLine();

            if (quantidadeEmString.isEmpty()) {
                throw new UnsupportedOperationException("Não é permitido inserir valor vazio");
            }


            if (quantidadeEmString.contains("-")) {
                System.out.println("Não é possível inserir números negativos!");
                continue;
            }

            if (quantidadeEmString.contains(".")) {
                quantidade = Double.parseDouble(quantidadeEmString);
                System.out.println("O número digitado é um double: " + quantidade);
                break;
            } else {
                throw new NumberFormatException("Para grãos, a quantidade deve ser informada com ponto.");
            }
        }
        System.out.print("Informe o nome do grão: ");
        String nome = ler.nextLine();

        if (nome.isEmpty()) {
            throw new UnsupportedOperationException("Não é permitido inserir nome vazio");
        }

        return new Grao(nome, quantidade);
    }

}
