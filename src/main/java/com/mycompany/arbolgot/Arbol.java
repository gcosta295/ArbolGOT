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
    private List lSucursals;
    private List listaLines;
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
        this.lNodes = new List ();
    }
//
//    /**
//     * Regresa la lista de estaciones que conforman al grafo
//     *
//     * @author Nathaly
//     * @return lPerson
//     */
//    public List getlPerson() {
//        return lPerson;
//    }
//

    /**
     * devuelve el grafo
     *
     * @author Nathaly
     * @return graph
     */
    public MultiGraph getGraph() {
        return graph;
    }
//
//    /**
//     * Regresa la lista de sucursales
//     *
//     * @author gcosta
//     * @return lSucursals
//     */
//    public List getlSucursals() {
//        return lSucursals;
//    }
//

    /**
     * método para la creación del grafo. Se vuelve cada persona un nodo con
     * color y tamaño.
     *
     * @author astv06
     *
     * @param persons
     */
    public void Graph(List persons) {
//        this.listaLines = new List();
//        this.lSucursals = new List();
//        this.lPerson = new List();
        graph.setAttribute("ui.stylesheet", "node{\n"
                + "    size: 10px, 10px;\n"
                + "    fill-color: black;\n"
                + "    text-mode: normal; \n"
                + "}");
        HashTable HT = new HashTable();
        for (int i = 1; i <= persons.getlen(); i++) {
            Person pAux = persons.getPerson(i);
//            System.out.println("persona     " + pAux.getName());
//            System.out.println("len list persons    "+lNodes.getlen());
//            System.out.println("index persona   "+ pAux.getIndex());
//            System.out.println("");
            if (lNodes.indexInList(pAux.getIndex()) == false) {
                lNodes.addPerson(pAux);
                Node nx;
//                System.out.println(pAux);
                nx = graph.addNode(Integer.toString(pAux.getIndex()));
                nx.setAttribute("ui.label", pAux.getName());
                this.createHash(HT, nx, pAux.getIndex());
            }
            if (pAux.getMother() != null) {
//                System.out.println("mama");
//                System.out.println(pAux.getpMother().getName());
//                System.out.println(pAux.getpMother().getIndex());
                if (lNodes.indexInList(pAux.getpMother().getIndex()) == false) {
                    lNodes.addPerson(pAux.getpMother());
                    Node nx2;
                    nx2 = this.graph.addNode(Integer.toString(pAux.getpMother().getIndex()));
                    nx2.setAttribute("ui.label", pAux.getMother());
                    this.createHash(HT, nx2, pAux.getIndex());
                }
            }
            if (pAux.getHijos() != null) {
//                System.out.println(pAux.getHijos().getlen());
                for (int j = 1; j <= pAux.getHijos().getlen(); j++) {
                    Person hAux = pAux.getHijos().getPerson(j);
//                    System.out.println("");
//                    System.out.println("nombre hijo         " + hAux.getName());
//                    System.out.println("index hijo         " + hAux.getIndex());
                    if (lNodes.indexInList(hAux.getIndex()) == false) {
//                        System.out.println(hAux.getName());
                        lNodes.addPerson(hAux);
                        Node nx1;
                        nx1 = graph.addNode(Integer.toString(hAux.getIndex()));
                        nx1.setAttribute("ui.label", hAux.getName());
                        this.createHash(HT, nx1, pAux.getIndex());
                        String y = Integer.toString(pAux.getIndex()) + Integer.toString(hAux.getIndex());
                        graph.addEdge(y, Integer.toString(pAux.getIndex()), Integer.toString(hAux.getIndex()));
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
