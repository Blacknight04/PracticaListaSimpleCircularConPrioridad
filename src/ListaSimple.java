/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramon Ruiz
 */
public class ListaSimple {
    protected Nodo ini;
    protected Nodo fin;
    
    public ListaSimple(){
        ini=fin=null;
    }
    
    public boolean insertar(char dato, int nivel){
        Nodo nuevo = new Nodo(dato, nivel);
        if(nuevo==null)return false;
        
        if(estaVacia()){
        ini = fin = nuevo;
        return true;
        }
        fin.setSig(nuevo);
        fin=nuevo;
        return true;
    }
    
    public boolean eliminar(){
        if(estaVacia()) return false;
        if(hayUnNodo()){
            ini=fin=null;
            return true;
        }
        Nodo temp = ini;
        ini = temp.getSig();
        temp.setSig(null);
        temp = null;
        return true;
                
    }

    boolean estaVacia() {
        return ini==null && fin==null;
    }

    protected boolean hayUnNodo() {
        return ini==fin;
    }
    
    protected int ContarNodos(){
        if(estaVacia()) return 0;
        
        int contador=1;
        for(Nodo temp=ini; temp!=fin; temp = temp.getSig()){
            contador++;
        }
        return contador;
    }
    

    public Nodo getIni() {
        return ini;
    }

    public void setIni(Nodo ini) {
        this.ini = ini;
    }

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }
    
    
}
