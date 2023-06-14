package Exercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChecarParidadeTest {
    ChecarParidade checarParidade = new ChecarParidade();

    @Test
    public void oNumeroSeraPar() {
        boolean paridade = checarParidade.numeroEhPar(4);
        assertTrue(paridade);
    }

    @Test
    public void oNumeroNaoSeraPar() {
        boolean paridade = checarParidade.numeroEhPar(3);
        assertFalse(paridade);
    }
}
