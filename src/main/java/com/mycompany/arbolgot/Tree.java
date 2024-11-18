/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolgot;

import javax.swing.JOptionPane;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.ui.view.Viewer;
//comment
/**
 *
 * @author astv06
 */
public class Tree {

    public MultiGraph graph;
    private List lPerson;
    private List lNodes;
    private Viewer viewer;

    /**
     * Creacion del Arbol
     *
     * @author Nathaly
     *
     */
    public Tree() {

        this.graph = new MultiGraph("ArbolGOT");
        this.lNodes = new List();
        this.viewer = null;
//     algo   
    }

    /**
     * devuelve el grafo
     *
     * @author Nathaly
     * @return graph
     */
    public MultiGraph getGraph() {
        return graph;
    }

    /**
     * método para la creación del grafo. Se vuelve cada persona un nodo con
     * color y tamaño.
     *
     * @author astv06
     *
     * @param persons
     */
    public void Graph(List persons) {
        graph.setAttribute("ui.stylesheet", "node{\n"
                + "    size: 15px, 15px;\n"
                + "    fill-color: pink;\n"
                + "    text-mode: normal; \n"
                + "}"
                + "edge{\n"
                + "    size: 2px,10px;\n"
                + "    shape: angle;\n"
                + "}");
        HashTable HT = new HashTable();
        for (int i = 1; i <= persons.getlen(); i++) {
            Person pAux = persons.getPerson(i);
            if (lNodes.indexInList(pAux.getIndex()) == false) {
                lNodes.addPerson(pAux);
                Node nx;
                nx = graph.addNode(Integer.toString(pAux.getIndex()));
                nx.setAttribute("ui.label", pAux.getName());
                this.createHash(HT, nx, pAux.getIndex());
            }
            if (pAux.getMother() != null) {
                if (lNodes.indexInList(pAux.getpMother().getIndex()) == false) {
                    lNodes.addPerson(pAux.getpMother());
                    Node nx2;
                    nx2 = this.graph.addNode(Integer.toString(pAux.getpMother().getIndex()));
                    nx2.setAttribute("ui.label", pAux.getMother());
                    this.createHash(HT, nx2, pAux.getIndex());
                    String y = Integer.toString(pAux.getIndex()) + Integer.toString(pAux.getpMother().getIndex());
                    graph.addEdge(y, Integer.toString(pAux.getpMother().getIndex()), Integer.toString(pAux.getIndex()), true).addAttribute("fill-color", "red");
                } 
                else {
                    String y = Integer.toString(pAux.getIndex()) + Integer.toString(pAux.getpMother().getIndex());
                    graph.addEdge(y, Integer.toString(pAux.getpMother().getIndex()), Integer.toString(pAux.getIndex()), true).addAttribute("fill-color", "red");
                }
            }
            if (pAux.getHijos() != null) {
                for (int j = 1; j <= pAux.getHijos().getlen(); j++) {
                    Person hAux = pAux.getHijos().getPerson(j);
                    if (lNodes.indexInList(hAux.getIndex()) == false) {
                        lNodes.addPerson(hAux);
                        Node nx1;
                        nx1 = graph.addNode(Integer.toString(hAux.getIndex()));
                        nx1.setAttribute("ui.label", hAux.getName());

                        this.createHash(HT, nx1, pAux.getIndex());
                        String y = Integer.toString(pAux.getIndex()) + Integer.toString(hAux.getIndex());
                        graph.addEdge(y, Integer.toString(pAux.getIndex()), Integer.toString(hAux.getIndex()), true);
                    }
                }
            }
        }
    }

    public void createHash(HashTable ht, Object o, int index) {
        Hash hAux = new Hash();
        hAux.setData(o);
        hAux.setKey(index);
        ht.addHash(hAux);
    }

    
/**
 * retorna los integrantes de la generacion correspondiante
 * a la cantidad de ramas escaladas en el arbol
 * @author astv06
 * @param n
 * @param l
 * @param p
 * @return l
*/     

    public List getGeneration (int n, List l, Person p){
        if (n >= 1) {
            n -= 1;
            if (n > 1) {
                for (int i = 1; i <= p.getHijos().getlen(); i++) {
                    Person pAux = p.getHijos().getPerson(i);
                    if (pAux.getHijos() != null) {
                        this.getGeneration(n, l, pAux);
                    }
                }
            }
            if (n == 0) {
                for (int i = 1; i <= p.getHijos().getlen(); i++) {
                    Person pAux = p.getHijos().getPerson(i);
                    l.addPerson(pAux);
                }
            }
            return l;
        } 
        else {
            return null;
        }
    }

    /**
 * retorna los ansestros de una persona según la cantidad
 * de ramas escaladas en el arbol le sea indicada
 * @author astv06
 * @param n
 * @param l
 * @param p
 * @return l
*/
    
    public List getAnsester(int n, List l, Person p) {
        if (n >= 0) {
            if (n >= 1) {
                if (p.getPFather() != null) {
                    Person pAux = p.getPFather();
                    this.getAnsester(n - 1, l, pAux);
                } else {
                    this.getAnsester(0, l, p);
                }
            }
            if (n == 0) {
                List gen = p.getPFather().getHijos();
                for (int i = 1; i < gen.getlen(); i++) {
                    Person pAux = gen.getPerson(i);
                    if (l.indexInList(pAux.getIndex()) == false) {
                        l.addPerson(pAux);
                    }
                    if (pAux.getHijos() != null) {
                        for (int j = 1; j < pAux.getHijos().getlen(); j++) {
                            this.getAnsester(0, l, pAux.getHijos().getPerson(j));
                        }
                    }
                }
            }
            return l;
        } else {
            return null;
        }
    }

    public Viewer getViewer() {
        return viewer;
    }
    
    
}
