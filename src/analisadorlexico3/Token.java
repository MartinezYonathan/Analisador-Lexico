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
public class Token {
    private int clase;
    private String valor;
    private String nombre;

    public Token(int clase, String valor, String nombre) {
        this.clase = clase;
        this.valor = valor;
        this.nombre = nombre;
    }

    public int getClase() {
        return clase;
    }

    public void setClase(int clase) {
        this.clase = clase;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
