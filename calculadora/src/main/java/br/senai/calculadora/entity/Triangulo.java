package br.senai.calculadora.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Triangulo extends PoligonoRegular {

    @Override
    public Double calcularArea() {
        return medidaLado * calcularAltura() / 2;
    }

    public Double calcularAltura() {
        return Math.sqrt(3) * medidaLado / 2;
    }

}
