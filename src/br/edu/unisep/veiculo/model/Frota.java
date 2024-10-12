package br.edu.unisep.veiculo.model;

import java.util.ArrayList;
import java.util.List;

public class Frota {
    private List<Veiculo> veiculos = new ArrayList<Veiculo>();

    public Frota() {
        veiculos = new ArrayList<>();
    }

    public void adicionar(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void exibir() {
        System.out.println(veiculos);
    }
}
