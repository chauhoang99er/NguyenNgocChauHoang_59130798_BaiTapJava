/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Admin
 */
public class QuanLyChuyenXe 
{
    List<ChuyenXe> dsChuyenXe;
    
    public QuanLyChuyenXe()
    {
        dsChuyenXe = new ArrayList<>();
    }
    
    public void themChuyenXe(ChuyenXe cx)
    {
        dsChuyenXe.add(cx);
    }
    
    public double tinhDoanhThuNoiThanh()
    {
        double t = 0;
        for (int i = 0; i < dsChuyenXe.size(); i++)
        {
            if (dsChuyenXe.get(i) instanceof ChuyenXeNoiThanh)
                t += dsChuyenXe.get(i).getDoanhThu();
        }
        return t;
    }
    
    public double tinhDoanhThuNgoaiThanh()
    {
        double t = 0;
        for (int i = 0; i < dsChuyenXe.size(); i++)
        {
            if (dsChuyenXe.get(i) instanceof ChuyenXeNgoaiThanh)
                t += dsChuyenXe.get(i).getDoanhThu();
        }
        return t; 
    }
    
    public double tinhTongDT()
    {
        double t = 0;
        for (int i = 0; i < dsChuyenXe.size(); i++)
        {
            t += dsChuyenXe.get(i).getDoanhThu();
        }
        return t;
    }
    
    public void inDSChuyenXe()
    {
        for (int i = 0; i < dsChuyenXe.size(); i++)
        {
            System.out.println("Chuyến xe thứ " + (i + 1)+ ": \n" + dsChuyenXe.get(i).inCX());
        }
    }
}
