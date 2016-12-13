/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm3;

import java.util.*;

/**
 *
 * @author HKbhoang
 */
public class CanBoListWithArrayList {
    private List<CanBo> list = null;

    public CanBoListWithArrayList() {
        list = new ArrayList();
    }
    public void printTitleGV(){
        String value = String.format("%-20s%-15s%-15s%-10s%-15s%-15s%-10s", "Ho Ten", "Khoa", "Trinh Do", "Phu Cap", "So Tiet Day", "He So Luong", "Tien Luong");
        System.out.println(value); 
    }
    public void printTitleNV(){
        String value = String.format("%-20s%-15s%-15s%-10s%-15s%-15s%-10s", "Ho Ten", "Phong Ban", "Chuc Vu", "Phu Cap", "So Ngay Cong", "He So Luong", "Tien Luong");
        System.out.println(value); 
    }
    void addCanBo(){
        Scanner sc = new Scanner(System.in);
        String hoTen;
        int loaiCanBo;
        String khoa = "" ;
        int trinhDo ;
        int soTietDay ;
        int hsl ;
        
        String phongBan;
        int chucVu;
        int soNgayCong;
        
        
        System.out.print("Xin nhap ho ten Can bo: ");
        hoTen = sc.nextLine();
        System.out.println("Loai Can bo(nhap so nguyen 1 hoac 2)");
        System.out.println("1. Giang Vien");
        System.out.println("2. Nhan Vien");
        System.out.print("Chon Can bo loai: ");
        loaiCanBo = sc.nextInt();
        if(loaiCanBo == 1){
            Scanner sc1 = new Scanner(System.in);
            System.out.print("Nhap khoa: ");
            khoa = sc1.nextLine();
            System.out.println("Nhap trinh do giang vien(nhap mot so 1 or 2 or 3): ");
            System.out.println("1. Cu nhan ");
            System.out.println("2. Thac si ");
            System.out.println("3. Tien si ");
            System.out.print("Chon : ");
            trinhDo = sc1.nextInt();
            System.out.print("Nhap so tiet day: ");
            soTietDay = sc1.nextInt();
            System.out.print("Nhap he so luong: ");
            hsl = sc.nextInt();
            
            GiangVien giangVien = new GiangVien();
            giangVien.setHoTen(hoTen);
            //giangVien.setType("Giang Vien");
            giangVien.setKhoa(khoa);
            
           switch(trinhDo){
               case 1: 
                   giangVien.setTrinhDo("Cu nhan");
                   giangVien.setPhuCap(300);
                   break;
               case 2:
                   giangVien.setTrinhDo("Thac si");
                   giangVien.setPhuCap(500);
                   break;
               case 3:
                   giangVien.setTrinhDo("Tien si");
                   giangVien.setPhuCap(1000);
                   break;
               default:
                   System.out.println("Nhap sai");
           }
                
            
            //giangVien.phuCap();
            giangVien.setSoTietDay(soTietDay);
            giangVien.setHsl(hsl);
            list.add(giangVien);
            System.out.println("Them giang vien thanh cong");
//            for (CanBo canBo : list) {
//                System.out.println(canBo);
//            }
            
            
        }else if(loaiCanBo == 2){
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Nhap phong ban: ");
            phongBan = sc2.nextLine();
            System.out.println("Nhap chuc vu cua nhan vien(chon 1 or 2 or 3): ");
            System.out.println("1. Truong phong");
            System.out.println("2. Pho phong");
            System.out.println("3. Nhan Vien");
            System.out.print("Chon : ");
            chucVu = sc2.nextInt();
            System.out.println("Nhap so ngay cong: ");
            soNgayCong = sc2.nextInt();
            System.out.println("Nhap he so luong: ");
            hsl = sc2.nextInt();
            
            NhanVien nhanVien = new NhanVien();
            nhanVien.setHoTen(hoTen);
            //nhanVien.setType("Nhan vien");
            nhanVien.setPhongBan(phongBan);
            
            switch(chucVu){
               case 1: 
                   nhanVien.setChucVu("Truong Phong");
                   nhanVien.setPhuCap(2000);
                   break;
               case 2:
                   nhanVien.setChucVu("Pho phong");
                   nhanVien.setPhuCap(1000);
                   break;
               case 3:
                   nhanVien.setChucVu("Nhan vien");
                   nhanVien.setPhuCap(500);
                   break;
               default:
                   System.out.println("Nhap sai");
           }
            
            //nhanVien.phuCap();
            nhanVien.setSoNgayCong(soNgayCong);
            nhanVien.setHsl(hsl);
            list.add(nhanVien);
            System.out.println("Them nhan vien thanh cong");
            
        }else{
            System.out.println("Du lieu khong hop le.");
        }
        
        
        
            
        
        
    }
    
    void xuatDanhSachGV(){
        ArrayList<GiangVien> listGV = new ArrayList();
        for (CanBo canBo : list) {
            if (canBo.getType() == "Giang Vien") {
                listGV.add(((GiangVien)canBo));
            }
        }
        
        Collections.sort(listGV);
        //Collections.sort(listGV, new luongSort());
        System.out.println();
        System.out.println();
        printTitleGV();
        for (GiangVien giangVien : listGV) {
            giangVien.value();
            System.out.println(giangVien);
        }
        System.out.println();
        System.out.println();
    }
    void xuatDanhSachNV(){
        ArrayList<NhanVien> listNV = new ArrayList();
        for (CanBo canBo : list) {
            if (canBo.getType() == "Nhan Vien") {
                listNV.add(((NhanVien)canBo));
            }
        }
        
        Collections.sort(listNV);
        //Collections.sort(listNV, new luongSort());
        printTitleNV();
        System.out.println();
        System.out.println();
        for (NhanVien nhanVien : listNV) {
            
            System.out.println(nhanVien);
        }
        System.out.println();
        System.out.println();
    }
    
// yeu cau 2, tim kiem theo ten va phong ban
    void searchNV(){
        String tenNV;
        String phongBan;
        Scanner sc = new Scanner(System.in);
        System.out.println("Tim kiem nhan vien : ");
        System.out.print("Xin nhap ten nhan vien can tim: ");
        tenNV = sc.nextLine();
        System.out.print("Xin nhap phong ban: ");
        phongBan = sc.nextLine();
        System.out.println("Ket qua: ");
        System.out.println();
        printTitleNV();
        
        for (CanBo canBo : list) {
            if (canBo.getHoTen().equals(tenNV) && ((NhanVien)canBo).getPhongBan().equals(phongBan)) {
                System.out.println(canBo);
            }else{
                System.out.println("Khong tim thay.");
            }
        }
        System.out.println();
        System.out.println();
        
    }
}
