/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.controllers.admin;

import com.mycompany.db;
import com.mycompany.models.AccountGenerator;
import com.mycompany.models.tai_khoan_nguoi_dung_model;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
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
public class tai_khoan extends javax.swing.JInternalFrame {

    /**
     * Creates new form tai_khoan
     */
    public tai_khoan() {
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

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_nd = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        sum_nd = new javax.swing.JLabel();
        txt_tk = new javax.swing.JTextField();
        tk = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jstk = new javax.swing.JLabel();
        jsd = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jnt = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jht = new javax.swing.JLabel();
        stk = new javax.swing.JTextField();
        sd = new javax.swing.JTextField();
        ltk = new javax.swing.JComboBox<>();
        nt = new javax.swing.JTextField();
        sdt = new javax.swing.JTextField();
        ht = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btn_them = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        nhap = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 699));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setMaximumSize(new java.awt.Dimension(454, 404));

        tb_nd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tb_nd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb_nd.setMinimumSize(new java.awt.Dimension(0, 0));
        tb_nd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_ndMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_nd);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jPanel5.setBackground(new java.awt.Color(255, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setMaximumSize(new java.awt.Dimension(635, 48));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ THÔNG TIN CÁ NHÂN NGƯỜI DÙNG");

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Tổng số tài khoản người dùng:");

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
                .addGap(10, 10, 10)
                .addComponent(sum_nd, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(txt_tk, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tk, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_tk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sum_nd)
                        .addComponent(jLabel2))
                    .addComponent(tk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jstk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jstk.setText("STK:");

        jsd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jsd.setText("Số dư:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Loại tài khoản:");

        jnt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jnt.setText("Ngày tạo:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Số điện thoại:");

        jht.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jht.setText("Họ và tên:");

        ltk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Chọn tài khoản-", "Tài khoản giao dịch", "Tài khoản vay", "Tài khoản tiết kiệm", " " }));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        nhap.setText("Nhập");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_xoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(nhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jstk, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stk, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sd, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ltk, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ht, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jht, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sdt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jnt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nt, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jsd, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jstk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jht)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ht, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ltk, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jsd))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jnt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private void load(){
        ltk.setSelectedItem(" ");
        sdt.setText("");
        ltk.setEnabled(false);
        sdt.setEnabled(false);
        ht.setVisible(false);
        nt.setVisible(false);
        sd.setVisible(false);
        stk.setVisible(false);
        jht.setVisible(false);
        jstk.setVisible(false);
        jnt.setVisible(false);
        jsd.setVisible(false);
        btn_xoa.setVisible(false);
        try {
            tb_nd.removeAll();
            con = db.connect();
            String sql = "select * "
                    + "from tai_khoan_nguoi_dung tknd "
                    + "join nguoi_dung nd on tknd.so_dien_thoai_id = nd.so_dien_thoai "
                    + "order by tknd.so_dien_thoai_id";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String[] td = {"ID", "Họ và tên", "Số điện thoại", "Loại tài khoản", "Số tài khoản", "Số dư", "Ngày tạo"};
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
                v.add(rs.getString("ho") + " " + rs.getString("ten"));
                v.add(rs.getString("so_dien_thoai"));
                v.add(rs.getString("loai_tai_khoan"));
                v.add(rs.getString("so_tai_khoan"));
                v.add(rs.getString("so_tien_hien_co"));
                v.add(rs.getString("ngay_tao"));
                tb.addRow(v);
            }
            sum_nd.setText(sum + "");
            tb_nd.setModel(tb);
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    tai_khoan_nguoi_dung_model tknd;
    private void tb_ndMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_ndMouseClicked
        int i = tb_nd.getSelectedRow();
        sdt.setEnabled(true);
        btn_xoa.setVisible(true);
        stk.setEditable(false);
        stk.setVisible(true);
        jstk.setVisible(true);
        sd.setEditable(false);
        sd.setVisible(true);
        jsd.setVisible(true);
        ltk.setEditable(false);
        nt.setEditable(false);
        nt.setVisible(true);
        jnt.setVisible(true);
        sdt.setEditable(false);
        ht.setEditable(false);
        ht.setVisible(true);
        jht.setVisible(true);
        DefaultTableModel tb = (DefaultTableModel)tb_nd.getModel();
        stk.setText(tb.getValueAt(i, 4).toString());
        sd.setText(tb.getValueAt(i, 5).toString());
        ltk.setSelectedItem(tb.getValueAt(i, 3).toString());
        nt.setText(tb.getValueAt(i, 6).toString());
        sdt.setText(tb.getValueAt(i, 2).toString());
        ht.setText(tb.getValueAt(i, 1).toString());
        tknd = new tai_khoan_nguoi_dung_model();
        tknd.setId(Integer.parseInt(tb.getValueAt(i, 0).toString()));
    }//GEN-LAST:event_tb_ndMouseClicked

    private void txt_tkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_tkMouseClicked
        stk.setText("");
        sd.setText("");
        ltk.setSelectedItem(" ");
        nt.setText("");
        sdt.setText("");
        ht.setText("");
        stk.setVisible(false);
        sd.setVisible(false);
        ltk.setEnabled(false);
        nt.setVisible(false);
        sdt.setEnabled(false);
        ht.setVisible(false);
        btn_xoa.setVisible(false);
    }//GEN-LAST:event_txt_tkMouseClicked
    boolean check = false;
    private void txt_tkKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tkKeyReleased
        try {
            con = db.connect();
            Statement st = con.createStatement();
            String tim = txt_tk.getText().trim();
            String sql = "select * "
            + "from tai_khoan_nguoi_dung "
            + "where so_dien_thoai_id like '"+tim+"%' or so_tai_khoan like '"+tim+"%'";
            ResultSet rs = st.executeQuery(sql);
            String[] td = {"ID", "Họ và tên", "Số điện thoại", "Loại tài khoản", "Số tài khoản", "Số dư", "Ngày tạo"};
            DefaultTableModel tb = new DefaultTableModel(td, 0){
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false; 
                }
            };
            while(rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("id"));
                v.add(rs.getString("ho") + " " + rs.getString("ten"));
                v.add(rs.getString("so_dien_thoai"));
                v.add(rs.getString("loai_tai_khoan"));
                v.add(rs.getString("so_tai_khoan"));
                v.add(rs.getString("so_tien_hien_co"));
                v.add(rs.getString("ngay_tao"));
                tb.addRow(v);
            }
            tb_nd.setModel(tb);
            con.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_txt_tkKeyReleased

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        btn_xoa.setVisible(false);
        if(check == true){
            stk.setVisible(true);
            sd.setVisible(true);
            ltk.setSelectedItem(" ");
            nt.setVisible(true);
            sdt.setText("");
            ht.setVisible(true);
            check = false;
            return;
        }
        if(!ltk.isEnabled()){
            ltk.setEnabled(true);
            sdt.setEnabled(true);
            return;
        }
        try {
            con = db.connect();
            Statement st = con.createStatement();
            String loai_tai_khoan = ltk.getSelectedItem().toString();
            if(loai_tai_khoan.equals("-Chọn tài khoản-")){
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn loại tài khoản.");
                return;
            }
            String so_dien_thoai = sdt.getText().trim();
            if(so_dien_thoai.isEmpty()){
                JOptionPane.showMessageDialog(this, "Số điện thoại không được để trống.");
                return;
            }
            String checkk = "select * from nguoi_dung where so_dien_thoai = '"+so_dien_thoai+"'";
            ResultSet rs = st.executeQuery(checkk);
            while(rs.next()){
                String sql = "insert into tai_khoan_nguoi_dung (so_dien_thoai_id, loai_tai_khoan, so_tai_khoan, so_tien_hien_co, ngay_tao)"
                + "values ('"+so_dien_thoai+"', N'"+loai_tai_khoan+"', '"+AccountGenerator.generateUniqueAccountNumber(con)+"', '"+0+"', getdate())";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Thêm tài khoản người dùng mới thành công.");
                load();
                return;
            }
            JOptionPane.showMessageDialog(this, "Người dùng chưa được đăng ký thông tin, hãy đăng ký thông tin và quay lại sau.");
            load();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        try {
            con = db.connect();
            Statement st = con.createStatement();
            String sql = "Delete from tai_khoan_nguoi_dung "
            + "where id = '"+tknd.getId()+"'";
            int r = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa tài khoản người dùng này không?", "Xác nhận", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(r == JOptionPane.YES_OPTION){
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Xóa thành công!!");
                con.close();
            }
            load();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_xoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JTextField ht;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jht;
    private javax.swing.JLabel jnt;
    private javax.swing.JLabel jsd;
    private javax.swing.JLabel jstk;
    private javax.swing.JComboBox<String> ltk;
    private javax.swing.JButton nhap;
    private javax.swing.JTextField nt;
    private javax.swing.JTextField sd;
    private javax.swing.JTextField sdt;
    private javax.swing.JTextField stk;
    private javax.swing.JLabel sum_nd;
    private javax.swing.JTable tb_nd;
    private javax.swing.JLabel tk;
    private javax.swing.JTextField txt_tk;
    // End of variables declaration//GEN-END:variables
}
