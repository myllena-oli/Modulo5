package Exercicio1;

import java.math.BigDecimal;

public class Produtos {
    private String nome;
    private BigDecimal preco;

    public Produtos(String nome, BigDecimal preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

}
