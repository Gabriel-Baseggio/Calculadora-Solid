package br.senai.calculadora.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class Poligono implements Forma {

    protected List<Double> medidasLados;

    public Integer quantidadeDeLados() {
        return this.medidasLados.size();
    }

    public Double calcularPerimetro() {
        return this.medidasLados.stream().mapToDouble(Double::doubleValue).sum();
    }

}
