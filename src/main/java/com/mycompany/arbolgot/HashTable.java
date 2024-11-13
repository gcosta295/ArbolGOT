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
    private Hash first;
    private int len;

    public HashTable() {
        this.first = null;
        this.len = 0;
    }

    public void setFirst() {
        this.first = null;
    }

    public void addHash (Hash h){
        if (this.len == 0){
            this.first = h;
        }
        else{
            Hash hAux = this.first;
            while (hAux != null){
                if (h.getKey()-1==hAux.getKey()){
                    hAux.setNext(h);
                    this.len+=1;
                }
            }
        }
    }
//    public void addHashTable (Object o, int index){
//        this.setKey(index);
//        this.setData(o);
//        this.setFirst(first);
//        if (index == 1){
//            this.setFirst(this);
//        }
//        else{
//            HashTable hAux = this.first;
//            while (hAux.key + 1 <= index){
//                if (hAux.key + 1 < index){
//                    hAux = hAux.next;
//                }
//                else{
//                    hAux.next.next = this;
//                }
//            }
//        }
//    }
//    
    public Hash serchHashTable (int index){
        Hash hAux = this.first;
        while (hAux != null){
            if (hAux.getKey()==index){
                return hAux;
            }
            else{
                hAux = hAux.getNext();
            }
        }
        return null;
    }
//    public HashTable serchHashTable (int index){
//        HashTable hAux = this.first;
//        while (hAux.key + 1 <= index){
//            if (hAux.key + 1 < index){
//                    hAux = hAux.next;
//                }
//                else{
//                    return hAux;
//            }
//        } 
//        return null;
//    }
}
