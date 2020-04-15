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
public class SinhVienBiz extends SinhVienPoly
{
    public double diemMarketing;
    public double diemSales;
    
    public SinhVienBiz(String hoTen, double diemMarketing, double diemSales)
    {
        super(hoTen, "Biz");
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public double getDiem() 
    {
        return (diemMarketing*2 + diemSales)/3;
    }
    
}
