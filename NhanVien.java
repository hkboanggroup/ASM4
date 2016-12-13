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
public class NhanVien extends CanBo implements Comparable<CanBo>{

    private String phongBan;
    private String chucVu;
    private int phuCap;
    private int soNgayCong;
    private int hsl;
    
    public NhanVien() {
        setType("Nhan Vien");
    }
    
    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public int getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(int phuCap) {
        this.phuCap = phuCap;
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    public int getHsl() {
        return hsl;
    }

    public void setHsl(int hsl) {
        this.hsl = hsl;
    }
    
    
    

    @Override
    int xuatLuong() {
        return getHsl() * 730 + getPhuCap() + getSoNgayCong() * 30;
    }

//    @Override
//    void phuCap() {
//        if(this.getChucVu() == "truong phong"){
//                setPhuCap(2000);
//        }
//        else if (this.getChucVu() == "pho phong"){
//             setPhuCap(1000);
//        } else if(this.getChucVu() == "nhan vien") {
//             setPhuCap(500);
//        }
//    }
    public String value(){
        String value = String.format("%-20s%-15s%-15s%-10s%-15s%-15s%-10s", getHoTen(), getPhongBan(), getChucVu(), getPhuCap(), getSoNgayCong(), getHsl(), xuatLuong());
        return value;
    }
//    public String toString(){
//        return getHoTen() + " | " + getPhongBan() + " | " + getChucVu() + " | " + getPhuCap() + " | " + getSoNgayCong() +  " | " + getHsl() + " | " + xuatLuong();
//    }
    public String toString(){
        return value();
    }
    
    @Override
    public int compareTo(CanBo o) {
        int value = this.getHoTen().compareTo(o.getHoTen());
        if(value == 0 && this.xuatLuong() > o.xuatLuong()){
            return -1;
        }else{
            return this.getHoTen().compareTo(o.getHoTen());
        }
    }
}
