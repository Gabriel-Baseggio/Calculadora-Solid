package br.senai.calculadora.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class PoligonoRegular implements Forma {

    protected Double medidaLado;

    protected Integer quantidadeLados;

    public Double calcularPerimetro() {
        return this.quantidadeLados * this.medidaLado;
    }

}
