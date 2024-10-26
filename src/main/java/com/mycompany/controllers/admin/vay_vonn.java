/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.controllers.admin;

import static com.ctc.wstx.shaded.msv_core.reader.RunAwayExpressionChecker.check;
import com.mycompany.db;
import com.mycompany.models.UserSession;
import com.mycompany.models.tai_khoan_nguoi_dung_model;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import static org.apache.poi.util.DocumentFormatException.check;
import static org.apache.poi.util.RecordFormatException.check;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Admin
 */
public class vay_vonn extends javax.swing.JInternalFrame {

    /**
     * Creates new form vay_vonn
     */
    public vay_vonn() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        load();
        load_anh();
    }
     Connection con; 
    private void load(){
        Combo_Kyhan.setSelectedItem(" ");
        Combo_Khoanvay.setSelectedItem(" ");
        txtBanmuonvay.setText(" ");
        txtTaikhoan.setText(" ");
        

        txtHo.setEnabled(false);
        txtTen.setEnabled(false);
        txtSodt.setEnabled(false);
        txtCancuoc.setEnabled(false);
        txtDiachi.setEnabled(false);
        dateNgaysinh.setEnabled(false);
       
        
        try {
            tb_vv.removeAll();
            con = db.connect();
            String sql = " SELECT * from khoan_vay kv "
                    + "join tai_khoan_nguoi_dung tknd on tknd.so_tai_khoan = kv.so_tai_khoan_id "
                    + "join nguoi_dung nd on nd.so_dien_thoai = tknd.so_dien_thoai_id ";
                   
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String[] td = {"ID","Họ","Tên","Số điện thoại","Địa chỉ","Ngày sinh","Số CCCD ","Tài khoản vay","Vay số tiền","Kỳ hạn","Loại khoản vay","Trạng thái"};
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
                v.add(rs.getString("ky_han"));
                v.add(rs.getString("loai_vay"));
                v.add(rs.getString("tinh_trang"));
                tb.addRow(v);
            }
            
            tb_vv.setModel(tb);
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

     private void load_anh() {
        try {
            
            BufferedImage img_vay = ImageIO.read(new File("src/main/java/com/mycompany/pics/vay.png"));
            Image scaledImg_vay = img_vay.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            btnvay.setIcon(new ImageIcon(scaledImg_vay));
            
            BufferedImage img_tk = ImageIO.read(new File("src/main/java/com/mycompany/pics/search.png"));
            Image scaledImg_tk = img_tk.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            btn_tim_kiem.setIcon(new ImageIcon(scaledImg_tk));
            
            BufferedImage img_xua = ImageIO.read(new File("src/main/java/com/mycompany/pics/xuattt.png"));
            Image scaledImg_xua = img_xua.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            btnXuatExcel.setIcon(new ImageIcon(scaledImg_xua));
         
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtBanmuonvay = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Combo_Kyhan = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Combo_Khoanvay = new javax.swing.JComboBox<>();
        lai_suat = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtTaikhoan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDiachi = new javax.swing.JTextField();
        txtHo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCancuoc = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtSodt = new javax.swing.JTextField();
        dateNgaysinh = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_vv = new javax.swing.JTable();
        btn_tim_kiem = new javax.swing.JButton();
        btnvay = new javax.swing.JButton();
        btnXuatExcel = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 153, 255));

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 2, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("THÔNG TIN NHU CẦU VAY");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Bạn muốn vay:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Kỳ hạn:");

        Combo_Kyhan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Chọn kỳ hạn--", "3 tháng", "6 tháng", "12 tháng", "15 tháng", "18 tháng", "24 tháng", " " }));
        Combo_Kyhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo_KyhanActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Lãi suất:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Loại khoản vay:");

        Combo_Khoanvay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Chọn loại khoản vay--", "Vay tín dụng", "Vay thế chấp", "Vay tiêu dùng", "Vay kinh doanh" }));
        Combo_Khoanvay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo_KhoanvayActionPerformed(evt);
            }
        });

        lai_suat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lai_suat.setText("8,7%/năm");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Tài khoản vay:");

        txtTaikhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTaikhoanActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Số điện thoại:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Ngày sinh:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Địa chỉ:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Họ :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Số CCCD:");

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 2, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("THÔNG TIN NGƯỜI VAY");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Tên:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(52, 52, 52)
                        .addComponent(lai_suat, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(jLabel2))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(190, 190, 190)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Combo_Khoanvay, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Combo_Kyhan, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBanmuonvay, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDiachi)
                                    .addComponent(dateNgaysinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSodt, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtHo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                        .addComponent(txtTen, javax.swing.GroupLayout.Alignment.LEADING))))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(jLabel6)
                        .addGap(36, 36, 36)
                        .addComponent(txtCancuoc, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12))
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtTaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBanmuonvay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel13)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Combo_Kyhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtSodt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Combo_Khoanvay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel5)
                    .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(lai_suat)
                        .addComponent(jLabel4))
                    .addComponent(dateNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCancuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(194, 194, 194))
        );

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("DỊCH VỤ VAY ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(310, 310, 310))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tb_vv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Họ ", "Tên", "Số điện thoại", "Địa chỉ", "Ngày sinh", "Số CCCD", "Tài khoản vay", "Vay số tiền", "Kỳ hạn", "Loại khoản vay", "Trạng thái"
            }
        ));
        tb_vv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_vvMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_vv);

        btn_tim_kiem.setText("Tìm kiếm");
        btn_tim_kiem.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btn_tim_kiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tim_kiemActionPerformed(evt);
            }
        });

        btnvay.setText("Vay");
        btnvay.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnvay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvayActionPerformed(evt);
            }
        });

        btnXuatExcel.setText("Xuất file");
        btnXuatExcel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnXuatExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatExcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnvay, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_tim_kiem, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnXuatExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_tim_kiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXuatExcel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnvay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Combo_KyhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo_KyhanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Combo_KyhanActionPerformed

    private void Combo_KhoanvayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo_KhoanvayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Combo_KhoanvayActionPerformed
        boolean check = false;    
     private static CellStyle DinhdangHeader(XSSFSheet sheet) {
        // Create font
        XSSFFont font = sheet.getWorkbook().createFont();
        font.setFontName("Times New Roman");
        font.setBold(true);
        font.setFontHeightInPoints((short) 12); // font size
        font.setColor(IndexedColors.WHITE.getIndex()); // text color

        // Create CellStyle
        CellStyle cellStyle = sheet.getWorkbook().createCellStyle();
        cellStyle.setFont(font);
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        cellStyle.setVerticalAlignment(VerticalAlignment.TOP);
        cellStyle.setFillForegroundColor(IndexedColors.DARK_GREEN.getIndex());
        cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        cellStyle.setBorderBottom(BorderStyle.THIN);
        cellStyle.setWrapText(true);
        return cellStyle;
    }    tai_khoan_nguoi_dung_model tknd;
    private void tb_vvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_vvMouseClicked
        int i = tb_vv.getSelectedRow();
        
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
        txtTaikhoan.setVisible(true);
        txtTaikhoan.setEditable(false);
        txtBanmuonvay.setEditable(false);
        txtBanmuonvay.setVisible(true);
        
        Combo_Kyhan.setEditable(false);
        Combo_Khoanvay.setEditable(false);
        
        DefaultTableModel tb = (DefaultTableModel)tb_vv.getModel();
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
        txtTaikhoan.setText(tb.getValueAt(i, 7).toString());
        txtBanmuonvay.setText(tb.getValueAt(i, 8).toString());
        Combo_Kyhan.setSelectedItem(tb.getValueAt(i, 9).toString());
        Combo_Khoanvay.setSelectedItem(tb.getValueAt(i, 10).toString());
        
        tknd = new tai_khoan_nguoi_dung_model();
        tknd.setId(Integer.parseInt(tb.getValueAt(i, 0).toString()));




    }//GEN-LAST:event_tb_vvMouseClicked

    private void txtTaikhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTaikhoanActionPerformed
         String stk = txtTaikhoan.getText().trim();
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
            JOptionPane.showMessageDialog(this, "Số tài khoản không tồn tại");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtTaikhoanActionPerformed

    private void btnXuatExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatExcelActionPerformed
        try {

            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet spreadsheet = workbook.createSheet("khoan_vay");
            // register the columns you wish to track and compute the column width

            CreationHelper createHelper = workbook.getCreationHelper();

            XSSFRow row = null;
            Cell cell = null;

            row = spreadsheet.createRow((short) 2);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("DANH SÁCH KHOẢN VAY ");

            //Tạo dòng tiêu đều của bảng
            // create CellStyle
            CellStyle cellStyle_Head = DinhdangHeader(spreadsheet);
            row = spreadsheet.createRow((short) 3);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellStyle(cellStyle_Head);
            cell.setCellValue("ID");

            cell = row.createCell(1, CellType.STRING);
            cell.setCellStyle(cellStyle_Head);
            cell.setCellValue("Họ");

            cell = row.createCell(2, CellType.STRING);
            cell.setCellStyle(cellStyle_Head);
            cell.setCellValue("Tên");

            cell = row.createCell(3, CellType.STRING);
            cell.setCellStyle(cellStyle_Head);
            cell.setCellValue("Số điện thoại");

            cell = row.createCell(4, CellType.STRING);
            cell.setCellStyle(cellStyle_Head);
            cell.setCellValue("Địa chỉ");

            cell = row.createCell(5, CellType.STRING);
            cell.setCellStyle(cellStyle_Head);
            cell.setCellValue("Ngày sinh");

            cell = row.createCell(6, CellType.STRING);
            cell.setCellStyle(cellStyle_Head);
            cell.setCellValue("Số CCCD");

            cell = row.createCell(7, CellType.STRING);
            cell.setCellStyle(cellStyle_Head);
            cell.setCellValue("Số tài khoản");

            cell = row.createCell(8, CellType.STRING);
            cell.setCellStyle(cellStyle_Head);
            cell.setCellValue("Vay số tiền");

            cell = row.createCell(9, CellType.STRING);
            cell.setCellStyle(cellStyle_Head);
            cell.setCellValue("Kỳ hạn");

            cell = row.createCell(10, CellType.STRING);
            cell.setCellStyle(cellStyle_Head);
            cell.setCellValue("Loại khoản vay");

            cell = row.createCell(11, CellType.STRING);
            cell.setCellStyle(cellStyle_Head);
            cell.setCellValue("Trạng thái");

            //Kết nối DB
            con = db.connect();
            String sql = " SELECT * from khoan_vay kv "
            + "join tai_khoan_nguoi_dung tknd on tknd.so_tai_khoan = kv.so_tai_khoan_id "
            + "join nguoi_dung nd on nd.so_dien_thoai = tknd.so_dien_thoai_id ";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            //Đổ dữ liệu từ rs vào các ô trong excel
            ResultSetMetaData rsmd = rs.getMetaData();
            int tongsocot = rsmd.getColumnCount();

            //Đinh dạng Tạo đường kẻ cho ô chứa dữ liệu
            CellStyle cellStyle_data = spreadsheet.getWorkbook().createCellStyle();
            cellStyle_data.setBorderLeft(BorderStyle.THIN);
            cellStyle_data.setBorderRight(BorderStyle.THIN);
            cellStyle_data.setBorderBottom(BorderStyle.THIN);

            int i = 0;
            while (rs.next()) {
                row = spreadsheet.createRow((short) 4 + i);
                row.setHeight((short) 400);

                cell = row.createCell(0);
                cell.setCellStyle(cellStyle_data);
                cell.setCellValue(i + 1);

                cell = row.createCell(1);
                cell.setCellStyle(cellStyle_data);
                cell.setCellValue(rs.getString("ho"));

                cell = row.createCell(2);
                cell.setCellStyle(cellStyle_data);
                cell.setCellValue(rs.getString("ten"));

                cell = row.createCell(3);
                cell.setCellStyle(cellStyle_data);
                cell.setCellValue(rs.getString("so_dien_thoai"));

                cell = row.createCell(4);
                cell.setCellStyle(cellStyle_data);
                cell.setCellValue(rs.getString("dia_chi"));

                //Định dạng ngày tháng trong excel
                java.util.Date ngay = new java.util.Date(rs.getDate("ngay_sinh").getTime());
                CellStyle cellStyle = workbook.createCellStyle();
                cellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd/MM/yyyy"));
                cellStyle.setBorderLeft(BorderStyle.THIN);
                cellStyle.setBorderRight(BorderStyle.THIN);
                cellStyle.setBorderBottom(BorderStyle.THIN);
                cell = row.createCell(5);
                cell.setCellValue(ngay);
                cell.setCellStyle(cellStyle);

                cell = row.createCell(6);
                cell.setCellStyle(cellStyle_data);
                cell.setCellValue(rs.getString("so_cong_dan"));

                cell = row.createCell(7);
                cell.setCellStyle(cellStyle_data);
                cell.setCellValue(rs.getString("so_tai_khoan"));

                cell = row.createCell(8);
                cell.setCellStyle(cellStyle_data);
                cell.setCellValue(rs.getString("so_tien_vay"));

                cell = row.createCell(9);
                cell.setCellStyle(cellStyle_data);
                cell.setCellValue(rs.getString("ky_han"));

                cell = row.createCell(10);
                cell.setCellStyle(cellStyle_data);
                cell.setCellValue(rs.getString("loai_vay"));

                cell = row.createCell(11);
                cell.setCellStyle(cellStyle_data);
                cell.setCellValue(rs.getString("tinh_trang"));

                i++;
            }
            //Hiệu chỉnh độ rộng của cột
            for (int col = 0; col < tongsocot; col++) {
                spreadsheet.autoSizeColumn(col);
            }

            File f = new File("D:\\luuExcel\\taikhoannganhang.xlsx");
            FileOutputStream out = new FileOutputStream(f);
            workbook.write(out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnXuatExcelActionPerformed

    private void btnvayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvayActionPerformed

        if (check == true) {
            txtHo.setVisible(true);
            txtTen.setVisible(true);
            txtSodt.setVisible(true);
            Combo_Kyhan.setSelectedItem(" ");
            Combo_Khoanvay.setSelectedItem(" ");
            txtCancuoc.setVisible(true);
            txtBanmuonvay.setVisible(true);
            txtDiachi.setVisible(true);
            txtTaikhoan.setVisible(true);
            dateNgaysinh.setVisible(true);
            check = false;
            return;
        }
        if (!txtTaikhoan.isEnabled()) {
            txtTaikhoan.setEnabled(true);
            Combo_Kyhan.setEnabled(true);
            Combo_Khoanvay.setEnabled(true);
            txtBanmuonvay.setEnabled(true);
            return;
        }

        String so_tai_khoan_id = txtTaikhoan.getText().trim();
        String so_tien_vay = txtBanmuonvay.getText().trim();
        String ky_han = Combo_Kyhan.getSelectedItem().toString();
        String loai_vay = Combo_Khoanvay.getSelectedItem().toString();

        // Kết nối DB và chèn dữ liệu vào bảng khoan_vay
        try {
            con = db.connect();

            // B2: Câu lệnh SQL để thêm khoản vay
            String sql = "INSERT INTO khoan_vay (so_tai_khoan_id, so_tien_vay, ky_han, loai_vay, tinh_trang) "
            + "VALUES (?, ?, ?, ?, ?)";

            PreparedStatement st = con.prepareStatement(sql);

            // Truyền giá trị cho các tham số
            st.setString(1, so_tai_khoan_id); // tham số 1
            st.setString(2, so_tien_vay);      // tham số 2
            st.setString(3, ky_han);           // tham số 3
            st.setString(4, loai_vay);         // tham số 4
            st.setString(5, "Đang vay");       // tham số 5

            st.executeUpdate();
            con.close();

            JOptionPane.showMessageDialog(this, "Vay thành công");
            load(); // Tải lại dữ liệu bảng để hiển thị

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btnvayActionPerformed

    private void btn_tim_kiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tim_kiemActionPerformed
        try {

            String tk = txtTaikhoan.getText().trim();
            String ky_han = Combo_Kyhan.getSelectedItem().toString();
            if (ky_han.equals("--Chọn kỳ hạn--")) {
                ky_han = "";
            }
            String loai_vay = Combo_Khoanvay.getSelectedItem().toString();
            if (loai_vay.equals("--Chọn loại khoản vay--")) {
                loai_vay = "";
            }
            con = db.connect();

            String sql = " SELECT * from khoan_vay kv "
            + "join tai_khoan_nguoi_dung tknd on tknd.so_tai_khoan = kv.so_tai_khoan_id "
            + "join nguoi_dung nd on nd.so_dien_thoai = tknd.so_dien_thoai_id "
            + "where so_tai_khoan_id like '%" + tk + "%' and ky_han like N'%" + ky_han + "%'and loai_vay like N'%" + loai_vay + "%'";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String[] td = {"ID","Họ","Tên","Số điện thoại","Địa chỉ","Ngày sinh","Số CCCD ","Tài khoản vay","Vay số tiền","Kỳ hạn","Loại khoản vay","Trạng thái"};
            DefaultTableModel tb = new DefaultTableModel(td, 0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("id"));
                v.add(rs.getString("ho"));
                v.add(rs.getString("ten"));
                v.add(rs.getString("so_dien_thoai"));
                v.add(rs.getString("dia_chi"));
                v.add(rs.getString("ngay_sinh"));
                v.add(rs.getString("so_cong_dan"));
                //

                v.add(rs.getString("so_tai_khoan_id"));
                v.add(rs.getString("so_tien_vay"));
                v.add(rs.getString("ky_han"));
                v.add(rs.getString("loai_vay"));
                v.add(rs.getString("tinh_trang"));
                tb.addRow(v);

            }
            tb_vv.setModel(tb);
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_tim_kiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combo_Khoanvay;
    private javax.swing.JComboBox<String> Combo_Kyhan;
    private javax.swing.JButton btnXuatExcel;
    private javax.swing.JButton btn_tim_kiem;
    private javax.swing.JButton btnvay;
    private com.toedter.calendar.JDateChooser dateNgaysinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JLabel lai_suat;
    private javax.swing.JTable tb_vv;
    private javax.swing.JTextField txtBanmuonvay;
    private javax.swing.JTextField txtCancuoc;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextField txtHo;
    private javax.swing.JTextField txtSodt;
    private javax.swing.JTextField txtTaikhoan;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
