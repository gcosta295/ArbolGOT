/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolgot;
//comment2

import org.graphstream.graph.Node;

/**
 *
 * @author astv06
 */
public class Hash {
    
    private int key;
    private Person data;
    private Hash next;

    public Hash() {
        this.key = 0;
        this.data = null;
        this.next = null;
    }

    /**
     * retorna la llave del elemento.
     *
     * @author astv06
     *
     * @return  key
     */       
    public int getKey() {
        return key;
    }

    /**
     * retorna la data del elemento.
     *
     * @author astv06
     *
     * @return  data
     */     
    public Person getData() {
        return data;
    }

    /**
     * retorna el siguiente elemento de la hashTable.
     *
     * @author astv06
     *
     * @return next
     */     
    public Hash getNext() {
        return next;
    }

    /**
     * asigna la llave del elemento.
     *
     * @author astv06
     *
     * @param key
     */     
    public void setKey(int key) {
        this.key = key;
    }

    /**
     * Asigna la data del elemento.
     *
     * @author astv06
     *
     * @param data
     */     
    public void setData(Person data) {
        this.data = data;
    }

        /**
     * asigna el siguiente elemento de la hashTable.
     *
     * @author astv06
     *
     * @param next
     */ 
    public void setNext(Hash next) {
        this.next = next;
    }
    
    
}