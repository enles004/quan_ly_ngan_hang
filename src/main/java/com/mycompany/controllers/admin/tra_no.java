/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.controllers.admin;

import com.mycompany.controllers.user.quanly_vayy;
import com.mycompany.db;
import com.mycompany.models.UserSession;
import com.mycompany.models.khoan_vay_model;
import com.mycompany.models.tai_khoan_nguoi_dung_model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class tra_no extends javax.swing.JInternalFrame {

    /**
     * Creates new form tra_no
     */
    public tra_no() {
       initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        load_Tra_no();
        
    }
    Connection con;
    private void load_Tra_no() {
        txtSotaikhoan.setText("");
        txtLai_phai_tra.setText("");
        txtSo_tien_tra.setText("");
        txtTong.setText("");

        txtHo.setEnabled(false);
        txtTen.setEnabled(false);
        txtSodt.setEnabled(false);
        txtCancuoc.setEnabled(false);
        txtDiachi.setEnabled(false);
        dateNgaysinh.setEnabled(false);
        try {
            tb_tra_no.removeAll();
            //b1:Ket noi Db
            con = db.connect();
            ////B2:Tạo đối tượng Statement để thực hiện câu lệnh truy vấn\
           String sql = " SELECT * from khoan_vay kv "
                    + "join tai_khoan_nguoi_dung tknd on tknd.so_tai_khoan = kv.so_tai_khoan_id "
                    + "join nguoi_dung nd on nd.so_dien_thoai = tknd.so_dien_thoai_id ";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String[] td = {"ID","Họ","Tên","Số điện thoại","Địa chỉ","Ngày sinh","Số CCCD ","Số tài khoản" ,"Số tiền vay", "Số tiền trả", "Số tiền còn lại", "Kỳ hạn", "Loại khoản vay","Trạng thái"};
            DefaultTableModel tb = new DefaultTableModel(td, 0){
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false; // Không cho phép chỉnh sửa bất kỳ ô nào
                }
            };
            while (rs.next()) {
                Vector v = new Vector();
                
                v.add(rs.getString("id"));
                v.add(rs.getString("ho"));
                v.add(rs.getString("ten"));
                v.add(rs.getString("so_dien_thoai"));
                v.add(rs.getString("dia_chi"));
                v.add(rs.getString("ngay_sinh"));
                v.add(rs.getString("so_cong_dan"));
                v.add(rs.getString("so_tai_khoan_id"));
                v.add(rs.getString("so_tien_vay"));
                v.add(rs.getString("so_tien_da_tra"));
                v.add(rs.getString("so_tien_con_lai"));
                v.add(rs.getString("ky_han"));
                v.add(rs.getString("loai_vay"));
                v.add(rs.getString("tinh_trang"));
                
                tb.addRow(v);

            }
            tb_tra_no.setModel(tb);
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public class tra_noo extends vay_vonn {
        private JTextField txtBanmuonvay;
        private JComboBox<String> Combo_Kyhan;
        private JComboBox<String> Combo_Khoanvay; 
        public tra_noo() {
            // Khởi tạo giao diện và các components
            txtBanmuonvay = new JTextField();
            Combo_Kyhan = new JComboBox<>();
            Combo_Khoanvay =new JComboBox<>();
            
        Combo_Kyhan.addItem("3 tháng");
        Combo_Kyhan.addItem("6 tháng");
        Combo_Kyhan.addItem("12 tháng");
        Combo_Kyhan.addItem("15 tháng");
        Combo_Kyhan.addItem("18 tháng");
        Combo_Kyhan.addItem("24 tháng");

        
        Combo_Khoanvay.addItem("Vay tiêu dùng");
        Combo_Khoanvay.addItem("Vay thế chấp");
        Combo_Khoanvay.addItem("Vay tín dụng");
        Combo_Khoanvay.addItem("Vay kinh doanh"); 
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
    
    private void load_xoa(){
        txtHo.setText("");
        txtTen.setText("");
        txtDiachi.setText("");
        txtSodt.setText("");
        txtSotaikhoan.setText("");
        txtCancuoc.setText("");
        txtLai_phai_tra.setText("");
        txtSo_tien_tra.setText("");
        txtTong.setText("");
        dateNgaysinh.setDateFormatString("dd/MM/yyyy");
        
        txtHo.setEnabled(false);
        txtCancuoc.setEnabled(false);
        txtDiachi.setEnabled(false);
        txtTen.setEnabled(false);
        txtLai_phai_tra.setEnabled(false);
        txtSo_tien_tra.setEnabled(false);
        txtSotaikhoan.setEnabled(false);
        txtTong.setEnabled(false);
        dateNgaysinh.setEnabled(false);
        btnXoa.setVisible(false);
        tb_tra_no.removeAll();
        try {
           
            tb_tra_no.removeAll();
            con = db.connect();
            String sql = " SELECT * from khoan_vay kv "
                    + "join tai_khoan_nguoi_dung tknd on tknd.so_tai_khoan = kv.so_tai_khoan_id "
                    + "join nguoi_dung nd on nd.so_dien_thoai = tknd.so_dien_thoai_id "
                    + "where kv.tinh_trang = 'Đã thanh toán'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String[] td = {"ID","Họ","Tên","Số điện thoại","Địa chỉ","Ngày sinh","Số CCCD ","Số tài khoản" ,"Số tiền vay", "Số tiền trả", "Số tiền còn lại", "Kỳ hạn", "Loại khoản vay","Trạng thái"};
            DefaultTableModel tb = new DefaultTableModel(td, 0){
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false; // Không cho phép chỉnh sửa bất kỳ ô nào
                }
            };
            while(rs.next()){
                
                Vector v = new Vector();
                v.add(rs.getString("id"));
                v.add(rs.getString("ho"));
                v.add(rs.getString("ten"));
                v.add(rs.getString("so_dien_thoai"));
                v.add(rs.getString("dia_chi"));
                v.add(rs.getString("ngay_sinh"));
                v.add(rs.getString("so_cong_dan"));
                v.add(rs.getString("so_tai_khoan_id"));
                v.add(rs.getString("so_tien_vay"));
                v.add(rs.getString("so_tien_da_tra"));
                v.add(rs.getString("so_tien_con_lai"));
                v.add(rs.getString("ky_han"));
                v.add(rs.getString("loai_vay"));
                v.add(rs.getString("tinh_trang"));
                tb.addRow(v);
            }
            

            tb_tra_no.setModel(tb);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_tra_no = new javax.swing.JTable();
        jCheckBox1 = new javax.swing.JCheckBox();
        btnXoa = new javax.swing.JButton();
        txtSo_tien_tra = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnThanhtoan = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTong = new javax.swing.JTextField();
        txtLai_phai_tra = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSotaikhoan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtHo = new javax.swing.JTextField();
        txtSodt = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtDiachi = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        dateNgaysinh = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        txtCancuoc = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText(" TRẢ NỢ KHOẢN VAY");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(256, 256, 256))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tb_tra_no.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Họ", "Tên", "Số điện thoại", "Địa chỉ", "Ngày sinh", "Số CCCD", "Số tiền vay", "Số tiền đã trả ", "Số tiền còn lại", "Kỳ hạn", "Khoản vay", "Trạng thái"
            }
        ));
        tb_tra_no.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_tra_noMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_tra_no);

        jCheckBox1.setText("Tôi đồng ý với Quy định về các nội dung trong Hợp đồng và điều khoản điều kiện kèm theo. ");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(204, 204, 204));
        btnXoa.setText("Xóa");
        btnXoa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        txtSo_tien_tra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSo_tien_traActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Tổng:");

        btnThanhtoan.setBackground(new java.awt.Color(204, 204, 204));
        btnThanhtoan.setText("Thanh toán");
        btnThanhtoan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnThanhtoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhtoanActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Số tiền trả:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Lãi phải trả:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Hình thức trả nợ:");

        txtSotaikhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSotaikhoanMouseClicked(evt);
            }
        });
        txtSotaikhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSotaikhoanActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Tài khoản nguồn trả nợ :");

        jRadioButton1.setText("Trả nợ định kỳ");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });

        jRadioButton2.setText("Tất toán - đóng khoản vay");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Họ:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Tên:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Số điện thoại:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Địa chỉ:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Ngày sinh:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Số CCCD:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dateNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(txtHo))
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12))
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jRadioButton1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jRadioButton2))
                                .addComponent(txtSo_tien_tra, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtLai_phai_tra, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTong, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSotaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCancuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(155, 155, 155))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(81, 81, 81)
                        .addComponent(txtSodt, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtHo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(dateNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtSodt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCancuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSotaikhoan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jRadioButton2))
                    .addComponent(jLabel3))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSo_tien_tra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtLai_phai_tra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThanhtoan)
                    .addComponent(btnXoa))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    tai_khoan_nguoi_dung_model tknd;
    private void tb_tra_noMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_tra_noMouseClicked
        int i = tb_tra_no.getSelectedRow();
        txtHo.setEditable(false);
        txtHo.setVisible(true);
        txtTen.setEditable(false);
        txtTen.setVisible(true);
        txtSodt.setEditable(false);
        txtSodt.setEnabled(true);
        txtDiachi.setVisible(true);
        txtDiachi.setEditable(false);
        dateNgaysinh.setVisible(true);
        txtCancuoc.setVisible(true);
        txtCancuoc.setEditable(false);
        txtSotaikhoan.setVisible(true);
        txtSotaikhoan.setEditable(false);
        txtLai_phai_tra.setEditable(false);
        txtLai_phai_tra.setVisible(true);
        txtTong.setEditable(false);
        txtTong.setVisible(true);
       
        
        
        DefaultTableModel tb = (DefaultTableModel)tb_tra_no.getModel();
        txtHo.setText(tb.getValueAt(i, 1).toString());
        txtTen.setText(tb.getValueAt(i, 2).toString());
        txtSodt.setText(tb.getValueAt(i, 3).toString());
        txtDiachi.setText(tb.getValueAt(i, 4).toString());
        String ngay = tb.getValueAt(i, 5).toString();
        java.util.Date ngs;
        try {
            ngs = new SimpleDateFormat("yyyy-MM-dd").parse(ngay);
            dateNgaysinh.setDate(ngs);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
       
        txtCancuoc.setText(tb.getValueAt(i, 6).toString());
        txtSotaikhoan.setText(tb.getValueAt(i, 7).toString());
        
        tknd = new tai_khoan_nguoi_dung_model();
        tknd.setId(Integer.parseInt(tb.getValueAt(i, 0).toString()));
        
    }//GEN-LAST:event_tb_tra_noMouseClicked

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
        
        String sql = " SELECT * from khoan_vay kv "
                    + "join tai_khoan_nguoi_dung tknd on tknd.so_tai_khoan = kv.so_tai_khoan_id "
                    + "join nguoi_dung nd on nd.so_dien_thoai = tknd.so_dien_thoai_id ";
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
                }else if(ky_han.equals("15 tháng")){
                    kh=15;
                }else if(ky_han.equals("18 tháng")){
                    kh=18;
                }else if(ky_han.equals("24 tháng")){
                    kh=24;
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

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        
        String sql = " SELECT * from khoan_vay kv "
                    + "join tai_khoan_nguoi_dung tknd on tknd.so_tai_khoan = kv.so_tai_khoan_id "
                    + "join nguoi_dung nd on nd.so_dien_thoai = tknd.so_dien_thoai_id ";
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
                }else if(ky_han.equals("15 tháng")){
                    kh=15;
                }else if(ky_han.equals("18 tháng")){
                    kh=18;
                }else if(ky_han.equals("24 tháng")){
                    kh=24;
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

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed
    khoan_vay kv;
  
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        try {
            //Lấy dữ liệu từ component đưa vào biến
            String stk = txtSotaikhoan.getText();
            //B2:Keets noois DB
             con = db.connect();
            //B3:Tạo đối tượng Statement để thực hirnj câu lệnh
            String sql = "Delete From khoan_vay Where so_tai_khoan_id='" + stk + "'";
            Statement st = con.createStatement();
            
            int r = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa khoản vay này không?", "Xác nhận", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(r == JOptionPane.YES_OPTION){
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Xóa thành công!!");
            }
                con.close();
            load_Tra_no();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void txtSo_tien_traActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSo_tien_traActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSo_tien_traActionPerformed
    boolean check = false;
    private void btnThanhtoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhtoanActionPerformed
        // Lấy dữ liệu từ các components
         if (check == true) {
         txtHo.setVisible(true);
         txtTen.setVisible(true);
         txtSodt.setVisible(true);
         txtCancuoc.setVisible(true);
         txtSotaikhoan.setVisible(true);
         txtDiachi.setVisible(true);
         txtLai_phai_tra.setVisible(true);
         txtSo_tien_tra.setVisible(true);
         txtTong.setVisible(true);
         dateNgaysinh.setVisible(true);
         
         check = false;
         return;
     }
     if (!txtSotaikhoan.isEnabled()) {
         txtLai_phai_tra.setEnabled(true);
         txtSo_tien_tra.setEnabled(true);
         txtTong.setEnabled(true);
        
         
         return;
     }

        String so_tai_khoan_id = txtSotaikhoan.getText().trim();
        String stv = "Select * from khoan_vay where so_tai_khoan_id = '"+so_tai_khoan_id+"'";
        String so_tien_vay = "";
        String ky_han = "";
        String loai_khoan = "";
        String so_tien_da_tra = "";
        try {
            con = db.connect();
            Statement stt = con.createStatement();
            ResultSet rss = stt.executeQuery(stv);
            while(rss.next()){
                so_tien_vay = rss.getString("so_tien_vay");
                ky_han = rss.getString("ky_han");
                loai_khoan = rss.getString("loai_vay");
                if(rss.getString("so_tien_da_tra") == null){
                    so_tien_da_tra = "0";
                }
                else{
                    so_tien_da_tra = rss.getString("so_tien_da_tra");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       
         // Kiểm tra các giá trị trước khi sử dụng
        if (so_tai_khoan_id.isEmpty() || so_tien_vay.isEmpty() || ky_han == null || loai_khoan == null || so_tien_da_tra.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin!");
        return; // Thoát nếu có thông tin không hợp lệ
   }

        // B2: Kết nối DB
        try {
            // B3: Tạo đối tượng PreparedStatement để thực hiện câu lệnh truy vấn
            String sql = "INSERT INTO khoan_vay (so_tai_khoan_id, so_tien_vay, so_tien_da_tra, so_tien_con_lai, ky_han,loai_vay, tinh_trang) "
            + "VALUES ( ?, ?, ?, ?, ?, ?, ?)";

           PreparedStatement st = con.prepareStatement(sql);

            // Truyền giá trị cho các tham số ?
            st.setString(1, so_tai_khoan_id);
            st.setString(2, so_tien_vay);
            st.setString(3, so_tien_da_tra);
            float so_tien_con_lai = Float.parseFloat(so_tien_vay) - Float.parseFloat(so_tien_da_tra);
            System.out.println(so_tien_con_lai);
            st.setFloat(4, so_tien_con_lai);
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

    private void txtSotaikhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSotaikhoanActionPerformed
         String stk = txtSotaikhoan.getText().trim();
        try {
            con = db.connect();
            Statement st = con.createStatement();
            String sql = " SELECT * from khoan_vay kv "
                    + "join tai_khoan_nguoi_dung tknd on tknd.so_tai_khoan = kv.so_tai_khoan_id "
                    + "join nguoi_dung nd on nd.so_dien_thoai = tknd.so_dien_thoai_id "
                    + "where tknd.so_tai_khoan = '"+stk+"'"; 
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                txtHo.setText(rs.getString("ho"));
                txtTen.setText(rs.getString("ten"));
                txtCancuoc.setText(rs.getString("so_cong_dan"));
                txtDiachi.setText(rs.getString("dia_chi"));
                txtSodt.setText(rs.getString("so_dien_thoai"));
                dateNgaysinh.setDate(rs.getDate("ngay_sinh"));
                return;
            }
            JOptionPane.showMessageDialog(this, "Số tài khoản không tồn tại");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtSotaikhoanActionPerformed

    private void txtSotaikhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSotaikhoanMouseClicked
       
        
    }//GEN-LAST:event_txtSotaikhoanMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThanhtoan;
    private javax.swing.JButton btnXoa;
    private com.toedter.calendar.JDateChooser dateNgaysinh;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_tra_no;
    private javax.swing.JTextField txtCancuoc;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextField txtHo;
    private javax.swing.JTextField txtLai_phai_tra;
    private javax.swing.JTextField txtSo_tien_tra;
    private javax.swing.JTextField txtSodt;
    private javax.swing.JTextField txtSotaikhoan;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTong;
    // End of variables declaration//GEN-END:variables
}
