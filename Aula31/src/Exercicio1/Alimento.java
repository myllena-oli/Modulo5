package Exercicio1;

import java.util.Scanner;

abstract class Alimento {
    protected String nome;
    protected double quantidade;
    Scanner ler = new Scanner(System.in);

    public Alimento(String nome, double quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public abstract String getTipo();

    public String getNome() {
        return nome;
    }

    public double getQuantidade() {
        return quantidade;
    }

}