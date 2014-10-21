package com.example.gkstore;

import java.util.ArrayList;

public abstract class Ropa {

	protected String descripcion;
	protected float precio;
	protected String image;
			
	public Ropa(){}
	
	public Ropa(String descripcion, float precio, String image){
		this.descripcion = descripcion;
		this.precio = precio;
		this.image = image;
	}
	public void asignadescripcion (String d){
		descripcion=d;
    }
 
	public String leerdescripcion (){
		return descripcion;
    }
 
    public void asignaprecio(float p){
    	precio=p;
    }
 
    public float leerprecio(){
        return precio;
    }
    public void setImage(String image){
    	this.image = image;
    }
    public String getImage(){
    	return image;  	
    }
            
    public abstract ArrayList catalogo();
   
    
}