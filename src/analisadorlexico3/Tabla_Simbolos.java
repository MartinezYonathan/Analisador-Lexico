/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisadorlexico3;

/**
 *
 * @author MABY
 */
public class Tabla_Simbolos {
    private int posicion;
    private String nombre;
    private int clase;

    public Tabla_Simbolos(int posicion, String nombre, int clase) {
        this.posicion = posicion;
        this.nombre = nombre;
        this.clase = clase;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getClase() {
        return clase;
    }

    public void setClase(int clase) {
        this.clase = clase;
    }
    
    
    
}
