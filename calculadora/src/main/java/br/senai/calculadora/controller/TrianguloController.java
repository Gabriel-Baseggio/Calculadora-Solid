package br.senai.calculadora.controller;

import br.senai.calculadora.controller.dto.PoligonoRegularDTO;
import br.senai.calculadora.service.TrianguloService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/triangulo")
@AllArgsConstructor
public class TrianguloController {

    private TrianguloService trianguloService;

    @PostMapping("/area")
    public ResponseEntity<?> calcularArea(@RequestBody PoligonoRegularDTO dto) {
        return new ResponseEntity<>(trianguloService.calcularArea(dto.medidaLado()), HttpStatus.OK);
    }

    @PostMapping("/perimetro")
    public ResponseEntity<?> calcularPerimetro(@RequestBody PoligonoRegularDTO dto) {
        return new ResponseEntity<>(trianguloService.calcularPerimetro(dto.medidaLado()), HttpStatus.OK);
    }

    @PostMapping("/altura")
    public ResponseEntity<?> calcularAltura(@RequestBody PoligonoRegularDTO dto) {
        return new ResponseEntity<>(trianguloService.calcularAltura(dto.medidaLado()), HttpStatus.OK);
    }

}
