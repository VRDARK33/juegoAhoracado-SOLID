package com.vrdark33.ahorcado.model;

public class JuegoAhorcado {

        //1. atributos
        private String palabra;
        private char[] letrasAdivinadas;
        private int intentos ;
        private int intentosMaximos ;

        public JuegoAhorcado(String palabra, int intentosMaximos){
            this.intentosMaximos = intentosMaximos;
            this.intentos = 0;
            this.palabra = palabra.toLowerCase();

            letrasAdivinadas = new char[palabra.length()];
            for (int i = 0;i<letrasAdivinadas.length;i++){
                letrasAdivinadas[i] = '_';
            }

        }

        public boolean adivinarLetra (char letra){
            boolean letraCorrecta = false;

            for (int i= 0;i<palabra.length();i++){
                if(palabra.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if(!letraCorrecta){
                intentos++;
            }

            return letraCorrecta;
        }

        public String getEstadoPalabra(){
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i<letrasAdivinadas.length; i++){
                sb.append(letrasAdivinadas[i]).append(" ");
            }

            return sb.toString();
        }

        public boolean haGanado(){

            for(int i = 0; i<letrasAdivinadas.length;i++){
                if(letrasAdivinadas[i] == '_'){
                    return false;
                }
            }
            return true;
        }

        public boolean haPerdido(){
            return intentos >= intentosMaximos;
        }

        public int getIntentosRestantes(){
            return intentosMaximos - intentos;
        }


        public String getPalabraSecreta(){
        return palabra;
        }
}
