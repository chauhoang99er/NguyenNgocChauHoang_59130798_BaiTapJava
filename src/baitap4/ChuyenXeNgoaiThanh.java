/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

/**
 *
 * @author Admin
 */
public class ChuyenXeNgoaiThanh extends ChuyenXe
{
    private String noiDen;
    private int soNgayDiDuoc;
    
    public ChuyenXeNgoaiThanh(String noiDen, int soNgayDiDuoc, String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu)
    {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
    
    @Override
    public String inCX()
    {
        return super.inCX() +
                "\nNơi đến: " + noiDen +
                "\nSố ngày đi được: " + soNgayDiDuoc;
    }
}
