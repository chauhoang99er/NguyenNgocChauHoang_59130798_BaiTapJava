/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap5;

/**
 *
 * @author Admin
 */
public abstract class CaNhan 
{
    private final String hoTen;
    private final int tuoi;
    private final String diaChi;
    private final String sdt;
    
    public String getHoTen()
    {
        return hoTen;
    }
    
    public int getTuoi()
    {
        return tuoi;
    }
    
    public String getDiaChi()
    {
        return diaChi;
    }
    
    public String getSdt()
    {
        return sdt;
    }
    
    public CaNhan(String hoTen, int tuoi, String diaChi, String sdt)
    {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }
    
    public String HienThiTT()
    {
        return "Họ tên: " + hoTen +
                "\nTuổi: " + tuoi +
                "\nĐịa chỉ: " + diaChi +
                "\nSĐT: " + sdt;
    }
}
