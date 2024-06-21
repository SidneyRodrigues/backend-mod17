package domain;

public class Hyundai extends Carro {

    public Hyundai(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public void exibirInfo() {
        System.out.println("HB20: " + getModelo() + " - Ano: " + getAno());
    }
}
