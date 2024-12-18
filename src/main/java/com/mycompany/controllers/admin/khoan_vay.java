/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.controllers.admin;

import com.mycompany.db;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import com.mycompany.models.khoan_vay_model;
/**
 *
 * @author nobpe
 */
public class khoan_vay extends javax.swing.JInternalFrame {

    /**
     * Creates new form khoan_vay
     */
    public khoan_vay() {
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        initComponents();
        load_anh();
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

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_kv = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        cb_tt = new javax.swing.JComboBox<>();
        tk = new javax.swing.JTextField();
        lb_tk = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btn_xoa = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_lv = new javax.swing.JTextField();
        txt_stkv = new javax.swing.JTextField();
        txt_dt = new javax.swing.JTextField();
        txt_nkt = new javax.swing.JTextField();
        txt_cl = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_kh = new javax.swing.JTextField();
        txt_nbd = new javax.swing.JTextField();
        txt_stv = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(640, 600));
        setPreferredSize(new java.awt.Dimension(800, 699));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setMaximumSize(new java.awt.Dimension(454, 404));

        tb_kv.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tb_kv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb_kv.setMinimumSize(new java.awt.Dimension(0, 0));
        tb_kv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_kvMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_kv);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jPanel5.setBackground(new java.awt.Color(255, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setMaximumSize(new java.awt.Dimension(635, 48));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ KHOẢN VAY");

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

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lb1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb1.setText("Tổng số yêu cầu chưa xử lý:");

        lb2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb2.setForeground(new java.awt.Color(204, 0, 51));
        lb2.setText("jLabel3");

        cb_tt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Chọn tình trạng-", "Đang vay", "Hoàn tất", "Quá hạn" }));
        cb_tt.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_ttItemStateChanged(evt);
            }
        });

        tk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tkMouseClicked(evt);
            }
        });
        tk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tkKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(tk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_tk, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lb1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cb_tt, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb2)
                    .addComponent(lb1)
                    .addComponent(cb_tt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(tk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lb_tk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Loại vay:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("STK vay:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Ngày bắt đầu:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Số tiền vay:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Đã trả:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Ngày kết thúc:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Còn lại:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Kỳ hạn:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_lv, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_stkv, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(txt_nbd)
                    .addComponent(txt_stv, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt_nkt)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_dt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9)
                    .addComponent(txt_cl, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addComponent(txt_kh))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nkt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_kh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(45, 45, 45)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_nbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt_dt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_cl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt_lv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_stv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel10))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_stkv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 502, Short.MAX_VALUE))
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_xoa)
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
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Connection con;
    private void load_anh() {
        try {
            BufferedImage img_xoa = ImageIO.read(new File("src/main/java/com/mycompany/pics/xoa.png"));
            Image scaledImg_xoa = img_xoa.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            btn_xoa.setIcon(new ImageIcon(scaledImg_xoa));
            
            BufferedImage img_tk = ImageIO.read(new File("src/main/java/com/mycompany/pics/search.png"));
            Image scaledImg_tk = img_tk.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            lb_tk.setIcon(new ImageIcon(scaledImg_tk));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void load(){
        try {
            lb_tk.setVisible(false);
            tk.setVisible(false);
            lb1.setVisible(false);
            lb2.setVisible(false);
            txt_lv.setEnabled(false);
            txt_stkv.setEnabled(false);
            txt_kh.setEnabled(false);
            txt_stv.setEnabled(false);
            txt_dt.setEnabled(false);
            txt_cl.setEnabled(false);
            txt_nbd.setEnabled(false);
            txt_nkt.setEnabled(false);
            btn_xoa.setVisible(false);
            tb_kv.removeAll();
            String[] td = {"ID", "Người vay", "STK vay", "Tình trạng"};
            DefaultTableModel tb = new DefaultTableModel(td, 0);
            tb_kv.setModel(tb);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void load_xoa(){
        txt_lv.setText("");
        txt_stv.setText("");
        txt_dt.setText("");
        txt_cl.setText("");
        txt_nbd.setText("");
        txt_nkt.setText("");
        txt_kh.setText("");
        txt_stkv.setText("");
        lb1.setVisible(false);
        lb2.setVisible(false);
        txt_lv.setEnabled(false);
        txt_stkv.setEnabled(false);
        txt_kh.setEnabled(false);
        txt_stv.setEnabled(false);
        txt_dt.setEnabled(false);
        txt_cl.setEnabled(false);
        txt_nbd.setEnabled(false);
        txt_nkt.setEnabled(false);
        btn_xoa.setVisible(false);
        tb_kv.removeAll();
        try {
            int sum = 0;
            lb1.setVisible(true);
            lb2.setVisible(true);
            tb_kv.removeAll();
            con = db.connect();
            String sql = "select * from khoan_vay kv "
                    + "join nguoi_dung nd on nd.id = kv.nguoi_dung_id "
                    + "join thong_tin_ca_nhan ttcn on ttcn.nguoi_dung_id = nd.id "
                    + "where kv.tinh_trang = 'hoan_tat'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String[] td = {"ID", "Người vay", "STK vay", "Tình trạng"};
            DefaultTableModel tb = new DefaultTableModel(td, 0){
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false; // Không cho phép chỉnh sửa bất kỳ ô nào
                }
            };
            while(rs.next()){
                sum ++;
                Vector v = new Vector();
                v.add(rs.getString("id"));
                v.add(rs.getString("ho") +" "+ rs.getString("ten"));
                v.add(rs.getString("so_tai_khoan"));
                v.add(rs.getString("tinh_trang"));
                tb.addRow(v);
            }
            lb2.setText(sum + "");
            lb1.setText("Tổng số vay đã hoàn tất:");
            tb_kv.setModel(tb);
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    khoan_vay_model kvm;
    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        try {
            con = db.connect();
            Statement st = con.createStatement();
            int id = kvm.getId();
            String sql = "Delete from khoan_vay "
            + "where id = '"+id+"'";
            int r = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa khoản vay này không?", "Xác nhận", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(r == JOptionPane.YES_OPTION){
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Xóa thành công!!");
                con.close();
            }
            load_xoa();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_xoaActionPerformed
    
    private void tb_kvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_kvMouseClicked
        int i = tb_kv.getSelectedRow();
        if(cb_tt.getSelectedItem().toString() == "Hoàn tất"){
            btn_xoa.setVisible(true);
        }
        DefaultTableModel tb = (DefaultTableModel)tb_kv.getModel();
        int id = Integer.parseInt(tb.getValueAt(i, 0).toString());
        kvm = new khoan_vay_model();
        kvm.setId(id);
        try {
            txt_lv.setEditable(false);
            txt_stv.setEditable(false);
            txt_dt.setEditable(false);
            txt_cl.setEditable(false);
            txt_nbd.setEditable(false);
            txt_nkt.setEditable(false);
            txt_kh.setEditable(false);
            txt_stkv.setEditable(false);
            txt_lv.setEnabled(true);
            txt_stv.setEnabled(true);
            txt_dt.setEnabled(true);
            txt_cl.setEnabled(true);
            txt_nbd.setEnabled(true);
            txt_nkt.setEnabled(true);
            txt_kh.setEnabled(true);
            txt_stkv.setEnabled(true);
            String sql = "Select * from khoan_vay "
                + "where id = '"+id+"'";
            con = db.connect();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                txt_lv.setText(rs.getString("loai_vay"));
                txt_stv.setText(rs.getString("so_tien_vay"));
                txt_dt.setText(rs.getString("so_tien_da_tra"));
                txt_cl.setText(rs.getString("so_tien_con_lai"));
                txt_nbd.setText(rs.getString("ngay_bat_dau"));
                txt_nkt.setText(rs.getString("ngay_ket_thuc"));
                txt_kh.setText(rs.getString("ky_han"));
                txt_stkv.setText(tb.getValueAt(i, 1).toString());
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tb_kvMouseClicked

    private void cb_ttItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_ttItemStateChanged
        txt_lv.setText("");
        txt_stv.setText("");
        txt_dt.setText("");
        txt_cl.setText("");
        txt_nbd.setText("");
        txt_nkt.setText("");
        txt_kh.setText("");
        txt_stkv.setText("");
        String status = cb_tt.getSelectedItem().toString();
        String where = "";
        if (status == "Đang vay"){
            tk.setVisible(true);
            lb_tk.setVisible(true);
            lb1.setText("Tổng số vay đang vay:");
            where = "where kv.tinh_trang = 'dang_vay'";
        }
        else if(status == "Hoàn tất"){
            tk.setVisible(true);
            lb_tk.setVisible(true);
            lb1.setText("Tổng số vay đã hoàn tất:");
            where = "where kv.tinh_trang = 'hoan_tat'";
        }
        else if(status == "Quá hạn"){
            tk.setVisible(true);
            lb_tk.setVisible(true);
            lb1.setText("Tổng số vay quá hạn:");
            where = "where kv.tinh_trang = 'qua_han'";
        }
        else{
            tk.setVisible(false);
            lb_tk.setVisible(false);
            lb1.setVisible(false);
            lb2.setVisible(false);
            tb_kv.removeAll();
            return;
        }
        try {
            int sum = 0;
            lb1.setVisible(true);
            lb2.setVisible(true);
            tb_kv.removeAll();
            con = db.connect();
            String sql = "select * from khoan_vay kv "
                    + "join nguoi_dung nd on nd.id = kv.nguoi_dung_id "
                    + "join thong_tin_ca_nhan ttcn on ttcn.nguoi_dung_id = nd.id "
                    + where;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String[] td = {"ID", "Người vay", "STK vay", "Tình trạng"};
            DefaultTableModel tb = new DefaultTableModel(td, 0){
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false; // Không cho phép chỉnh sửa bất kỳ ô nào
                }
            };
            while(rs.next()){
                sum ++;
                Vector v = new Vector();
                v.add(rs.getString("id"));
                v.add(rs.getString("ho") +" "+ rs.getString("ten"));
                v.add(rs.getString("so_tai_khoan"));
                v.add(rs.getString("tinh_trang"));
                tb.addRow(v);
            }
            lb2.setText(sum + "");
            tb_kv.setModel(tb);
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cb_ttItemStateChanged

    private void tkKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tkKeyReleased

        try {
            con = db.connect();
            Statement st = con.createStatement();
            String tim = tk.getText().trim();
            String status = cb_tt.getSelectedItem().toString();
            String where = "";
            if (status == "Đang vay"){
                lb1.setText("Tổng số vay đang vay:");
                where = "where kv.tinh_trang = 'dang_vay' and "
                        + "ttcn.so_tai_khoan like '%"+tim+"%'";
            }
            else if(status == "Hoàn tất"){
                lb1.setText("Tổng số vay đã hoàn tất:");
                where = "where kv.tinh_trang = 'hoan_tat' and "
                        + "ttcn.so_tai_khoan like '%"+tim+"%'";
            }
            else if(status == "Quá hạn"){
                lb1.setText("Tổng số vay quá hạn:");
                where = "where kv.tinh_trang = 'qua_han' and "
                        + "ttcn.so_tai_khoan like '%"+tim+"%'";
            }
            else{
                return;
            }
            String sql = "select * from khoan_vay kv "
                    + "join nguoi_dung nd on nd.id = kv.nguoi_dung_id "
                    + "join thong_tin_ca_nhan ttcn on ttcn.nguoi_dung_id = nd.id "
                    + where;
            ResultSet rs = st.executeQuery(sql);
            String[] td = {"ID", "Người vay", "STK vay", "Tình trạng"};
            DefaultTableModel tb = new DefaultTableModel(td, 0){
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false; // Không cho phép chỉnh sửa bất kỳ ô nào
                }
            };
            int sum = 0;
            while(rs.next()){
                sum ++;
                Vector v = new Vector();
                v.add(rs.getString("id"));
                v.add(rs.getString("ho") +" "+ rs.getString("ten"));
                v.add(rs.getString("so_tai_khoan"));
                v.add(rs.getString("tinh_trang"));
                tb.addRow(v);
            }
            lb2.setText(sum + "");
            tb_kv.setModel(tb);
            con.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_tkKeyReleased

    private void tkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tkMouseClicked
        txt_lv.setText("");
        txt_stv.setText("");
        txt_dt.setText("");
        txt_cl.setText("");
        txt_nbd.setText("");
        txt_nkt.setText("");
        txt_kh.setText("");
        txt_stkv.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_tkMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_xoa;
    private javax.swing.JComboBox<String> cb_tt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb_tk;
    private javax.swing.JTable tb_kv;
    private javax.swing.JTextField tk;
    private javax.swing.JTextField txt_cl;
    private javax.swing.JTextField txt_dt;
    private javax.swing.JTextField txt_kh;
    private javax.swing.JTextField txt_lv;
    private javax.swing.JTextField txt_nbd;
    private javax.swing.JTextField txt_nkt;
    private javax.swing.JTextField txt_stkv;
    private javax.swing.JTextField txt_stv;
    // End of variables declaration//GEN-END:variables

    String getID() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
