package com.vrdark33.ahorcado.service;

import com.vrdark33.ahorcado.model.JuegoAhorcado;
import org.springframework.stereotype.Service;


@Service
public class GameService {

     private JuegoAhorcado juego;

     public GameService(){
        this.juego = new JuegoAhorcado("solid", 6);

     }

     public String getEstadoPalabra(){
        return juego.getEstadoPalabra();
     }

     public int getIntentosRestantes(){
        return juego.getIntentosRestantes();
     }

     public String adivinarLetra(char letra){
        boolean correcta = juego.adivinarLetra(Character.toLowerCase(letra));

        if (juego.haGanado()) {
            return "¡Ganaste! La palabra era: " + juego.getPalabraSecreta();
        }else if(juego.haPerdido()){
            return "Perdiste. La palabra era: " + juego.getPalabraSecreta();
        }else{
            return correcta ? "¡Letra correcta!" : "Letra incorrecta.";
        }
     }


     public void reiniciarJuego() {
        this.juego = new JuegoAhorcado("java", 6);
    }

    public void iniciarJuegoConPalabra(String palabra){
      this.juego = new JuegoAhorcado(palabra.toLowerCase(), 6);
    }




}