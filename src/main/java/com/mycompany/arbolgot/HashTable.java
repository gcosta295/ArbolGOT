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
public class HashTable {
    private Hash first;
    private Hash last;
    private int len;

    public HashTable() {
        this.first = null;
        this.last = null;
        this.len = 0;
    }

    /**
     * agrega una nueva hash a la hashTable.
     *
     * @author astv06
     *
     * @param h
     */     
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
    
    /**
     * retorna la hash que coincida en llave con
     * la llave de entrada.
     *
     * @author astv06
     *
     * @param index
     * @return hAux
     */     
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
    
//    public Hash serchHashTable2 (int index){
//        Hash hAux = this.first;
//        int count = 1;
//        while (hAux.getNext() != null){
//            if (count==index){
//                return hAux;
//            }
//            else{
//                hAux = hAux.getNext();
//            }
//            count += 1;
//        }
//        return null;
//    }

    /**
     * retorna la longitud de la hashTable.
     *
     * @author astv06
     *
     * @return len
     */     
    public int getLen() {
        return len;
    }

    /**
     * retorna el ultimo elemento de la hashTable.
     *
     * @author astv06
     *
     * @return last
     */ 
    public Hash getLast() {
        return last;
    }
}
