/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolgot;

import interfaces.PersonaSquare;
import javax.swing.JFrame;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.ui.view.Viewer;
import org.graphstream.ui.view.ViewerListener;
import org.graphstream.ui.view.ViewerPipe;

public class Clicks implements ViewerListener {
    Graph graph;
    Viewer viewer;
    List persons;
    HashTable ht;
    Boolean f;
    protected boolean loop = true;
    
    /**
     * asigna un grafo.
     *
     * @author gcosta
     *
     * @param graph
     */
    public void setGraph(Graph graph) {
        this.graph = graph;
    }

    /**
     * asigna un viewer.
     *
     * @author gcosta
     *
     * @param viewer
     */
    public void setViewer(Viewer viewer){
        this.viewer= viewer;
    }
   
    /**
     * asigna una lista de personas.
     *
     * @author gcosta
     *
     * @param persons
     */    
    public void setPersons(List persons) {
        this.persons = persons;
    }
    
    /**
     * asigna una hashTable.
     *
     * @author gcosta
     *
     * @param ht
     */    
    public void setHt (HashTable ht){
        this.ht=ht;
    }
    
    public Clicks() {
        this.graph = null;
        this.viewer=null;
        this.viewer = null;
        this.persons = null;
    }
    
    /**
     * devuelve el hashTable.
     *
     * @author gcosta
     *
     * @return ht
     */    
    public HashTable getHT(){
        return ht;
    }
    
    /**
     * devuelve el grafo.
     *
     * @author gcosta
     *
     * @return graph
     */     
    public Graph getGraph(){
        return graph;
    }
    
    /**
     * metodo que te permite que la interfaz
     * detecte los clicks del usuario.
     *
     * @author gcosta
     *
     */     
    public void Clicks1() {
 
        viewer.enableAutoLayout();
        viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);
        viewer.getDefaultView().enableMouseOptions();
        ViewerPipe fromViewer = viewer.newViewerPipe();
        fromViewer.addViewerListener(this);
        fromViewer.addSink(graph);
        new Thread(() ->{
            while(true){
                fromViewer.pump();
            }
        }).start();
    }
    
    public void viewClosed(String id) {
        loop = false;
    }
    
    /**
     * da intrucciones de que hacer al
     * darle click a un nodo.
     *
     * @author gcosta
     *
     * @param id
     */     
    @Override
    public void buttonPushed(String id) {
        Node nx = graph.getNode(id);
        nx.setAttribute("ui.class", "clicked");
        int idd = Integer.parseInt(id);
        Hash h = ht.serchHashTable(idd);
        Person persona = h.getData();
        PersonaSquare t = new PersonaSquare();
        t.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        t.setPer(persona);
    }
    
    /**
     * da intrucciones de que hacer al
     * soltar el click.
     *
     * @author gcosta
     *
     * @param id
     */       
    @Override
    public void buttonReleased(String id) {
        Node nx = graph.getNode(id);
        if (nx.hasAttribute("Thruth?")){
            nx.setAttribute("ui.class", "shown");
        }else{
             nx.removeAttribute("ui.class");
        }
       
    }
    
    /**
     * detecta cuando el mouse esta
     * sobre el nodo.
     *
     * @author gcosta
     *
     * @param id
     */       
    @Override
    public void mouseOver(String id) {
        
        Node nx = graph.getNode(id);
        nx.setAttribute("ui.class", "hover");
    }
    
    /**
     * da intrucciones de que hacer al
     * darle click a un nodo.
     *
     * @author gcosta
     *
     * @param id
     */       
    @Override
    public void mouseLeft(String id) {
             Node nx = graph.getNode(id);
        if (nx.hasAttribute("Thruth?")){
            nx.setAttribute("ui.class", "shown");
        }else{
             nx.removeAttribute("ui.class");
        }    }
}
