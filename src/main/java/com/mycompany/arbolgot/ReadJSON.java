/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolgot;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.json.JSONException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author gcosta
 */
public class ReadJSON {

    private String text;

    private boolean valid;

    /**
     * @Description constructor de ReadJSON
     * @author gcosta
     */
    public ReadJSON() {
    }

    /**
     * Description devuelve boolean si el JSON es valido
     *
     * @author gcosta
     * @return valid
     */
    public boolean isValid() {
        return valid;
    }

    /**
     * Description permite abrir un archivo con JFileChooser
     *
     * @author gcosta
     */
    public void abrirArchivo() {
        valid = false;
        String aux = "";
        setText("");
        try {
            //El metodo que nos permite abrir la ventana
            JFileChooser file = new JFileChooser();
            file.showOpenDialog(file);
            File abre = file.getSelectedFile();
            String fileType = file.getTypeDescription(abre); //tells us what type of file the chosen one is 

            if (fileType.equals("JSON Source File")) { //Validates the JSON file
                if (abre != null) {
                    valid = true;
                    FileReader archivos = new FileReader(abre);
                    BufferedReader lee = new BufferedReader(archivos);
                    while ((aux = lee.readLine()) != null) {
                        setText(getText() + aux + "\n");
                    }
                    lee.close();
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "\nEl archivo no es JSON, por favor volver a intentar",
                        "ADVERTENCIA!!!", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex + ""
                    + "\nNo se ha encontrado el archivo",
                    "ADVERTENCIA!!!", JOptionPane.WARNING_MESSAGE);
        }

    }

    /**
     * Description permite la lectura del JSON, devuelve el parse completo de
     * las lineas
     *
     * @author gcosta
     * @see ReadJSON()
     * @return List
     */
    public List Parse() {
        String jsonString = text;
        List persons = new List();
        try {

            JSONParser parser = new JSONParser(); //creates a json parsser, to parse the json string
            JSONObject arbolJSON = (JSONObject) parser.parse(jsonString);
            String nombreArbol = (String) arbolJSON.keySet().iterator().next();
            JSONArray personas = (JSONArray) arbolJSON.get(nombreArbol);

            for (Object lineObject : personas) { //iterates through each person of the json
                JSONObject persona = (JSONObject) lineObject;

                for (Object lineNameObject : persona.keySet()) { //object each person 
                    String PersonName = (String) lineNameObject; //transform the metroline name into a string
                    Person newPerson = new Person();
                    newPerson.setName(PersonName);
//                    persons.addPerson(newPerson);

                    JSONArray atributos = (JSONArray) persona.get(PersonName); //creates an array of the metroline we are currently parsing

                    for (Object atributeObject : atributos) { ///makes each station o the array into an object

                        JSONObject atributo = (JSONObject) atributeObject;

                        for (Object atributeNameObject : atributo.keySet()) {
                            String atributeName = (String) atributeNameObject;
                            String atributedesc = atributo.get(atributeNameObject).toString();

                            if ("Of his name".equals(atributeName)) {
                                newPerson.setNumber(atributedesc);
                            }
                            if ("Born to".equals(atributeName)) {
                                if (newPerson.getFather() == null) {
                                    newPerson.setFather(atributedesc);
//                                    System.out.println(atributedesc);
                                } else {
//                                    System.out.println(atributedesc);
                                    newPerson.setMother(atributedesc);
                                }

                            }
                            if ("Known throughout as".equals(atributeName)) {
                                newPerson.setMotin(atributedesc);
                            }
                            if ("Held title".equals(atributeName)) {
                                newPerson.setTitulo(atributedesc);
                            }
                            if ("Of eyes".equals(atributeName)) {
                                newPerson.setEyesColor(atributedesc);
                            }
                            if ("Notes".equals(atributeName)) {
                                newPerson.setNotes(atributedesc);
                            }
                            if ("Of hair".equals(atributeName)) {
                                newPerson.setHairColor(atributedesc);
                            }
                            if ("Father to".equals(atributeName)) {
                                newPerson.setListaHijos(atributedesc);
                            }
                            if ("Fate".equals(atributeName)) {
                                newPerson.setFate(atributedesc);
                            }
                            if ("Wed to".equals(atributeName)) {
                                newPerson.setEsposo(atributedesc);
                            }

                        }
                    }
                    persons.addPerson(newPerson);
                    persons.getPerson(persons.getlen()).setIndex(persons.getlen());
                }
            }

        } catch (ParseException e) {

            e.printStackTrace();
        }

        return persons;

    }

    public List Arbol(List persons) {
        
        for (int i = 1; i <= persons.getlen(); i++) {
            Person pAux = persons.getPerson(i);
//            System.out.println(pAux.getName());

            String fatherName = pAux.getFather();
            String motherName = pAux.getMother();
//            System.out.println(fatherName);
            if (fatherName != null) {
                if (!"[Unknown]".equals(fatherName)) { //Todo lo de los padres
//            System.out.println(pAux.getName());

                    if (persons.getMotinPerson(fatherName) != null) { //si el nombre es por motin

                        Person padre = persons.getMotinPerson(fatherName);
//                    System.out.println(padre);
                        pAux.setPFather(padre);
//                        System.out.println(pAux.getName() + " father: " + pAux.getPFather().getName());

                        padre.getHijos().addPerson(pAux);
                    } else { //si tengo que buscarlo por nombre y numero

                        for (int j = 1; j < persons.getlen(); j++) {
                            Person pAux2 = persons.getPerson(j);
                            String pname = pAux2.getName();
                            String pnumber = pAux2.getNumber();
                            String completeText = pname + ", " + pnumber + " of his name";

                            if (completeText.contains(fatherName)) {
                                pAux.setPFather(pAux2);
                                pAux2.getHijos().addPerson(pAux);
//                                System.out.println(pAux.getName() + " father: " + pAux.getPFather().getName());
                            }
                        }
                    }
                }
            }

            if (persons.nameInList(motherName)) {
                Person pAux3 = persons.getNamedPerson(motherName);
                pAux.setPMother(pAux3);
                pAux3.getHijos().addPerson(pAux);
//                System.out.println(motherName);
            } else {
                if (motherName != null) {
                    Person newMother = new Person();
                    newMother.setName(motherName);
                    newMother.getHijos().addPerson(pAux);
                    pAux.setPMother(newMother);
//                    System.out.println(motherName);
                    persons.addPerson(newMother);
                }

            }

        }

        return persons;
    }

    public List arreglarHijos(List persons) {

        for (int j = 1; j <= persons.getlen(); j++) {
            Person pAux = persons.getPerson(j);
            if (pAux.getListaHijos() != null) {
                String hijos = pAux.getListaHijos();

                try {
                    JSONParser parser = new JSONParser();

                    JSONArray json = (JSONArray) parser.parse(hijos);
                    for (Object hijo : json) {
                        String hijoName = (String) hijo;
//                        System.out.println(hijoName);
                        if (persons.nameInList(hijoName) == false) {
                            Person newHijo = new Person();
                            newHijo.setName(hijoName);
                            pAux.getHijos().addPerson(newHijo);
                            newHijo.setPFather(pAux);
                            newHijo.setFather(pAux.getName());
                            persons.addPerson(newHijo);
                            persons.getPerson(persons.getlen()).setIndex(persons.getlen());
                        } else {

                            if (pAux.getHijos().getNamedPerson(hijoName) == null) {
                                Person newHijo = new Person();
                                newHijo.setName(hijoName);
                                pAux.getHijos().addPerson(newHijo);
                                newHijo.setPFather(pAux);
                                newHijo.setFather(pAux.getName());
                                persons.addPerson(newHijo);
                                persons.getPerson(persons.getlen()).setIndex(persons.getlen());
                            }
                        }

                    }

                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }
        return persons;
    }

    /**
     * @author gcosta
     * @return text
     */
    public String getText() {
        return text;
    }

    /**
     * @author gcosta
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }

}
