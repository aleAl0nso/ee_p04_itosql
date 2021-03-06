/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import java.awt.Font;
import java.util.Iterator;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.*;


/**
 * Declaracion de la clase Insertar_datos que extiende de JFrame
 * @author Ingrid Paola Lopez Niño, Jiménez Pérez Pedro, Alonso González Alejandro Javier, Azcona González José Antonio, Chávez Aquino Daniel Felipe
 * @version 06/12/2016
 */
public class Insertar_datos<T> extends javax.swing.JFrame {
    ListaLigada<Tabla> listaDeTablas;
    
    private String[] aux;
    private String[]auxParacrear;
    private String[] aux2;
    private ListaLigada l;
    private ArrayList<String> valores ;
    private ArrayList<JTextField> arrejtext;
    private JLabel j;
    private JTextField t;
    private Objeto obj;
  
    // Crear_tabla c1=new Crear_tabla();
    /**
     * Este metodo nos devuelve una Lista Ligada de tipo Tabla
     * @return listaDeTablas
     */
    public ListaLigada<Tabla> regresaLista(){
        return listaDeTablas;
    }
    /**
     * Creacion del constructor de a clase donde se implementan sus propiedades
     * @version 01/12/2016
     */
    public Insertar_datos() {
        arrejtext = new ArrayList<>();
        valores=new ArrayList<>() ;
        initComponents();
        this.setResizable(false);
        this.setTitle("Agregar información");
        agregarItems();
    }
    /**
     * Creacion de otro constructor donde tiene una parametro
     * @param listaDeTablas Es un parametro de Lista Ligada de tipo Tabla
     */
    public Insertar_datos(ListaLigada<Tabla> listaDeTablas) {
        this.listaDeTablas=listaDeTablas;
        arrejtext = new ArrayList<>();
        valores=new ArrayList<>() ;
        initComponents();
        this.setResizable(false);
        this.setTitle("Agregar información");
        agregarItems();
    }
    /**
     * Este metodo agrega los campos que tendra el jComboBox y no tiene parametros
     * @version 06/12/2016
     */
    public void agregarItems(){
        Crear_tabla c=new Crear_tabla(listaDeTablas);
        Iterator<String> iter = c.getTablas().iterator();
        while(iter.hasNext()){
            String s=iter.next();
            aux=s.split("/");
            jComboBox1.addItem(aux[0]);
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel1.setText("Nombre de la tabla");

        jButton1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jButton1.setText("Agregar info>>>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jButton2.setText("Aceptar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(12, 1));

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridLayout(12, 1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/222.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1))
            .addGroup(layout.createSequentialGroup()
                .addGap(488, 488, 488)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(jButton1))))
            .addGroup(layout.createSequentialGroup()
                .addGap(467, 467, 467)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Metodo del boton de aceptar
     * @param evt Es un parametro de ActionEvent
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed
    /**
     * Metodo del jComboBox
     * @param evt Es un parametro de ActionEvent
     */
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        jPanel2.removeAll();
        jPanel3.removeAll();
        Crear_tabla c = new Crear_tabla(listaDeTablas);
        Iterator<String> iter = c.getTablas().iterator();
        while(iter.hasNext()){
            String s=iter.next();
            aux=s.split("/");
            aux2=s.replaceFirst(aux[0],"").replace('/',' ').split(",");
            if(jComboBox1.getSelectedItem().equals(aux[0])){
                
                for(int i=0; i<aux2.length;i++){
                   
                j = new JLabel(aux2[i]);
                j.setFont(new Font("Georgia", Font.PLAIN, 12));
                jPanel2.add(j);
                jPanel2.updateUI();
                
                
                t = new JTextField();
                t.setFont(new Font("Georgia", Font.PLAIN, 12));
                arrejtext.add(t);
                jPanel3.add(t);
                jPanel3.updateUI();
                
               
                }
            }
           
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed
    /**
     * Metodo del boton de agregar informacion
     * @param evt Es un parametro de ActionEvent
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Iterator<JTextField> iter = arrejtext.iterator();
        while(iter.hasNext()){
            JTextField s = iter.next();
            valores.add(s.getText()+" -- ");
            //System.out.println(aux[0]+"---"+s.getText());
        }
        //JOptionPane.showMessageDialog(null, jComboBox1.getAccessibleContext());
        /*Crear_tabla c=new Crear_tabla();
        Iterator<String> iter1 = c.getTablas().iterator();
        while(iter.hasNext()){
            String s=iter1.next();
            auxParacrear=s.split("/");
             if(jComboBox1.getSelectedItem().equals(auxParacrear[0])){
                 */
       // for(int x=0; x<aux.length;x++){
           // JOptionPane.showMessageDialog(null, aux[x]);
        //}
                 //JOptionPane.showMessageDialog(null, auxParacrear[0]);
                 Objeto ob = new Objeto(aux[0], valores);
                 
             listaDeTablas.buscarTabla(""+jComboBox1.getSelectedItem()).agregarRegistro(ob);
            // Nodo a = new Nodo();
        ///---------------------------------------------------------
        
       
         //Nodo aux1 = listaDeTablas.getInicio();
         //listaDeTablas.recorrer(aux1);
        
     
 
        
        
          
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * Metodo que nos regresa un JComboBox
     * @return jComboBox1
     */
    public JComboBox getjComboBox1() {
        return jComboBox1;
    }
    /**
     * Metodo que no regresa nada y tiene un parametro
     * @param jComboBox1 Es un parametro de tipo JComboBox
     */
    public void setjComboBox1(JComboBox jComboBox1) {
        this.jComboBox1 = jComboBox1;
    }

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
            java.util.logging.Logger.getLogger(Insertar_datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insertar_datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insertar_datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insertar_datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insertar_datos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
