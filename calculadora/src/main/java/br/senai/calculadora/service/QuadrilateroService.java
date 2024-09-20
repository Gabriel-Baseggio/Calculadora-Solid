package br.senai.calculadora.service;

import br.senai.calculadora.entity.Quadrilatero;
import org.springframework.stereotype.Service;

@Service
public class QuadrilateroService {

    public Double calcularArea(Double medidaLado) {
        Quadrilatero quadrilatero = new Quadrilatero(medidaLado);
        return quadrilatero.calcularArea();
    }

    public Double calcularPerimetro(Double medidaLado) {
        Quadrilatero quadrilatero = new Quadrilatero(medidaLado);
        return quadrilatero.calcularPerimetro();
    }

}
