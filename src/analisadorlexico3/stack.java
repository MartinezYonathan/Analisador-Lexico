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
public class stack {
    static public String[] pila=new String[300];
    static public int cima;

    // métodos públicos

    public static void limpia_pila() {
	    cima=0;
	    pila[cima]="$";          
    }
    
    public static void push(String prompt) {
	    cima++;
	    pila[cima]=prompt;
    }

    public static String pop() {
	    cima--;
        return pila[cima+1];
    }

    public static String tope() {
	    return pila[cima];
    }
 
}
