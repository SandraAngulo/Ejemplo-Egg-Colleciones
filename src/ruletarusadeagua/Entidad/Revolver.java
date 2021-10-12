/*Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual
(posición del tambor que se dispara, puede que esté el agua o no) y posición agua (la
posición del tambor donde se encuentra el agua). Estas dos posiciones, se generarán
aleatoriamente.

Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
valores deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)


 */
package ruletarusadeagua.Entidad;

public class Revolver {
    //Atributos posicion actual,(posicion de agua//bala)

    private int posicionActual;
    private int posicionDeAgua;//bala

    public Revolver() {
    }

    public void llenarRevolver() {
        this.posicionActual = (int) (Math.random() * 6 + 1);
        this.posicionDeAgua = (int) (Math.random() * 6 + 1);
    }

    public boolean mojar() {
        if(posicionActual == posicionDeAgua){
           System.out.println("El jugador ha sido mojado "); 
        }
        return posicionActual == posicionDeAgua ;
        
    }

    public void siguienteChorro() {
        if (posicionActual == 6) {
            posicionActual = 1;
        } else {
            posicionActual = posicionActual + 1;
        }

    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionDeAgua=" + posicionDeAgua + '}';
    }

}
