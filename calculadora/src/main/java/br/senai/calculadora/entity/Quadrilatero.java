package br.senai.calculadora.entity;

import java.util.List;

public class Quadrilatero extends PoligonoRegular {

    public Quadrilatero(Double medidaLado) {
        super(medidaLado, 4);
    }

    @Override
    public Double calcularArea() {
        return medidaLado * medidaLado;
    }

}
