/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.controllers.admin;

import com.mycompany.db;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nobpe
 */
public class loai_the extends javax.swing.JInternalFrame {

    /**
     * Creates new form loai_the
     */
    public loai_the() {
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
    private void load(){
        try {
            tb_lt.removeAll();
            con = db.connect();
            String sql = "select * from loai_the";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String[] td = {"Tên thẻ", "Ưu đãi", "Hạn mức sử dụng", "Phí dịch vụ"};
            DefaultTableModel tb = new DefaultTableModel(td, 0);
            int sum = 0;
            while(rs.next()){
                sum++;
                Vector v = new Vector();
                v.add(rs.getString("ten_loai_the"));
                v.add(rs.getString("uu_dai"));
                v.add(rs.getString("han_muc_su_dung"));
                v.add(rs.getString("phi_dich_vu"));
                tb.addRow(v);
            }
            sum_nd.setText(sum + "");
            tb_lt.setModel(tb);
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_lt = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        sum_nd = new javax.swing.JLabel();
        txt_tk = new javax.swing.JTextField();
        tk = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_thoat = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_ten = new javax.swing.JTextField();
        txt_hm = new javax.swing.JTextField();
        txt_dv = new javax.swing.JTextField();
        txt_ud = new javax.swing.JTextField();
        btn_them = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(640, 600));
        setPreferredSize(new java.awt.Dimension(640, 600));
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);
        setVisible(true);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setMaximumSize(new java.awt.Dimension(454, 404));

        tb_lt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tb_lt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb_lt.setMinimumSize(new java.awt.Dimension(0, 0));
        tb_lt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_ltMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_lt);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jPanel5.setBackground(new java.awt.Color(255, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setMaximumSize(new java.awt.Dimension(635, 48));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ LOẠI THẺ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Tổng số loại thẻ hiện có:");

        sum_nd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sum_nd.setForeground(new java.awt.Color(204, 0, 51));
        sum_nd.setText("jLabel3");

        txt_tk.setToolTipText("");
        txt_tk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_tkMouseClicked(evt);
            }
        });
        txt_tk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_tkKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(sum_nd, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(txt_tk, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tk, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_tk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(sum_nd))
                            .addGap(1, 1, 1))))
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_thoat.setText("Thoát");
        btn_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thoatActionPerformed(evt);
            }
        });

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Tên thẻ:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Hạn mức sử dụng/ngày:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Ưu đãi:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Phí dịch vụ/năm:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txt_ten)
                    .addComponent(txt_hm, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(txt_dv)
                    .addComponent(txt_ud, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_dv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(5, 5, 5)
                        .addComponent(txt_hm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154)
                .addComponent(btn_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sua)
                    .addComponent(btn_xoa)
                    .addComponent(btn_thoat)
                    .addComponent(btn_them))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Connection con;
    private void tb_ltMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_ltMouseClicked
        int i = tb_lt.getSelectedRow();
        btn_sua.setVisible(true);
        btn_xoa.setVisible(true);
        txt_ten.setEnabled(true);
        txt_hm.setEnabled(true);
        txt_dv.setEnabled(true);
        DefaultTableModel tb = (DefaultTableModel)tb_lt.getModel();
        txt_ten.setText(tb.getValueAt(i, 0).toString());
        txt_hm.setText(tb.getValueAt(i, 1).toString());
        String ngay = tb.getValueAt(i, 2).toString();
        txt_dv.setText(tb.getValueAt(i, 7).toString());
    }//GEN-LAST:event_tb_ltMouseClicked

    private void txt_tkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_tkMouseClicked
        txt_ten.setText("");
        txt_hm.setText("");
        txt_dv.setText("");
        txt_ten.setEnabled(false);
        txt_hm.setEnabled(false);
        txt_dv.setEnabled(false);
        btn_sua.setVisible(false);
        btn_xoa.setVisible(false);
    }//GEN-LAST:event_txt_tkMouseClicked

    private void txt_tkKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tkKeyReleased
        try {
            con = db.connect();
            Statement st = con.createStatement();
            String tim = txt_tk.getText().trim();
            String sql = "select * "
            + "from thong_tin_ca_nhan ttcn "
            + "join nguoi_dung nd on nd.id = ttcn.nguoi_dung_id "
            + "where ttcn.so_dien_thoai like '"+tim+"%'";
            ResultSet rs = st.executeQuery(sql);
            String[] td = {"Họ", "Tên", "Ngày sinh", "Giới tính", "Địa chỉ", "Số điện thoại", "Email", "Số công dân", "Số tài khoản"};
            DefaultTableModel tb = new DefaultTableModel(td, 0){
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false; // Không cho phép chỉnh sửa bất kỳ ô nào
                }
            };
            System.out.println(rs);
            while(rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("ho"));
                v.add(rs.getString("ten"));
                v.add(rs.getString("ngay_sinh"));
                v.add(rs.getString("gioi_tinh"));
                v.add(rs.getString("dia_chi"));
                v.add(rs.getString("so_dien_thoai"));
                v.add(rs.getString("email"));
                v.add(rs.getString("so_cong_dan"));
                v.add(rs.getString("so_tai_khoan"));
                tb.addRow(v);
            }
            tb_lt.setModel(tb);
            con.close();
        } catch (Exception e){
            e.printStackTrace();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tkKeyReleased

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
//        try {
//            con = db.connect();
//            String ten = txt_ten.getText().trim();
//            String han_muc = txt_hm.getText().trim();
//            String phi_divh_vu = txt_dv.getText().trim();
//            String sql = "Update thong_tin_ca_nhan Set ho = N'"+ho+"', ten = N'"+ten+"', ngay_sinh = '"+ns+"', gioi_tinh = N'"+gt+"', dia_chi = N'"+dc+"', so_dien_thoai = '"+dt+"', so_cong_dan = '"+cd+"'"
//            + "where so_tai_khoan = '"+u.getStk()+"'";
//            Statement st = con.createStatement();
//            st.executeUpdate(sql);
//            JOptionPane.showMessageDialog(this, "Bạn đã cập nhật thành công");
//            con.close();
//            load();
//        } catch (SQLException ex) {
//            Logger.getLogger(nguoi_dung.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(nguoi_dung.class.getName()).log(Level.SEVERE, null, ex);
//        }        // TODO add your handling code here:

    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
//        try {
//            con = db.connect();
//            Statement st = con.createStatement();
//            String sql = "Delete nd from nguoi_dung nd "
//            + "join thong_tin_ca_nhan ttcn on nd.id = ttcn.nguoi_dung_id "
//            + "where ttcn.so_tai_khoan = '"+u.getStk()+"'";
//            int r = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa người dùng này không?", "Xác nhận", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
//            if(r == JOptionPane.YES_OPTION){
//                st.executeUpdate(sql);
//                JOptionPane.showMessageDialog(this, "Xóa thành công!!");
//                con.close();
//            }
//            load();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        // TODO add your handling code here:
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thoatActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_thoatActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        try {
            con = db.connect();
            Statement st = con.createStatement();
            String ten = txt_ten.getText().trim();
            if(ten.isEmpty()){
                JOptionPane.showMessageDialog(this, "Tên không được để trống.");
                return;
            }
            String uu_dai = txt_ud.getText().trim();
            if(uu_dai.isEmpty()){
                JOptionPane.showMessageDialog(this, "Ưu đãi không được để trống.");
                return;
            }
            String han_muc = txt_hm.getText().trim();
            if(han_muc.isEmpty()){
                JOptionPane.showMessageDialog(this, "Hạn mức không được để trống.");
                return;
            }
            String phi_dich_vu = txt_dv.getText().trim();
            if(phi_dich_vu.isEmpty()){
                JOptionPane.showMessageDialog(this, "Phí dich vụ không được để trống.");
                return;
            }
            String sql = "insert into loai_the (ten_loai_the, uu_dai, han_muc_su_dung, phi_dich_vu)"
                    + "values ('"+ten+"', N'"+uu_dai+"', '"+han_muc+"', N'"+phi_dich_vu+"'";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Thêm loại thẻ thành công.");
            load();
        } catch (Exception e){
            e.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_themActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_thoat;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel sum_nd;
    private javax.swing.JTable tb_lt;
    private javax.swing.JLabel tk;
    private javax.swing.JTextField txt_dv;
    private javax.swing.JTextField txt_hm;
    private javax.swing.JTextField txt_ten;
    private javax.swing.JTextField txt_tk;
    private javax.swing.JTextField txt_ud;
    // End of variables declaration//GEN-END:variables
}