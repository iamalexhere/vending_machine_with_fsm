/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package sazlm.vending_view.trial.payment_menu;

import sazlm.vending_model.*;


/**
 *
 * @author ialex
 */
public class ConfirmationProductPanel extends javax.swing.JPanel {
    private Machine machine;
    private Product selectedProduct;
    /**
     * Creates new form ConfirmationProductPanel
     */
    public ConfirmationProductPanel() {
        initComponents();
    }
    
    public ConfirmationProductPanel(Machine machine, Product selectedProduct) {
        initComponents();
        this.machine = machine;
        this.selectedProduct = selectedProduct;
        updateLabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        minus = new javax.swing.JLabel();
        namaProduk = new javax.swing.JLabel();
        stockProdukPlaceholder = new javax.swing.JLabel();
        stockProdukLabel = new javax.swing.JLabel();
        numLabel = new javax.swing.JLabel();
        hargaProduk = new javax.swing.JLabel();
        plus = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        iconProduct = new javax.swing.JLabel();

        minus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        minus.setText("-");
        minus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                minusMousePressed(evt);
            }
        });

        namaProduk.setFont(new java.awt.Font("Square721 BT", 1, 18)); // NOI18N
        namaProduk.setText("(nama produk)");

        stockProdukPlaceholder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stockProdukPlaceholder.setForeground(new java.awt.Color(204, 204, 204));
        stockProdukPlaceholder.setText("sisa stock:");

        stockProdukLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stockProdukLabel.setForeground(new java.awt.Color(204, 204, 204));
        stockProdukLabel.setText("(num)");

        numLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        numLabel.setText("0");

        hargaProduk.setFont(new java.awt.Font("Square721 BT", 0, 16)); // NOI18N
        hargaProduk.setText("(harga produk)");

        plus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        plus.setText("+");
        plus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                plusMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        iconProduct.setFont(new java.awt.Font("Square721 BT", 0, 16)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(minus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numLabel))
                    .addComponent(stockProdukPlaceholder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stockProdukLabel)
                    .addComponent(plus))
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namaProduk))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(iconProduct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hargaProduk)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(namaProduk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hargaProduk)
                            .addComponent(iconProduct))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stockProdukPlaceholder)
                    .addComponent(stockProdukLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numLabel)
                    .addComponent(minus)
                    .addComponent(plus))
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void minusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusMousePressed
        // TODO add your handling code here:
        String numFromLabel = numLabel.getText();
        int num = Integer.parseInt(numFromLabel);
        num--;
        numLabel.setText(num +"");
    }//GEN-LAST:event_minusMousePressed

    private void plusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusMousePressed
        // TODO add your handling code here:

        String numFromLabel = numLabel.getText();
        int num = Integer.parseInt(numFromLabel);
        num++;
        numLabel.setText(num +"");
    }//GEN-LAST:event_plusMousePressed

    public void updateLabel(){
        //this.stateLabel.setText(machine.getCurrentState().name());
        this.namaProduk.setText(machine.getSelectedProduct().name());
        this.hargaProduk.setText(machine.getTotalPayment()+"");
        this.stockProdukLabel.setText(machine.getRemainingStock(selectedProduct)+"");
        
        //this.hargaProduk = Product.getProduct()
    }
        // Method to update the view of stock
    public void setStockItem(String stockInfo){
        stockProdukLabel.setText(stockInfo);
    }
    
    // Method to get updated stock
    public int getStockItem(){
        int stock = Integer.parseInt(stockProdukLabel.getText());
        return stock;
    }
    
    // Method to get Quantity from ui
    public int getQuantity(javax.swing.JLabel numLabel){
        String numFromLabel = numLabel.getText();
        int num = Integer.parseInt(numFromLabel);
        return num;
    }
    
    // Method to get Product Name
    
    
    
    // Method to set Product icon
    public void setIcon(){
        //iconProduct.setIcon();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hargaProduk;
    private javax.swing.JLabel iconProduct;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel minus;
    private javax.swing.JLabel namaProduk;
    private javax.swing.JLabel numLabel;
    private javax.swing.JLabel plus;
    private javax.swing.JLabel stockProdukLabel;
    private javax.swing.JLabel stockProdukPlaceholder;
    // End of variables declaration//GEN-END:variables
}
