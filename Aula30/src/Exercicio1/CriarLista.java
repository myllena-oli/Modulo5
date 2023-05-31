package Exercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CriarLista {

    public void criarLista(){
        Integer vetor[] = {1, 5, 5, 6, 7, 8, 8, 8};
        List<Integer> lista = new ArrayList<>();
        Collections.addAll(lista, vetor);
        System.out.println(lista);
    }

}
