package interfaces;

import com.mycompany.arbolgot.Arbol;
import com.mycompany.arbolgot.Clicks;
import com.mycompany.arbolgot.Hash;
import com.mycompany.arbolgot.HashTable;
import com.mycompany.arbolgot.List;
import com.mycompany.arbolgot.Person;
import static interfaces.Menu.ht;
import static interfaces.Menu.persons;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
//com
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
/**
 *
 * @author Nathaly
 */
public class IFbuscarNombre extends javax.swing.JInternalFrame {

    static List persons;
    static HashTable ht;
    String nombre;

    /**
     * Creates new form IFbuscarNombre
     */
    public IFbuscarNombre(List L) {
        initComponents();
        this.setSize(400, 300);
        this.setTitle("Buscar");
        this.persons = L;
        this.nombre = "";
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jC_nombres = new javax.swing.JComboBox<>();
        jB_cargarNombres = new javax.swing.JButton();
        jB_buscar = new javax.swing.JButton();
        jB_cargarNombres1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(142, 83, 192));

        jC_nombres.setEditable(true);
        jC_nombres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        jC_nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jC_nombresActionPerformed(evt);
            }
        });

        jB_cargarNombres.setBackground(new java.awt.Color(231, 202, 255));
        jB_cargarNombres.setFont(new java.awt.Font("SWComp", 0, 12)); // NOI18N
        jB_cargarNombres.setText("cargar ");
        jB_cargarNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_cargarNombresActionPerformed(evt);
            }
        });

        jB_buscar.setBackground(new java.awt.Color(231, 202, 255));
        jB_buscar.setText("Buscar nombre");
        jB_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_buscarActionPerformed(evt);
            }
        });

        jB_cargarNombres1.setBackground(new java.awt.Color(231, 202, 255));
        jB_cargarNombres1.setFont(new java.awt.Font("SWComp", 0, 12)); // NOI18N
        jB_cargarNombres1.setText("ver");
        jB_cargarNombres1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_cargarNombres1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(231, 202, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Vivaldi", 0, 24)); // NOI18N
        jLabel1.setText("Buscar Nombre");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(167, 142, 189));

        jLabel2.setText("Nota: click en cargar muestra todos");

        jLabel3.setText("los nombres. Si le da a buscar y");

        jLabel4.setText("escribe un nombre, luego debe ");

        jLabel5.setText("darle a cargar para ver las opciones");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jB_cargarNombres1)
                        .addGap(58, 58, 58)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jB_cargarNombres)
                            .addComponent(jC_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jB_buscar)
                        .addGap(62, 62, 62))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jC_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jB_cargarNombres))
                    .addComponent(jB_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jB_cargarNombres1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 410, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jC_nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC_nombresActionPerformed


    }//GEN-LAST:event_jC_nombresActionPerformed

    private void jB_cargarNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_cargarNombresActionPerformed
        System.out.println(nombre);
        jC_nombres.removeAllItems();
        Person pAux = persons.getpFirst();
        while (pAux != null) {
            if (pAux.getName().contains(nombre)) {

                jC_nombres.addItem(pAux.getName() + " " + pAux.getNumber() + " " + pAux.getIndex());

            }
            pAux = pAux.getNext();
        }


    }//GEN-LAST:event_jB_cargarNombresActionPerformed

    private void jB_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_buscarActionPerformed

        nombre = JOptionPane.showInputDialog(this, "Escribe el nombre de la persona que quieres buscar");

    }//GEN-LAST:event_jB_buscarActionPerformed

    private void jB_cargarNombres1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_cargarNombres1ActionPerformed
        Arbol arbol = new Arbol();
        arbol.Graph(persons);

        Clicks clicks = new Clicks();
        clicks.setGraph(arbol.getGraph());
        clicks.setViewer(arbol.getViewer());
        clicks.setPersons(persons);
        ht = arbol.getHashTable();
        clicks.setHt(ht);
        clicks.Clicks1();

        Object h = jC_nombres.getSelectedItem();
        String a = h.toString();
        String nums = a.replaceAll("[^0-9]", "");
        System.out.println(nums);

        Hash x = ht.serchHashTable(Integer.parseInt(nums));
        Person persona = x.getData();

        Graph grafo = arbol.getGraph();
        arbol.getGraph().getNode(Integer.toString(persona.getIndex())).setAttribute("ui.class", "shown");

        List descendants = new List();
        descendants = persona.getDesenders(descendants);

        for (int i = 1; i <= persons.getlen(); i++) {
            Person aux = persons.getPerson(i);
            
            arbol.getGraph().getNode(Integer.toString(aux.getIndex())).removeAttribute("ui.class");
            arbol.getGraph().getNode(Integer.toString(aux.getIndex())).removeAttribute("Thruth?");
        }
        for (int i = 1; i <= descendants.getlen(); i++) {
            Person aux = descendants.getPerson(i);
            arbol.getGraph().getNode(Integer.toString(aux.getIndex())).setAttribute("ui.class", "shown");
            arbol.getGraph().getNode(Integer.toString(aux.getIndex())).setAttribute("Thruth?");
        }


    }//GEN-LAST:event_jB_cargarNombres1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_buscar;
    private javax.swing.JButton jB_cargarNombres;
    private javax.swing.JButton jB_cargarNombres1;
    private javax.swing.JComboBox<String> jC_nombres;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables

}
