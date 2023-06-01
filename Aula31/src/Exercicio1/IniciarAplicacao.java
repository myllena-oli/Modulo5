package Exercicio1;

import java.util.*;

public class IniciarAplicacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<Alimento> compras = new ArrayList<>();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("\nQual tipo de alimento quer adicionar");
            System.out.println("1. Adicionar VERDURA");
            System.out.println("2. Adicionar LEGUME");
            System.out.println("3. Adicionar GRÃOS");
            System.out.println("4. Adicionar OUTROS");
            System.out.println("5. Sair do menu");
            System.out.println("Escolha uma opção: ");

            String opcao = ler.nextLine();

            if (opcao.equals("5")) {
                break;
            }

            if (opcao.equalsIgnoreCase("VERDURA") || opcao.equals("1")) {
                Verdura verdura = new Verdura("", 0);
                verdura = verdura.adicionarVerdura();
                compras.add(verdura);


            } else if (opcao.equalsIgnoreCase("LEGUME") || opcao.equals("2")) {

                Legume legume = new Legume("", 0);
                legume = legume.adicionarLegume();
                compras.add(legume);


            } else if (opcao.equalsIgnoreCase("GRÃOS") || opcao.equals("3")) {
                Grao grao = new Grao("", 0);
                grao = grao.adicionarGrao();
                compras.add(grao);


            } else if (opcao.equalsIgnoreCase("OUTROS") || opcao.equals("4")) {
                Outro outro = new Outro("", 0);
                outro = outro.adicionarOutros();
                compras.add(outro);

            } else {
                throw new IllegalArgumentException("Tipo de alimento inválido");
            }

        }

        System.out.println("\n--- LISTA DE COMPRAS ---");
        int numeroVerdura = 0;
        int numeroLegumes = 0;
        int numeroGrao = 0;
        int numeroOutro = 0;

        for (Alimento alimento : compras) {
            System.out.println(alimento.getTipo() + " - " + alimento.getNome() + " - " + alimento.getQuantidade() + " kg.");
            if (alimento.getTipo().equals("VERDURA")) {
                numeroVerdura++;
            } else if (alimento.getTipo().equals("LEGUME")) {
                numeroLegumes++;
            } else if (alimento.getTipo().equals("GRÃOS")) {
                numeroGrao++;
            } else {
                numeroOutro++;
            }
        }

        System.out.println("\n--- QUANTIDADE DE ALIMENTOS ---");

        System.out.println("Verduras: " + numeroVerdura);
        System.out.println("Legumes: " + numeroLegumes);
        System.out.println("Grãos: " + numeroGrao);
        System.out.println("Outros: " + numeroOutro);
    }
}
