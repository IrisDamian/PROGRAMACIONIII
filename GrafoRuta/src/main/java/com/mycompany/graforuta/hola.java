/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graforuta;

import GrafosPkg.Grafo;
import MUNICIPIOS.ID;

/**
 *
 * @author Iris Damian
 */
public class hola extends javax.swing.JFrame {

    /**
     * Creates new form hola
     */
    Grafo g = new Grafo("abcdefghijklmnopq");    
    //implementamos nuestra clase de grafos
    
    //creamos las conexiones entre nuestros municipios
    //implementando los casos creados anteriormente
    //brindando la distancia entre municipios como parte de los casos
    public hola() {
        initComponents();
        g.agregarRuta('a', 'c', 20);
        g.agregarRuta('a', 'e', 30);
        g.agregarRuta('a', 'g', 17);
        g.agregarRuta('a', 'p', 20);
        g.agregarRuta('b', 'c', 15);
        g.agregarRuta('b', 'i', 20);
        g.agregarRuta('b', 'p', 23);
        g.agregarRuta('c', 'a', 20);
        g.agregarRuta('c', 'b', 15);
        g.agregarRuta('c', 'g', 19);
        g.agregarRuta('d', 'f', 17);
        g.agregarRuta('d', 'j', 20);
        g.agregarRuta('d', 'l', 35);
        g.agregarRuta('e', 'a', 30);
        g.agregarRuta('e', 'k', 12);
        g.agregarRuta('e', 'p', 15);
        g.agregarRuta('f', 'd', 17);
        g.agregarRuta('f', 'i', 29);
        g.agregarRuta('g', 'a', 17);
        g.agregarRuta('g', 'c', 19);
        g.agregarRuta('g', 'h', 16);
        g.agregarRuta('h', 'g', 16);
        g.agregarRuta('i', 'b', 20);
        g.agregarRuta('i', 'f', 29);
        g.agregarRuta('i', 'l', 20);
        g.agregarRuta('j', 'd', 20);
        g.agregarRuta('j', 'm', 7);
        g.agregarRuta('k', 'e', 12);
        g.agregarRuta('k', 'o', 17);
        g.agregarRuta('k', 'p', 16);
        g.agregarRuta('k', 'q', 18);
        g.agregarRuta('l', 'd', 35);
        g.agregarRuta('l', 'i', 20);
        g.agregarRuta('m', 'j', 7);
        g.agregarRuta('m', 'n', 41);
        g.agregarRuta('n', 'm', 41);
        g.agregarRuta('o', 'k', 17);
        g.agregarRuta('o', 'p', 7);
        g.agregarRuta('o', 'q', 7);
        g.agregarRuta('p', 'a', 20);
        g.agregarRuta('p', 'b', 23);
        g.agregarRuta('p', 'e', 15);
        g.agregarRuta('p', 'k', 16);
        g.agregarRuta('p', 'o', 7);
        g.agregarRuta('p', 'q', 10);
        g.agregarRuta('q', 'k', 18);
        g.agregarRuta('q', 'o', 7);
        g.agregarRuta('q', 'p', 10);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        combo1 = new javax.swing.JComboBox<>();
        combo2 = new javax.swing.JComboBox<>();
        boton1 = new javax.swing.JButton();
        mostrarrespuesta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        combo1.setEditable(true);
        combo1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Asuncion Mita", "Jutiapa", "El Progreso", "Jalpatagua", "Atescatempa", "Comapa", "Santa Catarina Mita", "Agua Blanca", "Quesada", "Conguaco", "Jerez", "San Jose Acatempa", "Moyuta", "Pasaco", "El Adelanto", "Yupiltepeque", "Zapotitlan", "" }));

        combo2.setBackground(new java.awt.Color(255, 255, 102));
        combo2.setEditable(true);
        combo2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        combo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Asuncion Mita", "Jutiapa", "El Progreso", "Jalpatagua", "Atescatempa", "Comapa", "Santa Catarina Mita ", "Agua Blanca", "Quesada", "Conguaco", "Jerez", "San Jose Acatempa", "Moyuta", "Pasaco", "El Adelanto", "Yupiltepeque", "Zapotitlan", " ", " " }));

        boton1.setBackground(new java.awt.Color(255, 204, 0));
        boton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        boton1.setForeground(new java.awt.Color(255, 0, 0));
        boton1.setText("Buscar");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        mostrarrespuesta.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        mostrarrespuesta.setForeground(new java.awt.Color(204, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("MUNICIPIOS DE JUTIAPA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(boton1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(91, 91, 91))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(mostrarrespuesta))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(boton1)
                .addGap(15, 15, 15)
                .addComponent(mostrarrespuesta)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        String inicio;
        String fin;
        inicio = combo1.getSelectedItem() + "";
        fin = combo2.getSelectedItem() + "";
        ID d = new ID();
        char i = d.municipios(inicio);
        char f = d.municipios(fin);
        String respuesta = g.encontrarRutaMinimaDijkstra(i, f);
        mostrarrespuesta.setText(respuesta);
        //creamos parametros de tipo cadena
        //utilizando nuestros combo box para implementarlos en ellos
        //llamando a nuestra clase ID para obtener la estructura de los casos
        //solicitando mostrarnos los resultados de nuestras rutas
    }//GEN-LAST:event_boton1ActionPerformed

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
            java.util.logging.Logger.getLogger(hola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hola().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JComboBox<String> combo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel mostrarrespuesta;
    // End of variables declaration//GEN-END:variables
}
