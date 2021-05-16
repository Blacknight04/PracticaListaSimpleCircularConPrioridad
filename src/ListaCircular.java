/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramon Ruiz
 */
public class ListaCircular extends ListaSimple {
    
    public ListaCircular(){
        super();
    }
           
    @Override
    public boolean insertar(char dato, int nivel){
        boolean resp = super.insertar(dato, nivel);
        if(!resp) return false;
        fin.setSig(ini);
        return true;
    }
    
    @Override
    public boolean eliminar(){
        if(!estaVacia()) fin.setSig(null);
        boolean resp = super.eliminar();
        if(!resp) return false;
        if(!estaVacia()) fin.setSig(ini);
        return true;
    }
    
   
    
}
