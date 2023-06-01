package Exercicio2;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Moedas {
    private String nome;
    private double cotacao;

    public Moedas(String nome, double cotacao) {
        this.nome = nome;
        this.cotacao = cotacao;
    }

    public String getNome() {
        return nome;
    }

    public double getCotacao() {
        return cotacao;
    }

    public Moedas preencherMoeda(String moeda) {

        switch (moeda.toLowerCase()) {

            case "dólar americano":
                return new Moedas("Dólar americano", 5.03);
            case "dólar canadense":
                return new Moedas("Dólar canadense", 3.71);
            case "euro":
                return new Moedas("Euro", 5.38);
            case "libra esterlina":
                return new Moedas("Libra Esterlina", 6.27);
            default:
                throw new IllegalArgumentException("Tipo de moeda inválido. ");
        }
    }

    public BigDecimal converterParaReal(BigDecimal valor, Moedas moeda) {
        return valor.multiply(BigDecimal.valueOf(moeda.getCotacao()));
    }

    public String obterDiaAtual() {

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);

    }
}
