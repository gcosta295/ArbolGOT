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
public class Person {

    private String name;
    private String number;
    private String father;
    private Person pFather;
    private Person pMother;
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
    private String listHijos;

    /**
     * constructor de la persona
     *
     * @author astv06
     */
    public Person getpMother() {
        return pMother;
    }

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
        this.hijos = new List();
        this.notes = null;
        this.fate = null;
        this.next = null;
        this.pFather = null;
        this.index = 0;
        this.pMother = null;
        this.listHijos = null;
    }

    /**
     * hace una copia de todos los datos de una persona menos del atributo next
     *
     * @author astv06
     * @param p
     */
    public void copyData(Person p) {
        this.setName(p.name);
        this.setNumber(p.number);
        this.setFather(p.father);
        this.setEyesColor(p.eyesColor);
        this.setHairColor(p.hairColor);
        this.setMother(p.mother);
        this.setMotin(p.motin);
        this.setTitulo(p.titulo);
        this.setEsposo(p.esposo);
        this.setHijos(p.hijos);
        this.setNotes(p.notes);
        this.setFate(p.fate);
        this.setIndex(p.index);
        this.pFather = p.pFather;
        this.setPMother(p.pMother);
        this.listHijos = p.listHijos;
    }

    /**
     * asigna un valor a la siguiente persona
     *
     * @author astv06
     * @param next
     */
    public void setNext(Person next) {
        this.next = next;
    }

    public void setPMother(Person pMother) {
        this.pMother = pMother;
    }

    public void setPFather(Person pFather) {
        this.pFather = pFather;
    }

    /**
     * retorna el nombre de la persona
     *
     * @author astv06
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * retorna la siguiente persona de la lista
     *
     * @author astv06
     * @return next
     */
    public Person getNext() {
        return next;
    }

    public String getMother() {
        return mother;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @param father the father to set
     */
    public void setFather(String father) {
        this.father = father;
    }

    /**
     * @param eyesColor the eyesColor to set
     */
    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    /**
     * @param hairColor the hairColor to set
     */
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    /**
     * @param mother the mother to set
     */
    public void setMother(String mother) {
        this.mother = mother;
    }

    /**
     * @param motin the motin to set
     */
    public void setMotin(String motin) {
        this.motin = motin;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @param esposo the esposo to set
     */
    public void setEsposo(String esposo) {
        this.esposo = esposo;
    }

    /**
     * @param hijos the hijos to set
     */
    public void setHijos(List hijos) {
        this.hijos = hijos;
    }

    /**
     * @param notes the notes to set
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * @param fate the fate to set
     */
    public void setFate(String fate) {
        this.fate = fate;
    }

    /**
     * @param index the index to set
     */
    public void setIndex(int index) {
        this.index = index;
    }

    public String getFather() {
        return father;
    }

    public String getNumber() {
        return number;
    }

    public void setListaHijos(String s) {
        this.listHijos = s;
    }

    public String getListaHijos() {
        return listHijos;
    }

    public Person getPFather() {
        return pFather;
    }

    /**
     * retorna el apodo de la persona
     *
     * @author astv06
     * @return motin
     */
    public String getMotin() {
        return motin;
    }

    /**
     * retorna el indice de la persona
     *
     * @author astv06
     * @return index
     */
    public int getIndex() {
        return index;
    }

    /**
     * retorna la lista de hijos de la persona
     *
     * @author astv06
     * @return hijos
     */
    public List getHijos() {
        return hijos;
    }

    public String getTitulo() {
        return titulo;
    }
    
    /**
     * retorna los integrantes de una generacion
     *
     * @author astv06
     * @param n
     * @param l
     * @return l
     */
    public List getGeneration(int n, List l) {
        n -= 1;
        if (n > 0) {
            for (int i = 1; i <= this.hijos.getlen(); i++) {
                Person pAux = this.hijos.getPerson(i);
                if (pAux.hijos != null) {
                    pAux.getGeneration(n, l);
                }
            }
        }
        if (n == 0) {
            for (int i = 1; i <= this.hijos.getlen(); i++) {
                Person pAux = this.hijos.getPerson(i);
                l.addPerson(pAux);
            }
        }
        return l;
    }

    /**
     * retorna los antecesores del familiar indicado
     *
     * @author astv06
     * @param n
     * @param l
     * @return l
     */
    public List getAnsesters(List l, int index1) {
        if (this.pFather != null) {
            this.pFather.getAnsesters(l, index1);
        } else {
            if (this.index != index1 && this.hijos.indexInList(index1) == false) {
                for (int i = 1; i <= this.hijos.getlen(); i++) {
                    Person pAux = this.hijos.getPerson(i);
                    
                    if (pAux.hijos != null && pAux.hijos.indexInList(index1)) {
                            for (int j = 1; j <= pAux.getHijos().getlen(); j++) {
                                Person pAux1 = pAux.getHijos().getPerson(j);
                                if (l.indexInList(pAux1.index) == false) {
                                    l.addPerson(pAux1);
                                }
                        }
                    }
                }
            }
        }
        if (this.getHijos() != null) {
            if (this.index != index1 && this.hijos.indexInList(index1) == false) {
                for (int i = 1; i <= this.getHijos().getlen(); i++) {
                    Person pAux = this.getHijos().getPerson(i);
                    l.addPerson(pAux);
                }
            }
        }
        if (l.indexInList(this.index) == false) {
            l.addPerson(this);
        }
        return l;
    }

    /**
     * retorna los decendientes del familiar indicado
     *
     * @author astv06
     * @param n
     * @param l
     * @return l
     */
    public List getDesenders (List l){
        if (this.getHijos()!= null){
            for (int i = 1; i <= this.getHijos().getlen(); i++) {
                Person pAux = this.getHijos().getPerson(i); 
                l.addPerson(pAux);
                pAux.getDesenders(l);
            }
        }
        if (l.pInList(this)==false){
                    l.addPerson(this);
                }
        return l;
    }
    
    
    public String getAllInfo(Person p) {
        String x;
        String n;
        if (p.number != null) {
            n = p.name + " " + p.number;
        } else {
            n = p.name;
        }
        x = n + "\n";
        if (p.motin != null) {
            x += "Motin:" + " " + p.motin + "\n";
        }

        if (p.father != null) {
            x += "Father:" + " " + p.father + "\n";
        }
        if (p.mother != null) {
            x += "Mother:" + " " + p.mother + "\n";
        }
        if (p.titulo != null) {
            x += "Title:" + " " + p.titulo + "\n";
        }
        if (p.esposo != null) {
            x += "Espos@:" + " " + p.esposo + "\n";
        }
        if (p.hairColor != null) {
            x += "Hair Color:" + " " + p.hairColor + "\n";
        }
        if (p.eyesColor != null) {
            x += "Eye Color:" + " " + p.eyesColor + "\n";
        }
        if (p.listHijos != null) {
            x += "Hijos:" + " " + p.listHijos + "\n";
        }
        if (p.notes != null) {
            x += "Notes:" + " " + p.notes + "\n";
        }
        if (p.fate != null) {
            x += "Fate:" + " " + p.fate + "\n";
        }
 

        return x;
    }

}
