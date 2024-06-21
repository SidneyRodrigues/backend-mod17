import domain.Carro;
import domain.Civic;
import domain.Hyundai;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCarros<T extends Carro> {
    private List<T> carros = new ArrayList<>();

    public void adicionarCarro(T carro) {
        carros.add(carro);
    }

    public void exibirCarros() {
        for (T carro : carros) {
            carro.exibirInfo();
        }
    }

    public static void main(String[] args) {
        ListaDeCarros<Carro> listaDeCarros = new ListaDeCarros<>();

        listaDeCarros.adicionarCarro(new Civic("Honda Civic Si", 2020));
        listaDeCarros.adicionarCarro(new Hyundai("Hyundai HB20", 2014));

        listaDeCarros.exibirCarros();
    }
}
