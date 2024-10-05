/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.controllers.user;

import com.mycompany.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class quanlygiaodich extends javax.swing.JInternalFrame {

    /**
     * Creates new form quanlygiaodich
     */
    public quanlygiaodich() {
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

        jPanel11 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cbnganhang = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btnchuyennhanh = new javax.swing.JRadioButton();
        btnchuyenthuong = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        txtsotk = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txttien = new javax.swing.JTextField();
        btnluu = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btntimkiem = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtloinhan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDanhsach = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(640, 550));

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel4.setText("Ngân hàng thụ hưởng:");

        cbnganhang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vietcombank (Ngân hàng TMCP Ngoại Thương Việt Nam)", "BIDV (Ngân hàng Đầu tư và phát triển Việt Nam)", "Techcombank (Ngân hàng Kỹ thương Việt Nam)", "TP Bank (Ngân hàng tiên phong)", "MB Bank (Ngân hàng Quân đội Việt Nam)" }));
        cbnganhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbnganhangActionPerformed(evt);
            }
        });

        jLabel5.setText("Loại phương thức chuyển tiền:");

        btnchuyennhanh.setText("Chuyển nhanh Napas 24/7");
        btnchuyennhanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchuyennhanhActionPerformed(evt);
            }
        });

        btnchuyenthuong.setText("Chuyển thường");

        jLabel11.setText("Số tài khoản:");

        jLabel12.setText("Tên người nhận:");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbnganhang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnchuyennhanh)
                        .addGap(117, 117, 117)
                        .addComponent(btnchuyenthuong))
                    .addComponent(jLabel5)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(txtsotk, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbnganhang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnchuyennhanh)
                    .addComponent(btnchuyenthuong))
                .addGap(42, 42, 42)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtsotk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(276, 276, 276))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel14.setText("Số tiền:");

        btnluu.setText("Lưu");
        btnluu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnluuActionPerformed(evt);
            }
        });

        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btntimkiem.setText("Tìm kiếm");
        btntimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimkiemActionPerformed(evt);
            }
        });

        jLabel15.setText("Lời nhắn (nếu có):");

        tbDanhsach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Số tài khoản", "Tên người nhận", "Số tiền", "Lời nhắn"
            }
        ));
        jScrollPane1.setViewportView(tbDanhsach);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(btntimkiem)
                            .addGap(18, 18, 18)
                            .addComponent(btnluu)
                            .addGap(18, 18, 18)
                            .addComponent(btnsua)
                            .addGap(18, 18, 18)
                            .addComponent(btnxoa))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttien, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(txtloinhan, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txttien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtloinhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsua)
                    .addComponent(btnxoa)
                    .addComponent(btnluu)
                    .addComponent(btntimkiem))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnluuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnluuActionPerformed
        // TODO add your handling code here:
        // Lấy thông tin từ các trường
        String tenNganHang = (String) cbnganhang.getSelectedItem();
        String soTaiKhoan = txtsotk.getText();
        String tenNguoiNhan = txtname.getText();
        String loaiPhuongThuc = "=";
        if(btnchuyennhanh.isSelected()){
            loaiPhuongThuc = "Chuyển nhanh Napas 24/7";
        } else if(btnchuyenthuong.isSelected()){
            loaiPhuongThuc = "Chuyển thường";
        }
        String soTien = txttien.getText();
        String loiNhan = txtloinhan.getText();
        // Kiểm tra dữ liệu đầu vào
        if(soTaiKhoan.isEmpty() || tenNguoiNhan.isEmpty() || soTien.isEmpty()){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin!");
        } else {
            // Kết nối database và thực hiện lưu
            try {
                Connection con = db.connect();
                String sql = "INSERT INTO GiaoDich (SoTaiKhoan, TenNguoiNhan, SoTien, LoaiChuyenTien, TuTaiKhoan, LoiNhan) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(0, tenNganHang);
                pst.setString(1, soTaiKhoan);
                pst.setString(2, tenNguoiNhan);
                pst.setString(3, soTien);
                pst.setString(4, loaiPhuongThuc);
                pst.setString(5, loiNhan);

                int result = pst.executeUpdate();
                if(result > 0) {
                    JOptionPane.showMessageDialog(this, "Lưu thông tin thành công!");
                }
                con.close();
            } catch(Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi lưu dữ liệu.");
            }
        }

    }//GEN-LAST:event_btnluuActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // Lấy dữ liệu từ các trường trong form
        String tenNganHang = (String) cbnganhang.getSelectedItem();
        String soTaiKhoan = txtsotk.getText();
        String tenNguoiNhan = txtname.getText();
        String loaiPhuongThuc = "=";
        if(btnchuyennhanh.isSelected()){
            loaiPhuongThuc = "Chuyển nhanh Napas 24/7";
        } else if(btnchuyenthuong.isSelected()){
            loaiPhuongThuc = "Chuyển thường";
        }
        String soTien = txttien.getText();
        String loiNhan = txtloinhan.getText();
        // Kiểm tra dữ liệu đầu vào
        if(soTaiKhoan.isEmpty() || tenNguoiNhan.isEmpty() || soTien.isEmpty()){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin!");
        } else {
            // Kết nối cơ sở dữ liệu và thực hiện cập nhật
            try {
                Connection con = db.connect();
                String sql = "UPDATE GiaoDich SET TenNguoiNhan = ?, SoTien = ?, LoaiChuyenTien = ?, TuTaiKhoan = ?, LoiNhan = ? WHERE SoTaiKhoan = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(0, tenNganHang);
                pst.setString(1, soTaiKhoan);
                pst.setString(2, tenNguoiNhan);
                pst.setString(3, soTien);
                pst.setString(4, loaiPhuongThuc);
                pst.setString(5, loiNhan); // Điều kiện là số tài khoản

                int result = pst.executeUpdate();
                if(result > 0) {
                    JOptionPane.showMessageDialog(this, "Cập nhật thông tin thành công!");
                } else {
                    JOptionPane.showMessageDialog(this, "Không tìm thấy giao dịch với số tài khoản này.");
                }
                con.close();
            } catch(Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi cập nhật dữ liệu.");
            }
        }
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
        // Lấy số tài khoản từ form
        String soTaiKhoan = txtsotk.getText();

        // Kiểm tra dữ liệu đầu vào
        if(soTaiKhoan.isEmpty()){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số tài khoản để xóa giao dịch!");
        } else {
            // Hỏi xác nhận trước khi xóa
            int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa giao dịch này?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);

            if(confirm == JOptionPane.YES_OPTION) {
                // Kết nối cơ sở dữ liệu và thực hiện xóa
                try {
                    Connection con = db.connect();
                    String sql = "DELETE FROM GiaoDich WHERE SoTaiKhoan = ?";
                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.setString(1, soTaiKhoan); // Điều kiện là số tài khoản

                    int result = pst.executeUpdate();
                    if(result > 0) {
                        JOptionPane.showMessageDialog(this, "Xóa giao dịch thành công!");
                    } else {
                        JOptionPane.showMessageDialog(this, "Không tìm thấy giao dịch với số tài khoản này.");
                    }
                    con.close();
                } catch(Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi xóa giao dịch.");
                }
            }
        }
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btntimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimkiemActionPerformed
        // TODO add your handling code here:
        // Lấy số tài khoản từ form
        String soTaiKhoan = txtsotk.getText();

        // Kiểm tra xem người dùng đã nhập số tài khoản chưa
        if(soTaiKhoan.isEmpty()){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số tài khoản để xóa giao dịch!");
        } else {
            // Kết nối cơ sở dữ liệu và tìm kiếm thông tin
            try {
                Connection con = db.connect();
                String sql = "SELECT * FROM GiaoDich WHERE SoTaiKhoan = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, soTaiKhoan); // Điều kiện là số tài khoản

                ResultSet rs = pst.executeQuery();
                if(rs.next()) {
                    // Hiển thị thông tin giao dịch nếu tìm thấy
                    String tenNguoiNhan = rs.getString("TenNguoiNhan");
                    String soTien = rs.getString("SoTien");
                    String loaiPhuongThuc = rs.getString("LoaiPhuongThuc");
                    String tuTaiKhoan = rs.getString("TuTaiKhoan");
                    String loiNhan = rs.getString("LoiNhan");

                    // Gán các giá trị tìm thấy vào form
                    txtname.setText(tenNguoiNhan);
                    txttien.setText(soTien);
                    if(loaiPhuongThuc.equals("Chuyển nhanh Napas 24/7")) {
                        btnchuyennhanh.setSelected(true);
                    } else if(loaiPhuongThuc.equals("Chuyển thường")) {
                        btnchuyenthuong.setSelected(true);
                    }
                    txtloinhan.setText(loiNhan);
                } else {
                    JOptionPane.showMessageDialog(this, "Không tìm thấy giao dịch với số tài khoản này.");
                }
                con.close();
            } catch(Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi tìm kiếm dữ liệu.");
            }
        }
    }//GEN-LAST:event_btntimkiemActionPerformed

    private void cbnganhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbnganhangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbnganhangActionPerformed

    private void btnchuyennhanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchuyennhanhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnchuyennhanhActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnchuyennhanh;
    private javax.swing.JRadioButton btnchuyenthuong;
    private javax.swing.JButton btnluu;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btntimkiem;
    private javax.swing.JButton btnxoa;
    private javax.swing.JComboBox<String> cbnganhang;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDanhsach;
    private javax.swing.JTextField txtloinhan;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtsotk;
    private javax.swing.JTextField txttien;
    // End of variables declaration//GEN-END:variables
}
