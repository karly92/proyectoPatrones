/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.gkstore;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Karii Gs
 */

//Formas envio es el patron de estrategia sus clases derivadas son EnvioCorreo, EnvioPaqueteria y EnvioAereo
// A su vez esta clase es un sujeto que notifica a la clase NotaProdcutos cada vez que se agrega un producto
public abstract class EmpresaTiendaRopa implements Subject,FormasEnvio {
    protected ArrayList lista = new ArrayList();
    protected ArrayList observers = new ArrayList();
    protected FormasEnvio forma;
    protected abstract Ropa comRopa(String tipo);  
    
    public Ropa ordenCompra(String tipo)
    {
    	Ropa c;
    	c=comRopa(tipo);
    	c.leerdescripcion();
    	c.leerprecio();
    	add(c);
    	enviar();
    	return c;
    }
    
    public void add(Ropa r){
        lista.add(r);
        notifyObservers();    
    }
    
    public Iterator iterator(){
    
        return lista.iterator();
    }
    
    public void addObserver(Observer o){
        observers.add(o);
    }
    
    public void removeObserver(Observer o){
        observers.remove(o);
    }
    
    public void notifyObservers(){
        Iterator i = observers.iterator();
        while(i.hasNext())
        {
            Observer o = (Observer) i.next();
            
            o.update(this);
        }
    }
    
    public void enviar(){
        forma.enviar();
    }
    
}
