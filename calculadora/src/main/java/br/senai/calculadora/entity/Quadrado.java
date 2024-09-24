package br.senai.calculadora.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Quadrado extends PoligonoRegular {

    public Quadrado(Double medidaLado) {
        super(medidaLado, 4);
    }

    @Override
    public Double calcularArea() {
        return Math.pow(medidaLado, 2);
    }

}
