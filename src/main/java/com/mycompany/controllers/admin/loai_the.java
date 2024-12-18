/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.controllers.admin;

import com.mycompany.controller.timkiem.tk_loai_the;
import com.mycompany.db;
import com.mycompany.models.loai_the_model;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

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
        load_anh();
        load();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void load_cb(){
        try {
            con = db.connect();
            Statement st = con.createStatement();
            String sql = "select * from cb_uu_dai";
            ResultSet rs = st.executeQuery(sql);
            cb.removeAllItems();
            cb.addItem("-Chọn ưu đãi-");
            while(rs.next()){
                cb.addItem(rs.getString("ten_uu_dai"));
            }
        } catch (Exception e) {
        }
    }
    private void load(){
        try {
            cb.removeAllItems();
            cb.setEnabled(false);
            txt_ten.setEnabled(false);
            txt_hm.setEnabled(false);
            txt_dv.setEnabled(false);
            cb.setSelectedItem(" ");
            txt_ten.setText("");
            txt_hm.setText("");
            txt_dv.setText("");
            btn_sua.setVisible(false);
            btn_xoa.setVisible(false);
            tb_lt.removeAll();
            con = db.connect();
            String sql = "select * from loai_the";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String[] td = {"ID", "Tên thẻ", "Ưu đãi", "Hạn mức sử dụng", "Phí dịch vụ"};
            DefaultTableModel tb = new DefaultTableModel(td, 0);
            int sum = 0;
            while(rs.next()){
                sum++;
                Vector v = new Vector();
                v.add(rs.getString("id"));
                v.add(rs.getString("ten_loai_the"));
                v.add(rs.getString("uu_dai"));
                v.add(rs.getString("han_muc_su_dung"));
                v.add(rs.getString("phi_dich_vu"));
                tb.addRow(v);
            }
            sum_nd.setText(sum + "");
            tb_lt.setModel(tb);
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

            DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
            rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);

            tb_lt.getColumnModel().getColumn(0).setCellRenderer(centerRenderer); 
            tb_lt.getColumnModel().getColumn(3).setCellRenderer(centerRenderer); 
            tb_lt.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
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
        jLabel3 = new javax.swing.JLabel();
        txt_ten = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_hm = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_dv = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cb = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        sum_nd = new javax.swing.JLabel();
        tk = new javax.swing.JLabel();
        txt_tk = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        ec = new javax.swing.JButton();
        tkk = new javax.swing.JButton();
        cl = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setMaximumSize(new java.awt.Dimension(640, 600));
        setPreferredSize(new java.awt.Dimension(800, 699));
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);
        setVisible(true);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setMaximumSize(new java.awt.Dimension(454, 404));

        tb_lt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tb_lt.setForeground(new java.awt.Color(51, 51, 51));
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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Loại thẻ:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Hạn mức sử dụng/ngày:");

        txt_hm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_hmKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Phí thường niên:");

        txt_dv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_dvKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Ưu đãi:");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txt_ten)
                    .addComponent(txt_hm, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(txt_dv, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                    .addComponent(cb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55))
            .addComponent(jSeparator1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_dv, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(5, 5, 5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cb)
                    .addComponent(txt_hm, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setMaximumSize(new java.awt.Dimension(635, 48));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
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

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tổng số loại thẻ hiện có:");

        sum_nd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sum_nd.setForeground(new java.awt.Color(204, 255, 255));
        sum_nd.setText("jLabel3");

        txt_tk.setToolTipText("");
        txt_tk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
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
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sum_nd, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143)
                .addComponent(txt_tk, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tk, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tk, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_tk, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(sum_nd)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btn_them.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_them.setText("Thêm");
        btn_them.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_sua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_sua.setText("Sửa");
        btn_sua.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        btn_xoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_xoa.setText("Xóa");
        btn_xoa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        ec.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ec.setText("Nhập");
        ec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        ec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecActionPerformed(evt);
            }
        });

        tkk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tkk.setText("Tìm kiếm");
        tkk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        tkk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tkkActionPerformed(evt);
            }
        });

        cl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cl.setText("Clear");
        cl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tkk, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cl, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ec, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tkk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Connection con;
    loai_the_model l_t;
    private void Themloaithe(String ten_the, String uu_dai, String han_muc_su_dung, String phi_dich_vu){
        try {
            con = db.connect();
            String sql = "insert loai_the (ten_loai_the, uu_dai, han_muc_su_dung, phi_dich_vu) "
                + "values (N'"+ten_the+"', N'"+uu_dai+"', '"+han_muc_su_dung+"', '"+phi_dich_vu+"')";
            Statement st = con.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
    
    private void ReadExcel(String tenfilepath) {
        try {
            FileInputStream fis = new FileInputStream(tenfilepath);
            //Tạo đối tượng Excel
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sheet = wb.getSheetAt(0); //Lấy sheet đầu tiên của file
            //Lấy ra các dòng bảng bảng
            Iterator<Row> itr = sheet.iterator();
            //Đọc dữ liệu
            int row_count = 0;
            while (itr.hasNext()) {
                if (row_count > 0) {
                    Row row = itr.next(); 
                    Cell cell1 = row.getCell(0);
                    String ten_the = "";
                    if (cell1.getCellType() == CellType.STRING) {
                        ten_the = cell1.getStringCellValue();
                    } else if (cell1.getCellType() == CellType.NUMERIC) {
                        ten_the = String.valueOf(cell1.getNumericCellValue());
                    }

                    Cell cell2 = row.getCell(1);
                    String uu_dai = "";
                    if (cell2.getCellType() == CellType.STRING) {
                        uu_dai = cell2.getStringCellValue();
                    } else if (cell2.getCellType() == CellType.NUMERIC) {
                        uu_dai = String.valueOf(cell2.getNumericCellValue());
                    }

                    Cell cell3 = row.getCell(2);
                    String han_muc_su_dung = "";
                    if (cell3.getCellType() == CellType.STRING) {
                        han_muc_su_dung = cell3.getStringCellValue();
                    } else if (cell3.getCellType() == CellType.NUMERIC) {
                        han_muc_su_dung = String.valueOf(cell3.getNumericCellValue());
                    }

                    Cell cell4 = row.getCell(3);
                    String phi_dich_vu = "";
                    if (cell4.getCellType() == CellType.STRING) {
                        phi_dich_vu = cell4.getStringCellValue();
                    } else if (cell4.getCellType() == CellType.NUMERIC) {
                        phi_dich_vu = String.valueOf(cell4.getNumericCellValue());
                    }

                    Themloaithe(ten_the, uu_dai, han_muc_su_dung, phi_dich_vu);
                }
                row_count++;
            }
            JOptionPane.showMessageDialog(this, "Thêm loại thẻ bằng file thành công");
            load();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    private void load_anh() {
        try {
            BufferedImage img_sua = ImageIO.read(new File("src/main/java/com/mycompany/pics/sua.png"));
            Image scaledImg_sua = img_sua.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            btn_sua.setIcon(new ImageIcon(scaledImg_sua));
            
            BufferedImage img_xoa = ImageIO.read(new File("src/main/java/com/mycompany/pics/xoa.png"));
            Image scaledImg_xoa = img_xoa.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            btn_xoa.setIcon(new ImageIcon(scaledImg_xoa));
            
            BufferedImage img_tk = ImageIO.read(new File("src/main/java/com/mycompany/pics/search.png"));
            Image scaledImg_tk = img_tk.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
            tk.setIcon(new ImageIcon(scaledImg_tk));
            
            BufferedImage img_them = ImageIO.read(new File("src/main/java/com/mycompany/pics/plus.png"));
            Image scaledImg_them = img_them.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            btn_them.setIcon(new ImageIcon(scaledImg_them));
            
            BufferedImage img_ec = ImageIO.read(new File("src/main/java/com/mycompany/pics/ec.png"));
            Image scaledImg_ec = img_ec.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            ec.setIcon(new ImageIcon(scaledImg_ec));
            
            BufferedImage img_tkk = ImageIO.read(new File("src/main/java/com/mycompany/pics/se.png"));
            Image scaledImg_tkk = img_tkk.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            tkk.setIcon(new ImageIcon(scaledImg_tkk));
            
            BufferedImage img_cl = ImageIO.read(new File("src/main/java/com/mycompany/pics/clean.png"));
            Image scaledImg_cl = img_cl.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            cl.setIcon(new ImageIcon(scaledImg_cl));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    boolean check = false;
    private void tb_ltMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_ltMouseClicked
        load_cb();
        check = true;
        int i = tb_lt.getSelectedRow();
        btn_sua.setVisible(true);
        btn_xoa.setVisible(true);
        txt_ten.setEnabled(true);
        txt_hm.setEnabled(true);
        txt_dv.setEnabled(true);
        cb.setEnabled(true);
        DefaultTableModel tb = (DefaultTableModel)tb_lt.getModel();
        txt_ten.setText(tb.getValueAt(i, 1).toString());
        txt_hm.setText(formatNumber(tb.getValueAt(i, 3).toString()));
        cb.setSelectedItem(tb.getValueAt(i, 2).toString());
        txt_dv.setText(formatNumber(tb.getValueAt(i, 4).toString()));
        l_t = new loai_the_model();
        l_t.setId(Integer.parseInt(tb.getValueAt(i, 0).toString()));
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
            + "from loai_the "
            + "where ten_loai_the like N'%"+tim+"%' or han_muc_su_dung like '%"+tim+"%'";
            ResultSet rs = st.executeQuery(sql);
            String[] td = {"ID", "Tên thẻ", "Ưu đãi", "Hạn mức sử dụng", "Phí dịch vụ"};
            DefaultTableModel tb = new DefaultTableModel(td, 0);
            while(rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("id"));
                v.add(rs.getString("ten_loai_the"));
                v.add(rs.getString("uu_dai"));
                v.add(rs.getString("han_muc_su_dung"));
                v.add(rs.getString("phi_dich_vu"));
                tb.addRow(v);
            }
            tb_lt.setModel(tb);
            con.close();
        } catch (Exception e){
            e.printStackTrace();
        }

    }//GEN-LAST:event_txt_tkKeyReleased
    public static String formatNumber(String input) {
        try {
            long number = Long.parseLong(input.replaceAll(",", ""));
            DecimalFormat decimalFormat = new DecimalFormat("#,###");
            return decimalFormat.format(number);
        } catch (NumberFormatException ex) {
            return input;
        }
    }
    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        try {
            con = db.connect();
            String ten = txt_ten.getText().trim();
            if(ten.isEmpty()){
                JOptionPane.showMessageDialog(this, "Tên không được để trống.");
                return;
            }
            String uu_dai = cb.getSelectedItem().toString();
            if(uu_dai.isEmpty()){
                JOptionPane.showMessageDialog(this, "Ưu đãi không được để trống.");
                return;
            }
            String han_muc = txt_hm.getText().trim().replaceAll(",", "");
            if(han_muc.isEmpty()){
                JOptionPane.showMessageDialog(this, "Hạn mức không được để trống.");
                return;
            }
            String phi_dich_vu = txt_dv.getText().trim().replaceAll(",", "");
            if(phi_dich_vu.isEmpty()){
                JOptionPane.showMessageDialog(this, "Phí dich vụ không được để trống.");
                return;
            }
            Statement st = con.createStatement();
            String check = "select * from loai_the where ten_loai_the = N'"+ten+"'";
            ResultSet rs = st.executeQuery(check);
            while(rs.next()){
                String sql = "Update loai_the Set ten_loai_the = N'"+ten+"', uu_dai = N'"+uu_dai+"', han_muc_su_dung = '"+han_muc+"', phi_dich_vu = '"+phi_dich_vu+"' "
                + "where id = '"+l_t.getId()+"'";

                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Bạn đã cập nhật thành công");
                con.close();
                load();
                return;
            }
            JOptionPane.showMessageDialog(this, "Tên thẻ đã tồn tại.");
        } catch (SQLException ex) {
            Logger.getLogger(loai_the.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(loai_the.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:

    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        try {
            con = db.connect();
            Statement st = con.createStatement();
            String sql = "Delete from loai_the "
            + "where id = '"+l_t.getId()+"'";
            int r = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa loại thẻ này không?", "Xác nhận", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
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

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        btn_sua.setVisible(false);
        btn_xoa.setVisible(false);
        if(check == true){
            cb.setSelectedItem("");
            txt_ten.setText("");
            txt_hm.setText("");
            txt_dv.setText("");
            check = false;
            return;
        }
        if(!txt_ten.isEnabled()){
            load_cb();
            txt_ten.setEnabled(true);
            cb.setEnabled(true);
            txt_hm.setEnabled(true);
            txt_dv.setEnabled(true);
            return;
        }
        try {
            con = db.connect();
            Statement st = con.createStatement();
            String ten = txt_ten.getText().trim();
            if(ten.isEmpty()){
                JOptionPane.showMessageDialog(this, "Tên không được để trống.");
                return;
            }
            String uu_dai = cb.getSelectedItem().toString();
            if(uu_dai.isEmpty()){
                JOptionPane.showMessageDialog(this, "Ưu đãi không được để trống.");
                return;
            }
            String han_muc = txt_hm.getText().trim().replaceAll(",", "");
            if(han_muc.isEmpty()){
                JOptionPane.showMessageDialog(this, "Hạn mức không được để trống.");
                return;
            }
            String phi_dich_vu = txt_dv.getText().trim().replaceAll(",", "");
            if(phi_dich_vu.isEmpty()){
                JOptionPane.showMessageDialog(this, "Phí dich vụ không được để trống.");
                return;
            }
            String check = "select * from loai_the where ten_loai_the = N'"+ten+"'";
            ResultSet rs = st.executeQuery(check);
            while(!rs.next()){
                String sql = "insert into loai_the (ten_loai_the, uu_dai, han_muc_su_dung, phi_dich_vu, ngay_tao)"
                    + "values (N'"+ten+"', N'"+uu_dai+"', '"+han_muc+"', '"+phi_dich_vu+"', getdate())";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Thêm loại thẻ thành công.");
                load();
                return;
            }
            JOptionPane.showMessageDialog(this, "Thẻ đã tồn tại, không thể tạo");
        } catch (Exception e){
            e.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_themActionPerformed

    private void ecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecActionPerformed
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
        // TODO add your handling code here:
    }//GEN-LAST:event_ecActionPerformed

    private void txt_dvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dvKeyReleased
        String text = txt_dv.getText().trim();
        text = text.replaceAll("[^0-9]", ""); 
        txt_dv.setText(formatNumber(text));         
    }//GEN-LAST:event_txt_dvKeyReleased

    private void txt_hmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_hmKeyReleased
        String text = txt_hm.getText().trim();
        text = text.replaceAll("[^0-9]", ""); 
        txt_hm.setText(formatNumber(text));
    }//GEN-LAST:event_txt_hmKeyReleased

    private void tkkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tkkActionPerformed
        tk_loai_the searchFrame = new tk_loai_the();
        searchFrame.setVisible(true);
    }//GEN-LAST:event_tkkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JComboBox<String> cb;
    private javax.swing.JButton cl;
    private javax.swing.JButton ec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel sum_nd;
    private javax.swing.JTable tb_lt;
    private javax.swing.JLabel tk;
    private javax.swing.JButton tkk;
    private javax.swing.JTextField txt_dv;
    private javax.swing.JTextField txt_hm;
    private javax.swing.JTextField txt_ten;
    private javax.swing.JTextField txt_tk;
    // End of variables declaration//GEN-END:variables
}
