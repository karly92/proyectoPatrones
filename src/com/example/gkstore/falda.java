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
public class falda extends Ropa {

    public falda(String des,float p, String i) {
    	super(des,p,i);
    }
	public ArrayList catalogo(){
		ArrayList list = new ArrayList();
		list.add(new falda("Falda Corta",200,"fal1"));
		list.add(new camisa("Falda Casual",150,"cam2"));
		list.add(new camisa("Falda Cool",400,"cam3"));
		return list;
	}
}
