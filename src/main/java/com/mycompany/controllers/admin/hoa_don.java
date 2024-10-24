/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.controllers.admin;

import com.mycompany.controllers.user.Quanlithongtincanhan;
import com.mycompany.db;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




/**
 *
 * @author HOA.HP
 */
public class hoa_don extends javax.swing.JInternalFrame {

    /**
     * Creates new form hoa_don
     */
    public hoa_don() {
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        initComponents();
        load();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        p3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txt_hoten = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_sdt_gui = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_stk_gui = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_so_tien_thanh_toan = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txt_loi_nhan = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        đfd = new javax.swing.JLabel();
        txt_den_stk = new javax.swing.JTextField();
        txt_dc = new javax.swing.JLabel();
        txt_dia_chi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cb = new javax.swing.JComboBox<>();
        btn_xac_nhan = new javax.swing.JButton();
        hoa_don_moi = new javax.swing.JButton();

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ GIAO DỊCH");

        setPreferredSize(new java.awt.Dimension(800, 699));

        jPanel5.setBackground(new java.awt.Color(255, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setMaximumSize(new java.awt.Dimension(635, 48));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("QUẢN LÝ HÓA ĐƠN");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.setMaximumSize(new java.awt.Dimension(454, 404));

        p3.setBackground(new java.awt.Color(51, 51, 51));
        p3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Thông tin hóa đơn");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Họ và tên bên gửi:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Số điện thoại bên gửi: ");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("Số tài khoản bên gửi (Nếu có)");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("Số tiền thanh toán:");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setText("Lời nhắn:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(txt_hoten)
                    .addComponent(txt_sdt_gui)
                    .addComponent(txt_stk_gui)
                    .addComponent(txt_so_tien_thanh_toan)
                    .addComponent(txt_loi_nhan, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_hoten, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_sdt_gui, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_stk_gui, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_so_tien_thanh_toan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_loi_nhan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        đfd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        đfd.setText("STK thụ hưởng:");

        txt_den_stk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_den_stkActionPerformed(evt);
            }
        });

        txt_dc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_dc.setText("Tên thụ hưởng:");

        txt_dia_chi.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Loại hóa đơn:");

        cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Chọn hóa đơn-", "Hóa đơn tiền nước", "Hóa đơn tiền điện", "Hóa đơn tiền nhà" }));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_dia_chi, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cb, javax.swing.GroupLayout.Alignment.LEADING, 0, 351, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_dc, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(đfd, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_den_stk, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(đfd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_den_stk, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_dc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_dia_chi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btn_xac_nhan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_xac_nhan.setText("Xác nhận hóa đơn");
        btn_xac_nhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xac_nhanActionPerformed(evt);
            }
        });

        hoa_don_moi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hoa_don_moi.setText("Hóa đơn mới");
        hoa_don_moi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoa_don_moiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hoa_don_moi, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_xac_nhan, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_xac_nhan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hoa_don_moi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void hoa_don_moiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoa_don_moiActionPerformed
        txt_hoten.setEnabled(true);
        txt_sdt_gui.setEnabled(true);
        txt_stk_gui.setEnabled(true);
        txt_den_stk.setEnabled(true);
        txt_so_tien_thanh_toan.setEnabled(true);
        txt_loi_nhan.setEnabled(true);
        txt_dia_chi.setEnabled(true);
        cb.setEnabled(true);
        txt_hoten.setText("");
        txt_sdt_gui.setText("");
        txt_stk_gui.setText("");
        txt_den_stk.setText("");
        txt_so_tien_thanh_toan.setText("");
        txt_loi_nhan.setText("");
        txt_dia_chi.setText("");
        cb.setSelectedItem("-Chọn hóa đơn-");
    }//GEN-LAST:event_hoa_don_moiActionPerformed
 private void load(){
        txt_hoten.setEnabled(false);
        txt_sdt_gui.setEnabled(false);
        txt_stk_gui.setEnabled(false);
        txt_den_stk.setEnabled(false);
        txt_so_tien_thanh_toan.setEnabled(false);
        txt_loi_nhan.setEnabled(false);
        txt_dia_chi.setEnabled(false);
        cb.setEnabled(false);
        txt_hoten.setText("");
        txt_sdt_gui.setText("");
        txt_stk_gui.setText("");
        txt_den_stk.setText("");
        txt_so_tien_thanh_toan.setText("");
        txt_loi_nhan.setText("");
        txt_dia_chi.setText("");
    }
    private void btn_xac_nhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xac_nhanActionPerformed
        // TODO add your handling code here:
        String ten_nguoi_gui = txt_hoten.getText().trim();
        if(ten_nguoi_gui.isEmpty()){
            JOptionPane.showMessageDialog(this, "Tên người dùng không được để trống.");
            return;
        }
        String so_dien_thoai_nguoi_gui= txt_sdt_gui.getText().trim();
        if(so_dien_thoai_nguoi_gui.isEmpty()){
            JOptionPane.showMessageDialog(this, "Số điện thoại người dùng không được để trống.");
            return;
        }
        String so_tai_khoan_nguoi_gui = txt_stk_gui.getText().trim();
        String so_tien = txt_so_tien_thanh_toan.getText().trim();
        if(so_tien.isEmpty()){
            JOptionPane.showMessageDialog(this, "Chưa điền số tiền.");
            return;
        }
        String mo_ta = txt_loi_nhan.getText().trim();
        if(mo_ta.isEmpty()){
            JOptionPane.showMessageDialog(this, "Lời nhắn không được để trống.");
            return;
        }
        String so_tai_khoan_nguoi_nhan = txt_den_stk.getText().trim();
        if(so_tai_khoan_nguoi_nhan.isEmpty()){
            JOptionPane.showMessageDialog(this, "STK người thụ hưởng không được để trống.");
            return;
        }
        String loai_hoa_don = cb.getSelectedItem().toString();
        if(loai_hoa_don.equals("-Chọn hóa đơn-")){
            JOptionPane.showMessageDialog(this, "Chưa chọn loại hóa đơn.");
            return;
        }
        int r = JOptionPane.showConfirmDialog(this, "Xác nhận hóa đơn?", "Xác nhận", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(r == JOptionPane.YES_OPTION){
            try {
                con = db.connect();
                con.setAutoCommit(false); 
                Statement st = con.createStatement();
                double soTienGiaoDich = Double.parseDouble(so_tien);
                String queryCheckBalance = "SELECT so_tien_hien_co FROM tai_khoan_nguoi_dung WHERE so_tai_khoan = '" + so_tai_khoan_nguoi_nhan + "'";
                ResultSet rs = st.executeQuery(queryCheckBalance);
                if(rs.next()) {
                    double soTienHienCo = rs.getDouble("so_tien_hien_co");
                    double soTienMoi = soTienHienCo + soTienGiaoDich;
                    String updateBalance = "UPDATE tai_khoan_nguoi_dung SET so_tien_hien_co = " + soTienMoi + " WHERE so_tai_khoan = '" + so_tai_khoan_nguoi_nhan + "'";
                    st.executeUpdate(updateBalance);
                    String sql = "insert into giao_dich (loai_giao_dich, ten_nguoi_gui, so_dien_thoai_nguoi_gui, so_tai_khoan_nguoi_gui, so_tai_khoan_nguoi_nhan, so_tien, mo_ta, ngay_giao_dich, trang_thai)"
                            + "values (N'"+loai_hoa_don+"', N'" + ten_nguoi_gui + "', '" + so_dien_thoai_nguoi_gui+ "', '" + so_tai_khoan_nguoi_gui + "', '" + so_tai_khoan_nguoi_nhan + "', " + so_tien + ", N'" + mo_ta + "', getdate(), N'thanh_cong')";
                    st.executeUpdate(sql);
                    con.commit();
                    JOptionPane.showMessageDialog(this, "Thanh toán hóa đơn thành công.");
                    load();
                } else {
                    throw new Exception("Không tìm thấy số tài khoản người nhận.");
                }
        } catch (Exception e) {
            e.printStackTrace();
            if (con != null) {
                
                try {
                    con.rollback(); 
                    JOptionPane.showMessageDialog(this, "Thanh toán hóa đơn thất bại. Đã rollback dữ liệu.");
                } catch (SQLException ex) {
                    Logger.getLogger(giao_dich.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } finally {
            if (con != null) {
                try {
                    con.setAutoCommit(true); 
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(giao_dich.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    }//GEN-LAST:event_btn_xac_nhanActionPerformed
    Connection con;
    private void txt_den_stkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_den_stkActionPerformed
        String so_tai_khoan_nguoi_nhan = txt_den_stk.getText().trim();
        try {   
            con = db.connect();
            Statement st = con.createStatement();
            String sql = "select * "
                    + "from tai_khoan_nguoi_dung tknd "
                    + "join nguoi_dung nd on nd.so_dien_thoai = tknd.so_dien_thoai_id "
                    + "where tknd.so_tai_khoan = '"+so_tai_khoan_nguoi_nhan+"' and tknd.loai_tai_khoan = N'Tài khoản đối tác'"; 
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                txt_dia_chi.setText(rs.getString("ho") +" "+ rs.getString("ten"));
                return;
            }
            JOptionPane.showMessageDialog(this, "Số tài khoản không tồn tại hoặc không có đối tác nào.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txt_den_stkActionPerformed

    private void txt_hotennhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hotennhanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hotennhanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_xac_nhan;
    private javax.swing.JComboBox<String> cb;
    private javax.swing.JButton hoa_don_moi;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel p3;
    private javax.swing.JTextField txt_den_stk;
    private javax.swing.JTextField txt_dia_chi;
    private javax.swing.JTextField txt_hoten;
    private javax.swing.JTextField txt_hotennhan;
    private javax.swing.JTextField txt_loi_nhan;
    private javax.swing.JTextField txt_sdt_gui;
    private javax.swing.JTextField txt_so_tien_thanh_toan;
    private javax.swing.JTextField txt_stk_gui;
    private javax.swing.JLabel đfd;
    // End of variables declaration//GEN-END:variables
}
