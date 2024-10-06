/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.controllers.user;

import com.mycompany.db;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HOA.HP
 */
public class Quan_li_the extends javax.swing.JInternalFrame {

    /**
     * Creates new form Quan_li_the
     */
    public Quan_li_the() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
     private void load_thongtin() throws ClassNotFoundException{
    Connection con = null;
        try {
////            Class.forName("com.mysql.cj.jdbc.Driver");
////            con=DriverManager.getConnection(url,user,pass);
            con = db.connect();
            String sql="Select * from thong_tin_ca_nhan";
            Statement st=con.createStatement();
            ResultSet rs =st.executeQuery(sql);
            String [] tieude={"id","nguoi_dung_id", "loai_the_id","so_the","ngay_het_han","trang_thai","ngay_tao"};
            DefaultTableModel tb= new DefaultTableModel(tieude,0);
            while(rs.next()){
                Vector v=new Vector();
                v.add(rs.getString("id"));
                v.add(rs.getString("nguoi_dung_id"));
                v.add(rs.getString("loai_the_id"));
                v.add(rs.getString("so_the"));
                v.add(rs.getString("ngay_het_han"));
                v.add(rs.getString("trang_thai"));
                v.add(rs.getString("ngay_tao"));
           
                tb.addRow(v);
            }
            tbthe.setModel(tb);
            con.close();
           
           
        }   catch(SQLException ex){
            ex.printStackTrace();
        
        }
    }
    
    
                  
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnguoidungid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnXuatExcel = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtBanmuonvay2 = new javax.swing.JTextField();
        txtBanmuonvay3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtloaitheid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtsothe = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ngayhethan = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        txttrangthai = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ngaytao = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbthe = new javax.swing.JTable();
        btndangkithemoi = new javax.swing.JButton();
        btnxoathe = new javax.swing.JButton();
        btntimkiemthe = new javax.swing.JButton();
        btnxemdanhsachthe = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(850, 600));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("QUẢN LÝ THẺ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setText("THÔNG TIN THẺ");

        jLabel8.setText("ID:");

        txtnguoidungid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnguoidungidActionPerformed(evt);
            }
        });

        jLabel9.setText("Kỳ hạn:");

        jLabel10.setText("Người dùng ID:");

        jLabel11.setText("Loại khoản vay:");

        btnThem.setBackground(new java.awt.Color(204, 204, 204));
        btnThem.setText("Gửi");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXuatExcel.setBackground(new java.awt.Color(204, 204, 204));
        btnXuatExcel.setText("Xuất file");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        jLabel13.setText("Loại thẻ ID:");

        txtBanmuonvay2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBanmuonvay2ActionPerformed(evt);
            }
        });

        txtBanmuonvay3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBanmuonvay3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Loại thẻ ID");

        txtloaitheid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtloaitheidActionPerformed(evt);
            }
        });

        jLabel3.setText("Số thẻ");

        txtsothe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsotheActionPerformed(evt);
            }
        });

        jLabel4.setText("Ngày hết hạn");

        jLabel5.setText("Trạng thái");

        jLabel6.setText("Ngày tạo");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThem)
                        .addGap(39, 39, 39)
                        .addComponent(btnXuatExcel)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(276, 276, 276))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(252, 252, 252))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBanmuonvay2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(txtnguoidungid, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtloaitheid, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(ngayhethan, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                    .addComponent(txttrangthai)
                                    .addComponent(ngaytao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(jLabel12))
                            .addComponent(txtsothe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(txtBanmuonvay3, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(384, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ngayhethan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel5))
                .addGap(2, 2, 2)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnguoidungid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttrangthai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(8, 8, 8)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtloaitheid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ngaytao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtsothe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBanmuonvay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXuatExcel)
                    .addComponent(jLabel9))
                .addGap(22, 22, 22))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addContainerGap(248, Short.MAX_VALUE)
                    .addComponent(txtBanmuonvay3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(194, 194, 194)))
        );

        tbthe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Người dùng ID", "Loại thẻ ID", "Số thẻ", "Ngày hết hạn", "Trạng thái", "Ngày tạo"
            }
        ));
        tbthe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbtheMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbthe);

        btndangkithemoi.setText("Đăng kí thẻ mới");
        btndangkithemoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndangkithemoiActionPerformed(evt);
            }
        });

        btnxoathe.setText("Xóa thẻ");
        btnxoathe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoatheActionPerformed(evt);
            }
        });

        btntimkiemthe.setText("Tìm kiếm thẻ");
        btntimkiemthe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimkiemtheActionPerformed(evt);
            }
        });

        btnxemdanhsachthe.setText("Xem danh sách thẻ");
        btnxemdanhsachthe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxemdanhsachtheActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btndangkithemoi)
                .addGap(55, 55, 55)
                .addComponent(btnxoathe)
                .addGap(69, 69, 69)
                .addComponent(btntimkiemthe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btnxemdanhsachthe)
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndangkithemoi)
                    .addComponent(btnxoathe)
                    .addComponent(btntimkiemthe)
                    .addComponent(btnxemdanhsachthe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed

       //lấy dữ liệu từ các componens đưa vào biến
        // lay dl tu componenment dua vao bien
        String id = txtID.getText().trim();
        String nguoidungid = txtnguoidungid.getText().trim();
        String loai_the_id= txtloaitheid.getText().trim();
        String sothe= txtsothe.getText().trim();
        Date ngay_het_han= new Date (ngayhethan.getDate().getTime());
        String trangthai=txttrangthai.getText().trim();
        Date ngay_tao= new Date (ngaytao.getDate().getTime());
        //ket noi database
        Connection con = null;
        try {
            //            Class.forName("com.mysql.cj.jdbc.Driver");
            //            con=DriverManager.getConnection(url,user,pass);

            con = db.connect();
            //            String sql="Insert Tacgia(Matacgia, Tentacgia,NgaySinh, Gioitinh,Dienthoai, Email, Diachi) Values('"+mtg+"',N'"+ttg+"','"+ngs+"',N'"+gt+"',"+"'"+dt+"','"+email+"',N'"+dc+"')";
            //            Statement st=con.createStatement();
            String sql="Insert into the_nguoi_dung Values(?,?,?,?,?,?,?)";
            PreparedStatement st=con.prepareStatement(sql);
            st.setString(0,id);
            st.setString(1,nguoidungid);
            st.setString(2,loai_the_id);
            st.setString(3,sothe);
            st.setDate(4,ngay_het_han);
            st.setString(5,trangthai);
            st.setDate(4,ngay_tao);
            st.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(this,"Them the moi thanh cong");
            load_thongtin();
        }   catch(SQLException ex){
            ex.printStackTrace();

        } catch (ClassNotFoundException ex) {Logger.getLogger(Quanlithongtincanhan.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btnThemActionPerformed

    private void txtnguoidungidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnguoidungidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnguoidungidActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtBanmuonvay2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBanmuonvay2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBanmuonvay2ActionPerformed

    private void txtBanmuonvay3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBanmuonvay3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBanmuonvay3ActionPerformed

    private void txtloaitheidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtloaitheidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtloaitheidActionPerformed

    private void txtsotheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsotheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsotheActionPerformed

    private void btndangkithemoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndangkithemoiActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btndangkithemoiActionPerformed

    private void tbtheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbtheMouseClicked
        // TODO add your handling code here:
         int i=tbthe.getSelectedRow();
        DefaultTableModel tb=(DefaultTableModel) tbthe.getModel();
        txtID.setText(tb.getValueAt(i,0).toString());
        txtnguoidungid.setText(tb.getValueAt(i,1).toString());
        txtloaitheid.setText(tb.getValueAt(i,2).toString());
        txtsothe.setText(tb.getValueAt(i,3).toString());
        String ngay_het_han=tb.getValueAt(i, 4).toString();
        java.util.Date ngayhet;
        try{
            ngayhet=new SimpleDateFormat("yyyy-MM-dd").parse(ngay_het_han);
            ngayhethan.setDate(ngayhet);
        } catch(Exception ex){
            ex.printStackTrace();
        }
         txttrangthai.setText(tb.getValueAt(i,5).toString());
        String ngay_tao=tb.getValueAt(i, 6).toString();
        java.util.Date ngtao;
        try{
            ngtao=new SimpleDateFormat("yyyy-MM-dd").parse(ngay_tao);
            ngaytao.setDate(ngtao);
        } catch(Exception ex){
            ex.printStackTrace();
        }
         txtID.setEnabled(false);
    }//GEN-LAST:event_tbtheMouseClicked

    private void btnxoatheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoatheActionPerformed
        // TODO add your handling code here:
        try{
            // b1: lay du lieu tu componet dua vao bien
            String id=txtID.getText();
            Connection con = null;
            //b2:Ket noi DB
            con=db.connect();
            //b3:tao doi tuong Statement de thuc hien cau lenh xoa
            String sql="Delete From the_nguoi_dung Where id='"+id+"'";
            Statement st=con.createStatement();
            st.executeUpdate(sql);
            con.close();
            JOptionPane.showMessageDialog(this,"xoa thanh cong!");
            load_thongtin();
        } catch(SQLException ex){
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Quanlithongtincanhan.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnxoatheActionPerformed

    private void btntimkiemtheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimkiemtheActionPerformed
        // TODO add your handling code here:
         try {
            //b1: lấy dữ liệu đưa vào biến
                String id = txtID.getText().trim();
                String nguoidungid = txtnguoidungid.getText().trim();
                String loai_the_id= txtloaitheid.getText().trim();
//                String sothe= txtsothe.getText().trim();
//                Date ngay_het_han= new Date (ngayhethan.getDate().getTime());
//                String trangthai=txttrangthai.getText().trim();
//                Date ngay_tao= new Date (ngaytao.getDate().getTime());
            //b2: kết nối DB
            Connection con = null;
            con = db.connect();
            //b3: tạo đối tượng statement TH truy vấn
            String sql="Select * From the_nguoi_dung Where id like '%"+id+"%' and nguoi_dung_id like N'%"+nguoidungid+"%' and loai_the_id like N'%"+loai_the_id+"%'";
            Statement st = con.createStatement();
            ResultSet rs =st.executeQuery(sql);
            String [] tieude={"id", "nguoi_dung_id","loai_the_id","so_the","ngay_het_han","trang_thai","ngay_tao"};
            DefaultTableModel tb= new DefaultTableModel(tieude,0);
            while(rs.next()){
                Vector v=new Vector();
                v.add(rs.getString("id"));
                v.add(rs.getString("nguoi_dung_id"));
                v.add(rs.getString("loai_the_id"));
                v.add(rs.getString("so_the"));
                v.add(rs.getString("ngay_het_han"));
                v.add(rs.getString("trang_thai"));
                v.add(rs.getString("ngay_tao"));
           
                tb.addRow(v);
            }
            tbthe.setModel(tb);
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btntimkiemtheActionPerformed

    private void btnxemdanhsachtheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxemdanhsachtheActionPerformed
        // TODO add your handling code here:
                                                   
    try {
        // Kết nối cơ sở dữ liệu
        Connection con = db.connect();

        // Câu lệnh SQL để lấy toàn bộ dữ liệu từ bảng the_nguoi_dung
        String sql = "SELECT * FROM the_nguoi_dung";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);

        // Tiêu đề các cột của bảng
        String[] tieude = {"ID", "Người dùng ID", "Loại thẻ ID", "Số thẻ", "Ngày hết hạn", "Trạng thái", "Ngày tạo"};
        DefaultTableModel tb = new DefaultTableModel(tieude, 0);

        // Duyệt qua kết quả truy vấn và thêm vào mô hình bảng
        while (rs.next()) {
            Vector<String> v = new Vector<>();
            v.add(rs.getString("id"));
            v.add(rs.getString("nguoi_dung_id"));
            v.add(rs.getString("loai_the_id"));
            v.add(rs.getString("so_the"));
            v.add(rs.getString("ngay_het_han"));
            v.add(rs.getString("trang_thai"));
            v.add(rs.getString("ngay_tao"));

            tb.addRow(v);
        }

        // Hiển thị dữ liệu lên bảng 
        tbthe.setModel(tb);

        // Đóng kết nối
        con.close();

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi khi tải danh sách thẻ.");
    }


    }//GEN-LAST:event_btnxemdanhsachtheActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXuatExcel;
    private javax.swing.JButton btndangkithemoi;
    private javax.swing.JButton btntimkiemthe;
    private javax.swing.JButton btnxemdanhsachthe;
    private javax.swing.JButton btnxoathe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser ngayhethan;
    private com.toedter.calendar.JDateChooser ngaytao;
    private javax.swing.JTable tbthe;
    private javax.swing.JTextField txtBanmuonvay2;
    private javax.swing.JTextField txtBanmuonvay3;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtloaitheid;
    private javax.swing.JTextField txtnguoidungid;
    private javax.swing.JTextField txtsothe;
    private javax.swing.JTextField txttrangthai;
    // End of variables declaration//GEN-END:variables
}