package br.senai.calculadora.controller;

import br.senai.calculadora.controller.dto.CirculoDTO;
import br.senai.calculadora.service.CirculoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/circulo")
@AllArgsConstructor
public class CirculoController {
    private final CirculoService circuloService;

    @PostMapping("/circunferencia")
    public ResponseEntity<?> calcularCircunferencia(@RequestBody CirculoDTO dto) {
        return ResponseEntity.ok(circuloService.calcularCircunferencia(dto.raio()));
    }

    @PostMapping("/diametro")
    public ResponseEntity<?> calcularDiametro(@RequestBody CirculoDTO dto) {
        return ResponseEntity.ok(circuloService.calcularDiametro(dto.raio()));
    }

    @PostMapping("/area")
    public ResponseEntity<?> calcularArea(@RequestBody CirculoDTO dto) {
        return ResponseEntity.ok(circuloService.calcularArea(dto.raio()));
    }
}
