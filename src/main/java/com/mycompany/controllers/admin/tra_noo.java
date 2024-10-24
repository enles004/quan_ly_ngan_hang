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
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Admin
 */
public class tra_noo extends javax.swing.JInternalFrame {

    /**
     * Creates new form tra_noo
     */
    public tra_noo() {
       initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        load_Tra_no();
        load_anh();
        
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
    public class tra_nooo extends vay_vonn {
        private JTextField txtBanmuonvay;
        private JComboBox<String> Combo_Kyhan;
        private JComboBox<String> Combo_Khoanvay; 
        public tra_nooo() {
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

    private void load_anh() {
        try {
            
            BufferedImage img_xoa = ImageIO.read(new File("src/main/java/com/mycompany/pics/delete.png"));
            Image scaledImg_xoa = img_xoa.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            btnXoa.setIcon(new ImageIcon(scaledImg_xoa));
            
            BufferedImage img_them = ImageIO.read(new File("src/main/java/com/mycompany/pics/thanhtoan.png"));
            Image scaledImg_them = img_them.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            btnThanhtoan.setIcon(new ImageIcon(scaledImg_them));
         
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
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
        jPanel3 = new javax.swing.JPanel();
        txtTong = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSotaikhoan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        txtSo_tien_tra = new javax.swing.JTextField();
        txtLai_phai_tra = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_tra_no = new javax.swing.JTable();
        btnThanhtoan = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(900, 688));

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
                .addGap(244, 244, 244)
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

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Tên:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Họ:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Số điện thoại:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Địa chỉ:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Ngày sinh:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Số CCCD:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(27, 27, 27)
                                .addComponent(dateNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSodt, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(28, 28, 28)
                            .addComponent(txtDiachi, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(18, 18, 18)
                            .addComponent(txtCancuoc))))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtHo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel11)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtSodt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCancuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Lãi phải trả:");

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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Hình thức trả nợ:");

        jCheckBox1.setText("Tôi đồng ý với Quy định về các nội dung trong Hợp đồng và điều khoản điều kiện kèm theo. ");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Tất toán - đóng khoản vay");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Tổng:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Số tiền trả:");

        jRadioButton1.setText("Trả nợ định kỳ");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });

        txtSo_tien_tra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSo_tien_traActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(103, 103, 103)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel7)
                                .addComponent(jLabel2)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(157, 157, 157)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jRadioButton1)
                                            .addGap(18, 18, 18)
                                            .addComponent(jRadioButton2))
                                        .addComponent(txtSo_tien_tra, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtLai_phai_tra, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTong, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSotaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(124, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 242, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtSotaikhoan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButton2))
                        .addComponent(jLabel3))
                    .addGap(21, 21, 21)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtSo_tien_tra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(21, 21, 21)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtLai_phai_tra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jCheckBox1)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

        btnThanhtoan.setText("Thanh toán");
        btnThanhtoan.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnThanhtoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhtoanActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnThanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(btnThanhtoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSotaikhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSotaikhoanMouseClicked

    }//GEN-LAST:event_txtSotaikhoanMouseClicked

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

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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

    private void txtSo_tien_traActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSo_tien_traActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSo_tien_traActionPerformed
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
    
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        try {
            //Lấy dữ liệu từ component đưa vào biến
            
            //B2:Keets noois DB
            con = db.connect();
            //B3:Tạo đối tượng Statement để thực hirnj câu lệnh
            String sql = "Delete From khoan_vay  Where id='" + tknd.getID() + "'";
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
    private void setId(String id) {
        this.id = id; 
    }
    private String id;
    private String getID() {
        return this.id;
    }

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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
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
