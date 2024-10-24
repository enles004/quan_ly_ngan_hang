/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.controllers.admin;

import com.mycompany.db;
import com.mycompany.models.ho_tro_model;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author nobpe
 */
public class ho_tro extends javax.swing.JInternalFrame {

    /**
     * Creates new form ho_tro
     */
    public ho_tro() {
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

        jPanel7 = new javax.swing.JPanel();
        btn_xuatfile = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nxl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_stkyc = new javax.swing.JTextField();
        txt_nyc = new javax.swing.JTextField();
        txt_nxl = new javax.swing.JTextField();
        txt_tinhtrang = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_mt = new javax.swing.JTextArea();
        btn_them = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        cb_tt = new javax.swing.JComboBox<>();
        timkiem = new javax.swing.JTextField();
        lb_tk = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_ht = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(640, 600));
        setPreferredSize(new java.awt.Dimension(800, 699));
        setRequestFocusEnabled(false);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btn_xuatfile.setText("Xuất file");
        btn_xuatfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xuatfileActionPerformed(evt);
            }
        });

        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("SĐT yêu cầu:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Ngày yêu cầu:");

        nxl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nxl.setText("Ngày xử lý:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Tình trạng:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Nội dung yêu cầu:");

        txt_mt.setColumns(20);
        txt_mt.setRows(5);
        jScrollPane2.setViewportView(txt_mt);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txt_stkyc, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(txt_nyc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(nxl))
                        .addGap(0, 71, Short.MAX_VALUE))
                    .addComponent(txt_nxl)
                    .addComponent(txt_tinhtrang, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(txt_tinhtrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(45, 45, 45)
                            .addComponent(nxl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_nxl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_stkyc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_nyc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btn_them.setText("Thêm mới");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btn_xuatfile, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_xuatfile)
                    .addComponent(btn_xoa)
                    .addComponent(btn_them))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lb1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb1.setText("Tổng số yêu cầu chưa xử lý:");

        lb2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb2.setForeground(new java.awt.Color(204, 0, 51));

        cb_tt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Chọn tình trạng-", "Chờ xử lý", "Đã xử lý", "Đã từ chối" }));
        cb_tt.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_ttItemStateChanged(evt);
            }
        });

        timkiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timkiemMouseClicked(evt);
            }
        });
        timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timkiemActionPerformed(evt);
            }
        });
        timkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                timkiemKeyReleased(evt);
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
                        .addComponent(lb1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cb_tt, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_tk, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_tt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb2)
                        .addComponent(lb1)))
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lb_tk, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setMaximumSize(new java.awt.Dimension(635, 48));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ HỖ TRỢ NGƯỜI DÙNG");

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

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setMaximumSize(new java.awt.Dimension(454, 404));

        tb_ht.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tb_ht.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "STK yêu cầu", "Ngày yêu cầu", "Ngày xử lí", "Tình trạng", "Nội dung yêu cầu"
            }
        ));
        tb_ht.setMinimumSize(new java.awt.Dimension(0, 0));
        tb_ht.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_htMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_ht);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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
            
            BufferedImage img_ec = ImageIO.read(new File("src/main/java/com/mycompany/pics/excel.png"));
            Image scaledImg_ec = img_ec.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            btn_xuatfile.setIcon(new ImageIcon(scaledImg_ec));
            
            BufferedImage img_tk = ImageIO.read(new File("src/main/java/com/mycompany/pics/search.png"));
            Image scaledImg_tk = img_tk.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            lb_tk.setIcon(new ImageIcon(scaledImg_tk));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void load(){
        try {
            btn_xuatfile.setVisible(false);
            timkiem.setVisible(false);
            lb_tk.setVisible(false);
            lb1.setVisible(false);
            lb2.setVisible(false);
            txt_tinhtrang.setEnabled(false);
            txt_stkyc.setEnabled(false);
            txt_mt.setEnabled(false);
            txt_nyc.setEnabled(false);
            txt_nxl.setEnabled(false);
            btn_xoa.setVisible(false);
            tb_ht.removeAll();
            String[] td = {"ID", "Nội dung", "Ngày yêu cầu"};
            DefaultTableModel tb = new DefaultTableModel(td, 0);
            tb_ht.setModel(tb);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void load_xoa(){
        txt_stkyc.setText("");
        txt_tinhtrang.setText("");
        txt_nyc.setText("");
        txt_nxl.setText("");
        txt_mt.setText("");
        txt_stkyc.setEnabled(false);
        txt_tinhtrang.setEnabled(false);
        txt_nyc.setEnabled(false);
        txt_nxl.setEnabled(false);
        txt_mt.setEnabled(false);
        btn_xoa.setVisible(false);
        try {
            int sum = 0;
            lb1.setVisible(true);
            lb2.setVisible(true);
            tb_ht.removeAll();
            con = db.connect();
            String status = cb_tt.getSelectedItem().toString();
            String where = "";
            if(status == "Đã xử lý"){
                timkiem.setVisible(true);
                lb1.setText("Tổng số hỗ trợ đã xử lý:");
                where = "where ht.trang_thai = 'da_xu_ly'";
            }
            else if(status == "Đã từ chối"){
                timkiem.setVisible(true);
                lb1.setText("Tổng số hỗ trợ đã từ chối:");
                where = "where ht.trang_thai = 'da_tu_choi'";
            }
            String sql = "select * from ho_tro_nguoi_dung ht "
                    + "join nguoi_dung nd on nd.id = ht.nguoi_dung_id "
                    + "join thong_tin_ca_nhan ttcn on ttcn.nguoi_dung_id = nd.id "
                    + where;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String[] td = {"ID", "Nội dung", "Ngày yêu cầu"};
            DefaultTableModel tb = new DefaultTableModel(td, 0){
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            while(rs.next()){
                sum ++;
                Vector v = new Vector();
                v.add(rs.getString("id"));
                v.add(rs.getString("mo_ta"));
                v.add(rs.getString("ngay_tao"));
                tb.addRow(v);
            }
            lb2.setText(sum + "");
            lb1.setVisible(true);
            tb_ht.setModel(tb);
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    ho_tro_model htm;
    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        try {
            con = db.connect();
            Statement st = con.createStatement();
            int id = htm.getId();
            String sql = "Delete from ho_tro_nguoi_dung "
            + "where id = '"+id+"'";
            int r = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa hỗ trợ này không?", "Xác nhận", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
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

    private void tb_htMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_htMouseClicked
        int i = tb_ht.getSelectedRow();
        if(cb_tt.getSelectedItem().toString() == "Đã xử lý" || cb_tt.getSelectedItem().toString() == "Đã từ chối"){
            btn_xoa.setVisible(true);
        }
        DefaultTableModel tb = (DefaultTableModel)tb_ht.getModel();
        int id = Integer.parseInt(tb.getValueAt(i, 0).toString());
        htm = new ho_tro_model();
        htm.setId(id);
        try {
            txt_stkyc.setEditable(false);
            txt_tinhtrang.setEditable(false);
            txt_nyc.setEditable(false);
            txt_nxl.setEditable(false);
            txt_mt.setEditable(false);
            txt_stkyc.setEnabled(true);
            txt_tinhtrang.setEnabled(true);
            txt_nyc.setEnabled(true);
            txt_nxl.setEnabled(true);
            txt_mt.setEnabled(true);
            String sql = "Select * from ho_tro_nguoi_dung ht "
                    + "join nguoi_dung nd on nd.id = ht.nguoi_dung_id "
                    + "join thong_tin_ca_nhan ttcn on ttcn.nguoi_dung_id = nd.id "
                    + "where ht.id = '"+id+"'";
            con = db.connect();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                txt_stkyc.setText(rs.getString("so_tai_khoan"));
                txt_tinhtrang.setText(rs.getString("loai_yeu_cau"));
                txt_nyc.setText(rs.getString("ngay_tao"));
                if(cb_tt.getSelectedItem().toString() == "Đã xử lý" || cb_tt.getSelectedItem().toString() == "Đã từ chối"){
                    txt_nxl.setVisible(true);
                    nxl.setVisible(true);
                    txt_nxl.setText(rs.getString("ngay_xu_ly"));
                }
                txt_mt.setText(rs.getString("mo_ta"));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tb_htMouseClicked

    private void btn_xuatfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xuatfileActionPerformed
         try {
            String check_tt = cb_tt.getSelectedItem().toString().trim();
            String tt = "";
            if(check_tt == "Chờ xử lý"){
                tt = "dang_xu_ly";
            }
            else if(check_tt == "Đã xử lý"){
             tt = "da_xu_ly";
            }
            else if(check_tt == "Đã từ chối"){
                tt = "da_tu_choi";
            }
            con = db.connect();
            JasperDesign jdesign = JRXmlLoader.load("src\\main\\java\\com\\mycompany\\controllers\\admin\\ho_tro.jrxml");
            String sql = "Select * From ho_tro_nguoi_dung ht "
                    + "join nguoi_dung nd on nd.id = ht.nguoi_dung_id "
                    + "join thong_tin_ca_nhan ttcn on ttcn.nguoi_dung_id = nd.id "
                    + "Where ht.trang_thai = '"+tt+"'"; 
            JRDesignQuery updateQuery = new JRDesignQuery();
            updateQuery.setText(sql);
            jdesign.setQuery(updateQuery);
            JasperReport jreport = JasperCompileManager.compileReport(jdesign);
            JasperPrint jprint = JasperFillManager.fillReport(jreport, null, con);
            JasperViewer viewer = new JasperViewer(jprint, false); // false để không đóng ứng dụng khi thoát
            viewer.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE); // Chỉ đóng cửa sổ
            viewer.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_xuatfileActionPerformed

    private void timkiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_timkiemKeyReleased
        try {
            con = db.connect();
            Statement st = con.createStatement();
            String tim = timkiem.getText().trim();
            String status = cb_tt.getSelectedItem().toString();
            String where = "";
            if (status == "Chờ xử lý"){
                lb1.setText("Tổng số hỗ trợ đang chờ xử lý:");
                where = "where ht.trang_thai = 'cho_xu_ly' "
                + "ttcn.so_tai_khoan like '%"+tim+"%'";
            }
            else if(status == "Đã xử lý"){
                timkiem.setVisible(true);
                lb1.setText("Tổng số hỗ trợ đã xử lý:");
                where = "where ht.trang_thai = 'da_xu_ly' "
                + "ttcn.so_tai_khoan like '%"+tim+"%'";
            }
            else if(status == "Đã từ chối"){
                timkiem.setVisible(true);
                lb1.setText("Tổng số hỗ trợ đã từ chối:");
                where = "where ht.trang_thai = 'da_tu_choi' "
                + "ttcn.so_tai_khoan like '%"+tim+"%'";
            }
            else{
                return;
            }
            String sql = "select * from ho_tro_nguoi_dung ht "
            + "join nguoi_dung nd on nd.id = kv.nguoi_dung_id "
            + "join thong_tin_ca_nhan ttcn on ttcn.nguoi_dung_id = nd.id "
            + where;
            ResultSet rs = st.executeQuery(sql);
            String[] td = {"ID", "Nội dung", "Ngày yêu cầu"};
            DefaultTableModel tb = new DefaultTableModel(td, 0){
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            while(rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("id"));
                v.add(rs.getString("mo_ta"));
                v.add(rs.getString("ngay_tao"));
                tb.addRow(v);
            }
            tb_ht.setModel(tb);
            con.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_timkiemKeyReleased

    private void timkiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timkiemMouseClicked
        txt_stkyc.setText("");
        txt_tinhtrang.setText("");
        txt_nyc.setText("");
        txt_nxl.setText("");
        txt_mt.setText("");
    }//GEN-LAST:event_timkiemMouseClicked

    private void cb_ttItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_ttItemStateChanged
        txt_stkyc.setText("");
        txt_tinhtrang.setText("");
        txt_nyc.setText("");
        txt_nxl.setText("");
        txt_mt.setText("");
        String status = cb_tt.getSelectedItem().toString();
        String where = "";
        if (status == "Chờ xử lý"){
            btn_xuatfile.setVisible(true);
            txt_nxl.setVisible(false);
            nxl.setVisible(false);
            timkiem.setVisible(true);
            lb_tk.setVisible(true);
            lb1.setText("Tổng số hỗ trợ đang chờ xử lý:");
            where = "where ht.trang_thai = 'dang_xu_ly'";
        }
        else if(status == "Đã xử lý"){
            btn_xuatfile.setVisible(true);
            timkiem.setVisible(true);
            lb_tk.setVisible(true);
            lb1.setText("Tổng số hỗ trợ đã xử lý:");
            where = "where ht.trang_thai = 'da_xu_ly'";
        }
        else if(status == "Đã từ chối"){
            btn_xuatfile.setVisible(true);
            timkiem.setVisible(true);
            lb_tk.setVisible(true);
            lb1.setText("Tổng số hỗ trợ đã từ chối:");
            where = "where ht.trang_thai = 'da_tu_choi'";
        }
        else{
            btn_xuatfile.setVisible(false);
            timkiem.setVisible(false);
            lb1.setVisible(false);
            lb2.setVisible(false);
            tb_ht.removeAll();
            lb_tk.setVisible(false);
            return;
        }
        try {
            int sum = 0;
            lb1.setVisible(true);
            lb2.setVisible(true);
            tb_ht.removeAll();
            con = db.connect();
            String sql = "select * from ho_tro_nguoi_dung ht "
            + "join nguoi_dung nd on nd.id = ht.nguoi_dung_id "
            + "join thong_tin_ca_nhan ttcn on ttcn.nguoi_dung_id = nd.id "
            + where;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String[] td = {"ID", "Nội dung", "Ngày yêu cầu"};
            DefaultTableModel tb = new DefaultTableModel(td, 0){
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            while(rs.next()){
                sum ++;
                Vector v = new Vector();
                v.add(rs.getString("id"));
                v.add(rs.getString("mo_ta"));
                v.add(rs.getString("ngay_tao"));
                tb.addRow(v);
            }
            lb2.setText(sum + "");
            tb_ht.setModel(tb);
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cb_ttItemStateChanged

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
                                                                                    
    // Tạo một instance của nhap_thong_tin_ho_tro
    nhap_thong_tin_ho_tro addInfoForm = new nhap_thong_tin_ho_tro();
    
   // Lấy tham chiếu đến JDesktopPane chứa form hiện tại
    JDesktopPane desktopPane = this.getDesktopPane(); // Hàm này sẽ lấy JDesktopPane từ JInternalFrame hiện tại

     // Kiểm tra xem desktopPane có khác null không
    if (desktopPane != null) {
        desktopPane.add(addInfoForm); // Thêm form mới vào desktop pane
        
        // Thiết lập vị trí cho form mới
        int x = (desktopPane.getWidth() - addInfoForm.getWidth()) / 2;
        int y = (desktopPane.getHeight() - addInfoForm.getHeight()) / 2;
        addInfoForm.setLocation(x, y); // Đặt vị trí của form ở giữa desktop pane
        
        addInfoForm.setVisible(true); // Hiển thị form mới
    } else {
        JOptionPane.showMessageDialog(this, "Không thể mở form thêm thông tin!");
    }



    }//GEN-LAST:event_btn_themActionPerformed

    private void timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timkiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timkiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JButton btn_xuatfile;
    private javax.swing.JComboBox<String> cb_tt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb_tk;
    private javax.swing.JLabel nxl;
    private javax.swing.JTable tb_ht;
    private javax.swing.JTextField timkiem;
    private javax.swing.JTextArea txt_mt;
    private javax.swing.JTextField txt_nxl;
    private javax.swing.JTextField txt_nyc;
    private javax.swing.JTextField txt_stkyc;
    private javax.swing.JTextField txt_tinhtrang;
    // End of variables declaration//GEN-END:variables
}
