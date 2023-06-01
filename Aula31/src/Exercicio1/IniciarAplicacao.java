package Exercicio1;

import java.util.*;

public class IniciarAplicacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<Alimento> compras = new ArrayList<>();

        while (true) {
            try {
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
                while (true) {

                    if (opcao.equalsIgnoreCase("VERDURA") || opcao.equals("1")) {
                        Verdura verdura = new Verdura("", 0);
                        try {
                            verdura = verdura.adicionarVerdura();
                        } catch (NumberFormatException e) {
                            System.out.println("Erro NumberFormatException: " + e.getMessage());
                            continue;
                        }
                        compras.add(verdura);
                        break;


                    } else if (opcao.equalsIgnoreCase("LEGUME") || opcao.equals("2")) {
                        Legume legume = new Legume("", 0);
                        try {
                            legume = legume.adicionarLegume();
                        } catch (NumberFormatException e) {
                            System.out.println("Erro NumberFormatException: " + e.getMessage());
                            continue;
                        }
                        compras.add(legume);
                        break;

                    } else if (opcao.equalsIgnoreCase("GRÃOS") || opcao.equals("3")) {
                        Grao grao = new Grao("", 0);
                        try {
                            grao = grao.adicionarGrao();
                        } catch (NumberFormatException e) {
                            System.out.println("Erro NumberFormatException: " + e.getMessage());
                            continue;
                        }
                        compras.add(grao);
                        break;

                    } else if (opcao.equalsIgnoreCase("OUTROS") || opcao.equals("4")) {
                        Outro outro = new Outro("", 0);
                        try {
                            outro = outro.adicionarOutros();
                        } catch (NumberFormatException e) {
                            System.out.println("Erro NumberFormatException: " + e.getMessage());
                            continue;
                        }
                        compras.add(outro);
                        break;

                    } else {
                        throw new IllegalArgumentException("Tipo de alimento inválido");
                    }


                }
            } catch (IllegalArgumentException e) {
                System.out.println("Erro IllegalArgumentException: " + e.getMessage());
            }
        }

        System.out.println("\n--- LISTA DE COMPRAS ---");
        int numeroVerdura = 0;
        int numeroLegumes = 0;
        int numeroGrao = 0;
        int numeroOutro = 0;

        for (Alimento alimento : compras) {
            if (alimento.getTipo().equals("VERDURA")) {
                System.out.println(alimento.getTipo() + " - " + alimento.getNome() + " - " + alimento.getQuantidade() + " kg.");
                numeroVerdura++;
            } else if (alimento.getTipo().equals("LEGUME")) {
                System.out.printf("%s - %s - %.0f un.\n", alimento.getTipo(),alimento.getNome(), alimento.getQuantidade());
                numeroLegumes++;
            } else if (alimento.getTipo().equals("GRÃOS")) {
                System.out.println(alimento.getTipo() + " - " + alimento.getNome() + " - " + alimento.getQuantidade() + " kg.");
                numeroGrao++;
            } else {
                System.out.printf("%s - %s - %.0f un.\n", alimento.getTipo(),alimento.getNome(), alimento.getQuantidade());
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
