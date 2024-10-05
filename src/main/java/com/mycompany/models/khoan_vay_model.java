/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.models;

/**
 *
 * @author nobpe
 */
public class khoan_vay_model {
    int id;
    int nguoi_dung_id;
    String loai_vay;
    float so_tien_vay;
    float so_tien_da_tra;
    float so_tien_con_lai;
    String ngay_bat_dau;
    String ngay_ket_thuc;
    String ky_han;
    String tinh_trang;

    public khoan_vay_model() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
