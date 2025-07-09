package com.vrdark33.ahorcado.controller;



import org.springframework.web.bind.annotation.*;

import java.util.Map;

import com.vrdark33.ahorcado.service.GameService;



@RestController
@RequestMapping("/api/game")
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService){
        this.gameService = gameService;
    }

    @GetMapping("/estado")
    public Map<String, Object> getEstado() {
        return Map.of(
            "palabra", gameService.getEstadoPalabra(),
            "intentosRestantes", gameService.getIntentosRestantes()
        );
    }

    
    @PostMapping("/iniciar")
    public void iniciarConPalabra(@RequestParam String palabra) {
        gameService.iniciarJuegoConPalabra(palabra);
    }
        

    


    @PostMapping("/adivinar")
    public String adivinar(@RequestParam char letra) {
        return gameService.adivinarLetra(letra);
    }

    @PostMapping("/reiniciar")
    public void reiniciar() {
        gameService.reiniciarJuego();
    }
    
    
    
}
