package br.edu.unisep.veiculo.view;

import br.edu.unisep.veiculo.model.Frota;
import br.edu.unisep.veiculo.model.Moto;
import br.edu.unisep.veiculo.model.Veiculo;

public class Principal {
    public static void main(String[] args) {
        Frota frota = new Frota();

        Veiculo moto = new Moto("123ASDF", "TITAN", 2, "Longo");
        frota.adicionar(moto);
        moto.exibirDetalhes();
    }
}
