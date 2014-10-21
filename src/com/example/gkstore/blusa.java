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
class Blusa extends Ropa {

    public Blusa(String des,float p, String i) {
    	super(des,p,i);
    }

    public ArrayList catalogo(){
    	ArrayList list = new ArrayList();
    	list.add(new Blusa("Blusa Verde",200,"blu1"));
		list.add(new Blusa("Blusa Amarilla",300,"blu2"));
		list.add(new Blusa("Blusa Roja",250,"blu3"));
		return list;
	}
}
