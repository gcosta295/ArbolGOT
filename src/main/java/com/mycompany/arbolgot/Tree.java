/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolgot;

import javax.swing.JOptionPane;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.ui.view.Viewer;

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
    
    public Viewer getViewer(){
        return viewer;
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
        Viewer viewer = graph.display();
        this.viewer=viewer;
        graph.setAttribute("ui.stylesheet", "node{\n"
                + "    size: 15px, 15px;\n"
                + "    fill-color: pink;\n"
                + "    text-mode: normal; \n"
                + "}"
                + "edge{\n"
                + "    size: 2px,10px;\n"
                + "    shape: angle;\n"
                + "}"
                + "node.clicked{\n"
                + " fill-color: red;\n"
                + "size: 15px,15px;\n"
                + "}"
                + "node.hover{\n"
                + "fill-color: blue;\n"
                + "size: 20px, 20px; \n"
                + "}");
//        graph.setAttribute("ui.stylesheet", "graph { fill-color: pink; }");
        HashTable HT = new HashTable();
        for (int i = 1; i <= persons.getlen(); i++) {
            Person pAux = persons.getPerson(i);
            if (lNodes.indexInList(pAux.getIndex()) == false) {
                lNodes.addPerson(pAux);
                Node nx;
                nx = graph.addNode(Integer.toString(pAux.getIndex()));
                nx.setAttribute("ui.label", pAux.getName());
                nx.setAttribute("fill-color", "red");
                this.createHash(HT, nx, pAux.getIndex());
            }
            if (pAux.getMother() != null) {
                if (lNodes.indexInList(pAux.getpMother().getIndex()) == false) {
                    System.out.println("AA");
                    lNodes.addPerson(pAux.getpMother());
                    Node nx2;
                    nx2 = this.graph.addNode(Integer.toString(pAux.getpMother().getIndex()));
                    nx2.setAttribute("ui.label", pAux.getMother());
                    nx2.setAttribute("ui.class", "mom");
                    this.createHash(HT, nx2, pAux.getIndex());
                    String y = Integer.toString(pAux.getIndex()) + Integer.toString(pAux.getpMother().getIndex());
                    graph.addEdge(y, Integer.toString(pAux.getpMother().getIndex()), Integer.toString(pAux.getIndex()), true).setAttribute("fill-color", "red");
//                    graph.addEdge(y, Integer.toString(pAux.getIndex()), Integer.toString(pAux.getpMother().getIndex()));
                } else {
                    String y = Integer.toString(pAux.getIndex()) + Integer.toString(pAux.getpMother().getIndex());
                    graph.addEdge(y, Integer.toString(pAux.getpMother().getIndex()), Integer.toString(pAux.getIndex()), true).setAttribute("fill-color", "red");

//                    graph.addEdge(y, Integer.toString(pAux.getIndex()), Integer.toString(pAux.getpMother().getIndex()));
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
//                        graph.addEdge(y, Integer.toString(pAux.getIndex()), Integer.toString(hAux.getIndex()));
//                        Edge f = graph.getEdge(y);
//                        System.out.println(f.getId());
//                        f.setAttribute("shape", "arrow");
                    }
                }
            }
        }
        graph.addNode("A").setAttribute("fill-color", "red");
        System.out.println(graph.getNode("1").getId());
//        graph.setAttribute("ui.stylesheet", "node{\n"
//                + "    size: 15px, 15px;\n"
//                + "    fill-color: pink;\n"
//                + "    text-mode: normal; \n"
//                + "}"
//                + "edge{\n"
//                + "    size: 2px,10px;\n"
//                + "    shape: angle;\n"
//                + "}");

//        graph.addAttribute("ui.stylesheet", "edge{shape: arrow}");
    }

    public void createHash(HashTable ht, Object o, int index) {
        Hash hAux = new Hash();
        hAux.setData(o);
        hAux.setKey(index);
        ht.addHash(hAux);
    }

}
