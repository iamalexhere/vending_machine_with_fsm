/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sazlm.vending_view.trial.selection_menu;
//import sazlm.vending_view.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.SwingUtilities;
import sazlm.vending_model.Machine;
import sazlm.vending_model.Product;
import sazlm.vending_view.trial.payment_menu.*;
import sazlm.vending_view.trial.start.MainMenuFrame;

/**
 *
 * @author ialex
 */
public class SelectionProductFrame extends javax.swing.JFrame {
    private Machine machine;
    /**
     * Creates new form SelectionProduct
     */
    public SelectionProductFrame() {
        initComponents();
        goToMainMenu();
    }
    
    public SelectionProductFrame(Machine machine) {
        initComponents();
        this.machine = machine;
        updateLabel();
        goToMainMenu();
    }


    void goToMainMenu(){
        back.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                if(SwingUtilities.isLeftMouseButton(e)){
                    MainMenuFrame obj = new MainMenuFrame(machine);
                    obj.setVisible(true);
                    dispose();
                }
            }
            
            
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        panelMoving = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        statePanel = new javax.swing.JPanel();
        statePlaceholder = new javax.swing.JLabel();
        stateLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        flashdiskLabel = new javax.swing.JLabel();
        stockMaskerPlaceholder = new javax.swing.JLabel();
        lilinLabel = new javax.swing.JLabel();
        stockMaskerLabel = new javax.swing.JLabel();
        rokokLabel = new javax.swing.JLabel();
        travelCableLabel = new javax.swing.JLabel();
        stockLilinLabel = new javax.swing.JLabel();
        stockLilinPlaceholder = new javax.swing.JLabel();
        stockFlashdiskLabel = new javax.swing.JLabel();
        stockObatLabel = new javax.swing.JLabel();
        stockTravelCableLabel = new javax.swing.JLabel();
        stockTravelCablePlaceholder = new javax.swing.JLabel();
        stockFlashdiskPlaceholder = new javax.swing.JLabel();
        zippoFluidLabel = new javax.swing.JLabel();
        maskerLabel = new javax.swing.JLabel();
        stockZippoFluidLabel = new javax.swing.JLabel();
        stockPermenLabel = new javax.swing.JLabel();
        stockRokokLabel = new javax.swing.JLabel();
        stockPowerbankLabel = new javax.swing.JLabel();
        stockRokokPlaceholder = new javax.swing.JLabel();
        obatLabel = new javax.swing.JLabel();
        stockZippoFluidPlaceholder = new javax.swing.JLabel();
        stockZippoLighterPlaceholder = new javax.swing.JLabel();
        powerbankLabel = new javax.swing.JLabel();
        zippoLighterLabel = new javax.swing.JLabel();
        stockZippoLighterLabel = new javax.swing.JLabel();
        stockObatPlaceholder = new javax.swing.JLabel();
        stockPowerbankPlaceholder = new javax.swing.JLabel();
        permenLabel = new javax.swing.JLabel();
        stockMaskerPlaceholder1 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(43, 60, 90));

        panelMoving.setBackground(new java.awt.Color(255, 255, 255));
        panelMoving.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconFolder/Screenshot 2023-12-23 104124-1.png"))); // NOI18N
        jLabel1.setText("Ben & Lou");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Vending Machine Model");

        javax.swing.GroupLayout panelMovingLayout = new javax.swing.GroupLayout(panelMoving);
        panelMoving.setLayout(panelMovingLayout);
        panelMovingLayout.setHorizontalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMovingLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );
        panelMovingLayout.setVerticalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMovingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        back.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("BACK");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(panelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(panelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back)))
                .addGap(15, 15, 15))
        );

        statePanel.setBackground(new java.awt.Color(43, 60, 90));
        statePanel.setForeground(new java.awt.Color(255, 255, 255));

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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        flashdiskLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        flashdiskLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        flashdiskLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconFolder/uiIcon/flashdisk.png"))); // NOI18N
        flashdiskLabel.setText("Flashdisk Rp115.000");
        flashdiskLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flashdiskLabelMouseClicked(evt);
            }
        });

        stockMaskerPlaceholder.setText("stock: ");

        lilinLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lilinLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lilinLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconFolder/uiIcon/candle.png"))); // NOI18N
        lilinLabel.setText("Lilin Rp25.000");
        lilinLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lilinLabelMouseClicked(evt);
            }
        });

        stockMaskerLabel.setText("(stock)");

        rokokLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rokokLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rokokLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconFolder/uiIcon/rokok.png"))); // NOI18N
        rokokLabel.setText("Rokok Rp30.000");
        rokokLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rokokLabelMouseClicked(evt);
            }
        });

        travelCableLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        travelCableLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        travelCableLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconFolder/uiIcon/kabel.png"))); // NOI18N
        travelCableLabel.setText("Travel Cable Rp85.000");
        travelCableLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                travelCableLabelMouseClicked(evt);
            }
        });

        stockLilinLabel.setText("(stock)");

        stockLilinPlaceholder.setText("stock:");

        stockFlashdiskLabel.setText("(stock)");

        stockObatLabel.setText("(stock)");

        stockTravelCableLabel.setText("(stock)");

        stockTravelCablePlaceholder.setText("stock:");

        stockFlashdiskPlaceholder.setText("stock:");

        zippoFluidLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        zippoFluidLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        zippoFluidLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconFolder/uiIcon/fluid.png"))); // NOI18N
        zippoFluidLabel.setText("Zippo Fluid Rp40.000");
        zippoFluidLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zippoFluidLabelMouseClicked(evt);
            }
        });

        maskerLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        maskerLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        maskerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconFolder/uiIcon/masker.png"))); // NOI18N
        maskerLabel.setText("Masker Rp 20.000");
        maskerLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maskerLabelMouseClicked(evt);
            }
        });

        stockZippoFluidLabel.setText("(stock)");

        stockPermenLabel.setText("(stock)");

        stockRokokLabel.setText("(stock)");

        stockPowerbankLabel.setText("(stock)");

        stockRokokPlaceholder.setText("stock:");

        obatLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        obatLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        obatLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconFolder/uiIcon/obat-1.png"))); // NOI18N
        obatLabel.setText("Obat Rp20.000");
        obatLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                obatLabelMouseClicked(evt);
            }
        });

        stockZippoFluidPlaceholder.setText("stock:");

        stockZippoLighterPlaceholder.setText("stock:");

        powerbankLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        powerbankLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        powerbankLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconFolder/uiIcon/powerbank.png"))); // NOI18N
        powerbankLabel.setText("Powerbank Rp180.000");
        powerbankLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                powerbankLabelMouseClicked(evt);
            }
        });

        zippoLighterLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        zippoLighterLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        zippoLighterLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconFolder/uiIcon/lighter.png"))); // NOI18N
        zippoLighterLabel.setText("Zippo Lighter Rp70.000");
        zippoLighterLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zippoLighterLabelMouseClicked(evt);
            }
        });

        stockZippoLighterLabel.setText("(stock)");

        stockObatPlaceholder.setText("stock:");

        stockPowerbankPlaceholder.setText("stock:");

        permenLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        permenLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        permenLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconFolder/uiIcon/permen.png"))); // NOI18N
        permenLabel.setText("Permen Rp 10.000");
        permenLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                permenLabelMouseClicked(evt);
            }
        });

        stockMaskerPlaceholder1.setText("stock: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(maskerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lilinLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rokokLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zippoLighterLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(flashdiskLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(powerbankLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(travelCableLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zippoFluidLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(obatLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(permenLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stockFlashdiskPlaceholder)
                            .addComponent(stockZippoLighterPlaceholder)
                            .addComponent(stockZippoFluidPlaceholder)
                            .addComponent(stockLilinPlaceholder)
                            .addComponent(stockMaskerPlaceholder)
                            .addComponent(stockRokokPlaceholder)
                            .addComponent(stockTravelCablePlaceholder)
                            .addComponent(stockPowerbankPlaceholder)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(stockMaskerPlaceholder1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(stockObatPlaceholder)))
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stockPowerbankLabel)
                    .addComponent(stockZippoLighterLabel)
                    .addComponent(stockZippoFluidLabel)
                    .addComponent(stockTravelCableLabel)
                    .addComponent(stockFlashdiskLabel)
                    .addComponent(stockPermenLabel)
                    .addComponent(stockMaskerLabel)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stockLilinLabel)
                            .addComponent(stockRokokLabel)
                            .addComponent(stockObatLabel))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(permenLabel)
                    .addComponent(stockPermenLabel)
                    .addComponent(stockMaskerPlaceholder1))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stockMaskerPlaceholder)
                    .addComponent(stockMaskerLabel)
                    .addComponent(maskerLabel))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(obatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stockObatPlaceholder, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stockObatLabel))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lilinLabel)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(stockLilinPlaceholder)
                        .addComponent(stockLilinLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rokokLabel)
                    .addComponent(stockRokokPlaceholder)
                    .addComponent(stockRokokLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zippoFluidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stockZippoFluidPlaceholder)
                    .addComponent(stockZippoFluidLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zippoLighterLabel)
                    .addComponent(stockZippoLighterPlaceholder)
                    .addComponent(stockZippoLighterLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(travelCableLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stockTravelCablePlaceholder)
                    .addComponent(stockTravelCableLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flashdiskLabel)
                    .addComponent(stockFlashdiskPlaceholder)
                    .addComponent(stockFlashdiskLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(powerbankLabel)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stockPowerbankPlaceholder)
                            .addComponent(stockPowerbankLabel))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(statePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void permenLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_permenLabelMouseClicked
        // TODO add your handling code here:
        if(machine.getRemainingStock(Product.PERMEN)>0){
            machine.selectProduct("PERMEN");
            showPaymentView(machine, Product.PERMEN, permenLabel.getIcon());
        } else{
            permenLabel.setEnabled(false);
        }
        

    }//GEN-LAST:event_permenLabelMouseClicked

    private void maskerLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maskerLabelMouseClicked
        // TODO add your handling code here:
        if(machine.getRemainingStock(Product.MASKER)>0){
            machine.selectProduct("MASKER");
            showPaymentView(machine, Product.MASKER, maskerLabel.getIcon());
        } else{
            maskerLabel.setEnabled(false);
        }

    }//GEN-LAST:event_maskerLabelMouseClicked

    private void obatLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obatLabelMouseClicked
        // TODO add your handling code here:
        if(machine.getRemainingStock(Product.OBAT)>0){
            machine.selectProduct("OBAT");
            showPaymentView(machine, Product.OBAT, obatLabel.getIcon());
        } else{
            obatLabel.setEnabled(false);
        }
    }//GEN-LAST:event_obatLabelMouseClicked

    private void lilinLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lilinLabelMouseClicked
        // TODO add your handling code here:
        if(machine.getRemainingStock(Product.OBAT)>0){
            machine.selectProduct("LILIN");
            showPaymentView(machine, Product.LILIN, lilinLabel.getIcon());
        } else{
            lilinLabel.setEnabled(false);
        }

    }//GEN-LAST:event_lilinLabelMouseClicked

    private void rokokLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rokokLabelMouseClicked
        // TODO add your handling code here:
        if(machine.getRemainingStock(Product.ROKOK)>0){
            machine.selectProduct("ROKOK");
            showPaymentView(machine, Product.ROKOK, rokokLabel.getIcon());
        } else{
            rokokLabel.setEnabled(false);
        }
    }//GEN-LAST:event_rokokLabelMouseClicked

    private void zippoFluidLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zippoFluidLabelMouseClicked
        // TODO add your handling code here:
        if(machine.getRemainingStock(Product.ZIPPO_FLUID)>0){
            machine.selectProduct("ZIPPO_FLUID");
            showPaymentView(machine, Product.ZIPPO_FLUID, zippoFluidLabel.getIcon());
        } else{
            zippoFluidLabel.setEnabled(false);
        }
    }//GEN-LAST:event_zippoFluidLabelMouseClicked

    private void zippoLighterLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zippoLighterLabelMouseClicked
        // TODO add your handling code here:
        if(machine.getRemainingStock(Product.ZIPPO_LIGHTER)>0){
            machine.selectProduct("ZIPPO_LIGHTER");
            showPaymentView(machine, Product.ZIPPO_LIGHTER,zippoLighterLabel.getIcon());
        } else{
            zippoLighterLabel.setEnabled(false);
        }
    }//GEN-LAST:event_zippoLighterLabelMouseClicked

    private void travelCableLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_travelCableLabelMouseClicked
        // TODO add your handling code here:
        if(machine.getRemainingStock(Product.TRAVEL_CABLE)>0){
            machine.selectProduct("TRAVEL_CABLE");
            showPaymentView(machine, Product.TRAVEL_CABLE, travelCableLabel.getIcon());
        } else{
            travelCableLabel.setEnabled(false);
        }
    }//GEN-LAST:event_travelCableLabelMouseClicked

    private void flashdiskLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flashdiskLabelMouseClicked
        // TODO add your handling code here:
        if(machine.getRemainingStock(Product.FLASHDISK)>0){
            machine.selectProduct("FLASHDISK");
            showPaymentView(machine, Product.FLASHDISK, flashdiskLabel.getIcon());
        } else{
            flashdiskLabel.setEnabled(false);
        }
    }//GEN-LAST:event_flashdiskLabelMouseClicked

    private void powerbankLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_powerbankLabelMouseClicked
        // TODO add your handling code here:
        if(machine.getRemainingStock(Product.POWERBANK)>0){
            machine.selectProduct("POWERBANK");
            showPaymentView(machine, Product.POWERBANK, powerbankLabel.getIcon());
        } else{
            powerbankLabel.setEnabled(false);
        }
    }//GEN-LAST:event_powerbankLabelMouseClicked

    public void showPaymentView(Machine machine, Product product, Icon icon){
        MainPayment mainPayment = new MainPayment(machine, product, icon);
        mainPayment.setVisible(rootPaneCheckingEnabled);
        this.dispose();
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
            java.util.logging.Logger.getLogger(SelectionProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectionProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectionProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectionProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectionProductFrame().setVisible(true);
            }
        });
    }
    
    public void updateLabel(){
        this.stockPermenLabel.setText(machine.getRemainingStock(Product.PERMEN)+"");
        this.stockMaskerLabel.setText(machine.getRemainingStock(Product.MASKER)+"");
        this.stockObatLabel.setText(machine.getRemainingStock(Product.OBAT)+"");
        this.stockLilinLabel.setText(machine.getRemainingStock(Product.LILIN)+"");
        this.stockFlashdiskLabel.setText(machine.getRemainingStock(Product.FLASHDISK)+"");
        this.stockZippoFluidLabel.setText(machine.getRemainingStock(Product.ZIPPO_FLUID)+"");
        this.stockZippoLighterLabel.setText(machine.getRemainingStock(Product.ZIPPO_LIGHTER)+"");
        this.stockRokokLabel.setText(machine.getRemainingStock(Product.ROKOK)+"");
        this.stockTravelCableLabel.setText(machine.getRemainingStock(Product.TRAVEL_CABLE)+"");
        this.stockPowerbankLabel.setText(machine.getRemainingStock(Product.POWERBANK)+"");
        this.stateLabel.setText(machine.getCurrentState().name());
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel flashdiskLabel;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lilinLabel;
    private javax.swing.JLabel maskerLabel;
    private javax.swing.JLabel obatLabel;
    private javax.swing.JPanel panelMoving;
    private javax.swing.JLabel permenLabel;
    private javax.swing.JLabel powerbankLabel;
    private javax.swing.JLabel rokokLabel;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JPanel statePanel;
    private javax.swing.JLabel statePlaceholder;
    private javax.swing.JLabel stockFlashdiskLabel;
    private javax.swing.JLabel stockFlashdiskPlaceholder;
    private javax.swing.JLabel stockLilinLabel;
    private javax.swing.JLabel stockLilinPlaceholder;
    private javax.swing.JLabel stockMaskerLabel;
    private javax.swing.JLabel stockMaskerPlaceholder;
    private javax.swing.JLabel stockMaskerPlaceholder1;
    private javax.swing.JLabel stockObatLabel;
    private javax.swing.JLabel stockObatPlaceholder;
    private javax.swing.JLabel stockPermenLabel;
    private javax.swing.JLabel stockPowerbankLabel;
    private javax.swing.JLabel stockPowerbankPlaceholder;
    private javax.swing.JLabel stockRokokLabel;
    private javax.swing.JLabel stockRokokPlaceholder;
    private javax.swing.JLabel stockTravelCableLabel;
    private javax.swing.JLabel stockTravelCablePlaceholder;
    private javax.swing.JLabel stockZippoFluidLabel;
    private javax.swing.JLabel stockZippoFluidPlaceholder;
    private javax.swing.JLabel stockZippoLighterLabel;
    private javax.swing.JLabel stockZippoLighterPlaceholder;
    private javax.swing.JLabel travelCableLabel;
    private javax.swing.JLabel zippoFluidLabel;
    private javax.swing.JLabel zippoLighterLabel;
    // End of variables declaration//GEN-END:variables
}
