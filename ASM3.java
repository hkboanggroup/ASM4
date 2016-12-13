/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm3;

import java.util.Scanner;

/**
 *
 * @author HKbhoang
 */
public class ASM3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CanBoListWithArrayList list = new CanBoListWithArrayList();
        int choice;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        
        do {            
            System.out.println("Chuong trinh quan ly truong dai hoc: ");
            System.out.println("Xin nhap mot so nguyen (1, 2, 3) de thuc thi chuc nang tuong ung");
            System.out.println("1. Them can bo vao danh sach");
            System.out.println("2. Tim kiem can bo nhan vien theo Ten và Phong ban: ");
            System.out.println("3. Xuat ra danh sach Giang Vien theo thu tu Alphabet: ");
            System.out.println("4. Ket thuc chuong trinh.");
            System.out.print("Chon so de thuc hien: ");
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    list.addCanBo();
                    
                    break;
                case 2:
                    list.searchNV();
                    break;
                case 3:
                    list.xuatDanhSachGV();
                    
                    break;
                case 4:
                    flag = false;
                default:
                    System.out.println("Du lieu khong hop le.");
                    
            }
            
        } while (flag);
    }
    
}
