package Exercicio2;

import java.util.*;

public class CriarLista {

    public void criarLista(){
        Integer vetor[] = {1, 5, 5, 6, 7, 8, 8, 8};
        Set<Integer> lista = new HashSet<>();
        Collections.addAll(lista, vetor);
        System.out.println(lista);
    }

}
