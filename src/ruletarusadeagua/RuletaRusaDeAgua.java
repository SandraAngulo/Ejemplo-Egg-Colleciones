/*
Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se
trata de un número de jugadores, que, con un revolver de agua, el cual posee una sola
carga de agua, se dispara y se moja.
*/
package ruletarusadeagua;


import java.util.ArrayList;
import java.util.Scanner;
import ruletarusadeagua.Entidad.Juego;
import ruletarusadeagua.Entidad.Jugador;
import ruletarusadeagua.Entidad.Revolver;


public class RuletaRusaDeAgua {

    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList();
        Revolver r = new Revolver();
        r.llenarRevolver();

        System.out.println("Ingresar la cantidad de jugadores");
        int n = sc.nextInt();
        if(n>6){
            n=6;
        }
        
        for (int i = 1; i <= n; i++) {
            jugadores.add(new Jugador(i));
        }

        Juego j = new Juego();
        j.llenarJuego(jugadores, r);
        j.ronda();

       //System.out.println(" NOMBRE   | MOJADO");
       //jugadores.forEach(aux -> System.out.println(aux));
    }

    
}
