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
//comment

    Graph graph;
    Viewer viewer;
    List persons;
    Boolean f;
    HashTable ht;
    protected boolean loop = true;


    public void setGraph(Graph graph) {
        this.graph = graph;
    }

    public void setViewer(Viewer viewer) {
        this.viewer = viewer;
    }

    public void setPersons(List persons) {
        this.persons = persons;
    }

    public void setHt(HashTable ht){
        this.ht=ht;
    }
    public Clicks() {
        this.graph = null;
        this.viewer = null;
        this.viewer = null;
        this.persons = null;
    }

    public void Clicks1() {
        // We do as usual to display a graph. This
        // connect the graph outputs to the viewer.
        // The viewer is a sink of the graph.

        viewer.enableAutoLayout();
//        viewer.getDefaultView().s
//        viewer.getDefaultView().ena
//        viewer.getDefaultView().getMouseListeners();
//        // The default action when closing the view is to quit
//        // the program.
        viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);
        viewer.getDefaultView().enableMouseOptions();
        // We connect back the viewer to the graph,
        // the graph becomes a sink for the viewer.
        // We also install us as a viewer listener to
        // intercept the graphic events.
        ViewerPipe fromViewer = viewer.newViewerPipe();
        fromViewer.addViewerListener(this);
        fromViewer.addSink(graph);

        // Then we need a loop to do our work and to wait for events.
        // In this loop we will need to call the
        // pump() method before each use of the graph to copy back events
        // that have already occurred in the viewer thread inside
        // our thread.
        new Thread(() -> {
//            System.out.println(Thread.currentThread().getName());
            while (true) {
                fromViewer.pump();
            }
        }).start();

//        while (loop) {
//            fromViewer.pump(); // or fromViewer.blockingPump(); in the nightly builds
//
//            // here your simulation code.
//            // You do not necessarily need to use a loop, this is only an example.
//            // as long as you call pump() before using the graph. pump() is non
//            // blocking.  If you only use the loop to look at event, use blockingPump()
//            // to avoid 100% CPU usage. The blockingPump() method is only available from
//            // the nightly builds.
//        }
    }

    public void viewClosed(String id) {
        loop = false;
    }

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

    public void buttonReleased(String id) {
        Node nx = graph.getNode(id);
        if (nx.hasAttribute("Thruth?")) {
            nx.setAttribute("ui.class", "shown");
        } else {
            nx.removeAttribute("ui.class");
        }

    }

    @Override
    public void mouseOver(String id) {

        Node nx = graph.getNode(id);
        nx.setAttribute("ui.class", "hover");
    }

    public void mouseLeft(String id) {
        Node nx = graph.getNode(id);
        if (nx.hasAttribute("Thruth?")) {
            nx.setAttribute("ui.class", "shown");
        } else {
            nx.removeAttribute("ui.class");
        }
    }
}
