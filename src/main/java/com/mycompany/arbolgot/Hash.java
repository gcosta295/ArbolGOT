/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolgot;

/**
 *
 * @author astv06
 */
public class Hash {
    
    private int key;
    private Object data;
    private Hash next;

    public Hash() {
        this.key = 0;
        this.data = null;
        this.next = null;
    }

    public int getKey() {
        return key;
    }

    public Object getData() {
        return data;
    }

    public Hash getNext() {
        return next;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setNext(Hash next) {
        this.next = next;
    }
    
    
}
