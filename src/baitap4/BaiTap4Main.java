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
public class BaiTap4Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ChuyenXeNgoaiThanh cxNgoaiThanh1 = new ChuyenXeNgoaiThanh("Nha Trang", 2, "Ngoai1", "Nguyễn Văn A", "1", 110);
        ChuyenXeNgoaiThanh cxNgoaiThanh2 = new ChuyenXeNgoaiThanh("Sài Gòn", 3, "Ngoai2", "Nguyễn Văn B", "2", 210);
        ChuyenXeNgoaiThanh cxNgoaiThanh3 = new ChuyenXeNgoaiThanh("Bình Định", 1, "Ngoai3", "Nguyễn Văn C", "3", 50);
        
        ChuyenXeNoiThanh cxNoiThanh1 = new ChuyenXeNoiThanh(1, 2, "Noi1", "Nguyễn Văn D", "11", 190);
        ChuyenXeNoiThanh cxNoiThanh2 = new ChuyenXeNoiThanh(2, 3, "Noi2", "Nguyễn Văn E", "22", 390);
        ChuyenXeNoiThanh cxNoiThanh3 = new ChuyenXeNoiThanh(3, 1, "Noi3", "Nguyễn Văn F", "33", 120);
       
        //Tạo quản lý chuyến xe
        QuanLyChuyenXe ql1 = new QuanLyChuyenXe();
        
        ql1.themChuyenXe(cxNgoaiThanh1);
        ql1.themChuyenXe(cxNgoaiThanh2);
        ql1.themChuyenXe(cxNgoaiThanh3);   
        
        ql1.themChuyenXe(cxNoiThanh1);
        ql1.themChuyenXe(cxNoiThanh2);
        ql1.themChuyenXe(cxNoiThanh3);
        
        //In thông tin từng chuyến xe
        ql1.inDSChuyenXe();
        
        //Tổng doanh thu
        System.out.println("Tổng doanh thu xe ngoại thành: " + ql1.tinhDoanhThuNgoaiThanh());
        System.out.println("Tổng doanh thu xe nội thành: " + ql1.tinhDoanhThuNoiThanh());
        System.out.println("Tổng doanh thu các chuyến xe: " + ql1.tinhTongDT());
    }
    
}
