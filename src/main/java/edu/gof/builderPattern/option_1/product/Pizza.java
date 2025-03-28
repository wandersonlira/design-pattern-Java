package edu.gof.builderPattern.option_1.product;

public class Pizza {
    private final String massa;
    private final String cobertura;
    private final String tamanho;


    public Pizza(String massa, String cobertura, String tamanho) {
        this.massa = massa;
        this.cobertura = cobertura;
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "massa='" + massa + '\'' +
                ", cobertura='" + cobertura + '\'' +
                ", tamanho='" + tamanho + '\'' +
                '}';
    }
}

