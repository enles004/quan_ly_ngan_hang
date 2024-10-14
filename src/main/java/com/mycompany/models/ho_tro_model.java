/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.models;

/**
 *
 * @author nobpe
 */
public class ho_tro_model {
    int id;
    int nguoi_dung_id;
    String loai_yeu_cau;
    String mo_ta;
    String trang_thai;
    String ngay_tao;
    String ngay_xu_ly;

    public ho_tro_model() {
    }

    public ho_tro_model(int id, int nguoi_dung_id, String loai_yeu_cau, String mo_ta, String trang_thai, String ngay_tao, String ngay_xu_ly) {
        this.id = id;
        this.nguoi_dung_id = nguoi_dung_id;
        this.loai_yeu_cau = loai_yeu_cau;
        this.mo_ta = mo_ta;
        this.trang_thai = trang_thai;
        this.ngay_tao = ngay_tao;
        this.ngay_xu_ly = ngay_xu_ly;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    
}
