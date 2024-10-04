/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.controllers.user;

import com.mycompany.db;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class quanly_vayy extends javax.swing.JInternalFrame {

    /**
     * Creates new form quanly_vayy
     */
    public quanly_vayy() {
        initComponents();
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        load();
    }
    
    Connection con; 
    private void load(){
        try {
            tb_vv.removeAll();
            con = db.connect();
            String sql = " SELECT * from khoan_vay kv "
                    +"join nguoi_dung nd on kv.nguoi_dung_id = nd.id";

                    
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String[] td = {"Vay số tiền","Kỳ hạn","Loại khoản vay"};
            DefaultTableModel tb = new DefaultTableModel(td, 0);
            while(rs.next()){
                Vector v = new Vector();
               
                v.add(rs.getString("so_tien_vay"));
                v.add(rs.getString("ky_han"));
                v.add(rs.getString("loai_vay"));
                tb.addRow(v);
            }
           
            tb_vv.setModel(tb);
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtBanmuonvay = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Combo_Kyhan = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Combo_Khoanvay = new javax.swing.JComboBox<>();
        btnThem = new javax.swing.JButton();
        btnXuatExcel = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_vv = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(640, 550));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("QUẢN LÝ KHOẢN VAY");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(180, 180, 180)
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
        jLabel7.setText("THÔNG TIN NHU CẦU VAY");

        jLabel8.setText("Bạn muốn vay:");

        jLabel9.setText("Kỳ hạn:");

        Combo_Kyhan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Chọn kỳ hạn--", "3 tháng", "6 tháng", "12 tháng" }));

        jLabel10.setText("Lãi suất:");

        jLabel11.setText("Loại khoản vay:");

        Combo_Khoanvay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Chọn loại khoản vay--", "Vay tín dụng", "Vay thế chấp", "Vay tiêu dùng", "Vay kinh doanh" }));

        btnThem.setBackground(new java.awt.Color(204, 204, 204));
        btnThem.setText("Gửi");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXuatExcel.setBackground(new java.awt.Color(204, 204, 204));
        btnXuatExcel.setText("Xuất file");

        jLabel12.setText("0,87%");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(49, 49, 49)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Combo_Kyhan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(txtBanmuonvay, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Combo_Khoanvay, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 88, Short.MAX_VALUE)))
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThem)
                .addGap(39, 39, 39)
                .addComponent(btnXuatExcel)
                .addGap(20, 20, 20))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBanmuonvay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Combo_Kyhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Combo_Khoanvay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXuatExcel))
                .addGap(22, 22, 22))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tb_vv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Vay số tiền", "Kỳ hạn", "Loại khoản vay", "Trạng thái"
            }
        ));
        jScrollPane1.setViewportView(tb_vv);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 269, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(198, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
    private void load_combobox() {
        // Khởi tạo ComboBox cho Kỳ hạn
        String[] kyHanValues = {"6 tháng", "12 tháng", "24 tháng", "36 tháng"};
        Combo_Kyhan = new JComboBox<>(kyHanValues);

        // Khởi tạo ComboBox cho Loại khoản vay
        String[] loaiVayValues = {"Vay tín chấp", "Vay thế chấp", "Vay tiêu dùng"};
        Combo_Khoanvay = new JComboBox<>(loaiVayValues);
    }
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
                                              
    // Lấy dữ liệu từ các components
    int nguoi_dung_id =1;
    float so_tien_da_tra =0;
    float so_tien_con_lai= Float.parseFloat(txtBanmuonvay.getText().trim());
    String so_tien_vay = txtBanmuonvay.getText().trim();
    String ky_han = Combo_Kyhan.getSelectedItem().toString();
    int kh=0;
    if (ky_han == "3 tháng"){
        kh=3;
    }else if(ky_han == "6 tháng"){
        kh=6;
    }else if(ky_han == "12 tháng"){
        kh=12;
    }
    String loai_vay = Combo_Khoanvay.getSelectedItem().toString();

    // B2: Kết nối DB
    try {
        con = db.connect();

        // B3: Tạo đối tượng PreparedStatement để thực hiện câu lệnh truy vấn
        
                     
        String sql = "INSERT INTO khoan_vay (nguoi_dung_id, loai_vay, so_tien_vay, so_tien_da_tra, so_tien_con_lai, ngay_bat_dau, ngay_ket_thuc, ky_han, tinh_trang) "
                + "VALUES (?, ?, ?, ?, ?, getdate(), dateadd(month, ?, getdate()), ?, ?)";

            PreparedStatement st = con.prepareStatement(sql); 

            // Truyền giá trị cho các tham số ?
            st.setInt(1, nguoi_dung_id);
            st.setString(2, loai_vay);
            st.setString(3, so_tien_vay);
            st.setFloat(4, so_tien_da_tra);
            st.setFloat(5, so_tien_con_lai);
            st.setInt(6, kh);  // Giá trị số tháng (ví dụ: 6 tháng)
            st.setString(7, ky_han);
            st.setString(8, "Đang vay");
           st.executeUpdate();
           con.close();
           JOptionPane.showMessageDialog(this, "Gửi thành công");
           load();
    } catch (Exception ex) {
        ex.printStackTrace();
    }


    }//GEN-LAST:event_btnThemActionPerformed
    public static void main(String args[]) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quanly_vayy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combo_Khoanvay;
    private javax.swing.JComboBox<String> Combo_Kyhan;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXuatExcel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_vv;
    private javax.swing.JTextField txtBanmuonvay;
    // End of variables declaration//GEN-END:variables
}
