/*
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado
(indica si está mojado o no el jugador). El número de jugadores será decidido por el
usuario, pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:9
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
 */
package ruletarusadeagua.Entidad;



public class Jugador {

    //ID,nombre,mojado
    private int id;
    public String nombre;
    private boolean mojado= false;
 

    public Jugador(int id) {
        this.id = id;
         nombre = "Jugador " + id;
    }

    public boolean isMojado() {
        return mojado;
    }  

    public boolean disparo(Revolver r) {
        mojado = r.mojar();
        r.siguienteChorro();
      
        System.out.println(this.toString());
        return mojado;
    }

    @Override
    public String toString() {
        return "Jugador{nombre=" + nombre + ", mojado=" + mojado + '}';
    }

    

    
}
