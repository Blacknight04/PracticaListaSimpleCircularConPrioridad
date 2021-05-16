/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramon Ruiz
 */
public class Nodo {
    private char Nodo;
    private int nivel;
    private Nodo sig;

    public Nodo(char d, int n) {
        Nodo = d;
        nivel = n;
        sig = null;
    }

    public char getNodo() {
        return Nodo;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setNodo(char Nodo) {
        this.Nodo = Nodo;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
    
    public char getDato(){
        return this.Nodo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
}
