/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.gkstore;

/**
 *
 * @author karla
 */
public interface Subject {
   
    public void addObserver(Observer o);
    public void removeObserver(Observer o);
    
}
