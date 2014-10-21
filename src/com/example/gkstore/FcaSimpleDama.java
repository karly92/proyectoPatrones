/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.gkstore;

/**
 *
 * @author Karii Gs
 */
public class FcaSimpleDama extends EmpresaTiendaRopa {
    
    public FcaSimpleDama(){
     
    }
            
    protected Ropa comRopa(String tipo) {
        if(tipo.equals("falda"))
        {
            return new falda("cosas",4,"hola");
        }
        if(tipo.equals("blusa"))
        {
            return new Blusa("cosas",4,"hola");
        }
        if(tipo.equals("jeans"))
        {
            return new jeans("cosas",4,"hola");
        }
       else 
        return new accesorios("cosas",4,"hola"); 
    
    }
}
