/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.models;

/**
 *
 * @author nobpe
 */
public class loai_the_model {
    int id;
    String ten_the;
    String uu_dai;
    String han_muc_su_dung;
    float phi_dich_vu;

    public loai_the_model() {
    }
    

    public loai_the_model(int id, String ten_the) {
        this.id = id;
        this.ten_the = ten_the;
    }

    
    
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return ten_the;
    }
    
    
}
