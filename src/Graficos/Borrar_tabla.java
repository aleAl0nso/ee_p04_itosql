/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import java.util.Iterator;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 * Declaracion de la clase Borrar_tabla que extiende de Frame
 * @author Ingrid Paola Lopez, Jiménez Pérez Pedro, Alonso González Alejandro Javier, Azcona González José Antonio, Chávez Aquino Daniel Felipe
 * @version 06/12/2016
 */
public class Borrar_tabla extends javax.swing.JFrame {
    private String aux2[];
    ListaLigada<Tabla> listaDeTablas= new ListaLigada<Tabla>();
    /**
     * Este metodo nos regresa una lista ligada de tipo tabla
     * @return listaDeTablas
     */
    public ListaLigada<Tabla> regresaLista(){
        return listaDeTablas;
    }
    
    /**
     * Este es el contructor de la clase donde tiene un parametro y la implementamos con las propiedades de la misma
     * @param listaDeTablas Es un parametro de tipo lista ligada de tipo tabla
     */
    public Borrar_tabla(ListaLigada<Tabla> listaDeTablas) {
        this.listaDeTablas = listaDeTablas;
        initComponents();
        this.setResizable(false);
        this.setTitle("Borrar tabla");
        jTextField1.setEditable(false);
        agregarItems();
    }
    /**
     * Este es otro constructor donde no tiene parametro y se implementa las propiedades de la tabla
     * @version 06/12/2016
     */
    public Borrar_tabla() {
        initComponents();
        this.setResizable(false);
        this.setTitle("Borrar tabla");
        jTextField1.setEditable(false);
        agregarItems();
    }
    /**
     * Este metodo agrega los campos que tendra el jComboBox y no tiene parametros
     * @version 06/12/2016
     */
    public void agregarItems(){
        Crear_tabla c=new Crear_tabla();
        Iterator<String> iter = c.getTablas().iterator();
        while(iter.hasNext()){
            String s=iter.next();
            aux2=s.split("/");
            jComboBox1.addItem(aux2[0]);
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

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel1.setText("Tablas");

        jComboBox1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jButton1.setText("Borrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/333.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(386, 386, 386)
                .addComponent(jButton1))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jButton1))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Este metodo es del jComboBox y no nos devuelve nada
 * @param evt Es un paramtro de ActionEvent
 */
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed
/**
 * Este metodo es del jTextFiel y no nos devuelve nada
 * @param evt Es un parametro de ActionEvent
 */
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
/**
 * Este metodo implementa un boton
 * @param evt Es un parametro de ActionEvent donde eliminamos la tabla
 */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      String tablaEliminando=""+jComboBox1.getSelectedItem();
        int i = JOptionPane.showConfirmDialog(null, "¿Seguro que desea borrar la Tabla " +tablaEliminando + "?", "Alerta!", JOptionPane.YES_NO_OPTION);
       if(i == JOptionPane.YES_OPTION){
        Crear_tabla ct = new Crear_tabla();
        
        ct.getTt().remove(jComboBox1.getSelectedIndex());
        ct.getTablas().remove(jComboBox1.getSelectedIndex()); 
        jComboBox1.updateUI();
        //Aqui se elimina de la lista de tablas************
           try {
               listaDeTablas.eliminar(tablaEliminando);
           } catch (Exception e) {
               jTextField1.setText("Se a eliminado la tabla " + jComboBox1.getSelectedItem());
           }
        
        
       jTextField1.setText("Se a eliminado la tabla " + jComboBox1.getSelectedItem());
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    public JComboBox getjComboBox1() {
        return jComboBox1;
    }

    public void setjComboBox1(JComboBox jComboBox1) {
        this.jComboBox1 = jComboBox1;
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Borrar_tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Borrar_tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Borrar_tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Borrar_tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Borrar_tabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}