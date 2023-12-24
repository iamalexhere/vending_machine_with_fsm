/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package sazlm.vending_view.payment_menuT;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;

/**
 *
 * @author ACER
 */
public class DisplaySelectedProductPanel extends javax.swing.JPanel {

    /**
     * Creates new form Menu
     */
    public DisplaySelectedProductPanel() {
        initComponents();
        setOpaque(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProductPanel = new javax.swing.JPanel();
        ProductPlaceholder = new javax.swing.JLabel();
        ProductNameLabel = new javax.swing.JLabel();
        StockRemainingPlaceholder = new javax.swing.JLabel();
        StockRemainingLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        ProductPanel.setBackground(new java.awt.Color(204, 204, 204));

        ProductPlaceholder.setText("Product:");

        ProductNameLabel.setText("(Name of the product)");

        StockRemainingPlaceholder.setText("Stock Remaining:");

        StockRemainingLabel.setText("(Remaining Stock)");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconFolder/powerbank.png"))); // NOI18N
        jLabel1.setText("pb");

        javax.swing.GroupLayout ProductPanelLayout = new javax.swing.GroupLayout(ProductPanel);
        ProductPanel.setLayout(ProductPanelLayout);
        ProductPanelLayout.setHorizontalGroup(
            ProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addGroup(ProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StockRemainingLabel)
                    .addComponent(StockRemainingPlaceholder)
                    .addComponent(ProductNameLabel)
                    .addComponent(ProductPlaceholder))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        ProductPanelLayout.setVerticalGroup(
            ProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(ProductPlaceholder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProductNameLabel)
                    .addComponent(jLabel1))
                .addGap(41, 41, 41)
                .addComponent(StockRemainingPlaceholder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StockRemainingLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProductPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProductPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ProductNameLabel;
    private javax.swing.JPanel ProductPanel;
    private javax.swing.JLabel ProductPlaceholder;
    private javax.swing.JLabel StockRemainingLabel;
    private javax.swing.JLabel StockRemainingPlaceholder;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
