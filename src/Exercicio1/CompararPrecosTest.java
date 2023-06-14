package Exercicio1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class CompararPrecosTest {

    CompararPrecos compararPrecos = new CompararPrecos();

    @Test
    public void produto1MaisBarato() {
        Produtos produto1 = new Produtos("Hamburguer", new BigDecimal("15.00"));
        Produtos produto2 = new Produtos("Batata", new BigDecimal("18.50"));
        Produtos produto3 = new Produtos("Hamburguer Duplo", new BigDecimal("32.00"));

        Produtos produtoMaisBarato = compararPrecos.retornaProdutoParaCompra(produto1, produto2, produto3);
        Assertions.assertEquals(produto1.getNome(), produtoMaisBarato.getNome());
    }


    @Test
    public void produto2MaisBarato() {
        Produtos produto1 = new Produtos("Hamburguer", new BigDecimal("25.00"));
        Produtos produto2 = new Produtos("Batata", new BigDecimal("12.50"));
        Produtos produto3 = new Produtos("Hamburguer Duplo", new BigDecimal("32.00"));

        Produtos produtoMaisBarato = compararPrecos.retornaProdutoParaCompra(produto1, produto2, produto3);
        Assertions.assertEquals(produto2.getNome(), produtoMaisBarato.getNome());
    }


    @Test
    public void produto3MaisBarato() {
        Produtos produto1 = new Produtos("Hamburguer", new BigDecimal("25.00"));
        Produtos produto2 = new Produtos("Batata", new BigDecimal("12.50"));
        Produtos produto3 = new Produtos("Refrigerante", new BigDecimal("5.00"));

        Produtos produtoMaisBarato = compararPrecos.retornaProdutoParaCompra(produto1, produto2, produto3);
        Assertions.assertEquals(produto3.getNome(), produtoMaisBarato.getNome());
    }

}
