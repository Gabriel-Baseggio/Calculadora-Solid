package br.senai.calculadora.service;

import br.senai.calculadora.entity.Triangulo;
import org.springframework.stereotype.Service;

@Service
public class TrianguloService {

    public Double calcularArea(Double medidaLado) {
        Triangulo triangulo = new Triangulo(medidaLado);
        return triangulo.calcularArea();
    }

    public Double calcularPerimetro(Double medidaLado) {
        Triangulo triangulo = new Triangulo(medidaLado);
        return triangulo.calcularPerimetro();
    }

    public Double calcularAltura(Double medidaLado) {
        Triangulo triangulo = new Triangulo(medidaLado);
        return triangulo.calcularAltura();
    }

}
