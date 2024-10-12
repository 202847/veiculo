package br.edu.unisep.veiculo.model;

public class Veiculo {
    public String placaVeiculo;
    public String modelo;
    public int qtdRodas;

    public Veiculo(String placaVeiculo, String modelo, int qtdRodas) {
        this.placaVeiculo = placaVeiculo;
        this.modelo = modelo;
        this.qtdRodas = qtdRodas;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public void exibirDetalhes() {

    }

    public void acelerador() {

    }
}
