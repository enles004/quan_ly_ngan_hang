/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.controllers.admin;
import com.mycompany.db;
import com.mycompany.models.user;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import static org.apache.poi.hssf.usermodel.HeaderFooter.date;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import static org.bouncycastle.crypto.params.Blake3Parameters.key;
/**
 *
 * @author Admin
 */
public class bao_hiemm extends javax.swing.JInternalFrame {

    /**
     * Creates new form bao_hiemm
     */
    public bao_hiemm() {
       initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        load();
        load_anh();
     ComboBox_loaibaohiem.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            updateTongPhi();
        }
    });

    ComboBox_thoihan.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            updateTongPhi();
        }
    });   
       
    }
     Connection con; 
    private void load(){
        ComboBox_loaibaohiem.setSelectedItem("");
        ComboBox_thoihan.setSelectedItem("");
        txtSotaikhoan.setText("");
        txtTongphi.setText("");
        txtHo.setText("");
        txtTen.setText("");
        txtSodt.setText("");
        txtCancuoc.setText("");
        txtDiachi.setText("");
        dateNgaysinh.setDateFormatString("dd/MM/yyyy");
    

        try {
            tb_bao_hiem.removeAll();
            con = db.connect();
            String sql = " SELECT * from bao_hiem bh "
                    + "join tai_khoan_nguoi_dung tknd on tknd.so_tai_khoan = bh.tai_khoan_nguoi_dung_id "
                    + "join nguoi_dung nd on nd.so_dien_thoai = tknd.so_dien_thoai_id ";
                   
                   
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String[] td = {"ID","Họ","Tên","Số điện thoại","Địa chỉ","Ngày sinh","Số CCCD ","Tài khoản thanh toán","Loại bảo hiểm","Thời hạn","Phí bảo hiểm"};
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
                
                v.add(rs.getString("tai_khoan_nguoi_dung_id"));
                v.add(rs.getString("loai_bao_hiem"));
                v.add(rs.getString("ky_han"));
                v.add(rs.getString("so_tien_da_dong"));
                
                tb.addRow(v);
            }
            
            tb_bao_hiem.setModel(tb);
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void load_anh() {
        try {
            
            BufferedImage img_xoa = ImageIO.read(new File("src/main/java/com/mycompany/pics/mua.png"));
            Image scaledImg_xoa = img_xoa.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            btnMua.setIcon(new ImageIcon(scaledImg_xoa));
            
            BufferedImage img_sua = ImageIO.read(new File("src/main/java/com/mycompany/pics/sua.png"));
            Image scaledImg_sua = img_sua.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            btnSua.setIcon(new ImageIcon(scaledImg_sua));
         
            BufferedImage img_nhap = ImageIO.read(new File("src/main/java/com/mycompany/pics/nhapexcel.png"));
            Image scaledImg_nhap = img_nhap.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            btnNhapfie.setIcon(new ImageIcon(scaledImg_nhap));
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
        jPanel3 = new javax.swing.JPanel();
        txtDiachi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtHo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSodt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCancuoc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        dateNgaysinh = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        ComboBox_loaibaohiem = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtTongphi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtSotaikhoan = new javax.swing.JTextField();
        ComboBox_thoihan = new javax.swing.JComboBox<>();
        btnMua = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnNhapfie = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_bao_hiem = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("DỊCH VỤ BẢO HIỂM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(270, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(296, 296, 296))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Địa chỉ:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Số điện thoại:");

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 2, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("THÔNG TIN NGƯỜI THAM GIA BẢO HIỂM");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Ngày sinh:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Số CCCD:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Họ :");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Tên:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel14))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtHo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDiachi, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(txtTen, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                                .addGap(64, 64, 64))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(txtSodt, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(57, 57, 57)))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel4))
                                        .addGap(64, 64, 64)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCancuoc, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                            .addComponent(dateNgaysinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(38, 38, 38)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 185, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jLabel12)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtHo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addComponent(dateNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(21, 21, 21)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtSodt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(txtCancuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setForeground(new java.awt.Color(255, 204, 204));

        ComboBox_loaibaohiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Chọn loại bảo hiểm--", "Bảo hiểm sức khỏe", "Bỏa hiểm xe máy", "Bảo hiểm ô tô", "Bảo hiểm du lịch nội địa", "Bảo hiểm du lịch quốc tế" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Loại bảo hiểm:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Tổng phí:");

        jLabel11.setText("VNĐ");

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 2, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("THÔNG TIN DỊCH VỤ BẢO HIỂM");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Thời hạn:");

        jLabel10.setText("(1 năm kể từ ngày trên và sau thời điểm thanh toán phí)");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Tài khoản thanh toán:");

        txtSotaikhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSotaikhoanActionPerformed(evt);
            }
        });

        ComboBox_thoihan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Chon thời hạn--", "3 tháng", "6 tháng", "12 tháng" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel9))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtTongphi, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ComboBox_loaibaohiem, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSotaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ComboBox_thoihan, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ComboBox_loaibaohiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(ComboBox_thoihan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtSotaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTongphi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        btnMua.setText("Mua ngay");
        btnMua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMuaActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnNhapfie.setText("Nhập File");
        btnNhapfie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapfieActionPerformed(evt);
            }
        });

        tb_bao_hiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Họ ", "Tên ", "Số điện thoại", "Địa chỉ", "Ngày sinh", "Số CCCD", "Tài khoản thanh toán", "Loại bảo hiểm", "Thời hạn", "Phí bảo hiểm"
            }
        ));
        tb_bao_hiem.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tb_bao_hiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_bao_hiemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_bao_hiem);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(447, 447, 447)
                .addComponent(btnMua)
                .addGap(18, 18, 18)
                .addComponent(btnSua)
                .addGap(18, 18, 18)
                .addComponent(btnNhapfie)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMua)
                    .addComponent(btnSua)
                    .addComponent(btnNhapfie))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSotaikhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSotaikhoanActionPerformed
        String stk= txtSotaikhoan.getText().trim();
        try {
            con = db.connect();
            Statement st = con.createStatement();

            String sql = "select * "
            + "from nguoi_dung nd "
            + "join tai_khoan_nguoi_dung tknd on nd.so_dien_thoai = tknd.so_dien_thoai_id "
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
            JOptionPane.showMessageDialog(this, "Số tài khoản không tồn tại hoặc số tài khoản không đúng!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtSotaikhoanActionPerformed
     boolean check = false;
     
     // Đặt hàm này ở ngoài hàm btnMuaActionPerformed, trong cùng class với các hàm khác
     
    private void updateTongPhi() {
        String loai_bao_hiem = ComboBox_loaibaohiem.getSelectedItem().toString();
        String thoi_han = ComboBox_thoihan.getSelectedItem().toString();

        // Kiểm tra nếu cả loại bảo hiểm và thời hạn đã được chọn
        if (!loai_bao_hiem.isEmpty() && !thoi_han.isEmpty()) {
            int tong = 0;
            
             // Xử lý các loại bảo hiểm và thời hạn
        switch (loai_bao_hiem) {
            case "Bảo hiểm sức khỏe":
                if (thoi_han.equals("3 tháng")) {
                    tong = 450000;
                } else if (thoi_han.equals("6 tháng")) {
                    tong = 900000;
                } else if (thoi_han.equals("12 tháng")) {
                    tong = 1600000;
                }
                break;
                
            case "Bảo hiểm xe máy":
                if (thoi_han.equals("3 tháng")) {
                    tong = 80000;
                } else if (thoi_han.equals("6 tháng")) {
                    tong = 150000;
                } else if (thoi_han.equals("12 tháng")) {
                    tong = 250000;
                }
                break;
                
            case "Bảo hiểm ô tô":
                if (thoi_han.equals("3 tháng")) {
                    tong = 1200000;
                } else if (thoi_han.equals("6 tháng")) {
                    tong = 2200000;
                } else if (thoi_han.equals("12 tháng")) {
                    tong = 4000000;
                }
                break;
                
            case "Bảo hiểm du lịch nội địa":
                if (thoi_han.equals("3 tháng")) {
                    tong = 500000;
                } else if (thoi_han.equals("6 tháng")) {
                    tong = 950000;
                } else if (thoi_han.equals("12 tháng")) {
                    tong = 1700000;
                }
                break;
                
            case "Bảo hiểm du lịch quốc tế":
                if (thoi_han.equals("3 tháng")) {
                    tong = 1500000;
                } else if (thoi_han.equals("6 tháng")) {
                    tong = 2800000;
                } else if (thoi_han.equals("12 tháng")) {
                    tong = 5000000;
                }
                break;

            default:
                // Trường hợp không có loại bảo hiểm nào phù hợp
                tong = 0;
                break;
        }
            // Hiển thị tổng phí trong txtTongphi
            txtTongphi.setText(String.valueOf(tong));
        } else {
            txtTongphi.setText(""); // Xóa tổng phí nếu chưa chọn đủ
        }
    }

   
    

    private void btnMuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMuaActionPerformed
  
                                           
  
    if (check == true) {
        txtHo.setVisible(true);
        txtTen.setVisible(true);
        txtSodt.setVisible(true);
        ComboBox_loaibaohiem.setSelectedItem(" ");
        ComboBox_thoihan.setSelectedItem(" ");
        txtCancuoc.setVisible(true);
        txtSotaikhoan.setVisible(true);
        txtDiachi.setVisible(true);
        txtTongphi.setVisible(true);
        dateNgaysinh.setVisible(true);
        check = false;
        return;
    }
    if (!txtSotaikhoan.isEnabled()) {
        txtTongphi.setEnabled(true);
        ComboBox_loaibaohiem.setEnabled(true);
        ComboBox_thoihan.setEnabled(true);

        return;
    }

    String tk = txtSotaikhoan.getText().trim();
    String loai_bao_hiem = ComboBox_loaibaohiem.getSelectedItem().toString();
    String thoi_han = ComboBox_thoihan.getSelectedItem().toString();
    int tong = Integer.parseInt(txtTongphi.getText());
    

    try {
        con = db.connect();

        // B2: Câu lệnh SQL để thêm khoản vay
        String sql = "INSERT INTO bao_hiem (loai_bao_hiem, ky_han, tai_khoan_nguoi_dung_id, so_tien_da_dong) "
                   + "VALUES ( ?, ?, ?, ?)";

        PreparedStatement st = con.prepareStatement(sql);

        // Truyền giá trị cho các tham số
        st.setString(1, loai_bao_hiem);
        st.setString(2, thoi_han);
        st.setString(3, tk);
        st.setInt(4, tong);

        st.executeUpdate();
        con.close();

        JOptionPane.showMessageDialog(this, "Bạn đã mua bảo hiểm thành công");
        load();

    } catch (Exception ex) {
        ex.printStackTrace();
    }

    }//GEN-LAST:event_btnMuaActionPerformed
bao_hiem bh;
    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        try {
            //B1: Lay dl tu cac component dua vao bien
            String ho = txtHo.getText().trim();
            if(ho.isEmpty()){
                JOptionPane.showMessageDialog(this, "Họ của người dùng \n không được để trống.");
                return;
            }
            String ten = txtTen.getText().trim();
            if(ten.isEmpty()){
                JOptionPane.showMessageDialog(this, "Tên của người dùng \n không được để trống.");
                return;
            }
            Date ngs = new Date(dateNgaysinh.getDate().getTime());
            String dt = txtSodt.getText().trim();
            String regex_sdt = "^(03|05|07|08|09|01[2|6|8|9])+([0-9]{8})$";
            Pattern pattern_sdt = Pattern.compile(regex_sdt);
            Matcher matcher_sdt = pattern_sdt.matcher(dt);
            if(!matcher_sdt.matches()){
                JOptionPane.showMessageDialog(this, "Định dạng số điện thoại không đúng.");
                return;
            }
            String cc = txtCancuoc.getText().trim();
            String regex_cccd = "^[0-9]{12}$";
            Pattern pattern_cccd = Pattern.compile(regex_cccd);
            Matcher matcher_cccd = pattern_cccd.matcher(cc);
            if (!matcher_cccd.matches()) {
                JOptionPane.showMessageDialog(this, "Định dạng số căn cước công dân không đúng.");
                return;
            }
            String dc = txtDiachi.getText().trim();
            if(dc.isEmpty()){
                JOptionPane.showMessageDialog(this, "Địa chỉ của người dùng \n không được để trống.");
                return;
            }
            String tk = txtSotaikhoan.getText().trim();
            String tong = txtTongphi.getText().trim();

            String loai_bao_hiem = ComboBox_loaibaohiem.getSelectedItem().toString();
            String thoi_han = ComboBox_thoihan.getSelectedItem().toString();

            //B2: Keets noois DB
            con =db.connect() ;
            //B3:Tạo đối tượng Statement để sua dl

            String sql = "Update bao_hiem Set loai_bao_hiem=N'" + loai_bao_hiem + "',so_tien_da_dong='" + tong + "',ky_han=N'" + thoi_han + "' Where id='" + bh.getID() + "'";

            Statement st = con.createStatement();
            st.executeUpdate(sql);
            con.close();
            JOptionPane.showMessageDialog(this, "Sửa thành công");
            load();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    
         private void them_nd( String tai_khoan_nguoi_dung_id, String loai_bao_hiem, String ky_han, String so_tien_da_dong){
        try {
            con = db.connect();
            Statement st = con.createStatement();
          
            String sql = "INSERT INTO bao_hiem (tai_khoan_nguoi_dung_id, loai_bao_hiem, ky_han, so_tien_da_dong) VALUES "
                    + "('"+tai_khoan_nguoi_dung_id+"', N'"+loai_bao_hiem+"', N'"+ky_han+"', '"+so_tien_da_dong+"')";
        
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }
    
     private void ReadExcel(String tenfilepath) {
    try {
        FileInputStream fis = new FileInputStream(tenfilepath);
        // Tạo đối tượng Excel
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheetAt(0); // Lấy sheet đầu tiên của file

        // Lấy ra các dòng của bảng
        Iterator<Row> itr = sheet.iterator();

        // Bỏ qua dòng đầu tiên (header)
        if (itr.hasNext()) {
            itr.next();
        }

        // Đọc dữ liệu
        while (itr.hasNext()) { // Lặp đến hết các dòng trong excel
            Row row = itr.next(); // Lấy dòng tiếp theo
            String tai_khoan_nguoi_dung_id = "", loai_bao_hiem = "", ky_han = "", so_tien_da_dong = "";

            // Kiểm tra từng ô để đảm bảo không bị null
            if (row.getCell(0) != null) {
                tai_khoan_nguoi_dung_id = row.getCell(0).getCellType() == CellType.NUMERIC ?
                      String.valueOf((long) row.getCell(0).getNumericCellValue()) : 
                      row.getCell(0).getStringCellValue();
            }

            if (row.getCell(1) != null) {
                loai_bao_hiem = row.getCell(1).getStringCellValue();
            }

            if (row.getCell(2) != null) {
                ky_han = row.getCell(2).getStringCellValue();
            }

            if (row.getCell(3) != null) {
               so_tien_da_dong = row.getCell(3).getCellType() == CellType.NUMERIC ?
                           String.valueOf((long) row.getCell(3).getNumericCellValue()) :
                           row.getCell(3).getStringCellValue();
            }

            // Thêm dữ liệu vào cơ sở dữ liệu
            them_nd(tai_khoan_nguoi_dung_id, loai_bao_hiem, ky_han, so_tien_da_dong);
        }

        JOptionPane.showMessageDialog(this, "Nhập file thành công.");
        load();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    private void btnNhapfieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapfieActionPerformed
        try {
            JFileChooser fc = new JFileChooser();
            int lc = fc.showOpenDialog(this);
            if (lc == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                String tenfile = file.getName();
                if (tenfile.endsWith(".xlsx")) {    //endsWith chọn file có phần kết thúc ...
                    ReadExcel(file.getPath());
                } else {
                    JOptionPane.showMessageDialog(this, "Phải chọn file excel");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnNhapfieActionPerformed

    private void tb_bao_hiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_bao_hiemMouseClicked
        int i = tb_bao_hiem.getSelectedRow();
        //        btnSua.setVisible(true);
        //        btnNhapfie.setVisible(true);
        txtHo.setEnabled(true);
        txtTen.setEnabled(true);
        txtDiachi.setEnabled(true);
        txtCancuoc.setEnabled(true);
        txtSodt.setEnabled(true);
        txtSotaikhoan.setEnabled(true);
        txtTongphi.setEnabled(true);
        dateNgaysinh.setEnabled(true);
        ComboBox_thoihan.setEnabled(true);
        ComboBox_loaibaohiem.setEnabled(true);

        DefaultTableModel tb = (DefaultTableModel)tb_bao_hiem.getModel();

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
        ComboBox_loaibaohiem.setSelectedItem(tb.getValueAt(i, 8).toString());
        ComboBox_thoihan.setSelectedItem(tb.getValueAt(i, 9).toString());
        txtTongphi.setText(tb.getValueAt(i, 10).toString());

        bh = new bao_hiem();
        bh.setId(tb.getValueAt(i, 0).toString());
    }//GEN-LAST:event_tb_bao_hiemMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox_loaibaohiem;
    private javax.swing.JComboBox<String> ComboBox_thoihan;
    private javax.swing.JButton btnMua;
    private javax.swing.JButton btnNhapfie;
    private javax.swing.JButton btnSua;
    private com.toedter.calendar.JDateChooser dateNgaysinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_bao_hiem;
    private javax.swing.JTextField txtCancuoc;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextField txtHo;
    private javax.swing.JTextField txtSodt;
    private javax.swing.JTextField txtSotaikhoan;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTongphi;
    // End of variables declaration//GEN-END:variables
 private void setId(String id) {
        this.id = id; 
    }
    private String id;
    private String getID() {
        return this.id;
    }
}
