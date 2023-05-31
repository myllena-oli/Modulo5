package Exercicio3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dicionario {
    public void criarMap() {
        Map<String, List<String>> ObjetoCor = new HashMap<>();

        ObjetoCor.put("bola", new ArrayList<>(List.of("azul")));
        ObjetoCor.put("boneca", new ArrayList<>(List.of("amarela")));
        ObjetoCor.put("dado", new ArrayList<>(List.of("rosa")));
        ObjetoCor.put("fone", new ArrayList<>(List.of("preto")));
        ObjetoCor.put("copo", new ArrayList<>(List.of("verde")));

        for (String percorrer : ObjetoCor.keySet()) {

            System.out.println(percorrer + " -> " + ObjetoCor.get(percorrer));
        }
    }
}