/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.controllers.admin;

import com.mycompany.db;
import com.mycompany.models.thong_bao_model;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
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
public class thong_bao extends javax.swing.JInternalFrame {

    /**
     * Creates new form thong_bao
     */
    public thong_bao() {
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

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_tb = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        sum_nd = new javax.swing.JLabel();
        txt_tk = new javax.swing.JTextField();
        tk = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_nd = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        txt_ltb = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txt_td = new javax.swing.JTextField();
        btn_them = new javax.swing.JButton();
        ec = new javax.swing.JButton();
        path = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(800, 699));
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);
        setVisible(true);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setMaximumSize(new java.awt.Dimension(454, 404));

        tb_tb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tb_tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb_tb.setMinimumSize(new java.awt.Dimension(0, 0));
        tb_tb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_tbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_tb);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setMaximumSize(new java.awt.Dimension(635, 48));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ THÔNG BÁO");

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

        sum_nd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sum_nd.setForeground(new java.awt.Color(204, 0, 51));

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
                .addComponent(sum_nd, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_tk, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tk, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_tk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sum_nd))
                    .addComponent(tk, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
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
        jLabel3.setText("Nội dung:");

        txt_nd.setColumns(20);
        txt_nd.setRows(5);
        jScrollPane2.setViewportView(txt_nd);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Loại thông báo:");

        txt_ltb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Chọn-", "Thông báo giao dịch", "Thông báo số dư", "Thông báo lãi suất", "Thông báo phí dịch vụ", "Thông báo bảo mật" }));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Tiêu đề:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(txt_ltb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(txt_td, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txt_td, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ltb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        btn_them.setText("Thêm");
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
                .addGap(30, 30, 30)
                .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 299, Short.MAX_VALUE))
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sua)
                    .addComponent(btn_xoa)
                    .addComponent(btn_them))
                .addContainerGap())
        );

        ec.setText("Nhập file");
        ec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(ec, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ec)
                    .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    boolean check = false;
    Connection con;
    thong_bao_model tbb;
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
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void load(){
        try {
            txt_td.setEnabled(false);
            txt_nd.setEnabled(false);
            txt_ltb.setEnabled(false);
            txt_nd.setText("");
            txt_ltb.setSelectedItem(" ");
            txt_td.setText("");
            btn_sua.setVisible(false);
            btn_xoa.setVisible(false);
            tb_tb.removeAll();
            con = db.connect();
            String sql = "select * from thong_bao "
                    + "order by ngay_tao desc";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String[] td = {"ID", "Tiêu đề", "Nội dung", "Loại thông báo", "Ngày tạo"};
            DefaultTableModel tb = new DefaultTableModel(td, 0){
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false; // Không cho phép chỉnh sửa bất kỳ ô nào
                }
            };
            while(rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("id"));
                v.add(rs.getString("tieu_de"));
                v.add(rs.getString("noi_dung"));
                v.add(rs.getString("loai_thong_bao"));
                v.add(rs.getString("ngay_tao"));
                tb.addRow(v);
            }
            tb_tb.setModel(tb);
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void Themthongbao(String tieu_de, String noi_dung, String loai_thong_bao){
        try {
            con = db.connect();
            String sql = "insert thong_bao (tieu_de, noi_dung, loai_thong_bao, ngay_tao) "
                + "values (N'"+tieu_de+"', N'"+noi_dung+"', N'"+loai_thong_bao+"', getdate())";
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
                    String tieu_de = row.getCell(0).getStringCellValue();
                    String noi_dung = row.getCell(1).getStringCellValue();
                    String loai_thong_bao = row.getCell(2).getStringCellValue();

                    Themthongbao(tieu_de, noi_dung, loai_thong_bao);
                }
                row_count++;
            }
            JOptionPane.showMessageDialog(this, "Thêm thông báo bằng file thành công");
            load();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void tb_tbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_tbMouseClicked
        check = true;
        int i = tb_tb.getSelectedRow();
        btn_sua.setVisible(true);
        btn_xoa.setVisible(true);
        txt_nd.setEnabled(true);
        txt_ltb.setEnabled(true);
        txt_td.setEnabled(true);
        DefaultTableModel tb = (DefaultTableModel)tb_tb.getModel();
        txt_nd.setText(tb.getValueAt(i, 2).toString());
        txt_ltb.setSelectedItem(tb.getValueAt(i, 3).toString());
        txt_td.setText(tb.getValueAt(i, 1).toString());
        tbb = new thong_bao_model();
        tbb.setId(Integer.parseInt(tb.getValueAt(i, 0).toString()));
    }//GEN-LAST:event_tb_tbMouseClicked

    private void txt_tkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_tkMouseClicked
        txt_nd.setText("");
        txt_td.setText("");
        txt_ltb.setSelectedItem(" ");
        btn_sua.setVisible(false);
        btn_xoa.setVisible(false);
    }//GEN-LAST:event_txt_tkMouseClicked

    private void txt_tkKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tkKeyReleased
        try {
            con = db.connect();
            Statement st = con.createStatement();
            String tim = txt_tk.getText().trim();
            String sql = "select * "
            + "from thong_bao "
            + "where tieu_de like '%"+tim+"%' or loai_thong_bao like '%"+tim+"%'";
            ResultSet rs = st.executeQuery(sql);
            String[] td = {"ID", "Tiêu đề", "Nội dung", "Loại thông báo", "Ngày tạo"};
            DefaultTableModel tb = new DefaultTableModel(td, 0);
            while(rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("id"));
                v.add(rs.getString("tieu_de"));
                v.add(rs.getString("noi_dung"));
                v.add(rs.getString("loai_thong_bao"));
                v.add(rs.getString("ngay_tao"));
                tb.addRow(v);
            }
            tb_tb.setModel(tb);
            con.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_txt_tkKeyReleased

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        try {
            con = db.connect();
            String tieu_de = txt_td.getText().trim();
            if(tieu_de.isEmpty()){
                JOptionPane.showMessageDialog(this, "Tiêu đề không được để trống.");
                return;
            }
            String noi_dung = txt_nd.getText().trim();
            if(noi_dung.isEmpty()){
                JOptionPane.showMessageDialog(this, "Nội dung không được để trống.");
                return;
            }
            String loai_thong_bao = txt_ltb.getSelectedItem().toString().trim();
            if(loai_thong_bao == "-Chọn-"){
                JOptionPane.showMessageDialog(this, "Chưa chọn loại thông báo.");
                return;
            }
            String sql = "Update thong_bao Set tieu_de = N'"+tieu_de+"', noi_dung = N'"+noi_dung+"', loai_thong_bao = N'"+loai_thong_bao+"' "
            + "where id = '"+tbb.getId()+"'";
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Bạn đã cập nhật thành công");
            con.close();
            load();
        } catch (SQLException ex) {
            Logger.getLogger(thong_bao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(thong_bao.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        try {
            con = db.connect();
            Statement st = con.createStatement();
            String sql = "Delete from thong_bao "
            + "where id = '"+tbb.getId()+"'";
            int r = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa thông báo này không?", "Xác nhận", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
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
            txt_nd.setText("");
            txt_td.setText("");
            txt_ltb.setSelectedItem(" ");
            check = false;
            return;
        }
        if(!txt_td.isEnabled()){
            txt_td.setEnabled(true);
            txt_nd.setEnabled(true);
            txt_ltb.setEnabled(true);
            return;
        }
        try {
            con = db.connect();
            Statement st = con.createStatement();
            String tieu_de = txt_td.getText().trim();
            if(tieu_de.isEmpty()){
                JOptionPane.showMessageDialog(this, "Tiêu đề không được để trống.");
                return;
            }
            String noi_dung = txt_nd.getText().trim();
            if(noi_dung.isEmpty()){
                JOptionPane.showMessageDialog(this, "Nội dung không được để trống.");
                return;
            }
            String loai_thong_bao = txt_ltb.getSelectedItem().toString();
            if(loai_thong_bao == "-Chọn-"){
                JOptionPane.showMessageDialog(this, "Chưa chọn loại thông báo.");
                return;
            }
       
            String sql = "insert into thong_bao (tieu_de, noi_dung, loai_thong_bao, ngay_tao)"
            + "values (N'"+tieu_de+"', N'"+noi_dung+"', N'"+loai_thong_bao+"', getdate())";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Thêm thông báo thành công.");
            load();
        } catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_themActionPerformed

    private void ecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecActionPerformed
        try {
            JFileChooser fc = new JFileChooser();
            int lc = fc.showOpenDialog(this);
            if (lc == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                path.setText(file.getPath());
                String tenfile = file.getName();
                if (tenfile.endsWith(".xlsx")) { 
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JButton ec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField path;
    private javax.swing.JLabel sum_nd;
    private javax.swing.JTable tb_tb;
    private javax.swing.JLabel tk;
    private javax.swing.JComboBox<String> txt_ltb;
    private javax.swing.JTextArea txt_nd;
    private javax.swing.JTextField txt_td;
    private javax.swing.JTextField txt_tk;
    // End of variables declaration//GEN-END:variables
}
