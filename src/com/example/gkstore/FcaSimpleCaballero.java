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
public class FcaSimpleCaballero extends EmpresaTiendaRopa {
      
	public FcaSimpleCaballero (){
        
    }
    protected Ropa comRopa(String tipo) {
        if(tipo.equals("pantalon"))
        {
        	return new pantalon("cosas",4,"hola");
        }
        if(tipo.equals("camisa"))
        {
        	return new camisa("cosas",4,"hola");
        }
        if(tipo.equals("corbata"))
        {
        	return new corbata("cosas",4,"hola");
        }
       else 
    	   return new trajes("cosas",4,"hola"); 
    }

   
}