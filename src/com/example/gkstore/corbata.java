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
class corbata extends Ropa {

    public corbata(String des,float p, String i) {
    	super(des,p,i);
    }

    public ArrayList catalogo(){
    	ArrayList list = new ArrayList();
		list.add(new corbata("Corbata Roja",100,"cor1"));
		list.add(new corbata("Corbata Azul",135,"cor2"));
		return list;
	}
}
