/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sazlm.vending_view;
import sazlm.vending_model.Machine;
import sazlm.vending_model.Product;

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
    }
    
    public SelectionProductFrame(Machine machine) {
        initComponents();
        this.machine = machine;
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

        statePanel = new javax.swing.JPanel();
        statePlaceholder = new javax.swing.JLabel();
        stateLabel = new javax.swing.JLabel();
        permenLabel = new javax.swing.JLabel();
        maskerLabel = new javax.swing.JLabel();
        hargaPermenLabel = new javax.swing.JLabel();
        hargaMaskerLabel = new javax.swing.JLabel();
        stockMaskerPlaceholder = new javax.swing.JLabel();
        stockPermenPlaceholder = new javax.swing.JLabel();
        stockPermenLabel = new javax.swing.JLabel();
        stockMaskerLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        statePlaceholder.setText("State:");

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
                .addContainerGap(330, Short.MAX_VALUE))
        );
        statePanelLayout.setVerticalGroup(
            statePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statePanelLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(statePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statePlaceholder)
                    .addComponent(stateLabel))
                .addContainerGap())
        );

        permenLabel.setText("permen");

        maskerLabel.setText("masker");

        hargaPermenLabel.setText("10");

        hargaMaskerLabel.setText("20");

        stockMaskerPlaceholder.setText("stock: ");

        stockPermenPlaceholder.setText("stock: ");

        stockPermenLabel.setText("(stock)");

        stockMaskerLabel.setText("(stock)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(statePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(122, 122, 122)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(permenLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(hargaPermenLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(stockPermenPlaceholder)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(stockPermenLabel))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(maskerLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(hargaMaskerLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(stockMaskerPlaceholder)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(stockMaskerLabel)))
                    .addContainerGap(125, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 269, Short.MAX_VALUE)
                .addComponent(statePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(131, 131, 131)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(permenLabel)
                        .addComponent(hargaPermenLabel)
                        .addComponent(stockPermenPlaceholder)
                        .addComponent(stockPermenLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(maskerLabel)
                        .addComponent(hargaMaskerLabel)
                        .addComponent(stockMaskerPlaceholder)
                        .addComponent(stockMaskerLabel))
                    .addContainerGap(131, Short.MAX_VALUE)))
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
        this.stateLabel.setText(machine.getCurrentState().name());
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hargaMaskerLabel;
    private javax.swing.JLabel hargaPermenLabel;
    private javax.swing.JLabel maskerLabel;
    private javax.swing.JLabel permenLabel;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JPanel statePanel;
    private javax.swing.JLabel statePlaceholder;
    private javax.swing.JLabel stockMaskerLabel;
    private javax.swing.JLabel stockMaskerPlaceholder;
    private javax.swing.JLabel stockPermenLabel;
    private javax.swing.JLabel stockPermenPlaceholder;
    // End of variables declaration//GEN-END:variables
}