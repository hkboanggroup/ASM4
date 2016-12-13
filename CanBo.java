/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm3;

/**
 *
 * @author HKbhoang
 */
public abstract class CanBo {
    private String hoTen;
    private String type;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    abstract int xuatLuong();
    //abstract void phuCap();
}
