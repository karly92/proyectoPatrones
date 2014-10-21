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
class shorts extends Ropa {

    public shorts(String des,float p, String i) {
    	super(des,p,i);
    }

    
    public ArrayList catalogo(){
    	ArrayList list = new ArrayList();
		list.add(new shorts("Bermuda Naranja",300,"sho1"));
		list.add(new shorts("Short Deportivo",104,"sho2"));
		list.add(new shorts("Short Azul",204,"sho3"));
		return list;
	}
}
