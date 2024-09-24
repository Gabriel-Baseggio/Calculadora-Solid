package br.senai.calculadora.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Circulo implements Forma{

    private Double raio;

    @Override
    public Double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public Double calcularDiametro(){
        return raio * 2;
    }

    public Double calcularCircunferencia(){
        return 2 * Math.PI * raio;
    }

}
