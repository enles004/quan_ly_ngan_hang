/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.controllers.user;

import com.mycompany.db;
import com.mycompany.models.UserSession;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import com.mycompany.models.khoan_vay_model;
import java.text.DecimalFormat;

/**
 *
 * @author Admin
 */
public class quanly_tra_no extends javax.swing.JInternalFrame {
   

    /**
     * Creates new form quanly_tra_no
     */
    public quanly_tra_no() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        load_Tra_no();
    }
     Connection con;

    private void load_Tra_no() {
        try {
            tb_tra_no.removeAll();
            //b1:Ket noi Db
            con = db.connect();
            ////B2:Tạo đối tượng Statement để thực hiện câu lệnh truy vấn\
            String sql = "Select * From khoan_vay where nguoi_dung_id = '"+UserSession.getUserId()+"'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String[] tieude = {"ID", "Số tiền vay", "Số tiền trả", "Số tiền còn lại", "Kỳ hạn", "Loại khoản vay"};
            DefaultTableModel tb = new DefaultTableModel(tieude, 0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("id"));
                v.add(rs.getString("so_tien_vay"));
                v.add(rs.getString("so_tien_da_tra"));
                v.add(rs.getString("so_tien_con_lai"));
                v.add(rs.getString("ky_han"));
                v.add(rs.getString("loai_vay"));
                
                tb.addRow(v);

            }
            tb_tra_no.setModel(tb);
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public class tra_no extends quanly_vayy {
        private JTextField txtBanmuonvay;
        private JComboBox<String> Combo_Kyhan;
        private JComboBox<String> Combo_Khoanvay; 
        public tra_no() {
            // Khởi tạo giao diện và các components
            txtBanmuonvay = new JTextField();
            Combo_Kyhan = new JComboBox<>();
            Combo_Khoanvay =new JComboBox<>();
            
        }
        // Tạo getter cho txtBanmuonvay
        public String getSoTienVay() {
            return txtBanmuonvay.getText().trim();
        }
        public String getKyhan() {
            return Combo_Kyhan.getSelectedItem().toString();
        }
      public String getKhoanvay() {
            return Combo_Khoanvay.getSelectedItem().toString();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_tra_no = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtTai_khoan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        txtSo_tien_tra = new javax.swing.JTextField();
        btnThanhtoan = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        txtLai_phai_tra = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTong = new javax.swing.JTextField();
        btnXoa = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText(" TRẢ NỢ KHOẢN VAY");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tb_tra_no.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Số tiền vay", "Số tiền đã trả ", "Số tiền còn lại", "Kỳ hạn", "Khoản vay", "Trạng thái"
            }
        ));
        tb_tra_no.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_tra_noMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_tra_no);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel2.setText("Tài khoản nguồn trả nợ :");

        jLabel3.setText("Hình thức trả nợ:");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Trả nợ định kỳ");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Tất toán - đóng khoản vay");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jRadioButton2)
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel4.setText("Số tiền trả:");

        txtSo_tien_tra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSo_tien_traActionPerformed(evt);
            }
        });

        btnThanhtoan.setBackground(new java.awt.Color(204, 204, 204));
        btnThanhtoan.setText("Thanh toán");
        btnThanhtoan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnThanhtoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhtoanActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Tôi đồng ý với Quy định về các nội dung trong Hợp đồng và điều khoản điều kiện kèm theo. ");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Lãi phải trả:");

        jLabel7.setText("Tổng:");

        btnXoa.setBackground(new java.awt.Color(204, 204, 204));
        btnXoa.setText("Xóa");
        btnXoa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTai_khoan, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtTong, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                                .addComponent(txtLai_phai_tra, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSo_tien_tra, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTai_khoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSo_tien_tra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtLai_phai_tra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jCheckBox1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThanhtoan)
                    .addComponent(btnXoa))
                .addContainerGap(251, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(480, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSo_tien_traActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSo_tien_traActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSo_tien_traActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void btnThanhtoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhtoanActionPerformed
      // Lấy dữ liệu từ các components
    int nguoi_dung_id = UserSession.getUserId();
    
    tra_no frameVay = new tra_no(); 
    String so_tien_vay = frameVay.getSoTienVay();  // Gọi hàm getter
    String ky_han = frameVay.getKyhan();
    String loai_khoan = frameVay.getKhoanvay();   
    String so_tien_da_tra =txtTong.getText().trim();
    
    // B2: Kết nối DB
    try {
        con = db.connect();
        // B3: Tạo đối tượng PreparedStatement để thực hiện câu lệnh truy vấn             
        String sql = "INSERT INTO khoan_vay (nguoi_dung_id, so_tien_vay, so_tien_da_tra, so_tien_con_lai, ky_han,loai_vay, tinh_trang) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement st = con.prepareStatement(sql); 

            // Truyền giá trị cho các tham số ?
            st.setInt(1, nguoi_dung_id);
            st.setString(2, so_tien_vay);
            st.setString(3, so_tien_da_tra);
            st.setFloat(4, Float.parseFloat(frameVay.getSoTienVay()) - Float.parseFloat(txtTong.getText().trim()));
            st.setString(5, ky_han);
            st.setString(6, loai_khoan);  
            st.setString(7, "Đã thanh toán");
           st.executeUpdate();
           con.close();
           JOptionPane.showMessageDialog(this, "Thanh toán thành công");
           load_Tra_no();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
        

    }//GEN-LAST:event_btnThanhtoanActionPerformed
    khoan_vay_model a;
    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
    int id = a.getId();
    String sql = " Select * from khoan_vay "
            + "where id = '"+ id +"'";
         try {
             con = db.connect();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
           
            while(rs.next()){
                float kh = 1 ;               
                String ky_han=rs.getString("ky_han");
                if (ky_han.equals("3 tháng")){
                    kh=3;
                }else if(ky_han.equals("6 tháng")){
                    kh=6;
                }else if(ky_han.equals("12 tháng")){
                    kh=12;
                }
                double laisuat=0.00725;
                double sotienvay = rs.getFloat("so_tien_vay");    
                double sotientra = rs.getFloat("so_tien_vay")/kh;
                double laiphaitra =(float) (sotienvay *laisuat);
                double tongsotienphaitra = sotientra + laiphaitra;
                DecimalFormat df = new DecimalFormat("#,###.##");
                txtSo_tien_tra.setText(df.format(sotientra)+"");
                txtLai_phai_tra.setText(df.format(laiphaitra)+ "");
                txtTong.setText(df.format(tongsotienphaitra)+"");
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jRadioButton1MouseClicked

    private void tb_tra_noMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_tra_noMouseClicked
       int i = tb_tra_no.getSelectedRow();
        DefaultTableModel tb = (DefaultTableModel)tb_tra_no.getModel();
        int id = Integer.parseInt(tb.getValueAt(i, 0).toString());
        a = new khoan_vay_model();
        a.setId(id);
        String sql = "Select * from khoan_vay "
                + "join nguoi_dung on nguoi_dung.id = khoan_vay.nguoi_dung_id "
                + "join thong_tin_ca_nhan ttcn on ttcn.nguoi_dung_id = nguoi_dung.id "
                + "where khoan_vay.id = '"+id+"'";
        try {
             con = db.connect();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                txtTai_khoan.setText(rs.getString("so_tai_khoan"));
                
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
           
    }//GEN-LAST:event_tb_tra_noMouseClicked

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        int id = a.getId();
        String sql = " Select * from khoan_vay "
            + "where id = '"+ id +"'";
         try {
             con = db.connect();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                float kh = 1 ;
                String ky_han=rs.getString("ky_han");
               
                if (ky_han.equals("3 tháng")){
                    kh=3;
                }else if(ky_han.equals("6 tháng")){
                    kh=6;
                }else if(ky_han.equals("12 tháng")){
                    kh=12;
                }
                double laisuat=0.00725;
                double sotienvay = rs.getFloat("so_tien_vay");    
                double laiphaitra =(float) (sotienvay *laisuat)*kh;
                double tongsotienphaitra = sotienvay + laiphaitra;
                DecimalFormat df = new DecimalFormat("#,###.##");
                txtSo_tien_tra.setText(df.format(sotienvay)+"");
                txtLai_phai_tra.setText(df.format(laiphaitra)+ "");
                txtTong.setText(df.format(tongsotienphaitra)+"");
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jRadioButton2MouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
         try {
            //Lấy dữ liệu từ component đưa vào biến
            int id = a.getId();
            //B2:Keets noois DB
            con = db.connect();
            //B3:Tạo đối tượng Statement để thực hirnj câu lệnh
            String sql = "Delete From khoan_vay Where id='" + id + "'";
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            con.close();
            JOptionPane.showMessageDialog(this, "Xóa thành công");
            load_Tra_no();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnXoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThanhtoan;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_tra_no;
    private javax.swing.JTextField txtLai_phai_tra;
    private javax.swing.JTextField txtSo_tien_tra;
    private javax.swing.JTextField txtTai_khoan;
    private javax.swing.JTextField txtTong;
    // End of variables declaration//GEN-END:variables
}
