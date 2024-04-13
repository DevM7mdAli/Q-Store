/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Zord
 */


import java.math.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

import java.lang.*;
import javax.swing.*;
import javax.swing.border.Border;

import javax.swing.event.*;
import javax.print.DocFlavor.STRING;
import javax.xml.crypto.Data;
public class Products extends javax.swing.JFrame {

    /**
     * Creates new form Products
     */
   JPanel mainPanel; // FlowLayout
    JPanel productsPanel; // GridLayout

    JButton cartButton;
    JLabel productName;
    String[] productNames = {"apple", "orange", "car", "helicopter", "crystal", "building","goods","anything","anything2",
        "anything3","anything4","anything5","anything6","anything7","anything8","anything9"
        ,"anything10","anything11","anything12","anything13","anything14","anything15","anything16"
    };
//         double prices[] = new double[productNames.length];
        

    public Products() {      
        super("Product Page");
        initComponents();
        initComponents2();
        
        setUpLayout();
        addProductsToPanel();
         getContentPane().setBackground(new Color(0xF0EBF8));
    }

    private void initComponents2() {
        mainPanel = new JPanel();
        mainPanel.setBackground(Color.WHITE);
        productsPanel = new JPanel();
    }

    private void setUpLayout() {
        setLayout(new FlowLayout());
        mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20)); // Add some space between components
        productsPanel.setLayout(new GridLayout(0, 8, 20, 20)); // 3 columns for products, space between cells
        Border border = BorderFactory.createEmptyBorder(40, 40, 40, 40); // Add padding around productsPanel
        productsPanel.setBorder(border);
        add(mainPanel);
        mainPanel.add(productsPanel);
    }

    private void addProductsToPanel() {
        int i = 0;
        for (String productName : productNames) {
            JPanel productPanel = createProductPanel(productName,i+15);
            productsPanel.add(productPanel);
            i++;
        }
    }

    private JPanel createProductPanel(String productName,double price) {
        JPanel productPanel = new JPanel(new GridLayout(3, 1)); // 3 rows for product name and cart button and price
        productPanel.setBackground(Color.WHITE); // Set background color
        productPanel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY)); // Add border for separation

        JLabel nameLabel = new JLabel(productName);
        JLabel priceL = new JLabel(String.valueOf(price)+" $");
        
        nameLabel.setHorizontalAlignment(JLabel.CENTER); // Center-align the label
        priceL.setHorizontalAlignment(JLabel.CENTER);
        JButton cartButton = new JButton("Add to Cart");
        
        cartButton.setAlignmentX(JButton.CENTER_ALIGNMENT); // Center-align the button

        productPanel.add(nameLabel);
        productPanel.add(priceL);
        productPanel.add(cartButton);
        

        return productPanel;
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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("drag");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(592, 592, 592)
                .addComponent(jLabel1)
                .addContainerGap(716, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 694, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}