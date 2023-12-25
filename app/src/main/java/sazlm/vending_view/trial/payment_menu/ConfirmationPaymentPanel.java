/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package sazlm.vending_view.trial.payment_menu;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;


public class ConfirmationPaymentPanel extends javax.swing.JPanel {
    
    public ConfirmationPaymentPanel() {
        initComponents();
        setOpaque(false);   
        
    }
   

    
    
    @SuppressWarnings("unchecked")
    
    boolean isAvailable = false;
    
    public void setCukup(){
        paintChildren(this.getGraphics(), Color.decode("#25d95b"));
        
        try {
            Thread.sleep(5);
        } catch (InterruptedException ex) {
            Logger.getLogger(ConfirmationPaymentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.isAvailable=true;
        paintChildren(this.getGraphics(), Color.decode("#25d95b"));
        this.jLabel1.setText("Bayar");
        this.jLabel1.setAlignmentX(CENTER_ALIGNMENT);
        
    }
    
    public void setKurang(){
        paintChildren(this.getGraphics(), Color.decode("#F2072f"));
        try {
            Thread.sleep(5);
        } catch (InterruptedException ex) {
            Logger.getLogger(ConfirmationPaymentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.isAvailable=false;
        paintChildren(this.getGraphics(), Color.decode("#F2072f"));
        this.jLabel1.setText("Saldo Belanja Kurang");
        this.jLabel1.setAlignmentX(CENTER_ALIGNMENT);

//        this.getGraphics().setColor(Color.decode("#F2072f"));
//        this.setBackground(Color.decode("#F2072f"));
 
        
    }
    
        
    @Override
    protected void paintChildren(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint grdt = new GradientPaint(0,0,Color.GRAY,0,getHeight(),Color.GRAY);
        g2.setPaint(grdt);
        jLabel1.setBackground(Color.GRAY);
        jLabel1.setText("Pending..");
        
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 45, 45);
        super.paintChildren(g);
    }
    
    public void paintChildren(Graphics g, Color c){
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint grdt = new GradientPaint(0,0,c,0,getHeight(),c);
        g2.setPaint(grdt);
        jLabel1.setBackground(c);
  
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 45, 45);
        super.paintChildren(g);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
