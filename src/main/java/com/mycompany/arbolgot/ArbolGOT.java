/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.arbolgot;

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
        Arbol arbol = new Arbol();
        arbol.Graph(persons);
        Clicks clicks = new Clicks();
        clicks.setGraph(arbol.getGraph());
        clicks.Clicks1();
        
//        for (int i = 1; i <= persons.getlen(); i++) {
//            Person pAux = persons.getPerson(i);
//            System.out.println("------");
//            System.out.println(pAux.getName()+ " "+ pAux.getNumber() + " hijos: ");
//            System.out.println("index" + pAux.getIndex());
//            List hijos = pAux.getHijos();
//            for (int j = 1; j <= hijos.getlen(); j++) {
////                System.out.println(hijos.getlen());
//                if (hijos.getPerson(j) != null) {
//                    System.out.println(hijos.getPerson(j).getName()+ " "+ hijos.getPerson(j).getNumber());
//                   
//                }
//            }
        }

    }


