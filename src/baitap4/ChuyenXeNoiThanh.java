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
public class ChuyenXeNoiThanh extends ChuyenXe
{
    private int soTuyen;
    private double soKm;
    
    public ChuyenXeNoiThanh(int soTuyen, double soKm, String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu)
    {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public double getSoKm() {
        return soKm;
    }

    public void setSoKm(double soKm) {
        this.soKm = soKm;
    }
    
    @Override
    public String inCX()
    {
        return super.inCX() +
                "\nSố tuyến: " + soTuyen +
                "\nSố Km đi được: " + soKm;
    }
}
