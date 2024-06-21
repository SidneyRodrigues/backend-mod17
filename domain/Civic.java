package domain;

public class Civic extends Carro {
    public Civic(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Civic: " + getModelo() + " - Ano: " + getAno());
    }
}

