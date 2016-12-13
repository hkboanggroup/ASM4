/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm3;

import java.util.Comparator;

/**
 *
 * @author HKbhoang
 */
public class luongSort implements Comparator<CanBo>{

    @Override
    public int compare(CanBo o1, CanBo o2) {
        if(o1.xuatLuong() < o2.xuatLuong()){
            return 1;
        }else if(o1.xuatLuong() > o2.xuatLuong()){
            return -1;
        }else{
            return 0;
        }
    }
    
}
