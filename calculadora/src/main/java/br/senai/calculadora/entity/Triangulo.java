package br.senai.calculadora.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
public class Triangulo extends PoligonoRegular {

    public Triangulo(Double medidaLado) {
        super(medidaLado, 3);
    }

    @Override
    public Double calcularArea() {
        return medidaLado * calcularAltura() / 2;
    }

    public Double calcularAltura() {
        return Math.sqrt(3) * medidaLado / 2;
    }

}
