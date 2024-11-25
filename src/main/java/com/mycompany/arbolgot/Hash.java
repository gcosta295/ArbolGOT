/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolgot;
//comment2
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

    public int getKey() {
        return key;
    }

    public Person getData() {
        return data;
    }

    public Hash getNext() {
        return next;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setData(Person data) {
        this.data = data;
    }

    public void setNext(Hash next) {
        this.next = next;
    }
    
    
}
