/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.controllers.user;

import com.mycompany.db;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class quanly_yeu_cau extends javax.swing.JInternalFrame {

    /**
     * Creates new form quanly_yeu_cau
     */
    public quanly_yeu_cau() throws IOException {
        initComponents();
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        load_yeu_cau();
    }
    Connection con; 
    private void load_yeu_cau(){
        try {
            tbYeucau.removeAll();
            con = db.connect();
            String sql = " SELECT * from ho_tro_nguoi_dung ht "
                    +"join nguoi_dung nd on ht.nguoi_dung_id = nd.id";          
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String[] td = {"ID","Tiêu đề","Mô tả","Trạng thái"};
            DefaultTableModel tb = new DefaultTableModel(td, 0);
            while(rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("id"));
                v.add(rs.getString("loai_yeu_cau"));
                v.add(rs.getString("mo_ta"));
                v.add(rs.getString("trang_thai"));
                tb.addRow(v);
            }
           
            tbYeucau.setModel(tb);
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        txtTimkiem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ComboBox_chonyc = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnSua = new javax.swing.JButton();
        btnNhapExcel = new javax.swing.JButton();
        btnGui = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbYeucau = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMotachitiet = new javax.swing.JTextArea();
        btnTimkiem = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("QUẢN LÝ HỖ TRỢ YÊU CẦU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(168, 168, 168))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("Quý khách có thể gửi các yêu cầu hỗ trợ, các góp ý dịch vụ để Ngân hàng nâng cao chất lượng dịch vụ được tốt hơn");

        jLabel3.setText("Chọn yêu cầu cần hỗ trợ:");

        ComboBox_chonyc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Chọn yêu cầu hỗ trợ--", "Đăng ký và đăng nhập", "Các dịch vụ thẻ", "Phương thức giao dịch", "Các chính sách bảo mật", "Chính sách quyền truy cập", "Biểu phí dịch vụ", "Thông báo biến động số dư", "Lãi suất", "Gửi tiết kiệm" }));

        jLabel4.setText("Mô tả chi tiết:");

        btnSua.setBackground(new java.awt.Color(204, 204, 204));
        btnSua.setText("Sửa");
        btnSua.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnNhapExcel.setBackground(new java.awt.Color(204, 204, 204));
        btnNhapExcel.setText("Nhập file");
        btnNhapExcel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnGui.setBackground(new java.awt.Color(204, 204, 204));
        btnGui.setText("Gửi");
        btnGui.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiActionPerformed(evt);
            }
        });

        tbYeucau.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Tiêu đề", "Mô tả", "Trạng thái"
            }
        ));
        jScrollPane1.setViewportView(tbYeucau);

        txtMotachitiet.setColumns(20);
        txtMotachitiet.setRows(5);
        jScrollPane2.setViewportView(txtMotachitiet);

        btnTimkiem.setBackground(new java.awt.Color(204, 204, 204));
        btnTimkiem.setText("Tìm kiếm:");
        btnTimkiem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTimkiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimkiemMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGui, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnNhapExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ComboBox_chonyc, 0, 275, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(btnTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimkiem))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ComboBox_chonyc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua)
                    .addComponent(btnNhapExcel)
                    .addComponent(btnGui))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        try {
            //B1: Lay dl tu cac component dua vao bien
            int nguoi_dung_id =1;
            String loai_yeu_cau = ComboBox_chonyc.getSelectedItem().toString();
            String mo_ta = txtMotachitiet.getText().trim();
           
            //B2: Keets noois DB
            con = db.connect();
            //B3:Tạo đối tượng Statement để sua dl
            String sql = "Update ho_tro_nguoi_dung Set loai_yeu_cau=N'" + loai_yeu_cau + "',mo_ta=N'" + mo_ta + "' Where id='" + nguoi_dung_id + "'";
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            con.close();
            JOptionPane.showMessageDialog(this, "Sửa thành công");
            load_yeu_cau();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiActionPerformed
    int nguoi_dung_id =1;
    String loai_yeu_cau =ComboBox_chonyc.getSelectedItem().toString();  
    String mo_ta = txtMotachitiet.getText().trim();
    // B2: Kết nối DB
    try {
        con = db.connect();
        // B3: Tạo đối tượng PreparedStatement để thực hiện câu lệnh truy vấn             
        String sql = "INSERT INTO ho_tro_nguoi_dung (nguoi_dung_id, loai_yeu_cau, mo_ta , trang_thai) "
                + "VALUES (?, ?, ?, ?)";

            PreparedStatement st = con.prepareStatement(sql); 

            // Truyền giá trị cho các tham số ?
            st.setInt(1, nguoi_dung_id);
            st.setString(2, loai_yeu_cau);
            st.setString(3, mo_ta);
            st.setString(4, "Đang xử lý ");
           st.executeUpdate();
           con.close();
           JOptionPane.showMessageDialog(this, "Gửi thành công");
           load_yeu_cau();
    } catch (Exception ex) {
        ex.printStackTrace();
    }

    }//GEN-LAST:event_btnGuiActionPerformed

    private void btnTimkiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimkiemMouseClicked
        
    }//GEN-LAST:event_btnTimkiemMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox_chonyc;
    private javax.swing.JButton btnGui;
    private javax.swing.JButton btnNhapExcel;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbYeucau;
    private javax.swing.JTextArea txtMotachitiet;
    private javax.swing.JTextField txtTimkiem;
    // End of variables declaration//GEN-END:variables
}
