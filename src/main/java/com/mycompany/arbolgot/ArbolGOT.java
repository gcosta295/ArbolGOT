/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.arbolgot;
//comment

import java.io.IOException;
import javax.swing.JOptionPane;
import org.json.simple.parser.ParseException;
import interfaces.Menu;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.jfree.layout.CenterLayout;
///comment
/**
 *
 * @author gabri
 */
public class ArbolGOT {
//utilizar el programa con escala al 100% (configuracion)

    public static void main(String[] args) {

        ReadJSON M = new ReadJSON();
        List persons = new List();
        while (persons.getlen() == 0) {
            try {
                M.abrirArchivo();
                persons = M.Parse();
                persons = M.Arbol(persons);
            }
            catch (Exception e) {
            JOptionPane.showMessageDialog(null,"\nseleccione nuevamente su archivo",
                    "ADVERTENCIA!!!", JOptionPane.WARNING_MESSAGE);

            }

        }
          M.arreglarHijos(persons);
        System.setProperty("org.graphstream.ui", "swing"); 
        Arbol arbol = new Arbol();
        arbol.Graph(persons);
        Clicks clicks = new Clicks();
        clicks.setGraph(arbol.getGraph());
        clicks.setViewer(arbol.getViewer());
        clicks.setPersons(persons);
        Menu m = new Menu();
        clicks.Clicks1();
    
                
        
        
     
    }
}
