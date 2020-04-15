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
public abstract class SinhVienPoly 
{
    public String hoTen;
    public String nganh;
    public SinhVienPoly(String hoTen, String nganh)
    {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    
    public abstract double getDiem();
    public String getHocLuc()
    {
        double t = this.getDiem();
        //Dieu kien
        if (t<5) return "Yếu";
        else if (t < 6.5) return "Trung Bình";
        else if (t < 7.5) return "Khá";
        else if (t < 9) return "Giỏi";
        else return "Xuất Sắc";
    }
    
    public void xuat()
    {
        System.out.println("Họ và Tên: " + hoTen + "\n" + "Ngành học: " + nganh);
    }
}
