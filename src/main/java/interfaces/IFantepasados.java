package interfaces;

import com.mycompany.arbolgot.Arbol;
import com.mycompany.arbolgot.Clicks;
import com.mycompany.arbolgot.Hash;
import com.mycompany.arbolgot.HashTable;
import com.mycompany.arbolgot.List;
import com.mycompany.arbolgot.Person;
import static interfaces.IFbuscarNombre.ht;
import static interfaces.IFbuscarNombre.persons;
import javax.swing.JOptionPane;
import org.graphstream.graph.Graph;
//c0mme
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
/**
 *
 * @author Nathaly
 */
public class IFantepasados extends javax.swing.JInternalFrame {

    static List persons;
    static HashTable ht;
    String nombre;

    /**
     * Creates new form IFantepasados
     */
    public IFantepasados(List L) {
        initComponents();
        this.setSize(400, 300);
        this.setTitle("Antepasados");
        this.persons = L;
        this.nombre = "";
    }

    public void setPersons(List persons) {
        this.persons = persons;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jB_cargarNombres1 = new javax.swing.JButton();
        jB_cargarNombres2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jC_nombres = new javax.swing.JComboBox<>();
        jB_cargarNombres = new javax.swing.JButton();
        jB_buscar = new javax.swing.JButton();
        ver = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        jB_cargarNombres1.setText("cargar");
        jB_cargarNombres1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_cargarNombres1ActionPerformed(evt);
            }
        });

        jB_cargarNombres2.setText("cargar");
        jB_cargarNombres2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_cargarNombres2ActionPerformed(evt);
            }
        });

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
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, Short.MAX_VALUE)
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

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Vivaldi", 0, 24)); // NOI18N
        jLabel6.setText("Buscar Nombre");

        jPanel2.setBackground(new java.awt.Color(141, 232, 141));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Vivaldi", 0, 24)); // NOI18N
        jLabel1.setText("Generacion");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(231, 136, 32));

        jC_nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jC_nombresActionPerformed(evt);
            }
        });

        jB_cargarNombres.setBackground(new java.awt.Color(255, 208, 121));
        jB_cargarNombres.setFont(new java.awt.Font("SWComp", 0, 12)); // NOI18N
        jB_cargarNombres.setText("cargar");
        jB_cargarNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_cargarNombresActionPerformed(evt);
            }
        });

        jB_buscar.setBackground(new java.awt.Color(255, 208, 121));
        jB_buscar.setFont(new java.awt.Font("SWComp", 0, 12)); // NOI18N
        jB_buscar.setText("Buscar nombre");
        jB_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_buscarActionPerformed(evt);
            }
        });

        ver.setBackground(new java.awt.Color(255, 208, 121));
        ver.setFont(new java.awt.Font("SWComp", 0, 12)); // NOI18N
        ver.setText("ver");
        ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(222, 178, 114));

        jLabel7.setText("Nota: click en cargar muestra todos");

        jLabel8.setText("los nombres. Si le da a buscar y");

        jLabel9.setText("escribe un nombre, luego debe ");

        jLabel10.setText("darle a cargar para ver las opciones");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 208, 121));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Vivaldi", 0, 24)); // NOI18N
        jLabel11.setText("Antepasados");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel11)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jC_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jB_buscar)
                        .addContainerGap(55, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jB_cargarNombres)
                            .addComponent(ver))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jC_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_cargarNombres)
                        .addGap(50, 50, 50)
                        .addComponent(ver))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 410, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_cargarNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_cargarNombresActionPerformed

            jC_nombres.removeAllItems();
        Person pAux = persons.getpFirst();
        while (pAux != null) {
            if (pAux.getName().contains(nombre)) {
                if (pAux.getNumber() != null) {
                    jC_nombres.addItem(pAux.getName() + " " + pAux.getNumber() + " " + pAux.getIndex());
                } else {
                    jC_nombres.addItem(pAux.getName() + " " + pAux.getIndex());
                }
            }
            pAux = pAux.getNext();
        }
    }//GEN-LAST:event_jB_cargarNombresActionPerformed

    private void jB_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_buscarActionPerformed
        nombre = JOptionPane.showInputDialog(this, "Escribe el nombre de la persona que quieres buscar");
        if (persons.getNamedPerson(nombre) == null) {
            nombre = "";
            JOptionPane.showMessageDialog(null, "\nesta persona no se encuentra en el arbol",
                    "ADVERTENCIA!!!", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jB_buscarActionPerformed

    private void jB_cargarNombres1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_cargarNombres1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_cargarNombres1ActionPerformed

    private void jB_cargarNombres2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_cargarNombres2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_cargarNombres2ActionPerformed

    private void verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verActionPerformed
        Object h = jC_nombres.getSelectedItem();
        
        if (h != null ) {
            String a = h.toString();
        nombre = a;
            Arbol arbol = new Arbol();
            arbol.Graph(persons);
            Clicks clicks = new Clicks();
            clicks.setGraph(arbol.getGraph());
            clicks.setViewer(arbol.getViewer());
            clicks.setPersons(persons);
            ht = arbol.getHashTable();
            clicks.setHt(ht);
            clicks.Clicks1();

            String nums = a.replaceAll("[^0-9]", "");

            Hash x = ht.serchHashTable(Integer.parseInt(nums));
            Person persona = x.getData();

            Graph grafo = arbol.getGraph();
            arbol.getGraph().getNode(Integer.toString(persona.getIndex())).setAttribute("ui.class", "shown");

            List asc = new List();
            asc = persona.getAnsesters(asc, persona.getIndex());

            for (int i = 1; i <= persons.getlen(); i++) {
                Person aux = persons.getPerson(i);

                arbol.getGraph().getNode(Integer.toString(aux.getIndex())).removeAttribute("ui.class");
                arbol.getGraph().getNode(Integer.toString(aux.getIndex())).removeAttribute("Thruth?");
            }

            for (int i = 1; i <= asc.getlen(); i++) {
                Person aux = asc.getPerson(i);
                arbol.getGraph().getNode(Integer.toString(aux.getIndex())).setAttribute("ui.class", "shown");
                arbol.getGraph().getNode(Integer.toString(aux.getIndex())).setAttribute("Thruth?");
            }
        } else {
            JOptionPane.showMessageDialog(null, "\nseleccione una persona para mostrar su arbol",
                    "ADVERTENCIA!!!", JOptionPane.WARNING_MESSAGE);

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_verActionPerformed

    private void jC_nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC_nombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jC_nombresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_buscar;
    private javax.swing.JButton jB_cargarNombres;
    private javax.swing.JButton jB_cargarNombres1;
    private javax.swing.JButton jB_cargarNombres2;
    private javax.swing.JComboBox<String> jC_nombres;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton ver;
    // End of variables declaration//GEN-END:variables
}
