/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.arbolgot;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.jfree.layout.CenterLayout;

/**
 *
 * @author gabri
 */
public class ArbolGOT {
//utilizar el programa con escala al 100% (configuracion)

    public static void main(String[] args) {

        
        ReadJSON M = new ReadJSON();
        M.abrirArchivo();
        List persons = M.Parse();
        persons = M.Arbol(persons);
        M.arreglarHijos(persons);
        System.setProperty("org.graphstream.ui", "swing");
        Arbol arbol = new Arbol();
        arbol.Graph(persons);
        Clicks clicks = new Clicks();
        clicks.setGraph(arbol.getGraph());
        clicks.setViewer(arbol.getViewer());
        clicks.setPersons(persons);
        clicks.Clicks1();
    }
}
