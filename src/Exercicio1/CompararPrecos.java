package Exercicio1;

public class CompararPrecos {
    public Produtos retornaProdutoParaCompra(Produtos produto1, Produtos produto2, Produtos produto3) {

        int primeiraComparacao = produto1.getPreco().compareTo(produto2.getPreco());
        int segundaComparacao = produto1.getPreco().compareTo(produto3.getPreco());
        int terceiraComparacao = produto2.getPreco().compareTo(produto3.getPreco());

        if (primeiraComparacao <= 0) {
            if (segundaComparacao <= 0) {
                return produto1;
            } else {
                return produto3;
            }
        } else {
            if (terceiraComparacao <= 0) {
                return produto2;
            } else {
                return produto3;
            }
        }

    }
}
