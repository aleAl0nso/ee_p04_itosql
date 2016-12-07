/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import java.awt.Font;
import javax.swing.JLabel;
import java.util.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 * Declaracion de la clase Crear_tabla que extiende de JFrame
 * @author Ingrid Paola Lopez Niño, Jiménez Pérez Pedro, Alonso González Alejandro Javier, Azcona González José Antonio, Chávez Aquino Daniel Felipe
 * @version 06/12/2016
 */
public class Crear_tabla extends javax.swing.JFrame {
    private int cont = 0;
    private String s = "";
    private JLabel jl,jl2;
    private JTextField jt;
    private JComboBox jcb;
    private String aux[];
    private String aux2[];
    private JTable jtt;
    Tabla tabla;
    private ArrayList<JTextField> jtfpanel2;
    private static ArrayList<String> tablas = new ArrayList<>();
    private static ArrayList<JTable> tt = new  ArrayList<>();
    private static ArrayList<String> atributos = new  ArrayList<>();
    ListaLigada<Tabla> listaDeTablas;
    /**
     * Este metodo retorna una lista ligada de tipo tabla
     * @return listaDeTablas
     */
    public ListaLigada<Tabla> regresaLista(){
        return listaDeTablas;
    }
    /**
     * Este es el constructor de la clase donde le pasamos un parametro y lo implementamos con sus propuedades
     * @param listaDeTablas
     */
    public Crear_tabla(ListaLigada listaDeTablas) {
        this.listaDeTablas=listaDeTablas;
        initComponents();
        jtfpanel2 =  new ArrayList<>();
        this.listaDeTablas=listaDeTablas;
        this.setResizable(false);
        this.setTitle("Agregar tabla");
    }
    /**
     * Este es otro constructor de la clase donde lo implementamos con sus propiedades sin parametros
     * @version 06/12/2016
     */
    public Crear_tabla() {
        initComponents();
        jtfpanel2 =  new ArrayList<>();
        this.listaDeTablas=listaDeTablas;
        this.setResizable(false);
        this.setTitle("Agregar tabla");
    }

    /**
     *Este método se llama desde dentro del constructor para inicializar el formulario.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel1.setText("Nombre de la tabla");

        jButton1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jButton1.setText("Agregar campo>>>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        jButton2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jButton2.setText("Aceptar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(12, 1));

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridLayout(12, 1));

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridLayout(12, 1));

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.GridLayout(12, 1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/555.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(600, 600, 600)
                .addComponent(jButton2))
            .addGroup(layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jButton2))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jButton1))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Este metodo implementa algunas de las propiedades que lleva la tabla
     * @param evt Es un parametro de ActionEvent
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(cont<12){
        jl = new JLabel("Nombre de campo");
        jl.setFont(new Font("Georgia", Font.PLAIN, 12));
        jPanel2.add(jl);
        jPanel2.updateUI();
        
        jt = new JTextField();
        jt.setFont(new Font("Georgia", Font.PLAIN, 12));
        jPanel3.add(jt);
        jtfpanel2.add(jt);
        jPanel3.updateUI();
        
        jl2 = new JLabel("Tipo");
        jl2.setFont(new Font("Georgia", Font.PLAIN, 12));
        jPanel4.add(jl2);
        jPanel4.updateUI();
        
        jcb = new JComboBox();
        jcb.addItem("Texto");
        jcb.addItem("Numérico (Entero)");
        jcb.addItem("Numérico (Decimal)");
        jPanel5.add(jcb);
        jPanel5.updateUI();
        
        cont++;
       }else{
            JOptionPane.showMessageDialog(null, "No se pueden agregar más campos", "Mensaje",JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * Este metodo nos regresa una lista ligada de tabla
     * @param evt Es un parametro de ActionEvent
     * @return listaDeTablas
     */
    public ListaLigada<Tabla> Regresar(java.awt.event.ActionEvent evt){
    jButton2ActionPerformed( evt);
    return listaDeTablas;
    }
    
    /**
     * Este metodo implementa el boton de aceptar en el panel
     * @param evt Es un parametro de ActionEvent
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if(jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Falta el nombre de la Tabla", "Mensaje",JOptionPane.ERROR_MESSAGE);
        }else{
           
           Crear_tabla c=new Crear_tabla(listaDeTablas);
        Iterator<String> iter2 = c.getTablas().iterator();
        while(iter2.hasNext()){
            String s=iter2.next();
            aux=s.split("/");
            aux2=s.replaceFirst(aux[0],"").replace('/',' ').split(",");
       
                for(int i=0; i<aux2.length;i++){
                atributos.add(aux2[i]);
                }
            
        }
          tabla = new Tabla(jTextField1.getText());
     
        Iterator<JTextField> iter = jtfpanel2.iterator();
        
        while(iter.hasNext()){
            JTextField jr=iter.next();
            if(jr.getText().equals("")){
                iter.remove();
            }else
                s+=jr.getText()+",";
            }
        try{
            Nodo tem = new Nodo(tabla);            
            listaDeTablas.insertar(tem);        
            //JOptionPane.showMessageDialog(null, listaDeTablas.getInicio().getDato());
            tablas.add(jTextField1.getText() + "/" + s.substring(0,s.length()-1));
        }catch(IndexOutOfBoundsException  be){
            JOptionPane.showMessageDialog(null, "No se puede crear la tabla sin campos", "Mensaje",JOptionPane.ERROR_MESSAGE);
        }
            jtt = new JTable(jtfpanel2.size(),1);
            tt.add(jtt);
            if(tablas.size()!=0){
            JOptionPane.showMessageDialog(null, "La tabla " + jTextField1.getText() + " se creó correctamente");
            this.dispose();
            }
        }
    
    }//GEN-LAST:event_jButton2ActionPerformed
    /**
     * Este metodo nos devuelve un array list de tipo JTextField
     * @return jtfpanel2;
     */
    public ArrayList<JTextField> getJtfpanel2() {
        return jtfpanel2;
    }
    /**
     * Este metodo nos regresa una tabla
     * @return tabla
     */
    public Tabla getTabla() {
        return tabla;
    }
    /**
     * Este metodo no nos regresa nada pero tiene un parametro
     * @param tabla Este es un parametro de la clase Tabla
     */
    public void setTabla(Tabla tabla) {
        this.tabla = tabla;
    }

    
    /**
     * Este metodo tiene un parametro de tipo ArrayList de JTextFiel
     * @version 06/12/2016
     */
    public void setJtfpanel2(ArrayList<JTextField> jtfpanel2) {
        this.jtfpanel2 = jtfpanel2;
    }
    /**
     * Este metodo es estatico y nos regresa una tabla de ArrayList
     * @return tablas
     */
    public static ArrayList<String> getTablas() {
        return tablas;
    }
    /**
     * Este metodo es estatico y no nos regresa nada pero tiene un parametro
     * @param tablas Es un parametro de tipo ArrayList
     */
    public static void setTablas(ArrayList<String> tablas) {
        Crear_tabla.tablas = tablas;
    }
    /**
     * Este metodo nos regresa un ArrayList de tipo JTable
     * @return tt
     */
    public ArrayList<JTable> getTt() {
        return tt;
    }
    /**
     * Este metodo no nos regresa nada pero tiene un parametro de ArrayList de tipo JTable
     * @param tt
     */
    public void setTt(ArrayList<JTable> tt) {
        this.tt = tt;
    }
    /**
     * Este metodo nos regresa una Lista Ligada
     * @return listaDeTablas
     */
    public ListaLigada getListaDeTablas() {
        return listaDeTablas;
    }
    /**
     * Este metodo no regresa nada pero tiene un parametro
     * @param listaDeTablas Es un parametro de tipo ListaLigada
     */
    public void setListaDeTablas(ListaLigada listaDeTablas) {
        this.listaDeTablas = listaDeTablas;
    }
    
    /**
     * Metodo para ejecutar
     * @param args Es un arreglo de String
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
            java.util.logging.Logger.getLogger(Crear_tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crear_tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crear_tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crear_tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crear_tabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
