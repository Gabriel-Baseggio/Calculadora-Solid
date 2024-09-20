package br.senai.calculadora.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Triangulo extends Poligono {

    @Override
    public Double calcularArea() {
        return null;
    }

    @Override
    public Double calcularPerimetro() {
        return null;
    }

    public static boolean verificarLados() {
        return true;
    }

}
