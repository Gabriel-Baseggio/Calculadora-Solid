package br.senai.calculadora.service;

import br.senai.calculadora.entity.Pentagono;
import org.springframework.stereotype.Service;

@Service
public class PentagonoService {

    public Double calcularArea(Double medidaLado) {
        Pentagono pentagono = new Pentagono(medidaLado);
        return pentagono.calcularArea();
    }

    public Double calcularPerimetro(Double medidaLado) {
        Pentagono pentagono = new Pentagono(medidaLado);
        return pentagono.calcularPerimetro();
    }

    public Double calcularApotema(Double medidaLado) {
        Pentagono pentagono = new Pentagono(medidaLado);
        return pentagono.calcularApotema();
    }

}
