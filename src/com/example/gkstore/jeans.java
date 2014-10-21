package com.example.gkstore;

import java.util.ArrayList;


public class jeans extends Ropa {

    public jeans(String des,float p, String i) {
    	super(des,p,i);
    }
    @Override
	public ArrayList catalogo(){
		ArrayList list = new ArrayList();
		list.add(new camisa("Camisa Azul",200,"cam1"));
		list.add(new camisa("Camisa Rayada",204,"cam2"));
		list.add(new camisa("Camisa Lila",204,"cam3"));
		return list;
	}
   
}