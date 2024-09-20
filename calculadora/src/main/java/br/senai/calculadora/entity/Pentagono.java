package br.senai.calculadora.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
public class Pentagono extends PoligonoRegular {

    public Pentagono(Double medidaLado) {
        super(medidaLado, 5);
    }

    @Override
    public Double calcularArea() {
        return 5 * medidaLado * calcularApotema();
    }

    public Double calcularApotema() {
        Triangulo triangulo = new Triangulo(medidaLado);
        return triangulo.calcularAltura();
    }

}
