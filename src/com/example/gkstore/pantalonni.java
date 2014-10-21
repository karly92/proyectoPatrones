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
class pantalonni extends Ropa {

    public pantalonni(String des,float p, String i) {
    	super(des,p,i);
    }

    public ArrayList catalogo(){
    	ArrayList list = new ArrayList();
    	list.add(new pantalonni("Pantalon Rojo ",500,"cam1"));
    	list.add(new pantalonni("Pantalon Naranja",300,"cam2"));
		list.add(new pantalonni("Pantalon Beige",400,"cam3"));
		return list;
	}
}
