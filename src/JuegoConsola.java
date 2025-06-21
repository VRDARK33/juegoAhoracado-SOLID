import java.util.Scanner;

public class JuegoConsola {

    private JuegoAhorcado juegoAhorcado;
    private Scanner scanner = new Scanner(System.in);


    public  void iniciarJuego(){
        System.out.println("bienvenido al juego del ahorcado ");
        System.out.println("ingrese la palabra secreta: ");
        String palabraSecreta = scanner.nextLine();
        System.out.println("ingrese la cantidad de intentos: ");
        int intentosMaximos = scanner.nextInt();

        juegoAhorcado = new JuegoAhorcado(palabraSecreta, intentosMaximos);
    }

    public void jugar(){
        while(!juegoAhorcado.haGanado() && !juegoAhorcado.haPerdido()){
            System.out.println("Palabra " + juegoAhorcado.getEstadoPalabra());
            System.out.println("intentos restantes " + juegoAhorcado.getIntentosRestantes());
            System.out.println("ingrese una letra: ");
            char letra = scanner.next().charAt(0);
            letra = Character.toLowerCase(letra);
            boolean fueCorrecta =  juegoAhorcado.adivinarLetra(letra);
            if (fueCorrecta){
                System.out.println("bien. letra correcta");
            }else{
                System.out.println("ups... letra incorrecta");
            }
        }
        if (juegoAhorcado.haGanado()){
            System.out.println("has ganado");
        }else{
            System.out.println("has perdido. la palabra secreta era: " + juegoAhorcado.getPalabraSecreta());
        }
    }
}

