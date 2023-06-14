package Exercicio2;

import java.time.DayOfWeek;

public class DiaDaFeira {
    public static String melhorDiaDeFeira(DayOfWeek semana) {

        if (semana == DayOfWeek.SUNDAY) {
            return "Hoje é domingo e é o melhor dia para ir à feira.";
        } else {
            return "Hoje não é o melhor dia para ir à feira.";
        }
    }
}
