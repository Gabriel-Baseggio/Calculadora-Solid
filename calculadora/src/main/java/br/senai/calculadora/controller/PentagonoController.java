package br.senai.calculadora.controller;

import br.senai.calculadora.controller.dto.PoligonoRegularDTO;
import br.senai.calculadora.service.PentagonoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pentagono")
@AllArgsConstructor
public class PentagonoController {

    private PentagonoService pentagonoService;

    @PostMapping("/area")
    public ResponseEntity<?> calcularArea(@RequestBody PoligonoRegularDTO dto) {
        return new ResponseEntity<>(pentagonoService.calcularArea(dto.medidaLado()), HttpStatus.OK);
    }

    @PostMapping("/perimetro")
    public ResponseEntity<?> calcularPerimetro(@RequestBody PoligonoRegularDTO dto) {
        return new ResponseEntity<>(pentagonoService.calcularPerimetro(dto.medidaLado()), HttpStatus.OK);
    }

    @PostMapping("/apotema")
    public ResponseEntity<?> calcularApotema(@RequestBody PoligonoRegularDTO dto) {
        return new ResponseEntity<>(pentagonoService.calcularApotema(dto.medidaLado()), HttpStatus.OK);
    }

}
