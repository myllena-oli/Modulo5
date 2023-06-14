package Exercicio4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaCorrenteTest {

    @Test
    public void oSaldoTeraOValorDe100() {
        ContaCorrente contaCorrente1 = new ContaCorrente(123, "Myllena");
        contaCorrente1.depositoConta(100);
        assertEquals(100, contaCorrente1.getSaldo());
    }
    @Test
    public void saqueNaoEfetuadoOSaldoContinuaASer4() {
        ContaCorrente contaCorrente2 = new ContaCorrente(456, "Anellym", 4);
        contaCorrente2.saqueConta(3);

        assertEquals(4, contaCorrente2.getSaldo());
    }

    @Test
    public void saqueNaoEfetuadoPoisOValorEMaiorOSaldoContinuaASer10() {
        ContaCorrente contaCorrente3 = new ContaCorrente(789, "Moana", 10);
        contaCorrente3.saqueConta(30);

        assertEquals(10, contaCorrente3.getSaldo());
    }

    @Test
    public void saqueEfetuadoOSaldoSera50() {
        ContaCorrente contaCorrente4 = new ContaCorrente(321, "Miguel", 100);
        contaCorrente4.saqueConta(50);

        assertEquals(50, contaCorrente4.getSaldo());
    }
}
