package interfaces;

import com.mycompany.arbolgot.Arbol;
import com.mycompany.arbolgot.Clicks;
import com.mycompany.arbolgot.List;
import com.mycompany.arbolgot.ReadJSON;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Nathaly
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    ReadJSON M;

    public Menu() {

        initComponents();
        this.M = new ReadJSON();
        this.setLocationRelativeTo(null);
        this.setTitle("Menu");
        this.setResizable(false);
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
        B_arbol = new javax.swing.JButton();
        B_antepasados = new javax.swing.JButton();
        B_nombre = new javax.swing.JButton();
        B_generacion = new javax.swing.JButton();
        B_cambiarJSON = new javax.swing.JButton();
        jDesktopPane_menu = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        B_arbol.setBackground(java.awt.Color.lightGray);
        B_arbol.setFont(new java.awt.Font("Vivaldi", 0, 18)); // NOI18N
        B_arbol.setText("Mostrar Árbol");
        B_arbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_arbolActionPerformed(evt);
            }
        });
        jPanel1.add(B_arbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 150, 50));

        B_antepasados.setBackground(java.awt.Color.lightGray);
        B_antepasados.setFont(new java.awt.Font("Vivaldi", 0, 18)); // NOI18N
        B_antepasados.setText("Antepasados");
        B_antepasados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_antepasadosActionPerformed(evt);
            }
        });
        jPanel1.add(B_antepasados, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 150, 50));

        B_nombre.setBackground(java.awt.Color.lightGray);
        B_nombre.setFont(new java.awt.Font("Vivaldi", 0, 18)); // NOI18N
        B_nombre.setText("Buscar por nombre ");
        B_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_nombreActionPerformed(evt);
            }
        });
        jPanel1.add(B_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 150, 50));

        B_generacion.setBackground(java.awt.Color.lightGray);
        B_generacion.setFont(new java.awt.Font("Vivaldi", 0, 18)); // NOI18N
        B_generacion.setText("Generación");
        B_generacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_generacionActionPerformed(evt);
            }
        });
        jPanel1.add(B_generacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 150, 50));

        B_cambiarJSON.setBackground(java.awt.Color.lightGray);
        B_cambiarJSON.setFont(new java.awt.Font("Vivaldi", 0, 14)); // NOI18N
        B_cambiarJSON.setText("Cargar JSON");
        B_cambiarJSON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_cambiarJSONActionPerformed(evt);
            }
        });
        jPanel1.add(B_cambiarJSON, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 150, 50));

        jDesktopPane_menu.setBackground(java.awt.Color.lightGray);

        javax.swing.GroupLayout jDesktopPane_menuLayout = new javax.swing.GroupLayout(jDesktopPane_menu);
        jDesktopPane_menu.setLayout(jDesktopPane_menuLayout);
        jDesktopPane_menuLayout.setHorizontalGroup(
            jDesktopPane_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        jDesktopPane_menuLayout.setVerticalGroup(
            jDesktopPane_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jPanel1.add(jDesktopPane_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 510, 420));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mapagotbla.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 450));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_cambiarJSONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_cambiarJSONActionPerformed

        M.abrirArchivo();
        List persons = M.Parse();
        persons = M.Arbol(persons);
        
        M.arreglarHijos(persons);
        System.out.println(persons.getPerson(1).getName());
        System.setProperty("org.graphstream.ui", "swing");
        Arbol arbol = new Arbol();
        arbol.Graph(persons);
        Clicks clicks = new Clicks();
        clicks.setGraph(arbol.getGraph());
        clicks.setViewer(arbol.getViewer());
        clicks.Clicks1();

    }//GEN-LAST:event_B_cambiarJSONActionPerformed

    private void B_arbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_arbolActionPerformed

        IFmostrarArbol interArbol = new IFmostrarArbol();
        jDesktopPane_menu.add(interArbol);
        interArbol.setVisible(true);

    }//GEN-LAST:event_B_arbolActionPerformed

    private void B_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_nombreActionPerformed

        IFbuscarNombre interNombre = new IFbuscarNombre();
        jDesktopPane_menu.add(interNombre);
        interNombre.setVisible(true);

    }//GEN-LAST:event_B_nombreActionPerformed

    private void B_antepasadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_antepasadosActionPerformed

        IFantepasados interAntepasados = new IFantepasados();
        jDesktopPane_menu.add(interAntepasados);
        interAntepasados.setVisible(true);

    }//GEN-LAST:event_B_antepasadosActionPerformed

    private void B_generacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_generacionActionPerformed

        IFgeneracion interGeneracion = new IFgeneracion();
        jDesktopPane_menu.add(interGeneracion);
        interGeneracion.setVisible(true);

    }//GEN-LAST:event_B_generacionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_antepasados;
    private javax.swing.JButton B_arbol;
    private javax.swing.JButton B_cambiarJSON;
    private javax.swing.JButton B_generacion;
    private javax.swing.JButton B_nombre;
    private javax.swing.JDesktopPane jDesktopPane_menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
