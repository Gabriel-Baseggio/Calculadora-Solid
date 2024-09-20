package br.senai.calculadora.entity;

import java.util.List;

public abstract class Poligono {

    protected List<Double> medidasLados;

    public Integer quantidadeDeLados() {
        return this.medidasLados.size();
    }

    public abstract Double calcularPerimetro();

}
