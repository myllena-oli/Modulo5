package Exercicio1;

class Verdura extends Alimento {
    public Verdura(String nome, double quantidade) {
        super(nome, quantidade);
    }

    @Override
    public String getTipo() {
        return "VERDURA";
    }

    public Verdura adicionarVerdura() {

        double quantidade;
        while (true) {

            System.out.print("Informe a quantidade da verdura em gramas com ponto: ");
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
                throw new NumberFormatException("Para verdura, a quantidade deve ser informada com ponto.");
            }
        }
        System.out.print("Informe o nome da verdura: ");
        String nome = ler.nextLine();

        if (nome.isEmpty()) {
            throw new UnsupportedOperationException("Não é permitido inserir nome vazio");
        }
        return new Verdura(nome, quantidade);
    }
}
