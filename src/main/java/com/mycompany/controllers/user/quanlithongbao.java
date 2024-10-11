/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.controllers.user;

import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author PC
 */
public class quanlithongbao extends javax.swing.JInternalFrame {

    /**
     * Creates new form quanlithongbao
     */
    public quanlithongbao() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDanhsach = new javax.swing.JTable();
        btnxoa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txttimkiem = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setPreferredSize(new java.awt.Dimension(640, 550));

        tbDanhsach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Số tiền", "Loại giao dịch", "Nội Dung"
            }
        ));
        jScrollPane1.setViewportView(tbDanhsach);

        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        jLabel1.setText("Tìm kiếm: ");

        txttimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttimkiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnxoa)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnxoa)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
        // Kiểm tra xem có dòng nào được chọn hay không
    int selectedRow = tbDanhsach.getSelectedRow();
    
    if (selectedRow != -1) {
        // Lấy mô hình bảng (tableModel) từ bảng tbDanhsach
        DefaultTableModel tableModel = (DefaultTableModel) tbDanhsach.getModel();
        
        // Xóa dòng được chọn từ mô hình bảng
        tableModel.removeRow(selectedRow);
    } else {
        // Hiển thị thông báo nếu không có dòng nào được chọn
        JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để xóa!");
    }
    }//GEN-LAST:event_btnxoaActionPerformed

    private void txttimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttimkiemActionPerformed
        // TODO add your handling code here:
        String keyword = txttimkiem.getText();
    // Nếu từ khóa tìm kiếm không rỗng, áp dụng bộ lọc tìm kiếm
    if (!keyword.trim().isEmpty()) {
        DefaultTableModel tableModel = (DefaultTableModel) tbDanhsach.getModel(); 
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tableModel);
        tbDanhsach.setRowSorter(sorter);

        // Áp dụng bộ lọc cho tất cả các cột, chỉ những hàng chứa từ khóa mới được hiển thị
        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + keyword));
    } else {
        // Nếu từ khóa rỗng, xóa bộ lọc
        ((TableRowSorter<?>) tbDanhsach.getRowSorter()).setRowFilter(null);
    }
    }//GEN-LAST:event_txttimkiemActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnxoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDanhsach;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables
}
