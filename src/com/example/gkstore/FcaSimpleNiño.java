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
public class FcaSimpleNiño extends EmpresaTiendaRopa {


    
    public FcaSimpleNiño(){
        
    }
    protected Ropa comRopa(String tipo) {
        if(tipo.equals("short"))
        {
        	return new shorts("cosas",4,"hola");
        }
        if(tipo.equals("pantalon"))
        {
        	return new pantalonni("cosas",4,"hola");
        }
        if(tipo.equals("playera"))
        {
        	return new playera("cosas",4,"hola");
        }
       else 
    	   return new camiseta("cosas",4,"hola"); 
    
    }
}
