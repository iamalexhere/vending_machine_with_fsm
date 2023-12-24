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
public class HeadBorderPanel extends javax.swing.JPanel {

    /**
     * Creates new form Menu
     */
    public HeadBorderPanel() {
        initComponents();
        setOpaque(false);
        panelMoving.setBackground(Color.white);
        panelMoving.setOpaque(false);
    }

    @Override
    protected void paintChildren(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint grdt = new GradientPaint(0,0,Color.decode("#ffffff"),0,getHeight(),Color.decode("#ffffff"));
        g2.setPaint(grdt);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
//        g2.fillRect(getWidth()-20, 0, getWidth(), getHeight() );
        super.paintChildren(g);
    }
    
    private int x;
    private int y;
    
    public void initMoving(JFrame jfram){
        panelMoving.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                x = e.getX();
                y= e.getY();
            }
            
        });
        
        panelMoving.addMouseMotionListener(new MouseMotionAdapter(){
            @Override
            public void mouseDragged(MouseEvent e) {
                jfram.setLocation(e.getXOnScreen()-x, e.getYOnScreen()-y);
            }
            
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BenLouPanel = new javax.swing.JPanel();
        panelMoving = new javax.swing.JPanel();
        LogoBenLouLabel = new javax.swing.JLabel();
        VMMLabel = new javax.swing.JLabel();

        BenLouPanel.setBackground(new java.awt.Color(43, 60, 90));

        panelMoving.setBackground(new java.awt.Color(255, 255, 255));
        panelMoving.setOpaque(false);

        LogoBenLouLabel.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        LogoBenLouLabel.setForeground(new java.awt.Color(255, 255, 255));
        LogoBenLouLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconFolder/Screenshot 2023-12-23 104124-1.png"))); // NOI18N
        System.out.println(getClass());
        LogoBenLouLabel.setText("Ben & Lou");

        VMMLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        VMMLabel.setForeground(new java.awt.Color(255, 255, 255));
        VMMLabel.setText("Vending Machine Model");

        javax.swing.GroupLayout panelMovingLayout = new javax.swing.GroupLayout(panelMoving);
        panelMoving.setLayout(panelMovingLayout);
        panelMovingLayout.setHorizontalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMovingLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(VMMLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LogoBenLouLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        panelMovingLayout.setVerticalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMovingLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(LogoBenLouLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VMMLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BenLouPanelLayout = new javax.swing.GroupLayout(BenLouPanel);
        BenLouPanel.setLayout(BenLouPanelLayout);
        BenLouPanelLayout.setHorizontalGroup(
            BenLouPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BenLouPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(panelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        BenLouPanelLayout.setVerticalGroup(
            BenLouPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BenLouPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(panelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BenLouPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BenLouPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BenLouPanel;
    private javax.swing.JLabel LogoBenLouLabel;
    private javax.swing.JLabel VMMLabel;
    private javax.swing.JPanel panelMoving;
    // End of variables declaration//GEN-END:variables
}
