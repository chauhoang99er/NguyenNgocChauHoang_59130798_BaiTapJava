/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author Admin
 */
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Sinh Vien Poly
        SinhVienPoly svPoly = new SinhVienIT("Duy Phùng", 9, 8, 10);
        System.out.println("Sinh Viên Poly:");
        svPoly.xuat();
        System.out.println("Điểm: " + svPoly.getDiem() + "\nHọc lực: " + svPoly.getHocLuc());
        
        // Sinh Vien IT
        SinhVienIT svIT = new SinhVienIT("Hoàng Minh", 3, 5, 7);
        System.out.println("Sinh Viên IT:");
        svIT.xuat();
        System.out.println("Điểm: " + svIT.getDiem() + "\nHọc lực: " + svIT.getHocLuc());
        
        // Sinh Vien Biz
        SinhVienBiz svBiz = new SinhVienBiz("Minh Toàn", 7, 8);
        System.out.println("Sinh Viên Biz:");
        svBiz.xuat();
        System.out.println("Điểm: " + svBiz.getDiem() + "\nHọc lực: " + svBiz.getHocLuc());
    }
    
}
