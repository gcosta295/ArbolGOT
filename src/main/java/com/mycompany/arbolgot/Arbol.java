/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolgot;

import javax.swing.JOptionPane;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.MultiGraph;

/**
 *
 * @author astv06
 */
public class Arbol {

    public MultiGraph graph;
    private List lPerson;
    private List lNodes;

    /**
     * Creacion del Arbol
     *
     * @author Nathaly
     *
     */
    public Arbol() {

        this.graph = new MultiGraph("ArbolGOT");
        this.lNodes = new List();
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

}
