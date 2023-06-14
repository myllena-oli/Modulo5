package Exercicio2;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiaDaFeiraTest {

    @Test
    public void daraQueEOMelhorDiaParaIrAFeira() {

        String frase = DiaDaFeira.melhorDiaDeFeira(DayOfWeek.SUNDAY);
        assertEquals("Hoje é domingo e é o melhor dia para ir à feira.", frase);
    }

    @Test
    public void daraQueNaoEOMelhorDiaParaIrAFeira() {

        String frase = DiaDaFeira.melhorDiaDeFeira(DayOfWeek.FRIDAY);
        assertEquals("Hoje não é o melhor dia para ir à feira.", frase);
    }
}
