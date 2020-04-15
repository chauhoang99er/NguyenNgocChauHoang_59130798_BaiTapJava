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
public class HocSinh extends CaNhan
{
    private final String lop;
    private final String nangKhieu;
    
    public HocSinh(String lop, String nangKhieu, String hoTen, int tuoi, String diaChi, String sdt)
    {
        super(hoTen, tuoi, diaChi, sdt);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }
    
    @Override
    public String HienThiTT()
    {
        return super.HienThiTT() +
                "\nLớp: " + lop +
                "\nNăng khiếu: " + nangKhieu;
    }
}
