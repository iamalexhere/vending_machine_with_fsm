/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sazlm.vending_view.trial.payment_menu;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.SwingUtilities;
import sazlm.vending_model.*;
import sazlm.vending_view.trial.selection_menu.SelectionProductFrame;
import sazlm.vending_view.trial.start.*;

public class MainPayment extends javax.swing.JFrame {
    private Machine machine;
    private Product selectedProduct;
    private CardLayout cd;
    /**
     * Creates new form MainPayment
     */
    public MainPayment() {
        initComponents();
    }
    public MainPayment(Machine machine, Product selectedProduct, Icon icon){
        initComponents();
        this.machine = machine;
        this.selectedProduct = selectedProduct;
        this.namaProduk.setIcon(icon);
        cd = (CardLayout)jPanel4.getLayout();
        cd.show(jPanel4, "card2");
        backToSelection();
        updateLabel();
    }

    public void setIconHarga(Icon icon){
        this.namaProduk.setIcon(icon);
    }
    
    void backToSelection(){
        back.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                if(SwingUtilities.isLeftMouseButton(e)){
                    machine.cancelTransaction();
                    SelectionProductFrame obj = new SelectionProductFrame(machine);
                    obj.setVisible(true);
                    dispose();
                }
            }
            
        });
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        statePanel = new javax.swing.JPanel();
        statePlaceholder = new javax.swing.JLabel();
        stateLabel = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        paymentMethodPanel = new javax.swing.JPanel();
        Tunai = new javax.swing.JLabel();
        QR = new javax.swing.JLabel();
        confirmationProductPanel = new javax.swing.JPanel();
        minus = new javax.swing.JLabel();
        namaProduk = new javax.swing.JLabel();
        stockProdukPlaceholder = new javax.swing.JLabel();
        stockProdukLabel = new javax.swing.JLabel();
        numLabel = new javax.swing.JLabel();
        hargaProduk = new javax.swing.JLabel();
        plus = new javax.swing.JLabel();
        iconProduct = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        qrPayment = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CashPayment = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        saldoPlaceholder = new javax.swing.JLabel();
        saldoText = new javax.swing.JLabel();
        button5000 = new javax.swing.JButton();
        button10000 = new javax.swing.JButton();
        button20000 = new javax.swing.JButton();
        button50000 = new javax.swing.JButton();
        button100000 = new javax.swing.JButton();
        confirmationPaymentPanel1 = new sazlm.vending_view.trial.payment_menu.ConfirmationPaymentPanel();
        headBorder1 = new sazlm.vending_view.trial.payment_menu.HeadBorder();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        statePanel.setBackground(new java.awt.Color(43, 60, 90));

        statePlaceholder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        statePlaceholder.setForeground(new java.awt.Color(255, 255, 255));
        statePlaceholder.setText("State:");

        stateLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stateLabel.setForeground(new java.awt.Color(255, 255, 255));
        stateLabel.setText("STATE");

        javax.swing.GroupLayout statePanelLayout = new javax.swing.GroupLayout(statePanel);
        statePanel.setLayout(statePanelLayout);
        statePanelLayout.setHorizontalGroup(
            statePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statePlaceholder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stateLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        statePanelLayout.setVerticalGroup(
            statePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(statePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statePlaceholder)
                    .addComponent(stateLabel))
                .addContainerGap())
        );

        back.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        back.setText("BACK");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pilih Pembayaran");

        paymentMethodPanel.setBackground(new java.awt.Color(43, 60, 90));

        Tunai.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Tunai.setForeground(new java.awt.Color(175, 175, 175));
        Tunai.setText("Tunai");
        Tunai.setEnabled(false);
        Tunai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TunaiMouseClicked(evt);
            }
        });

        QR.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        QR.setForeground(new java.awt.Color(175, 175, 175));
        QR.setText("QR");
        QR.setEnabled(false);
        QR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QRMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout paymentMethodPanelLayout = new javax.swing.GroupLayout(paymentMethodPanel);
        paymentMethodPanel.setLayout(paymentMethodPanelLayout);
        paymentMethodPanelLayout.setHorizontalGroup(
            paymentMethodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentMethodPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Tunai)
                .addGap(50, 50, 50)
                .addComponent(QR)
                .addGap(38, 38, 38))
        );
        paymentMethodPanelLayout.setVerticalGroup(
            paymentMethodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentMethodPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(paymentMethodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tunai)
                    .addComponent(QR))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        confirmationProductPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        confirmationProductPanel.setOpaque(false);

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

        iconProduct.setFont(new java.awt.Font("Square721 BT", 0, 16)); // NOI18N

        javax.swing.GroupLayout confirmationProductPanelLayout = new javax.swing.GroupLayout(confirmationProductPanel);
        confirmationProductPanel.setLayout(confirmationProductPanelLayout);
        confirmationProductPanelLayout.setHorizontalGroup(
            confirmationProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmationProductPanelLayout.createSequentialGroup()
                .addGroup(confirmationProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(confirmationProductPanelLayout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(iconProduct))
                    .addGroup(confirmationProductPanelLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(confirmationProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(confirmationProductPanelLayout.createSequentialGroup()
                                .addComponent(minus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numLabel))
                            .addComponent(stockProdukPlaceholder))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(confirmationProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stockProdukLabel)
                            .addComponent(plus))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, confirmationProductPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(hargaProduk)
                .addGap(52, 52, 52))
            .addGroup(confirmationProductPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(namaProduk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        confirmationProductPanelLayout.setVerticalGroup(
            confirmationProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, confirmationProductPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(namaProduk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iconProduct)
                .addGap(18, 18, 18)
                .addComponent(hargaProduk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(confirmationProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stockProdukPlaceholder)
                    .addComponent(stockProdukLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(confirmationProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numLabel)
                    .addComponent(minus)
                    .addComponent(plus))
                .addGap(15, 15, 15))
        );

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.CardLayout());

        qrPayment.setOpaque(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconFolder/qrCodeLipsum_qrcode.png"))); // NOI18N

        javax.swing.GroupLayout qrPaymentLayout = new javax.swing.GroupLayout(qrPayment);
        qrPayment.setLayout(qrPaymentLayout);
        qrPaymentLayout.setHorizontalGroup(
            qrPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qrPaymentLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        qrPaymentLayout.setVerticalGroup(
            qrPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qrPaymentLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel4.add(qrPayment, "card3");

        CashPayment.setOpaque(false);

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel3.setOpaque(false);

        saldoPlaceholder.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saldoPlaceholder.setForeground(new java.awt.Color(53, 67, 128));
        saldoPlaceholder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saldoPlaceholder.setText("Saldo Belanja Rp.");

        saldoText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saldoText.setForeground(new java.awt.Color(53, 67, 128));
        saldoText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saldoText.setText(" ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(saldoPlaceholder, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saldoText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saldoPlaceholder)
                    .addComponent(saldoText))
                .addGap(75, 75, 75))
        );

        button5000.setText("5000");
        button5000.setEnabled(false);
        button5000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5000ActionPerformed(evt);
            }
        });

        button10000.setText("10000");
        button10000.setEnabled(false);
        button10000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button10000ActionPerformed(evt);
            }
        });

        button20000.setText("20000");
        button20000.setEnabled(false);
        button20000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button20000ActionPerformed(evt);
            }
        });

        button50000.setText("50000");
        button50000.setEnabled(false);
        button50000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button50000ActionPerformed(evt);
            }
        });

        button100000.setText("100000");
        button100000.setEnabled(false);
        button100000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button100000ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CashPaymentLayout = new javax.swing.GroupLayout(CashPayment);
        CashPayment.setLayout(CashPaymentLayout);
        CashPaymentLayout.setHorizontalGroup(
            CashPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CashPaymentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CashPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CashPaymentLayout.createSequentialGroup()
                        .addComponent(button5000)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button10000)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button20000))
                    .addGroup(CashPaymentLayout.createSequentialGroup()
                        .addComponent(button50000)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button100000)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(CashPaymentLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        CashPaymentLayout.setVerticalGroup(
            CashPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CashPaymentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(CashPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button5000)
                    .addComponent(button10000)
                    .addComponent(button20000))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CashPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button50000)
                    .addComponent(button100000))
                .addGap(0, 0, 0))
        );

        jPanel4.add(CashPayment, "card2");

        confirmationPaymentPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmationPaymentPanel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back)
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(paymentMethodPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(confirmationProductPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(confirmationPaymentPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addGap(2, 2, 2)
                .addComponent(confirmationProductPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paymentMethodPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmationPaymentPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(headBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(headBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusMousePressed
        // TODO add your handling code here:
        String numFromLabel = numLabel.getText();
        int num = Integer.parseInt(numFromLabel);
        num--;
        if(num < 1){
            num =1;
        }
        numLabel.setText(num +"");
        updatePrice();
        Tunai.setEnabled(true);
        QR.setEnabled(true);
    }//GEN-LAST:event_minusMousePressed

    private void plusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusMousePressed
        // TODO add your handling code here:
        String numFromLabel = numLabel.getText();
        int num = Integer.parseInt(numFromLabel);
        num++;
        if(num > machine.getRemainingStock(selectedProduct)){
            num = machine.getRemainingStock(selectedProduct);
        }
        numLabel.setText(num +"");
        updatePrice();
        Tunai.setEnabled(true);
        QR.setEnabled(true);
    }//GEN-LAST:event_plusMousePressed

    private void confirmationPaymentPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmationPaymentPanel1MouseClicked
        // TODO add your handling code here:
        if(confirmationPaymentPanel1.isAvailable){
            machine.completeTransaction();
            stateLabel.setText(machine.getCurrentState().name()); 
            MainMenuFrame mainMenu = new MainMenuFrame(machine);
            mainMenu.setVisible(true);
            this.dispose();            
        }
    }//GEN-LAST:event_confirmationPaymentPanel1MouseClicked

    private void QRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QRMouseClicked
        // TODO add your handling code here:
        String numFromLabel = numLabel.getText();
        int num = Integer.parseInt(numFromLabel);
        if(num==0){
            QR.setEnabled(false);
        }else{
           CashPayment.setVisible(false);
            cd.show(jPanel4, "card3");
            QR.setForeground(Color.white);
            Tunai.setForeground(Color.LIGHT_GRAY);
            //Tunai.setEnabled(false);
            Tunai.setVisible(false);
            machine.selectQuantity(Integer.parseInt(numLabel.getText()));
            minus.setEnabled(false);
            plus.setEnabled(false);
            stateLabel.setText(machine.getCurrentState().name());

            machine.processPayment(machine.getTotalPayment(), "QRIS");
            stateLabel.setText(machine.getCurrentState().name());
            confirmationPaymentPanel1.setCukup(); 
        }

    }//GEN-LAST:event_QRMouseClicked

    private void TunaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TunaiMouseClicked
        // TODO add your handling code here:
        String numFromLabel = numLabel.getText();
        int num = Integer.parseInt(numFromLabel);
        if(num==0){
            Tunai.setEnabled(false);
        }else{
            cd.show(jPanel4, "card2");
            Tunai.setForeground(Color.white);
            QR.setForeground(Color.LIGHT_GRAY);
            //QR.setEnabled(false);
            QR.setVisible(false);
            machine.selectQuantity(Integer.parseInt(numLabel.getText()));
            minus.setEnabled(false);
            plus.setEnabled(false);
            stateLabel.setText(machine.getCurrentState().name());
            this.button100000.setEnabled(true);
            this.button50000.setEnabled(true);
            this.button20000.setEnabled(true);
            this.button10000.setEnabled(true);
            this.button5000.setEnabled(true);
            
            if(machine.getRemainingBalance() >= machine.getTotalPayment()){
                confirmationPaymentPanel1.setCukup();
            }
        }
        //saldoText.setText(machine);
    }//GEN-LAST:event_TunaiMouseClicked

    private void button100000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button100000ActionPerformed
        // TODO add your handling code here:
        if(machine.getCurrentState() == State.PAYMENT_PENDING){
            machine.processPayment(100_000, "cash");
            saldoText.setText(machine.getRemainingBalance()+"");
            stateLabel.setText(machine.getCurrentState().name());
            machine.checkBalance();
            stateLabel.setText(machine.getCurrentState().name());
            if(machine.getCurrentState() == State.PAYMENT_COMPLETE){
                confirmationPaymentPanel1.setCukup();
            } else{
                confirmationPaymentPanel1.setKurang();
            }
        }
    }//GEN-LAST:event_button100000ActionPerformed

    private void button50000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button50000ActionPerformed
        // TODO add your handling code here:
        if(machine.getCurrentState() == State.PAYMENT_PENDING){
            machine.processPayment(50_000, "cash");
            saldoText.setText(machine.getRemainingBalance()+"");
            stateLabel.setText(machine.getCurrentState().name());
            machine.checkBalance();
            stateLabel.setText(machine.getCurrentState().name());
            if(machine.getCurrentState() == State.PAYMENT_COMPLETE){
                confirmationPaymentPanel1.setCukup();
            } else{
                confirmationPaymentPanel1.setKurang();
            }
        }
    }//GEN-LAST:event_button50000ActionPerformed

    private void button20000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button20000ActionPerformed
        // TODO add your handling code here:
        if(machine.getCurrentState() == State.PAYMENT_PENDING){
            machine.processPayment(20_000, "cash");
            saldoText.setText(machine.getRemainingBalance()+"");
            stateLabel.setText(machine.getCurrentState().name());
            machine.checkBalance();
            stateLabel.setText(machine.getCurrentState().name());
            if(machine.getCurrentState() == State.PAYMENT_COMPLETE){
                confirmationPaymentPanel1.setCukup();
            } else{
                confirmationPaymentPanel1.setKurang();
            }
        }
    }//GEN-LAST:event_button20000ActionPerformed

    private void button10000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button10000ActionPerformed
        // TODO add your handling code here:
        if(machine.getCurrentState() == State.PAYMENT_PENDING){
            machine.processPayment(10_000, "cash");
            saldoText.setText(machine.getRemainingBalance()+"");
            stateLabel.setText(machine.getCurrentState().name());
            machine.checkBalance();
            stateLabel.setText(machine.getCurrentState().name());
            if(machine.getCurrentState() == State.PAYMENT_COMPLETE){
                //this.conmfirmationPaymentPanel1.setCukup();
                confirmationPaymentPanel1.setCukup();
            } else{
                //this.conmfirmationPaymentPanel1.setKurang();
                confirmationPaymentPanel1.setKurang();
            }
        }
    }//GEN-LAST:event_button10000ActionPerformed

    private void button5000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5000ActionPerformed
        // TODO add your handling code here:
        if(machine.getCurrentState() == State.PAYMENT_PENDING){
            machine.processPayment(5_000, "cash");
            saldoText.setText(machine.getRemainingBalance()+"");
            stateLabel.setText(machine.getCurrentState().name());
            machine.checkBalance();
            stateLabel.setText(machine.getCurrentState().name());
            if(machine.getCurrentState() == State.PAYMENT_COMPLETE){
                confirmationPaymentPanel1.setCukup();
            } else{
                confirmationPaymentPanel1.setKurang();
            }
        }
    }//GEN-LAST:event_button5000ActionPerformed

    public void updateLabel(){
        //this.stateLabel.setText(machine.getCurrentState().name());
        this.namaProduk.setText(machine.getSelectedProduct().name());
        this.hargaProduk.setText("0");
        this.stockProdukLabel.setText(machine.getRemainingStock(selectedProduct)+"");
        this.stateLabel.setText(machine.getCurrentState().name());
        this.saldoText.setText(machine.getRemainingBalance()+"");
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
    
    public void updatePrice(){
        //machine.getSelectedQuantity();
        int quantity = Integer.parseInt(numLabel.getText());
        int priceTemp = quantity * selectedProduct.getPrice();
        hargaProduk.setText(priceTemp+"");
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
            java.util.logging.Logger.getLogger(MainPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPayment().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CashPayment;
    private javax.swing.JLabel QR;
    private javax.swing.JLabel Tunai;
    private javax.swing.JLabel back;
    private javax.swing.JButton button10000;
    private javax.swing.JButton button100000;
    private javax.swing.JButton button20000;
    private javax.swing.JButton button5000;
    private javax.swing.JButton button50000;
    private sazlm.vending_view.trial.payment_menu.ConfirmationPaymentPanel confirmationPaymentPanel1;
    private javax.swing.JPanel confirmationProductPanel;
    private javax.swing.JLabel hargaProduk;
    private sazlm.vending_view.trial.payment_menu.HeadBorder headBorder1;
    private javax.swing.JLabel iconProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel minus;
    private javax.swing.JLabel namaProduk;
    private javax.swing.JLabel numLabel;
    private javax.swing.JPanel paymentMethodPanel;
    private javax.swing.JLabel plus;
    private javax.swing.JPanel qrPayment;
    private javax.swing.JLabel saldoPlaceholder;
    private javax.swing.JLabel saldoText;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JPanel statePanel;
    private javax.swing.JLabel statePlaceholder;
    private javax.swing.JLabel stockProdukLabel;
    private javax.swing.JLabel stockProdukPlaceholder;
    // End of variables declaration//GEN-END:variables
}
