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

    public Double calcularAltura(Double lado1, Double lado2, Double lado3, Double lado4) {
        return Math.min(lado1, lado2);
    }

    public Double calcularPerimetro() {
        return this.quantidadeLados * this.medidaLado;
    }


}
