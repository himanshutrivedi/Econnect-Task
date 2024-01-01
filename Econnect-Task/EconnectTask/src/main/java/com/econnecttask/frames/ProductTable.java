package com.econnecttask.frames;

import com.econnecttask.services.Helper;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author himanshu
 */
public class ProductTable extends javax.swing.JFrame {
    // Example data for product list
    public static Object[][] itemData = {
                {"Kingfisher", "500ml", 120.0, 0, 120.0},   
                {"Royal Challenge", "370ml", 150.0, 0, 150.0},
                {"Bira 91", "500ml", 180.0, 0, 180.0},
                {"Haywards 5000", "500ml", 100.0, 0, 100.0},
                {"Haywards Black", "370ml", 110.0, 0, 110.0},
                {"Tuborg", "500ml", 130.0, 0, 130.0},
                {"Foster's", "370ml", 140.0,0, 140.0},
                {"Carlsberg", "500ml", 160.0, 0, 160.0}
        };
public static Object[] columns = { "Item Name", "Packing", "MRP (in Rs)", "Cess (Per bottle)", "Total (in Rs)"};

    /**
     * Creates new form ProductTable
     */
    public ProductTable() {
        initComponents();
//        updating the existing table with example data
        DefaultTableModel model = new DefaultTableModel(itemData, columns)
                {@Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;//canEdit [columnIndex];
    }};
        tblProduct.setModel(model);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Product Seection List");

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;//canEdit [columnIndex];
            }
        });
        tblProduct.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tblProduct.getTableHeader().setResizingAllowed(false);
        tblProduct.setFocusable(false);
        tblProduct.setRowHeight(30);
        tblProduct.setSelectionBackground(new java.awt.Color(255, 153, 0));
        tblProduct.getTableHeader().setReorderingAllowed(false);
        tblProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblProductMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblProduct);
        if (tblProduct.getColumnModel().getColumnCount() > 0) {
            tblProduct.getColumnModel().getColumn(0).setResizable(false);
            tblProduct.getColumnModel().getColumn(1).setResizable(false);
            tblProduct.getColumnModel().getColumn(2).setResizable(false);
            tblProduct.getColumnModel().getColumn(3).setResizable(false);
            tblProduct.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblProductMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductMousePressed
        
// updating all values with every product selection from list
      
//        storing values into shopping list
        Helper.addToSoppingList(itemData[tblProduct.getSelectedRow()]);
        
        BillingFrame.totalValue += (double)itemData[tblProduct.getSelectedRow()][4]; 
        BillingFrame.lblTotalValue.setText("Rs. "+String.format("%.2f", BillingFrame.totalValue) );
        BillingFrame.taxTotalValue =   BillingFrame.totalValue*0.28;
        BillingFrame.lblTaxValue.setText("Rs. "+String.format("%.2f", BillingFrame.taxTotalValue));
        BillingFrame.subTotalValue = BillingFrame.totalValue-BillingFrame.taxTotalValue;
        BillingFrame.lblSubTotalValue.setText("Rs. "+String.format("%.2f", BillingFrame.subTotalValue));
        BillingFrame.dueAmount = BillingFrame.totalValue;
         BillingFrame.lblDueAmount.setText("Rs. "+String.format("%.2f", BillingFrame.dueAmount));
         BillingFrame.btnRecived.setText("Received  Rs. "+String.format("%.2f", BillingFrame.totalValue) );
    }//GEN-LAST:event_tblProductMousePressed

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
            java.util.logging.Logger.getLogger(ProductTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProduct;
    // End of variables declaration//GEN-END:variables
}
