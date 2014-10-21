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
class pantalon extends Ropa {

    public pantalon(String des,float p, String i) {
    	super(des,p,i);
    }

    public ArrayList catalogo(){
    	ArrayList list = new ArrayList();
		list.add(new pantalon("Pantalon de Vestir",400,"cpant1"));
		list.add(new pantalon("Pantalon Casual",500,"cpant2"));
		list.add(new pantalon("Pantalon Capri",404,"cpant3"));
		return list;
	}

}
