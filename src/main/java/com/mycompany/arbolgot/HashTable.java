/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolgot;
//comment
/**
 *
 * @author astv06
 */
public class HashTable {
    private Hash first;
    private Hash last;
    private int len;

    public HashTable() {
        this.first = null;
        this.last = null;
        this.len = 0;
    }

    public void setFirst() {
        this.first = null;
    }

    public void setLast(Hash last) {
        this.last = last;
    }

    public void addHash (Hash h){
        if (this.len == 0){
            this.first = h;
            this.last = h;
        }
        else{
            Hash hAux = this.last;
            hAux.setNext(h);
            this.last = h;
        }
        this.len+=1;
    }
    
    public Hash serchHashTable (int index){
        Hash hAux = this.first;
        while (hAux.getNext() != null){
            if (hAux.getKey()==index){
                return hAux;
            }
            else{
                hAux = hAux.getNext();
            }
        }
        return null;
    }
}
