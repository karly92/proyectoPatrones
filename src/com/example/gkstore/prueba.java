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
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     System.out.println("*************FABRICA DE CABALLERO***********");
     EmpresaTiendaRopa tienda;
    
     tienda=new  FcaSimpleCaballero();
     //Este es el observer y EmpresaTiendaRopa es el sujeto
     NotaProductos nota = new NotaProductos(tienda);
     System.out.println(tienda.ordenCompra("pantalon").toString());
     System.out.println(tienda.ordenCompra("corbata").toString());
     System.out.println(tienda.ordenCompra("camisa").toString()+"\n");
     System.out.println("**************FABRICA DE DAMA*****************");
     FcaSimpleDama  dam = new  FcaSimpleDama ();
     NotaProductos nota2 = new NotaProductos(dam);
     System.out.println(dam.ordenCompra("blusa").toString());
     System.out.println(dam.ordenCompra("falda").toString()+"\n");
     System.out.println("******************FABRICA DE NIÑOS*****************");
     
     FcaSimpleNiño nin=new FcaSimpleNiño();
     NotaProductos nota3 = new NotaProductos(nin);
     System.out.println(nin.ordenCompra("short").toString()+"\n");
   
    
    
    }
}
