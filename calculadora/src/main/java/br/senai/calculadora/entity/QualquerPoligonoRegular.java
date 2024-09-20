package br.senai.calculadora.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
public class QualquerPoligonoRegular extends PoligonoRegular {

    @Override
    public Double calcularArea() {
        return quantidadeLados * medidaLado * calcularApotema();
    }

    public Double calcularApotema() {
        Triangulo triangulo = new Triangulo(medidaLado);
        return triangulo.calcularAltura();
    }

}
