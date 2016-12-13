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
public class GiangVien extends CanBo implements Comparable<CanBo>{
    private String khoa;
    private String trinhDo;
    private int phuCap;
    private int soTietDay;
    private int hsl;

    public GiangVien() {
        setType("Giang Vien");
    }
    
//    public void phuCap(){
//        if(this.getTrinhDo() == "cu nhan"){
//                setPhuCap(300);
//        }
//        else if (this.getTrinhDo() == "thac si"){
//             setPhuCap(500);
//        } else if(this.getTrinhDo() == "tien si"){
//             setPhuCap(1000);
//        }
//    }
    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public int getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(int phuCap) {
        this.phuCap = phuCap;
    }

    public int getSoTietDay() {
        return soTietDay;
    }

    public void setSoTietDay(int soTietDay) {
        this.soTietDay = soTietDay;
    }

    public int getHsl() {
        return hsl;
    }

    public void setHsl(int hsl) {
        this.hsl = hsl;
    }
    
    
    int xuatLuong(){
        return getHsl()*730 + getPhuCap() + getSoTietDay()*45;
    }
    public String value(){
        String value = String.format("%-20s%-15s%-15s%-10s%-15s%-15s%-10s", getHoTen(), getKhoa(), getTrinhDo(), getPhuCap(), getSoTietDay(), getHsl(), xuatLuong());
        return value;
    }
//    public String toString(){
//        return getHoTen() + " | " + getKhoa() + " | " + getTrinhDo() + " | " + getPhuCap() + " | " + getSoTietDay() + " | " + getHsl() + " | " + xuatLuong()  ;
//    }
    public String toString(){
        return value() ;
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
