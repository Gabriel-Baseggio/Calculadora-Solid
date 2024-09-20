package br.senai.calculadora.entity;

import java.util.List;

public class Quadrilatero extends Poligono {

    public Quadrilatero(List<Double> medidasLados) {
        super(medidasLados);
    }

    @Override
    public Double calcularArea() {
        return this.medidasLados.get(0) * this.medidasLados.get(1);
    }

    @Override
    public Double calcularPerimetro() {
        return this.medidasLados.stream().reduce(0.0, Double::sum);
    }

    @Override
    public String toString() {
        return "Quadrilátero{" +
                "medidasLados=" + medidasLados +
                '}';
    }

}
