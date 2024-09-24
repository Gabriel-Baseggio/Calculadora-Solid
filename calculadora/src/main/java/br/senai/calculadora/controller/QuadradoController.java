package br.senai.calculadora.controller;

import br.senai.calculadora.controller.dto.PoligonoRegularDTO;
import br.senai.calculadora.service.QuadradoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quadrilatero")
@AllArgsConstructor
public class QuadradoController {

    private QuadradoService quadradoService;

    @PostMapping("/area")
    public ResponseEntity<?> calcularArea(@RequestBody PoligonoRegularDTO dto) {
        return new ResponseEntity<>(quadradoService.calcularArea(dto.medidaLado()), HttpStatus.OK);
    }

    @PostMapping("/perimetro")
    public ResponseEntity<?> calcularPerimetro(@RequestBody PoligonoRegularDTO dto) {
        return new ResponseEntity<>(quadradoService.calcularPerimetro(dto.medidaLado()), HttpStatus.OK);
    }

}
