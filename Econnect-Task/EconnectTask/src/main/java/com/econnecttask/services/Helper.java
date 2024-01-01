package com.econnecttask.services;

import com.econnecttask.frames.BillingFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author himanshu
 */
public class Helper {
//    row count for shopping list items
    private static int rowCount= 1;
    
    
    
//    for converting amount to words
    private static final String[] units = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };
    private static final String[] tens = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };
    public static String convertNumberToWord(int number) {
        if (number == 0) {
            return "";
        }
        if (number < 0) {
            return "Minus " + convertNumberToWord(Math.abs(number));
        }
        if (number < 20) {
            return units[number];
        }
        if (number < 100) {
            return tens[number / 10] + ((number % 10 != 0) ? " " : "") + units[number % 10];
        }
        if (number < 1000) {
            return units[number / 100] + " Hundred" + ((number % 100 != 0) ? " " : "") + convertNumberToWord(number % 100);
        }
        if (number < 100000) {
            return convertNumberToWord(number / 1000) + " Thousand" + ((number % 1000 != 0) ? " " : "") + convertNumberToWord(number % 1000);
        }
        if (number < 10000000) {
            return convertNumberToWord(number / 100000) + " Lakh" + ((number % 100000 != 0) ? " " : "") + convertNumberToWord(number % 100000);
        }
        if (number < 1000000000) {
            return convertNumberToWord(number / 10000000) + " Crore" + ((number % 10000000 != 0) ? " " : "") + convertNumberToWord(number % 10000000);
        }
        return "Number out of range";
    }
    
    
    
//    adding items to shopping list
    public static void addToSoppingList(Object[] row){
        
        
        DefaultTableModel model = (DefaultTableModel) BillingFrame.tblShoppingList.getModel();
//        checking for item already exist in shopping list
        for (int i = 0; i < model.getRowCount(); i++) {
            String productName = (String) model.getValueAt(i, 1); 
            if (productName.equals(row[0])) { 
                
                int quantity = (Integer) model.getValueAt(i, 3);
                model.setValueAt(quantity + 1, i, 3);

                double total = (double)model.getValueAt(i, 6);
                model.setValueAt(total + (double)row[4], i, 6);
                
                
                return; // No need to add a new row
            }
        }
//    adding new row to shopping list
       Object[] newRow = {rowCount,row[0],row[1],1,row[2],row[3],row[4]};
        model.addRow(newRow);
        rowCount++;
        BillingFrame.tblShoppingList.setModel(model);
        
    }
    
}
