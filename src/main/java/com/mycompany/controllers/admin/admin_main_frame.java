/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.controllers.admin;
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
 * @author nobpe
 */
public class admin_main_frame extends javax.swing.JFrame {

    /**
     * Creates new form main_frame
     */
    public admin_main_frame() throws IOException {
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
            Image scaledImg_nd = img_nd.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
            nguoi_dung.setIcon(new ImageIcon(scaledImg_nd));
            
            BufferedImage img_gd = ImageIO.read(new File("src/main/java/com/mycompany/pics/giaodich.png"));
            Image scaledImg_gd = img_gd.getScaledInstance(30, 25, Image.SCALE_SMOOTH);
            giao_dich.setIcon(new ImageIcon(scaledImg_gd));
            
            BufferedImage img_c = ImageIO.read(new File("src/main/java/com/mycompany/pics/credit.png"));
            Image scaledImg_c = img_c.getScaledInstance(30, 25, Image.SCALE_SMOOTH);
            loai_the.setIcon(new ImageIcon(scaledImg_c));
            
            BufferedImage img_b = ImageIO.read(new File("src/main/java/com/mycompany/pics/bell.png"));
            Image scaledImg_b = img_b.getScaledInstance(30, 25, Image.SCALE_SMOOTH);
            thong_bao.setIcon(new ImageIcon(scaledImg_b));
            
            BufferedImage img_br = ImageIO.read(new File("src/main/java/com/mycompany/pics/borrow.png"));
            Image scaledImg_br = img_br.getScaledInstance(30, 25, Image.SCALE_SMOOTH);
            khoan_vay.setIcon(new ImageIcon(scaledImg_br));
            
            BufferedImage img_sp = ImageIO.read(new File("src/main/java/com/mycompany/pics/help-desk.png"));
            Image scaledImg_sp = img_sp.getScaledInstance(30, 25, Image.SCALE_SMOOTH);
            ho_tro.setIcon(new ImageIcon(scaledImg_sp));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        nguoi_dung = new javax.swing.JLabel();
        giao_dich = new javax.swing.JLabel();
        thong_bao = new javax.swing.JLabel();
        loai_the = new javax.swing.JLabel();
        khoan_vay = new javax.swing.JLabel();
        ho_tro = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Desktop1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 600));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setMaximumSize(new java.awt.Dimension(818, 497));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setMaximumSize(new java.awt.Dimension(163, 398));

        nguoi_dung.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nguoi_dung.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nguoi_dung.setText("   Người dùng");
        nguoi_dung.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nguoi_dung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nguoi_dungMouseClicked(evt);
            }
        });

        giao_dich.setBackground(new java.awt.Color(153, 0, 153));
        giao_dich.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        giao_dich.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        giao_dich.setText("  Giao dịch");
        giao_dich.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        giao_dich.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                giao_dichMouseClicked(evt);
            }
        });

        thong_bao.setBackground(new java.awt.Color(153, 0, 153));
        thong_bao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        thong_bao.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        thong_bao.setText("  Thông báo");
        thong_bao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        thong_bao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thong_baoMouseClicked(evt);
            }
        });

        loai_the.setBackground(new java.awt.Color(153, 0, 153));
        loai_the.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loai_the.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loai_the.setText("  Loại thẻ");
        loai_the.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loai_the.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loai_theMouseClicked(evt);
            }
        });

        khoan_vay.setBackground(new java.awt.Color(153, 0, 153));
        khoan_vay.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        khoan_vay.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        khoan_vay.setText("  Khoản vay");
        khoan_vay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        khoan_vay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                khoan_vayMouseClicked(evt);
            }
        });

        ho_tro.setBackground(new java.awt.Color(153, 0, 153));
        ho_tro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ho_tro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ho_tro.setText("  Hỗ trợ");
        ho_tro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ho_tro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(khoan_vay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(thong_bao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loai_the, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(giao_dich, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nguoi_dung, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nguoi_dung, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(giao_dich, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loai_the, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thong_bao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(khoan_vay, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ho_tro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        Desktop1.setBackground(new java.awt.Color(204, 204, 204));
        Desktop1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        Desktop1.setPreferredSize(new java.awt.Dimension(640, 462));
        Desktop1.setRequestFocusEnabled(false);

        javax.swing.GroupLayout Desktop1Layout = new javax.swing.GroupLayout(Desktop1);
        Desktop1.setLayout(Desktop1Layout);
        Desktop1Layout.setHorizontalGroup(
            Desktop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 638, Short.MAX_VALUE)
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
                .addComponent(Desktop1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Desktop1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void nguoi_dungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nguoi_dungMouseClicked
        Desktop1.removeAll();
        JLabel sourceLabel = (JLabel) evt.getSource();
        Color customColor = new Color(18, 48, 174);
        Color black = new Color(0, 0, 0);
        sourceLabel.setForeground(customColor);
        giao_dich.setForeground(black);
        khoan_vay.setForeground(black);
        thong_bao.setForeground(black);
        ho_tro.setForeground(black);
        loai_the.setForeground(black);
        nguoi_dung nd = new nguoi_dung();
        Desktop1.add(nd).setVisible(true);
    }//GEN-LAST:event_nguoi_dungMouseClicked

    private void giao_dichMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_giao_dichMouseClicked
        Desktop1.removeAll();
        JLabel sourceLabel = (JLabel) evt.getSource();
        Color customColor = new Color(18, 48, 174);
        sourceLabel.setForeground(customColor);
        Color black = new Color(0, 0, 0);
        sourceLabel.setForeground(customColor);
        nguoi_dung.setForeground(black);
        khoan_vay.setForeground(black);
        thong_bao.setForeground(black);
        ho_tro.setForeground(black);
        loai_the.setForeground(black);
        giao_dich gd = new giao_dich();
        Desktop1.add(gd).setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_giao_dichMouseClicked

    private void loai_theMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loai_theMouseClicked
        Desktop1.removeAll();
        JLabel sourceLabel = (JLabel) evt.getSource();
        Color customColor = new Color(18, 48, 174);
        sourceLabel.setForeground(customColor);
        Color black = new Color(0, 0, 0);
        sourceLabel.setForeground(customColor);
        nguoi_dung.setForeground(black);
        khoan_vay.setForeground(black);
        thong_bao.setForeground(black);
        ho_tro.setForeground(black);
        giao_dich.setForeground(black);
        loai_the lt = new loai_the();
        Desktop1.add(lt).setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_loai_theMouseClicked

    private void thong_baoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thong_baoMouseClicked
        Desktop1.removeAll();
        JLabel sourceLabel = (JLabel) evt.getSource();
        Color customColor = new Color(18, 48, 174);
        sourceLabel.setForeground(customColor);
        Color black = new Color(0, 0, 0);
        sourceLabel.setForeground(customColor);
        nguoi_dung.setForeground(black);
        khoan_vay.setForeground(black);
        loai_the.setForeground(black);
        ho_tro.setForeground(black);
        giao_dich.setForeground(black);
        thong_bao tb = new thong_bao();
        Desktop1.add(tb).setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_thong_baoMouseClicked

    private void khoan_vayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khoan_vayMouseClicked
        Desktop1.removeAll();
        JLabel sourceLabel = (JLabel) evt.getSource();
        Color customColor = new Color(18, 48, 174);
        sourceLabel.setForeground(customColor);
        Color black = new Color(0, 0, 0);
        sourceLabel.setForeground(customColor);
        nguoi_dung.setForeground(black);
        thong_bao.setForeground(black);
        loai_the.setForeground(black);
        ho_tro.setForeground(black);
        giao_dich.setForeground(black);
        khoan_vay kv = new khoan_vay();
        Desktop1.add(kv).setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_khoan_vayMouseClicked

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
            java.util.logging.Logger.getLogger(admin_main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        try {
            UIManager.setLookAndFeel(new FlatLightLaf()); // Hoặc FlatDarkLaf
        } catch (Exception e) {
            e.printStackTrace();
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new admin_main_frame().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(admin_main_frame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop1;
    private javax.swing.JLabel giao_dich;
    private javax.swing.JLabel ho_tro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel khoan_vay;
    private javax.swing.JLabel loai_the;
    private javax.swing.JLabel nguoi_dung;
    private javax.swing.JLabel thong_bao;
    // End of variables declaration//GEN-END:variables
}
