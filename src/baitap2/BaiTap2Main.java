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
        NhanVien nv1 = new NhanVien("Văn A", 19, "Nha Trang", 100, 90);
        NhanVien nv2 = new NhanVien("Thị B", 20, "Bình Thuận", 200, 200);
        NhanVien nv3 = new NhanVien("Tố C", 22, "Ninh Thuận", 150, 100);
        NhanVien nv4 = new NhanVien("Bích D", 40, "Phú Yên", 130, 110);
        NhanVien nv5 = new NhanVien("Ngọc E", 10, "Lào Cai", 10, 220);
        
        QuanLy ql = new QuanLy();
        ql.them(nv1);
        ql.them(nv2);
        ql.them(nv3);
        ql.them(nv4);
        ql.them(nv5);
        ql.inDS();
    }
    
}
