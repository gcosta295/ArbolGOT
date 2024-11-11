/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolgot;

/**
 *
 * @author astv06
 */
public class Person {
   private String name;
    private String number;
    private String father;
    private Person pFather;
    private String eyesColor;
    private String hairColor;
    private String mother;
    private String motin;
    private String titulo;      //posible rename
    private String esposo;      //posible rename
    private List hijos;     //posible rename
    private String notes;
    private String fate;
    private Person next;
    private int index;

/**
 * constructor de la persona 
 * @author astv06
*/ 
    public Person() {
        this.name = null;
        this.number = null;
        this.father = null;
        this.eyesColor = null;
        this.hairColor = null;
        this.mother = null;
        this.motin = null;
        this.titulo = null;
        this.esposo = null;
        this.hijos = null;
        this.notes = null;
        this.fate = null;
        this.next = null;
        this.pFather = null;
        this.index = 0;
    }
    
/**
 * hace una copia de todos los datos de una persona
 * menos del atributo next
 * @author astv06
 * @param p
*/ 
    public void copyData (Person p){
        this.name = p.name;
        this.number = p.number;
        this.father = p.father;
        this.eyesColor = p.eyesColor;
        this.hairColor = p.hairColor;
        this.mother = p.mother;
        this.motin = p.motin;
        this.titulo = p.titulo;
        this.esposo = p.esposo;
        this.hijos = p.hijos;
        this.notes = p.notes;
        this.fate = p.fate;
        this.next = p.next;
        this.index = p.index;
        this.pFather = p.pFather;
    }

/**
 * asigna un valor a la siguiente persona 
 * @author astv06
 * @param next
*/ 
    public void setNext(Person next) {
        this.next = next;
    }

/**
 * retorna el nombre de la persona 
 * @author astv06
 * @return name
*/ 
    public String getName() {
        return name;
    }

/**
 * retorna la siguiente persona de la lista 
 * @author astv06
 * @return next
*/ 
    public Person getNext() {
        return next;
    } 

/**
 * retorna el apodo de la persona 
 * @author astv06
 * @return motin
*/ 
    public String getMotin() {
        return motin;
    }

/**
 * retorna el indice de la persona 
 * @author astv06
 * @return index
*/
    public int getIndex() {
        return index;
    }

/**
 * retorna la lista de hijos de la persona 
 * @author astv06
 * @return hijos
*/    
    public List getHijos() {
        return hijos;
    }

/**
 * retorna los integrantes de una generacion
 * @author astv06
 * @param n
 * @param l
 * @return l
*/     
    public List getGeneration (int n, List l){
        n -=1;
        if (n > 1){
            for (int i = 1; i <= this.hijos.getlen(); i++) {
                Person pAux = this.hijos.getPerson(i);
                if (pAux.hijos != null){
                    pAux.getGeneration(n, l);
                }
            }
        }
        if (n == 0){
            for (int i = 1; i <= this.hijos.getlen(); i++) {
                Person pAux = this.hijos.getPerson(i);
                l.addPerson(pAux);
            }
        }
        return l;
    }

/**
 * retorna los antecesores masculinos de 
 * la rama familiar
 * @author astv06
 * @param n
 * @param l
 * @return l
*/         
    public List getAnsesters (int n, List l){
        if (n >= 0){
            l.addPerson(this);
            if (this.pFather != null){
                Person pAux = this.pFather;
                n -= 1;
                pAux.getAnsesters(n, l);
            }
        }
        return l;
    }
}
