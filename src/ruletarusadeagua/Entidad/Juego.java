/*Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de
Jugadores) y Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
jugadores y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego


 */
package ruletarusadeagua.Entidad;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    Scanner Leer = new Scanner(System.in).useDelimiter("\n");
    public ArrayList<Jugador> Jugadores= new ArrayList<>();
    public Revolver revolver;
   

    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r) {
        this.Jugadores = jugadores;
        this.revolver = r;
    }

    public void ronda() {
        terminar:
        do {
            for (Jugador j : Jugadores) {
                j.disparo(revolver);
                if(j.isMojado()){
                    break terminar;
                }     //Si el jugador j esta mojado,
            }                                       //se sale de todos los bucles por debajo de terminar
        } while (true);
    }
}