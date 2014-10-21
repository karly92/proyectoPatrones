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
 * @author karla
 */
public class NotaProductos implements Observer {
    
    private ArrayList productos;
    private EmpresaTiendaRopa emp;
    public String nota;
    
    public NotaProductos(EmpresaTiendaRopa emp){
        nota = "";
        this.emp = emp;
        emp.addObserver(this);
    }
    
    public void agregarProducto(Ropa r){
        productos.add(r);
    }
    public void update(Subject o){
        
        /*if(o==emp){
            Ropa ropa;
            float total = 0;
            System.out.println("Nota de las prendas ");
            Iterator i = emp.iterator();
            while(i.hasNext())
            {
                
                ropa = (Ropa)i.next();
                System.out.println(ropa.leeridentificador()+":"+ropa.leerprecio()*ropa.leercantidad()+"\n");
                total += ropa.leerprecio()*ropa.leercantidad();
                
            }
           System.out.println("Total:"+total);
        }*/
        
    }
    
    
}
