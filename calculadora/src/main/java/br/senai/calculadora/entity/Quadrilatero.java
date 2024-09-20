package br.senai.calculadora.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Quadrilatero extends PoligonoRegular {

    public Quadrilatero(Double medidaLado) {
        super(medidaLado, 4);
    }

    @Override
    public Double calcularArea() {
        return Math.pow(medidaLado, 2);
    }

}
