package br.senai.calculadora.service;

import br.senai.calculadora.entity.Quadrado;
import org.springframework.stereotype.Service;

@Service
public class QuadradoService {

    public Double calcularArea(Double medidaLado) {
        Quadrado quadrado = new Quadrado(medidaLado);
        return quadrado.calcularArea();
    }

    public Double calcularPerimetro(Double medidaLado) {
        Quadrado quadrado = new Quadrado(medidaLado);
        return quadrado.calcularPerimetro();
    }

}
