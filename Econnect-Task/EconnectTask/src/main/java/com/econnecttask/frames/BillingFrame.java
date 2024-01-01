package com.econnecttask.frames;

import com.econnecttask.services.Helper;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author himanshu
 */
public class BillingFrame extends javax.swing.JFrame {
//    All static variables
    public static double dueAmount = 0;
    public static double givenAmount = 0;
     public static double changeAmount = 0;
     public static double totalValue = 0;
     public static double subTotalValue = 0;
     public static double taxTotalValue = 0;
    

    /**
     * Creates new form BillingFrame
     */
    public BillingFrame() {
        initComponents();
        lblDueAmount.setText("Rs. "+Double.toString(dueAmount));
        dateTime();
        
//        for updating time every second
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
public void actionPerformed(ActionEvent e) {
    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss aa");
                String currentTime = sdf.format(new Date());
                lblTime.setText(currentTime);
            }
        });
        timer.start();
        
        
    }
//    For showing date
    public void dateTime(){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd - MMMM - yyyy ,  EEEEEE");
        String dd = sdf.format(d);
        lblDateTime.setText(dd);
        lblDate.setText(dd);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHead = new javax.swing.JPanel();
        lblHead = new javax.swing.JLabel();
        btnPower = new javax.swing.JButton();
        btnSecurity = new javax.swing.JButton();
        btnNotification = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        pnlStatus = new javax.swing.JPanel();
        lblVersion = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblUserRole = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblDateTime = new javax.swing.JLabel();
        pnlLeft = new javax.swing.JPanel();
        lblInvoice = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnCash = new javax.swing.JButton();
        btnCard = new javax.swing.JButton();
        pnlMoneyInWord = new javax.swing.JPanel();
        lblRuppesInWords = new javax.swing.JLabel();
        btnAddProduct = new javax.swing.JButton();
        pnlTotalValues = new javax.swing.JPanel();
        lblSubTotalValue = new javax.swing.JLabel();
        lblTaxValue = new javax.swing.JLabel();
        lblCessValue = new javax.swing.JLabel();
        lblTotalValue = new javax.swing.JLabel();
        pnlTotalText = new javax.swing.JPanel();
        lblSubToal = new javax.swing.JLabel();
        lblTax = new javax.swing.JLabel();
        lblCess = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblShoppingList = new javax.swing.JTable();
        pnlCalc = new javax.swing.JPanel();
        pnlRecivedValues = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblDueAmount = new javax.swing.JLabel();
        lblGivenAmount = new javax.swing.JLabel();
        lblChangeDue = new javax.swing.JLabel();
        pnlKeyBoard = new javax.swing.JPanel();
        btnRecived = new javax.swing.JButton();
        btn200 = new javax.swing.JButton();
        btnclrAll = new javax.swing.JButton();
        btn500 = new javax.swing.JButton();
        btn2000 = new javax.swing.JButton();
        btn100 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn00 = new javax.swing.JButton();
        btnClr = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn50 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setName("frmMain"); // NOI18N
        setResizable(false);

        pnlHead.setBackground(new java.awt.Color(255, 255, 255));
        pnlHead.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        lblHead.setBackground(new java.awt.Color(204, 255, 0));
        lblHead.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ksbcpanal-75.png"))); // NOI18N

        btnPower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/power-60.png"))); // NOI18N
        btnPower.setBorderPainted(false);
        btnPower.setFocusable(false);
        btnPower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPowerActionPerformed(evt);
            }
        });

        btnSecurity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/security-60.png"))); // NOI18N
        btnSecurity.setToolTipText("Security");
        btnSecurity.setBorderPainted(false);
        btnSecurity.setFocusable(false);

        btnNotification.setIcon(new javax.swing.ImageIcon(getClass().getResource("/notification-60.png"))); // NOI18N
        btnNotification.setToolTipText("Notification");
        btnNotification.setDoubleBuffered(true);
        btnNotification.setFocusable(false);

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home-60.png"))); // NOI18N
        btnHome.setToolTipText("Home");
        btnHome.setFocusable(false);

        javax.swing.GroupLayout pnlHeadLayout = new javax.swing.GroupLayout(pnlHead);
        pnlHead.setLayout(pnlHeadLayout);
        pnlHeadLayout.setHorizontalGroup(
            pnlHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHead, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHome)
                .addGap(30, 30, 30)
                .addComponent(btnNotification)
                .addGap(30, 30, 30)
                .addComponent(btnSecurity)
                .addGap(30, 30, 30)
                .addComponent(btnPower)
                .addGap(20, 20, 20))
        );
        pnlHeadLayout.setVerticalGroup(
            pnlHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeadLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHead)
                    .addComponent(btnHome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNotification, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSecurity, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPower, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(9, 9, 9))
        );

        pnlStatus.setBackground(new java.awt.Color(255, 255, 255));

        lblVersion.setBackground(new java.awt.Color(255, 0, 0));
        lblVersion.setText("Version : POS 1.18");

        lblTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/time-16.png"))); // NOI18N
        lblTime.setText("12:15:20 PM");

        lblUserRole.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login-16.png"))); // NOI18N
        lblUserRole.setText("50782(Admin)");

        lblUserName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/account-16.png"))); // NOI18N
        lblUserName.setText("Himanshu");

        lblDateTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDateTime.setText("30-12-2023 12:15:20 PM");

        javax.swing.GroupLayout pnlStatusLayout = new javax.swing.GroupLayout(pnlStatus);
        pnlStatus.setLayout(pnlStatusLayout);
        pnlStatusLayout.setHorizontalGroup(
            pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUserRole, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlStatusLayout.setVerticalGroup(
            pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblDateTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblUserName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblUserRole, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlLeft.setBackground(new java.awt.Color(255, 255, 255));
        pnlLeft.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblInvoice.setBackground(new java.awt.Color(255, 255, 153));
        lblInvoice.setText("INVOICE NO. : 000987654321");

        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDate.setText("30-12-2023");

        btnCancel.setBackground(java.awt.Color.red);
        btnCancel.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("CANCEL");
        btnCancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnCash.setBackground(java.awt.Color.green);
        btnCash.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        btnCash.setForeground(new java.awt.Color(255, 255, 255));
        btnCash.setText("CASH");
        btnCash.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnCard.setBackground(java.awt.Color.blue);
        btnCard.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        btnCard.setForeground(new java.awt.Color(255, 255, 255));
        btnCard.setText("CARD");
        btnCard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        pnlMoneyInWord.setBackground(new java.awt.Color(153, 153, 153));
        pnlMoneyInWord.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblRuppesInWords.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        lblRuppesInWords.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRuppesInWords.setText("Rupees  Four Hundred Thirty Only");

        javax.swing.GroupLayout pnlMoneyInWordLayout = new javax.swing.GroupLayout(pnlMoneyInWord);
        pnlMoneyInWord.setLayout(pnlMoneyInWordLayout);
        pnlMoneyInWordLayout.setHorizontalGroup(
            pnlMoneyInWordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRuppesInWords, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlMoneyInWordLayout.setVerticalGroup(
            pnlMoneyInWordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRuppesInWords, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnAddProduct.setBackground(new java.awt.Color(102, 255, 102));
        btnAddProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shopping-bag-80.png"))); // NOI18N
        btnAddProduct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        pnlTotalValues.setBackground(new java.awt.Color(255, 255, 255));
        pnlTotalValues.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblSubTotalValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubTotalValue.setText("Rs. 0.00");

        lblTaxValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTaxValue.setText("Rs. 0.00");

        lblCessValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCessValue.setText("Rs. 0.00");

        lblTotalValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalValue.setText("Rs. 0.00");
        lblTotalValue.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblTotalValuePropertyChange(evt);
            }
        });

        javax.swing.GroupLayout pnlTotalValuesLayout = new javax.swing.GroupLayout(pnlTotalValues);
        pnlTotalValues.setLayout(pnlTotalValuesLayout);
        pnlTotalValuesLayout.setHorizontalGroup(
            pnlTotalValuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTotalValuesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSubTotalValue, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTaxValue, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCessValue, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTotalValuesLayout.setVerticalGroup(
            pnlTotalValuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTotalValuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblTaxValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCessValue, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblSubTotalValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblTotalValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlTotalText.setBackground(new java.awt.Color(204, 255, 102));
        pnlTotalText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblSubToal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubToal.setText("Sub Total");

        lblTax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTax.setText("Tax");

        lblCess.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCess.setText("Cess");

        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setText("Total");

        javax.swing.GroupLayout pnlTotalTextLayout = new javax.swing.GroupLayout(pnlTotalText);
        pnlTotalText.setLayout(pnlTotalTextLayout);
        pnlTotalTextLayout.setHorizontalGroup(
            pnlTotalTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTotalTextLayout.createSequentialGroup()
                .addComponent(lblSubToal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTax, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCess, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTotalTextLayout.setVerticalGroup(
            pnlTotalTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTotalTextLayout.createSequentialGroup()
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(lblCess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblTax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblSubToal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tblShoppingList.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        tblShoppingList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Item Name", "Packing", "Qty", "MRP (in Rs)", "Cess (in Rs)", "Total (in Rs)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblShoppingList.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tblShoppingList.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblShoppingList);
        if (tblShoppingList.getColumnModel().getColumnCount() > 0) {
            tblShoppingList.getColumnModel().getColumn(0).setMinWidth(30);
            tblShoppingList.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblShoppingList.getColumnModel().getColumn(0).setMaxWidth(30);
            tblShoppingList.getColumnModel().getColumn(1).setMinWidth(300);
            tblShoppingList.getColumnModel().getColumn(1).setPreferredWidth(300);
            tblShoppingList.getColumnModel().getColumn(1).setMaxWidth(300);
            tblShoppingList.getColumnModel().getColumn(2).setMinWidth(100);
            tblShoppingList.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblShoppingList.getColumnModel().getColumn(2).setMaxWidth(100);
            tblShoppingList.getColumnModel().getColumn(4).setMinWidth(120);
            tblShoppingList.getColumnModel().getColumn(4).setPreferredWidth(120);
            tblShoppingList.getColumnModel().getColumn(4).setMaxWidth(120);
            tblShoppingList.getColumnModel().getColumn(5).setMinWidth(150);
            tblShoppingList.getColumnModel().getColumn(5).setPreferredWidth(150);
            tblShoppingList.getColumnModel().getColumn(5).setMaxWidth(150);
            tblShoppingList.getColumnModel().getColumn(6).setMinWidth(100);
            tblShoppingList.getColumnModel().getColumn(6).setPreferredWidth(100);
            tblShoppingList.getColumnModel().getColumn(6).setMaxWidth(100);
        }

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addComponent(lblInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addComponent(btnAddProduct)
                .addGap(6, 6, 6)
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTotalText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTotalValues, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(pnlMoneyInWord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnCash, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnCard, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInvoice)
                    .addComponent(lblDate))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddProduct)
                    .addGroup(pnlLeftLayout.createSequentialGroup()
                        .addComponent(pnlTotalText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(pnlTotalValues, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(pnlMoneyInWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCash, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCard, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnlCalc.setBackground(new java.awt.Color(255, 255, 255));

        pnlRecivedValues.setBackground(new java.awt.Color(255, 255, 153));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel1.setText("Due Amount :");

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel2.setText("Given Amount :");

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel3.setText("Change Due :");

        lblDueAmount.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        lblDueAmount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDueAmount.setText("Rs. 0.00");

        lblGivenAmount.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        lblGivenAmount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGivenAmount.setText("Rs. 0.00");
        lblGivenAmount.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblGivenAmountPropertyChange(evt);
            }
        });

        lblChangeDue.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        lblChangeDue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblChangeDue.setText("Rs. 0.00");

        javax.swing.GroupLayout pnlRecivedValuesLayout = new javax.swing.GroupLayout(pnlRecivedValues);
        pnlRecivedValues.setLayout(pnlRecivedValuesLayout);
        pnlRecivedValuesLayout.setHorizontalGroup(
            pnlRecivedValuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRecivedValuesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRecivedValuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRecivedValuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblGivenAmount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDueAmount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(lblChangeDue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlRecivedValuesLayout.setVerticalGroup(
            pnlRecivedValuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRecivedValuesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlRecivedValuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDueAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(pnlRecivedValuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGivenAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRecivedValuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblChangeDue, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnRecived.setBackground(new java.awt.Color(102, 255, 102));
        btnRecived.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        btnRecived.setForeground(new java.awt.Color(255, 255, 255));
        btnRecived.setText("Recived Rs. 0.00");
        btnRecived.setPreferredSize(new java.awt.Dimension(402, 32));

        btn200.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        btn200.setForeground(new java.awt.Color(255, 51, 51));
        btn200.setText("200");
        btn200.setMaximumSize(new java.awt.Dimension(90, 23));
        btn200.setMinimumSize(new java.awt.Dimension(90, 23));
        btn200.setPreferredSize(new java.awt.Dimension(90, 23));
        btn200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn200ActionPerformed(evt);
            }
        });

        btnclrAll.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        btnclrAll.setForeground(new java.awt.Color(255, 51, 51));
        btnclrAll.setText("CLR ALL");
        btnclrAll.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnclrAll.setMaximumSize(new java.awt.Dimension(90, 23));
        btnclrAll.setMinimumSize(new java.awt.Dimension(90, 23));
        btnclrAll.setPreferredSize(new java.awt.Dimension(90, 23));
        btnclrAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclrAllActionPerformed(evt);
            }
        });

        btn500.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        btn500.setForeground(new java.awt.Color(255, 51, 51));
        btn500.setText("500");
        btn500.setMaximumSize(new java.awt.Dimension(90, 23));
        btn500.setMinimumSize(new java.awt.Dimension(90, 23));
        btn500.setPreferredSize(new java.awt.Dimension(90, 23));
        btn500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn500ActionPerformed(evt);
            }
        });

        btn2000.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        btn2000.setForeground(new java.awt.Color(255, 51, 51));
        btn2000.setText("2000");
        btn2000.setMaximumSize(new java.awt.Dimension(90, 23));
        btn2000.setMinimumSize(new java.awt.Dimension(90, 23));
        btn2000.setPreferredSize(new java.awt.Dimension(90, 23));
        btn2000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2000ActionPerformed(evt);
            }
        });

        btn100.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        btn100.setForeground(new java.awt.Color(255, 51, 51));
        btn100.setText("100");
        btn100.setMaximumSize(new java.awt.Dimension(90, 23));
        btn100.setMinimumSize(new java.awt.Dimension(90, 23));
        btn100.setPreferredSize(new java.awt.Dimension(90, 23));
        btn100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn100ActionPerformed(evt);
            }
        });

        btn0.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        btn0.setText("0");
        btn0.setMaximumSize(new java.awt.Dimension(90, 23));
        btn0.setMinimumSize(new java.awt.Dimension(90, 23));
        btn0.setPreferredSize(new java.awt.Dimension(90, 23));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btn00.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        btn00.setText("00");
        btn00.setMaximumSize(new java.awt.Dimension(90, 23));
        btn00.setMinimumSize(new java.awt.Dimension(90, 23));
        btn00.setPreferredSize(new java.awt.Dimension(90, 23));
        btn00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn00ActionPerformed(evt);
            }
        });

        btnClr.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        btnClr.setForeground(new java.awt.Color(255, 51, 51));
        btnClr.setText("CLR");
        btnClr.setMaximumSize(new java.awt.Dimension(90, 23));
        btnClr.setMinimumSize(new java.awt.Dimension(90, 23));
        btnClr.setPreferredSize(new java.awt.Dimension(90, 23));
        btnClr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClrActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        btn9.setText("9");
        btn9.setMaximumSize(new java.awt.Dimension(90, 23));
        btn9.setMinimumSize(new java.awt.Dimension(90, 23));
        btn9.setPreferredSize(new java.awt.Dimension(90, 23));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        btn7.setText("7");
        btn7.setMaximumSize(new java.awt.Dimension(90, 23));
        btn7.setMinimumSize(new java.awt.Dimension(90, 23));
        btn7.setPreferredSize(new java.awt.Dimension(90, 23));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        btn8.setText("8");
        btn8.setMaximumSize(new java.awt.Dimension(90, 23));
        btn8.setMinimumSize(new java.awt.Dimension(90, 23));
        btn8.setPreferredSize(new java.awt.Dimension(90, 23));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn20.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        btn20.setForeground(new java.awt.Color(255, 51, 51));
        btn20.setText("20");
        btn20.setMaximumSize(new java.awt.Dimension(90, 23));
        btn20.setMinimumSize(new java.awt.Dimension(90, 23));
        btn20.setPreferredSize(new java.awt.Dimension(90, 23));
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        btn4.setText("4");
        btn4.setMaximumSize(new java.awt.Dimension(90, 23));
        btn4.setMinimumSize(new java.awt.Dimension(90, 23));
        btn4.setPreferredSize(new java.awt.Dimension(90, 23));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        btn5.setText("5");
        btn5.setMaximumSize(new java.awt.Dimension(90, 23));
        btn5.setMinimumSize(new java.awt.Dimension(90, 23));
        btn5.setPreferredSize(new java.awt.Dimension(90, 23));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn50.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        btn50.setForeground(new java.awt.Color(255, 51, 51));
        btn50.setText("50");
        btn50.setMaximumSize(new java.awt.Dimension(90, 23));
        btn50.setMinimumSize(new java.awt.Dimension(90, 23));
        btn50.setPreferredSize(new java.awt.Dimension(90, 23));
        btn50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn50ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        btn6.setText("6");
        btn6.setMaximumSize(new java.awt.Dimension(90, 23));
        btn6.setMinimumSize(new java.awt.Dimension(90, 23));
        btn6.setPreferredSize(new java.awt.Dimension(90, 23));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn10.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        btn10.setForeground(new java.awt.Color(255, 51, 51));
        btn10.setText("10");
        btn10.setMaximumSize(new java.awt.Dimension(90, 23));
        btn10.setMinimumSize(new java.awt.Dimension(90, 23));
        btn10.setPreferredSize(new java.awt.Dimension(90, 23));
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        btn1.setText("1");
        btn1.setMaximumSize(new java.awt.Dimension(90, 23));
        btn1.setMinimumSize(new java.awt.Dimension(90, 23));
        btn1.setPreferredSize(new java.awt.Dimension(90, 23));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        btn2.setText("2");
        btn2.setMaximumSize(new java.awt.Dimension(90, 23));
        btn2.setMinimumSize(new java.awt.Dimension(90, 23));
        btn2.setPreferredSize(new java.awt.Dimension(90, 23));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        btn3.setText("3");
        btn3.setMaximumSize(new java.awt.Dimension(90, 23));
        btn3.setMinimumSize(new java.awt.Dimension(90, 23));
        btn3.setPreferredSize(new java.awt.Dimension(90, 23));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlKeyBoardLayout = new javax.swing.GroupLayout(pnlKeyBoard);
        pnlKeyBoard.setLayout(pnlKeyBoardLayout);
        pnlKeyBoardLayout.setHorizontalGroup(
            pnlKeyBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKeyBoardLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pnlKeyBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRecived, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlKeyBoardLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(pnlKeyBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlKeyBoardLayout.createSequentialGroup()
                                .addComponent(btn100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btn00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnClr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlKeyBoardLayout.createSequentialGroup()
                                .addComponent(btn200, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn500, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btn2000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnclrAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlKeyBoardLayout.createSequentialGroup()
                                .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlKeyBoardLayout.createSequentialGroup()
                                .addComponent(btn50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlKeyBoardLayout.createSequentialGroup()
                                .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlKeyBoardLayout.setVerticalGroup(
            pnlKeyBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKeyBoardLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(pnlKeyBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnlKeyBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnlKeyBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn50, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnlKeyBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn100, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClr, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn00, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnlKeyBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn200, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnclrAll, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn500, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2000, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(btnRecived, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout pnlCalcLayout = new javax.swing.GroupLayout(pnlCalc);
        pnlCalc.setLayout(pnlCalcLayout);
        pnlCalcLayout.setHorizontalGroup(
            pnlCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCalcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlKeyBoard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRecivedValues, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlCalcLayout.setVerticalGroup(
            pnlCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCalcLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlRecivedValues, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlKeyBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCalc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCalc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//power button to exit from app
    private void btnPowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPowerActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnPowerActionPerformed
// All keyboards buttons
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
       givenAmount += 1;
       lblGivenAmount.setText("Rs. "+Double.toString(givenAmount));
    }//GEN-LAST:event_btn1ActionPerformed

    private void lblGivenAmountPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblGivenAmountPropertyChange
        // TODO add your handling code here:
        lblChangeDue.setText("Rs. "+Double.toString(givenAmount-dueAmount));
    }//GEN-LAST:event_lblGivenAmountPropertyChange

    private void btnClrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClrActionPerformed
        // TODO add your handling code here:
        givenAmount = 0;
        lblGivenAmount.setText("Rs. "+Double.toString(givenAmount));
       
    }//GEN-LAST:event_btnClrActionPerformed

    private void lblTotalValuePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblTotalValuePropertyChange
        // TODO add your handling code here:
        
        lblRuppesInWords.setText("Rupees "+Helper.convertNumberToWord((int)totalValue));
        
    }//GEN-LAST:event_lblTotalValuePropertyChange

    private void btnclrAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclrAllActionPerformed
        // TODO add your handling code here:
        givenAmount = 0;
        lblGivenAmount.setText("Rs. "+Double.toString(givenAmount));
    }//GEN-LAST:event_btnclrAllActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
givenAmount += 2;
       lblGivenAmount.setText("Rs. "+Double.toString(givenAmount));        // TODO add your handling code here:
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
givenAmount += 3;
       lblGivenAmount.setText("Rs. "+Double.toString(givenAmount));        // TODO add your handling code here:
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
givenAmount += 4;
       lblGivenAmount.setText("Rs. "+Double.toString(givenAmount));        // TODO add your handling code here:
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
givenAmount += 5;
       lblGivenAmount.setText("Rs. "+Double.toString(givenAmount));        // TODO add your handling code here:
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
givenAmount += 6;
       lblGivenAmount.setText("Rs. "+Double.toString(givenAmount));        // TODO add your handling code here:
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
givenAmount += 7;
       lblGivenAmount.setText("Rs. "+Double.toString(givenAmount));        // TODO add your handling code here:
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
givenAmount += 8;
       lblGivenAmount.setText("Rs. "+Double.toString(givenAmount));        // TODO add your handling code here:
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
givenAmount += 9;
       lblGivenAmount.setText("Rs. "+Double.toString(givenAmount));        // TODO add your handling code here:
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
givenAmount += 10;
       lblGivenAmount.setText("Rs. "+Double.toString(givenAmount));        // TODO add your handling code here:
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
givenAmount += 20;
       lblGivenAmount.setText("Rs. "+Double.toString(givenAmount));        // TODO add your handling code here:
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn50ActionPerformed
givenAmount += 50;
       lblGivenAmount.setText("Rs. "+Double.toString(givenAmount));        // TODO add your handling code here:
    }//GEN-LAST:event_btn50ActionPerformed

    private void btn100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn100ActionPerformed
givenAmount += 100;
       lblGivenAmount.setText("Rs. "+Double.toString(givenAmount));        // TODO add your handling code here:
    }//GEN-LAST:event_btn100ActionPerformed

    private void btn200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn200ActionPerformed
givenAmount += 200;
       lblGivenAmount.setText("Rs. "+Double.toString(givenAmount));        // TODO add your handling code here:
    }//GEN-LAST:event_btn200ActionPerformed

    private void btn500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn500ActionPerformed
givenAmount += 500;
       lblGivenAmount.setText("Rs. "+Double.toString(givenAmount));        // TODO add your handling code here:
    }//GEN-LAST:event_btn500ActionPerformed

    private void btn2000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2000ActionPerformed
givenAmount += 2000;
       lblGivenAmount.setText("Rs. "+Double.toString(givenAmount));        // TODO add your handling code here:
    }//GEN-LAST:event_btn2000ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
givenAmount *= 10;
       lblGivenAmount.setText("Rs. "+Double.toString(givenAmount));        // TODO add your handling code here:
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn00ActionPerformed
givenAmount *= 100;
       lblGivenAmount.setText("Rs. "+Double.toString(givenAmount));        // TODO add your handling code here:
    }//GEN-LAST:event_btn00ActionPerformed
//opning product list
    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        // open product list
        ProductTable p = new ProductTable();
        p.setVisible(true);
    }//GEN-LAST:event_btnAddProductActionPerformed

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
            java.util.logging.Logger.getLogger(BillingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillingFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn00;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn100;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn200;
    private javax.swing.JButton btn2000;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn50;
    private javax.swing.JButton btn500;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCard;
    private javax.swing.JButton btnCash;
    private javax.swing.JButton btnClr;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnNotification;
    private javax.swing.JButton btnPower;
    public static javax.swing.JButton btnRecived;
    private javax.swing.JButton btnSecurity;
    private javax.swing.JButton btnclrAll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCess;
    private javax.swing.JLabel lblCessValue;
    private javax.swing.JLabel lblChangeDue;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDateTime;
    public static javax.swing.JLabel lblDueAmount;
    private javax.swing.JLabel lblGivenAmount;
    private javax.swing.JLabel lblHead;
    private javax.swing.JLabel lblInvoice;
    private javax.swing.JLabel lblRuppesInWords;
    private javax.swing.JLabel lblSubToal;
    public static javax.swing.JLabel lblSubTotalValue;
    private javax.swing.JLabel lblTax;
    public static javax.swing.JLabel lblTaxValue;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTotal;
    public static javax.swing.JLabel lblTotalValue;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUserRole;
    private javax.swing.JLabel lblVersion;
    private javax.swing.JPanel pnlCalc;
    private javax.swing.JPanel pnlHead;
    private javax.swing.JPanel pnlKeyBoard;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlMoneyInWord;
    private javax.swing.JPanel pnlRecivedValues;
    private javax.swing.JPanel pnlStatus;
    private javax.swing.JPanel pnlTotalText;
    private javax.swing.JPanel pnlTotalValues;
    public static javax.swing.JTable tblShoppingList;
    // End of variables declaration//GEN-END:variables
}
