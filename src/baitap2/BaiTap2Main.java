/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import baitap1.NhanVien;
/**
 *
 * @author Admin
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        NhanVien nv1 = new NhanVien("nhan vien 1", 19, "1", 100, 90);
        NhanVien nv2 = new NhanVien("nhan vien 2", 20, "2", 200, 200);
        NhanVien nv3 = new NhanVien("nhan vien 3", 22, "3", 150, 100);
        NhanVien nv4 = new NhanVien("nhan vien 4", 40, "4", 130, 110);
        NhanVien nv5 = new NhanVien("nhan vien 5", 10, "5", 10, 220);
        
        QuanLy ql = new QuanLy();
        ql.them(nv1);
        ql.them(nv2);
        ql.them(nv3);
        ql.them(nv4);
        ql.them(nv5);
        ql.inDS();
    }
    
}
