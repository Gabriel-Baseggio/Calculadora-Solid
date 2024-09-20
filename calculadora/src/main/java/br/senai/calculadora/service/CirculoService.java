package br.senai.calculadora.service;

import br.senai.calculadora.entity.Circulo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.w3c.dom.css.CSSImportRule;

@Service
public class CirculoService {
    public Double calcularArea(Double raio) {
        Circulo circulo = new Circulo(raio);
        return circulo.calcularArea();
    }

    public Double calcularDiametro(Double raio) {
        Circulo circulo = new Circulo(raio);
        return circulo.calcularDiametro();
    }

    public Double calcularCircunferencia(Double raio) {
        Circulo circulo = new Circulo(raio);
        return circulo.calcularCircunferencia();
    }

}
