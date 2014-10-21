/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.gkstore;

import java.util.ArrayList;

/**
 *
 * @author Karii Gs
 */
class trajes extends Ropa {

    public trajes(String des,float p, String i) {
    	super(des,p,i);
    }
	public ArrayList catalogo(){
		ArrayList list = new ArrayList();
		list.add(new camisa("Camisa Azul",200,"cam1"));
		list.add(new camisa("Camisa Rayada",204,"cam2"));
		list.add(new camisa("Camisa Lila",204,"cam3"));
		return list;
	}
    
}
