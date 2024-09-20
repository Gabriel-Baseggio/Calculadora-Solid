package br.senai.calculadora.controller;

import br.senai.calculadora.controller.dto.FormaDTO;
import br.senai.calculadora.service.QuadrilateroService;
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
public class QuadrilateroController {

    private QuadrilateroService quadrilateroService;

    @PostMapping("/area")
    public ResponseEntity<?> calcularArea(@RequestBody FormaDTO dto) {
        return new ResponseEntity<>(quadrilateroService.calcularArea(dto.medidaLado()), HttpStatus.OK);
    }

    @PostMapping("/perimetro")
    public ResponseEntity<?> calcularPerimetro(@RequestBody FormaDTO dto) {
        return new ResponseEntity<>(quadrilateroService.calcularPerimetro(dto.medidaLado()), HttpStatus.OK);
    }

}
