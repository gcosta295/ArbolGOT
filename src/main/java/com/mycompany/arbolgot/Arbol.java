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
                + "    size: 5px, 5px;\n"
                + "    fill-color: #2de327;\n"
                + "    text-mode: normal; \n"
                + "}");
        HashTable HT = new HashTable();
        lNodes = new List();
        for (int i = 1; i <= persons.getlen(); i++) {
            Person pAux = persons.getPerson(i);
            if (lNodes.indexInList(pAux.getIndex())==false){
                lNodes.addPerson(pAux);
                Node nx;
                nx = this.graph.addNode(pAux.getName());
                this.createHash(HT, nx, pAux.getIndex());
            }
            if (pAux.getMother()!=null){
                if (lNodes.indexInList(lNodes.getNamedPerson(pAux.getMother()).getIndex())==false){
                    lNodes.addPerson(lNodes.getNamedPerson(pAux.getMother()));
                    Node nx2;
                    nx2 = this.graph.addNode(pAux.getMother());
                    this.createHash(HT, nx2, pAux.getIndex());
                }
            }
            if (pAux.getHijos()!=null){
                for (int j = 1; j <= pAux.getHijos().getlen(); j++) {
                    Person hAux = pAux.getHijos().getPerson(j);
                    if (lNodes.indexInList(hAux.getIndex())==false){
                        lNodes.addPerson(hAux);
                        Node nx1;
                        nx1 = this.graph.addNode(hAux.getName());
                        this.createHash(HT, nx1, pAux.getIndex());
                        String y = pAux.getName() + hAux.getName();
                        Edge edd = this.graph.addEdge(y, pAux.getName(), hAux.getName());
                        
//                    String y = x.getName() + x1.getName();
//                    Edge edd = this.graph.addEdge(y, x.getName(), x1.getName());
//                    edd.setAttribute("shape", "line");
                    }
                }
            }
            
    
//        for (int j = 1; j <= persons.getlen(); j++) {
//            Line tline = persons.getLine(persons, j);
//            List stations = persons.getLine(persons, j).getStations();
//            
//                Person x = persons.getPerson(j);
//                Person x1 = persons.getPerson(j + 1);
//                lPerson.addPerson(x);
//                lPerson.addPerson(x1);
//                if (j < persons.getlen()) {
//                    if (j == 1) {
//                        Node nx;
//                        Node nx1;
//                        if (this.graph.getNode(x.getName()) == null) {
//                            nx = this.graph.addNode(x.getName());
//                        } else {
//                            nx = this.graph.getNode(x.getName());
//                        }
//                        if (this.graph.getNode(x1.getName()) == null) {
//                            nx1 = this.graph.addNode(x1.getName());
//                        } else {
//                            nx1 = this.graph.getNode(x1.getName());
//                        }
//                        nx.setAttribute("ui.style", "fill-color: #42a4ff;");
//                        nx.setAttribute("ui.label", x.getName());
//                        nx1.setAttribute("ui.label", x1.getName());
//                        nx1.setAttribute("ui.style", "fill-color: #42a4ff;");
//
//                    } else {
//                        if (x1 != null) {
//                            Node nx1;
//                            if (this.graph.getNode(x1.getName()) == null) {
//                                nx1 = this.graph.addNode(x1.getName());
//                                nx1.setAttribute("weight", 4.0);
//                            } else {
//                                nx1 = this.graph.getNode(x1.getName());
//                            }
//
//                            nx1.setAttribute("ui.style", "fill-color: #42a4ff;");
//                            nx1.setAttribute("ui.label", x1.getName());
//
//                        }
//                    }
//                    String y = x.getName() + x1.getName();
//                    Edge edd = this.graph.addEdge(y, x.getName(), x1.getName());
//                    edd.setAttribute("shape", "line");
//                }
//            }
//        }
//        for (int i = 1; i <= persons.getlen(); i++) {
//            List stations = persons.getLine(persons, i).getStations();
//            System.out.println(persons.getLine(persons, j).getLname());
//            for (int l = 1; l < stations.getlen(); l++) {
//                System.out.println(stations.getStation(l).getsData());
//            }
        }
    }
    
    public void createHash (HashTable ht, Object o, int index){
        Hash hAux = new Hash();
        hAux.setData(o);
        hAux.setKey(index);
        ht.addHash(hAux);
    }

//    /**
//     * Regresa la lista de lineas que conforman al grafo
//     *
//     * @author Nathaly
//     * @return listaLines
//     */
//    public List getListaLines() {
//        return listaLines;
//    }
//
//    /**
//     * Crea una sucursal, indicandote si la estacion existe la estacion
//     * seleccionada
//     *
//     * @author gcosta
//     * @return lPerson
//     */
//    public boolean setSucursal(String sname, List listaLines, int t) {
//
////        for (int j = 1; j < listaLines.getlen(); j++) {
////            List estaciones = listaLines.getLine(listaLines, j).getStations();
//        if (lPerson.nameInList(sname)) {
//            Station sAux = lPerson.getNamedStation(sname);
//            sAux.setCover(true);
//            sAux.setSucursal(true);
//            Node nx1;
//            nx1 = this.graph.getNode(sname);
//            List vac = new List();
//            vac = this.DFS(vac, t, sAux);
//
//            for (int j = 1; j <= vac.getlen(); j++) {
//                Station s = lPerson.getStation(j);
//                if (s!=null){
//                       s.setCover(true);
//                }
////                System.out.println(s.getsData());
//
////             
//
//            }
////        
//
//            if (nx1 != null) {
//                nx1.setAttribute("ui.style", "fill-color: #ff42e3;");
//                nx1.setAttribute("ui.style", "size: 10px, 10px;");
//                lSucursals.AddStation(sAux);
//                return true;
//            }
//
//        }
//
//        return false;
//    }
//
//    /**
//     * método para eliminar una sucursal. Se vuelve a poner el nodo del color
//     * original y se elimina de la lista de sucursales. Resetea los colores del
//     * grafo
//     *
//     * @author Nathaly
//     *
//     * @param sname
//     * @param listaLines
//     *
//     * @return
//     */
//    public boolean deleteSucursal(String sname, List listaLines) {
//
//        if (lSucursals.nameInList(sname)) {
//            Station sAux = lPerson.getNamedStation(sname);
//            sAux.setSucursal(false);
//            Node nx1;
//            nx1 = this.graph.getNode(sname);
//
//            if (nx1 != null) {
//                nx1.setAttribute("ui.style", "fill-color: #42a4ff;");
//                nx1.setAttribute("ui.style", "size: 10px, 10px;");
//                lSucursals.deleteStation(sAux);
//                return false;
//            }
//
//        }
//
//        for (int j = 1; j <= lPerson.getlen(); j++) {
//            Station s = lPerson.getStation(j);
//            s.setCover(false);
//            Node nx1;
//            nx1 = graph.getNode(s.getsData());
//            nx1.setAttribute("ui.style", "fill-color: #42a4ff;");
//        }
//
//        return true;
//    }
//
//    /**
//     * Realiza la busqueda por amplitud
//     *
//     * @author astv06
//     * @param l
//     * @param t
//     * @param s
//     * @return l
//     */
//    public List BFS(List l, int t, Station s) {
//        s.setCover(true);
//        int cont = 1;
//        List x = s.getconections();
//        while (cont <= t) {
//            if (cont == 1) {
//                for (int j = 1; j <= x.getlen(); j++) {
//                    if (l.sInList(x.getStation(j)) == false) {
//                        l.AddStation(x.getStation(j));
//                    }
//                }
//            } else {
//                for (int j = 1; j <= x.getlen(); j++) {
//                    List lAux = this.BFS(l, t - 1, s);
//                }
//            }
//            cont += 1;
//        }
//        return l;
//    }
//
//    /**
//     * Realiza la busqueda por profundidad
//     *
//     * @author gcosta
//     * @param visitedNodes
//     * @param t
//     * @param u
//     * @return visitedNodes
//     */
//    public List DFS(List visitedNodes, int t, Station u) {
//        u.setCover(true);
//        while (t > 0) {
//            if (t == 1) {
//                int c = 1;
//                while (c <= u.getconections().getlen()) {
//                    Station sAux = u.getconections().getStation(c);
//                    if (visitedNodes.sInListdfs(sAux)) {
//                        c += 1;
//                    } else {
//                        visitedNodes.AddStation(sAux);
//                        c += 1;
//                    }
//                }
//                t -= 1;
//            } else {
//                int k = 1;
//                while (k <= u.getconections().getlen()) {
//                    Station sAux = u.getconections().getStation(k);
//                    if (visitedNodes.sInListdfs(sAux) == false) {
//                        visitedNodes.AddStation(sAux);
//                        DFS(visitedNodes, t - 1, sAux);
//                    }
//                    k += 1;
//                }
//                t -= 1;
//            }
//        }
//        return visitedNodes;
//    }
//
//    /**
//     * Realiza una recomendacion de paradas para poner sucursales
//     *
//     * @author astv06
//     * @param t
//     * @return l
//     */
//    public List recomendSucursal(int t) {
//        List l = new List();
//        for (int j = 1; j <= lSucursals.getlen(); j++) {
//            Station s = lSucursals.getStation(j);
//            List lAux = new List();
//            List l2 = this.DFS(lAux, t + 1, s);
//            for (int j = 1; j <= l2.getlen(); j++) {
//                if (l2.getStation(j).isCover() == false) {
//                    if (l2.getStation(j).isSucursal() == false) {
//                    l.AddStation(l2.getStation(j));
//                    l2.getStation(j).setCover(true);
//                    }
//                }
//            }
//        }
//        return l;
//    }
//
//    /**
//     * Cambia el color de todas las sucursales cubiertas por metodo anterior
//     *
//     * @author gcosta
//     * @see BFS, DFS
//     * @param l
//     */
//    public void coveredSucursals(List l) {
//
//        //De ser la primera estacion diferente de null
//        Station sAux = l.getsFirst();
//        while (sAux != null) {
//
//            sAux.setCover(true);
//            Node nx1;
//            nx1 = this.graph.getNode(sAux.getsData());
//            nx1.setAttribute("ui.style", "fill-color: #1a9136;");
//            sAux = sAux.getNext();
//        }
//        for (int j = 1; j <= lSucursals.getlen(); j++) {
//
//            Station s = lSucursals.getStation(j);
//            Node nx = graph.getNode(s.getsData());
//            nx.setAttribute("ui.style", "fill-color: #ff42e3;");
//        }
//
//    }
//
//    /**
//     * Crea un nodo, con el nombre de una estacion
//     *
//     * @author gcosta
//     * @param s
//     */
//    public void CreateNode(String s) {
//        Node nx1 = this.graph.addNode(s);
//        nx1.setAttribute("ui.style", "fill-color: #42a4ff;");
//        nx1.setAttribute("ui.label", s);
//    }
//
//    /**
//     * Crea una edge, entre dos estaciones
//     *
//     * @author gcosta
//     * @param s
//     * @param station
//     */
//    public void CreateEdfe(String s, String station) {
//        Node nx = this.graph.getNode(station);
//        Node nx1 = this.graph.getNode(s);
//
//        String y = s + station;
//        Edge edd = this.graph.addEdge(y, s, station);
//        edd.setAttribute("shape", "line");
//    }
//
//    /**
//     * Muestra la cobertura total de las sucursales, usando DFS
//     *
//     * @author gcosta
//     * @see DFS
//     * @param t
//     */
//    public void TotalCover(int t) {
//
//        for (int j = 1; j <= lSucursals.getlen(); j++) {
//            List coveredS = new List();
//            Station s = lSucursals.getStation(j);
//            coveredSucursals(DFS(coveredS, t, s));
//        }
//    }
//
//    /**
//     * A la hora de cambiar el valor de la t reacrga el grafo
//     *
//     * @author gcosta
//     * @param t
//     */
//    public void cambioT(int t) {
//        for (int j = 1; j <= lPerson.getlen(); j++) {
//
//            Station s = lPerson.getStation(j);
//            Node nx1 = this.graph.getNode(s.getsData());
//            nx1.setAttribute("ui.style", "fill-color: #42a4ff;");
//            s.setCover(false);
//        }
//        for (int j = 1; j <= lSucursals.getlen(); j++) {
//            List coveredS = new List();
//            Station s = lSucursals.getStation(j);
//            Node nx2 = this.graph.getNode(s.getsData());
//            nx2.setAttribute("ui.style", "fill-color: #ff42e3;");
//            coveredS = DFS(coveredS, t, s);
//
//            for (int j = 1; j <= coveredS.getlen(); j++) {
//                coveredS.getStation(j).setCover(true);
//            }
//        }
//
//    }
}