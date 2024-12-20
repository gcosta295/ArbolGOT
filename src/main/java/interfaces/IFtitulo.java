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
//com
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
/**
 *
 * @author Nathaly
 */
public class IFtitulo extends javax.swing.JInternalFrame {

    static List persons;
    static HashTable ht;
    String nombre;

    /**
     * Creates new form IFgeneracion
     */
    public IFtitulo(List L) {
        initComponents();
        this.setSize(400, 300);
        this.setTitle("Titulos");
        this.persons = L;
         jC_nombres.removeAllItems();
        Person pAux = persons.getpFirst();

        List titles = new List();

        while (pAux != null) {
            if (pAux.getTitulo() != null) {
                if (titles.titleInList(pAux.getTitulo()) == false) {
                    jC_nombres.addItem(pAux.getTitulo());
                    titles.addPerson(pAux);
                }
            }
            pAux = pAux.getNext();
        }
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
        jB_cargarNombres1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(22, 22, 97));

        jB_cargarNombres1.setBackground(new java.awt.Color(181, 198, 246));
        jB_cargarNombres1.setFont(new java.awt.Font("SWComp", 0, 12)); // NOI18N
        jB_cargarNombres1.setText("Ver");
        jB_cargarNombres1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_cargarNombres1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(181, 198, 246));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Vivaldi", 0, 24)); // NOI18N
        jLabel1.setText("Titulos");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB_cargarNombres1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jC_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jC_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jB_cargarNombres1)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 410, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        
        List gentetitles = new List();
        
        gentetitles=persons.getListOfTitlePerson(a);
        
        System.out.println(gentetitles.getlen());
        for (int i = 1; i <= persons.getlen(); i++) {
            Person aux = persons.getPerson(i);

            arbol.getGraph().getNode(Integer.toString(aux.getIndex())).removeAttribute("ui.class");
            arbol.getGraph().getNode(Integer.toString(aux.getIndex())).removeAttribute("Thruth?");
        }
        for (int i = 1; i <= gentetitles.getlen(); i++) {
            Person aux = gentetitles.getPerson(i);
            arbol.getGraph().getNode(Integer.toString(aux.getIndex())).setAttribute("ui.class", "shown");
            arbol.getGraph().getNode(Integer.toString(aux.getIndex())).setAttribute("Thruth?");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jB_cargarNombres1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_cargarNombres1;
    private javax.swing.JComboBox<String> jC_nombres;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
