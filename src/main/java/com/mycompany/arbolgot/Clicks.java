/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolgot;

import interfaces.PersonaSquare;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.ui.view.Viewer;
import org.graphstream.ui.view.ViewerListener;
import org.graphstream.ui.view.ViewerPipe;

public class Clicks implements ViewerListener {
//comment

    Graph graph;
    Viewer viewer;
    List persons;
    HashTable ht;
    Boolean f;
    protected boolean loop = true;

//    public static void main(String args[]) {
//        System.setProperty("org.graphstream.ui", "swing");
//        Graph graph = new SingleGraph("Clicks");
//        for (int i = 0; i < 10; i++) {
//            Node n = graph.addNode(String.valueOf(i));
//            n.setAttribute("ui.style", "shape: box;");
//            n.setAttribute("ui.style", "size: 50px,30px;");
//            n.setAttribute("ui.style", "fill-color: blue;");
//        }
//        new Clicks(graph);
//    }
    public void setGraph(Graph graph) {
        this.graph = graph;
    }
    
    public void setViewer(Viewer viewer) {
        this.viewer = viewer;
    }
    
    public void setPersons(List persons) {
        this.persons = persons;
    }
    
    public void setHt (HashTable ht){
        this.ht=ht;
    }
    
    public Clicks() {
        this.graph = null;
        this.viewer = null;
        this.persons = null;
        
        
    }
    
    public HashTable getHT(){
        return ht;
    }
    
    public Graph getGraph(){
        return graph;
    }
    
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
    
    public void buttonPushed(String id) {
        Node nx = graph.getNode(id);
        nx.setAttribute("ui.class", "clicked");
        int idd = Integer.parseInt(id);
        System.out.println(idd);
        Hash h = ht.serchHashTable(idd);
        Person persona = h.getData();
        System.out.println(persona.getIndex());
        PersonaSquare t = new PersonaSquare();
        t.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        t.setPer(persona);
        
        
    }
    
    public void buttonReleased(String id) {
        Node nx = graph.getNode(id);
        nx.removeAttribute("ui.class");
    }
    
    @Override
    public void mouseOver(String id) {
        
        Node nx = graph.getNode(id);
        nx.setAttribute("ui.class", "hover");
    }
    
    public void mouseLeft(String id) {
        Node nx = graph.getNode(id);
        nx.removeAttribute("ui.class");
    }
}
