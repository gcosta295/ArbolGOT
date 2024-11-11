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
                                newPerson.setFather(atributedesc);
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
//                                newPerson.setHijos(atributedesc);
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
                }
            }

        } catch (ParseException e) {

            e.printStackTrace();
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
