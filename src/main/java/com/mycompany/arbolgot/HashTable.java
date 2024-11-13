/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolgot;

/**
 *
 * @author astv06
 */
public class HashTable {
    private HashTable first;
    private int key;
    private Object data;
    private HashTable next;

    public HashTable() {
        this.first = null;
        this.key = 0;
        this.data = null;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setNext(HashTable next) {
        this.next = next;
    }

    public void setFirst(HashTable first) {
        this.first = first;
    }

    public Object getData() {
        return data;
    }
    
    public void addHashTable (Object o, int index){
        this.setKey(index);
        this.setData(o);
        this.setFirst(first);
        if (index == 1){
            this.setFirst(this);
        }
        else{
            HashTable hAux = this.first;
            while (hAux.key + 1 <= index){
                if (hAux.key + 1 < index){
                    hAux = hAux.next;
                }
                else{
                    hAux.next.next = this;
                }
            }
        }
    }
    
    public HashTable serchHashTable (int index){
        HashTable hAux = this.first;
        while (hAux.key + 1 <= index){
            if (hAux.key + 1 < index){
                    hAux = hAux.next;
                }
                else{
                    return hAux;
            }
        } 
        return null;
    }
}
