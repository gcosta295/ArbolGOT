/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolgot;

/**
 *
 * @author astv06
 */
public class List {
        private Person pFirst;
    private Person pLast;
    private int len;

/**
 * constructor de listas 
 * @author astv06
*/    
    public List() {
        this.pFirst = null;
        this.pLast = null;
        this.len = 0;
    }

/**
 * retorna la longitud de la lista 
 * @author astv06
 * @return len
*/      
    public int getlen() {
        return this.len;
    }

/**
 * retorna la primera persona de la lista
 * @author astv06
 * @return pFirst
*/      
    public Person getpFirst() {
        return pFirst;
    }

/**
 * retorna la ultima persona de la lista
 * @author astv06
 * @return pLast
*/     
    public Person getpLast() {
        return pLast;
    }
    
/**
 * Añade una copia de la persona que tu le diste al metodo en la 
 * ultima posicion del mismo
 * @author astv06
 * @param p
*/    
    public void addPerson(Person p) {
        Person per = new Person();
        per.copyData(p);
        if (this.len != 0) {
            Person pAux = this.pLast;
            pAux.setNext(per);
            this.pLast = per;
        } else {
            this.pFirst = per;
            this.pLast = per;
        }
        this.len += 1;
    }
                                            
/**
 * Se emplea para confirmar la existencia de una 
 * persona mediante su nombre 
 * @author gcosta
 * @param pName
 * @return boolean
*/                                                                                    
    public boolean nameInList(String pName) {
        Person sAux = pFirst;
        while (sAux != null) {
            if (sAux.getName().contains(pName)) {
                return true;
            }
            sAux = sAux.getNext();
        }
        return false;
    }

/**
 * Busca en la lista que invoca al metodo la 
 * persona correspondiente al indice del
 * dato de entrada
 * @author astv06
 * @param i
 * @return sAux
*/
    public Person getPerson(int i) {
        if (i <= this.len) {
            int j = 1;
            Person pAux = this.pFirst;
            while (j <= i) {           
                if (j < i) {           
                    pAux = pAux.getNext();
                }
                j += 1;
            }
            return pAux;                  
        } else {
            return null;                  
        }
    }

/**
 * Comprueba si una persona esta en una lista
 * @author astv06
 * @param p
 * @return boolean
*/    
    public boolean pInList(Person p) {
        if (pFirst != null) {          
            Person pAux = pFirst;
            while (pAux != null) {                                      
                if (pAux.getName().equals(p.getName())) {             
                    return true;                                        
                }
                pAux = pAux.getNext();
            }
            return false;
        } else {
            return false;
        }
    }

/**
 * en base al nombre de la persona te encuentra la persona
 * @author gcosta
 * @param pName
 * @return sAux
*/    
    public Person getNamedPerson(String pName) { 
        Person pAux = pFirst;                 
        while (pAux != null) {                 
            if (pAux.getName().contains(pName)) { 
                return pAux;
            }
            pAux = pAux.getNext();             
        }
        return null;
    }

/**
 * elimina una persona en la lista 
 * @author astv06
 * @param p
*/    
    public void deletePerson(Person p){
        int cont = 1;
        for (int i = 1; i <= this.getlen(); i++) {
            Person pAux = this.getPerson(i);
            if (pAux.getName()!= p.getName()){
                cont+=1;
            }
            else{
                this.getPerson(cont-1).setNext(this.getPerson(cont+1));
            }
        }
    }
}

