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
import javax.swing.SwingUtilities;

/*
    Nanti tambahin yang QR (paymentMethodQR) + payQR, tinggal import QR, terus check ngehover 
*/
public class PaymentMethod extends javax.swing.JPanel {
    /**
     * Creates new form Payment
     */
    public PaymentMethod() {
        initComponents();
    }
    
    @Override
    protected void paintChildren(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        
        
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        GradientPaint grdt = new GradientPaint(0,0,Color.decode("#2b3a5c"),0,getHeight(),Color.decode("#2b3a5c"));
        g2.setPaint(grdt);
        
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 45, 45);
        g2.fillRect(0, getHeight()-30, getWidth(), getHeight() );
        
        
        super.paintChildren(g);
    }
    
    public void initSelection(){
        Tunai.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                if(SwingUtilities.isLeftMouseButton(e)){
                    Tunai.setForeground(Color.white);
                    QR.setForeground(Color.lightGray);
                }
            }
            
        });
        
        QR.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                if(SwingUtilities.isLeftMouseButton(e)){
                    QR.setForeground(Color.white);
                    Tunai.setForeground(Color.lightGray);
                
                }
            }
            
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Tunai = new javax.swing.JLabel();
        QR = new javax.swing.JLabel();

        setOpaque(false);

        jPanel1.setOpaque(false);

        Tunai.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Tunai.setForeground(new java.awt.Color(255, 255, 255));
        Tunai.setText("Tunai");

        QR.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        QR.setForeground(new java.awt.Color(175, 175, 175));
        QR.setText("QR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(Tunai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(QR)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tunai)
                    .addComponent(QR))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel QR;
    private javax.swing.JLabel Tunai;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
