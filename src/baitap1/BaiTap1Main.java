/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author Admin
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("Thong Tin Nhan Vien 1: ");
        NhanVien nv1 = new NhanVien("Nguyen Hoang Minh", 22, "31 Pham Tu", 50000, 310);
        System.out.println(nv1.getThongTin());
        System.out.println("Thong Tin Nhan Vien 2: ");
        NhanVien nv2 = new NhanVien("Vo Minh Toan", 21, "Quang Binh", 15000, 80);       
        System.out.println(nv2.getThongTin());
    }
    
}
