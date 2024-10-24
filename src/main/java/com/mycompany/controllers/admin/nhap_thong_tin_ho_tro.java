/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.controllers.admin;

import static com.lowagie.text.pdf.PdfFileSpecification.url;
import com.mycompany.config;
import com.mycompany.db;
import com.mycompany.models.user;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HOA.HP
 */

public class nhap_thong_tin_ho_tro extends javax.swing.JInternalFrame {

    /**
     * Creates new form nhap_thong_tin_ho_tro
     */
    public nhap_thong_tin_ho_tro() {
        initComponents();
        this.setDefaultCloseOperation(javax.swing.JInternalFrame.DISPOSE_ON_CLOSE); // Đóng form mà không thoát ứng dụng
        this.setSize(600, 400); // Đặt kích thước cho form
    // Lấy kích thước của màn hình
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    
    // Tính toán vị trí để đặt form ở giữa màn hình
    int x = (screenSize.width - this.getWidth()) / 2;
    int y = (screenSize.height - this.getHeight()) / 2;

    // Đặt vị trí cho form
    this.setLocation(x, y);
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
        txt_sdtyc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_noidungyc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ngayyeucau = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHotro = new javax.swing.JTable();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_trolai = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_ho = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_ten = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(800, 699));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cập nhật thông tin chi tiết"));
        jPanel1.setToolTipText("");
        jPanel1.setName(""); // NOI18N

        jLabel1.setText("SĐT yêu cầu:");

        txt_sdtyc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sdtycActionPerformed(evt);
            }
        });

        jLabel2.setText("Nội dung yêu cầu:");

        txt_noidungyc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_noidungycActionPerformed(evt);
            }
        });

        jLabel3.setText("Ngày yêu cầu");

        tbHotro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "SĐT", "Họ", "Tên", "Ngày yêu cầu", "Nội dung", "Trạng thái"
            }
        ));
        jScrollPane1.setViewportView(tbHotro);

        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

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

        btn_trolai.setText("Trở lại");
        btn_trolai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_trolaiActionPerformed(evt);
            }
        });

        jLabel4.setText("Họ");

        jLabel5.setText("Tên");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(186, 186, 186)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(txt_ho, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                    .addComponent(txt_sdtyc)
                                    .addComponent(txt_ten))
                                .addGap(67, 67, 67)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txt_noidungyc)
                                    .addComponent(ngayyeucau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn_xoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_trolai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(106, 106, 106))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_sdtyc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ngayyeucau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_noidungyc, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_ho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_them)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_sua)
                        .addGap(18, 18, 18)
                        .addComponent(btn_xoa)
                        .addGap(18, 18, 18)
                        .addComponent(btn_trolai)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
 private void load() {
    try {
        Connection con = db.connect();
        String sql = "SELECT n.so_dien_thoai, n.ho, n.ten, h.ngay_tao, h.noi_dung, h.trang_thai " +
                     "FROM nguoi_dung n " +
                     "JOIN ho_tro_nguoi_dung h ON n.id = h.nguoi_dung_id";
     
        Statement st = con.createStatement(); 
        ResultSet rs = st.executeQuery(sql); 

        // Tiêu đề cột cho JTable
        String[] tieude = {"SĐT", "Họ", "Tên", "Ngày Yêu Cầu", "Nội Dung", "Trạng Thái"};
        DefaultTableModel tb = new DefaultTableModel(tieude, 0); // Tạo model cho JTable

        while (rs.next()) {
            Vector<Object> v = new Vector<>(); 
            v.add(rs.getString("so_dien_thoai"));
            v.add(rs.getString("ho")); 
            v.add(rs.getString("ten")); 
            v.add(rs.getDate("ngay_tao")); 
            v.add(rs.getString("noi_dung")); 
            v.add(rs.getString("trang_thai")); 
            tb.addRow(v); 
        }

        
        tbHotro.setModel(tb); 

        // Đóng tài nguyên
        rs.close(); // Đóng ResultSet
        st.close(); // Đóng Statement
        con.close(); // Đóng Connection
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi khi tải dữ liệu: " + ex.getMessage());
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(nhap_thong_tin_ho_tro.class.getName()).log(Level.SEVERE, null, ex);
    }
}


    private void txt_sdtycActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sdtycActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sdtycActionPerformed

    private void txt_noidungycActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_noidungycActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_noidungycActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
      
        String ho = txt_ho.getText().trim();
        String ten = txt_ten.getText().trim();
        String sdt = txt_sdtyc.getText().trim();
        Date ngayyc= new Date (ngayyeucau.getDate().getTime());
        String nd= txt_noidungyc.getText().trim();
        
        
        
        //ket noi database
        try {
            
           Connection con = null;
           con=db.connect();
            String sqlNguoiDung = "INSERT INTO nguoi_dung (ho, ten, so_dien_thoai) VALUES (?, ?, ?)";
            PreparedStatement stNguoiDung=con.prepareStatement(sqlNguoiDung);
            stNguoiDung.setString(1,ho);
            stNguoiDung.setString(2,ten);
            stNguoiDung.setString(3, sdt);
            stNguoiDung.executeUpdate();
           // Lấy ID người dùng vừa thêm
            ResultSet rs = stNguoiDung.getGeneratedKeys();
            int nguoidungid = 0;
            if (rs.next()) {
                nguoidungid = rs.getInt(1);
            }
//                
            String sqlHoTro = "INSERT INTO ho_tro_nguoi_dung (nguoi_dung_id, trang_thai, ngay_tao, mo_ta) VALUES (?, 'dang_xu_ly', ?, ?)";
            PreparedStatement stHoTro = con.prepareStatement(sqlHoTro);
            stHoTro.setInt(1, nguoidungid);
            stHoTro.setString(2,"dang_xu_ly" );
            stHoTro.setDate(3,ngayyc);
            stHoTro.setString(4,nd);
           
            stHoTro.executeUpdate();
            
            con.close();
            JOptionPane.showMessageDialog(this,"Them moi thanh cong");
            load();
        }   catch(SQLException ex){
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(nhap_thong_tin_ho_tro.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // TODO add your handling code here:
                                           
    try {
        // B1: Lấy dữ liệu từ các component đưa vào biến
        String sdt = txt_sdtyc.getText().trim();
        String ho = txt_ho.getText().trim();
        String ten = txt_ten.getText().trim();
        Date ngayyc = new Date(ngayyeucau.getDate().getTime());
        String nd = txt_noidungyc.getText().trim();
        String trangThai = "chờ xử lý"; // Trạng thái mặc định

        // B2: Kết nối đến DB
       Connection con = null;
        con=db.connect();

        // B3: Cập nhật thông tin người dùng trong bảng nguoi_dung
        String sqlNguoiDung = "UPDATE nguoi_dung SET ho = ?, ten = ?, so_dien_thoai = ? WHERE so_dien_thoai = ?";
        PreparedStatement stNguoiDung = con.prepareStatement(sqlNguoiDung);
        stNguoiDung.setString(1, ho);
        stNguoiDung.setString(2, ten);
        stNguoiDung.setString(3, sdt);
        stNguoiDung.setString(4, sdt); // Cập nhật theo số điện thoại

        int nguoiDungRowsAffected = stNguoiDung.executeUpdate();

        // B4: Cập nhật thông tin hỗ trợ trong bảng ho_tro
        String sqlHoTro = "UPDATE ho_tro_nguoi_dung SET ngay_tao = ?, noi_dung = ?, trang_thai = ? WHERE nguoi_dung_id = (SELECT id FROM nguoi_dung WHERE so_dien_thoai = ?)";
        PreparedStatement stHoTro = con.prepareStatement(sqlHoTro);
        stHoTro.setDate(1, new java.sql.Date(ngayyc.getTime())); // Chuyển đổi Date
        stHoTro.setString(2, nd);
        stHoTro.setString(3, trangThai);
        stHoTro.setString(4, sdt); // Lấy ID người dùng từ số điện thoại

        int hoTroRowsAffected = stHoTro.executeUpdate();

        // Kiểm tra số hàng bị ảnh hưởng
        if (nguoiDungRowsAffected > 0 || hoTroRowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Sửa thành công!");
            load(); // Tải lại dữ liệu
        } else {
            JOptionPane.showMessageDialog(this, "Không tìm thấy thông tin người dùng hoặc hỗ trợ!");
        }

        // Đóng tài nguyên
        stNguoiDung.close();
        stHoTro.close();
        con.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi khi sửa dữ liệu: " + ex.getMessage());
    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(nhap_thong_tin_ho_tro.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
                                 
    try {
        // B1: Lấy dữ liệu từ component đưa vào biến
        String sdt = txt_sdtyc.getText().trim(); // Hoặc lấy từ mã tác giả nếu cần

        // B2: Kết nối đến DB
        Connection con = null;
        con=db.connect();


        // B3: Xóa thông tin hỗ trợ người dùng trong bảng ho_tro
        String sqlHoTro = "DELETE FROM ho_tro_nguoi_dung WHERE nguoi_dung_id = (SELECT id FROM nguoi_dung WHERE so_dien_thoai = ?)";
        PreparedStatement stHoTro = con.prepareStatement(sqlHoTro);
        stHoTro.setString(1, sdt);
        stHoTro.executeUpdate();

        // B4: Xóa thông tin người dùng trong bảng nguoi_dung
        String sqlNguoiDung = "DELETE FROM nguoi_dung WHERE so_dien_thoai = ?";
        PreparedStatement stNguoiDung = con.prepareStatement(sqlNguoiDung);
        stNguoiDung.setString(1, sdt);
        stNguoiDung.executeUpdate();

        // Thông báo xóa thành công
        JOptionPane.showMessageDialog(this, "Xóa thành công!");
        
        // Tải lại dữ liệu
        load();

        // Đóng tài nguyên
        stHoTro.close();
        stNguoiDung.close();
        con.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi khi xóa dữ liệu: " + ex.getMessage());
    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(nhap_thong_tin_ho_tro.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_trolaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_trolaiActionPerformed
        // TODO add your handling code here:
                                             
    // Đóng form hiện tại
    this.dispose(); // Nếu bạn muốn đóng form hiện tại
    
    // Nếu bạn cần mở lại form hỗ trợ trước đó, hãy tạo một instance mới của form đó
    ho_tro supportForm = new ho_tro(); // Giả sử tên class là SupportForm
    supportForm.setVisible(true); // Hiển thị form hỗ trợ


    }//GEN-LAST:event_btn_trolaiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_trolai;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser ngayyeucau;
    private javax.swing.JTable tbHotro;
    private javax.swing.JTextField txt_ho;
    private javax.swing.JTextField txt_noidungyc;
    private javax.swing.JTextField txt_sdtyc;
    private javax.swing.JTextField txt_ten;
    // End of variables declaration//GEN-END:variables
}
