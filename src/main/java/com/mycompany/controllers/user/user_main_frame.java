/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.controllers.user;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Admin
 */
public class user_main_frame extends javax.swing.JFrame {

    /**
     * Creates new form user_main_frame
     */
    public user_main_frame() throws IOException {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf()); // Hoặc FlatDarkLaf
        } catch (Exception e) {
            e.printStackTrace();
        }
        initComponents();
        load_anh();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void load_anh() throws IOException{
        try {
            BufferedImage img_nd = ImageIO.read(new File("src/main/java/com/mycompany/pics/user.png"));
            Image scaledImg_nd = img_nd.getScaledInstance(30, 25, Image.SCALE_SMOOTH);
            nguoi_dung.setIcon(new ImageIcon(scaledImg_nd));
            
            BufferedImage img_gd = ImageIO.read(new File("src/main/java/com/mycompany/pics/giaodich.png"));
            Image scaledImg_gd = img_gd.getScaledInstance(30, 25, Image.SCALE_SMOOTH);
            jLabel6.setIcon(new ImageIcon(scaledImg_gd));
            
            BufferedImage img_c = ImageIO.read(new File("src/main/java/com/mycompany/pics/credit.png"));
            Image scaledImg_c = img_c.getScaledInstance(30, 25, Image.SCALE_SMOOTH);
            jLabel8.setIcon(new ImageIcon(scaledImg_c));
            
            BufferedImage img_b = ImageIO.read(new File("src/main/java/com/mycompany/pics/bell.png"));
            Image scaledImg_b = img_b.getScaledInstance(30, 25, Image.SCALE_SMOOTH);
            jLabel7.setIcon(new ImageIcon(scaledImg_b));
            
            BufferedImage img_br = ImageIO.read(new File("src/main/java/com/mycompany/pics/borrow.png"));
            Image scaledImg_br = img_br.getScaledInstance(30, 25, Image.SCALE_SMOOTH);
            khoan_tra.setIcon(new ImageIcon(scaledImg_br));
            
            BufferedImage img_sp = ImageIO.read(new File("src/main/java/com/mycompany/pics/help-desk.png"));
            Image scaledImg_sp = img_sp.getScaledInstance(30, 25, Image.SCALE_SMOOTH);
            Ho_tro.setIcon(new ImageIcon(scaledImg_sp));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        nguoi_dung = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        khoan_tra = new javax.swing.JLabel();
        Ho_tro = new javax.swing.JLabel();
        khoan_vay1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Desktop1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setMaximumSize(new java.awt.Dimension(818, 497));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setMaximumSize(new java.awt.Dimension(163, 398));

        nguoi_dung.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nguoi_dung.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nguoi_dung.setText("  Người dùng");
        nguoi_dung.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nguoi_dung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nguoi_dungMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("  Giao dịch");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("  Thông báo");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("  Loại thẻ");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        khoan_tra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        khoan_tra.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        khoan_tra.setText("  Khoản trả");
        khoan_tra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        khoan_tra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                khoan_traMouseClicked(evt);
            }
        });

        Ho_tro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Ho_tro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Ho_tro.setText("  Hỗ trợ");
        Ho_tro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ho_tro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ho_troMouseClicked(evt);
            }
        });

        khoan_vay1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        khoan_vay1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        khoan_vay1.setText("  Khoản vay");
        khoan_vay1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        khoan_vay1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                khoan_vay1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ho_tro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nguoi_dung, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(khoan_tra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(khoan_vay1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nguoi_dung, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(khoan_vay1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(khoan_tra, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ho_tro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Desktop1.setPreferredSize(new java.awt.Dimension(640, 462));
        Desktop1.setRequestFocusEnabled(false);

        javax.swing.GroupLayout Desktop1Layout = new javax.swing.GroupLayout(Desktop1);
        Desktop1.setLayout(Desktop1Layout);
        Desktop1Layout.setHorizontalGroup(
            Desktop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 655, Short.MAX_VALUE)
        );
        Desktop1Layout.setVerticalGroup(
            Desktop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Desktop1, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Desktop1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
@SuppressWarnings("unchecked")
    private void nguoi_dungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nguoi_dungMouseClicked
      
    
    }//GEN-LAST:event_nguoi_dungMouseClicked

    private void khoan_traMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khoan_traMouseClicked
        Desktop1.removeAll();
        JLabel sourceLabel = (JLabel) evt.getSource();
        Color customColor = new Color(18, 48, 174);
        sourceLabel.setForeground(customColor);
         quanly_tra_no quanly_tra_no = new quanly_tra_no();
        Desktop1.add(quanly_tra_no).setVisible(true);
        
    }//GEN-LAST:event_khoan_traMouseClicked

    private void Ho_troMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ho_troMouseClicked
        Desktop1.removeAll();
        JLabel sourceLabel = (JLabel) evt.getSource();
        Color customColor = new Color(18, 48, 174);
        sourceLabel.setForeground(customColor);
        quanly_yeu_cau quanly_yeu_cau = new quanly_yeu_cau();
        Desktop1.add(quanly_yeu_cau).setVisible(true);
    }//GEN-LAST:event_Ho_troMouseClicked

    private void khoan_vay1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khoan_vay1MouseClicked
        Desktop1.removeAll();
        JLabel sourceLabel = (JLabel) evt.getSource();
        Color customColor = new Color(18, 48, 174);
        sourceLabel.setForeground(customColor);
        quanly_vayy quanly_vayy = new quanly_vayy();
        Desktop1.add(quanly_vayy).setVisible(true);
    }//GEN-LAST:event_khoan_vay1MouseClicked
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(user_main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user_main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user_main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user_main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               try {
                    new user_main_frame().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(user_main_frame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop1;
    private javax.swing.JLabel Ho_tro;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel khoan_tra;
    private javax.swing.JLabel khoan_vay1;
    private javax.swing.JLabel nguoi_dung;
    // End of variables declaration//GEN-END:variables
}
