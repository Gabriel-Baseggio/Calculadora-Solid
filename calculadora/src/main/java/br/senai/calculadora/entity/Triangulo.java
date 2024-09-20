package br.senai.calculadora.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Triangulo extends PoligonoRegular {

    @Override
    public Double calcularArea() {
        Double lado = this.medidasLados.getFirst();
        return Math.pow(lado, 2) * Math.sqrt(3) / 4;
    }

    public Double calcularAltura() {
        return null;
    }

}
