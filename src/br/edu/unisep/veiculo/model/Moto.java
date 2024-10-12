package br.edu.unisep.veiculo.model;

public class Moto extends Veiculo {
    public String tipoGuidao;

    public String getTipoGuidao() {
        return tipoGuidao;
    }

    public void setTipoGuidao(String tipoGuidao) {
        this.tipoGuidao = tipoGuidao;
    }

    public Moto(String placa, String modelo, int qtdRodas, String tipoGuidao) {
        super(placa, modelo, qtdRodas);
        this.tipoGuidao = tipoGuidao;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("QtdRodas " + qtdRodas);
        System.out.println("tipoGuidao " + tipoGuidao);
        System.out.println("Placa " + placaVeiculo);
        System.out.println("Modelo " + modelo);
    }

}
