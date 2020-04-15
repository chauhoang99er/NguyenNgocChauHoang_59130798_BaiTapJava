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
public class BaiTap5Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       HocSinh hs1 = new HocSinh("59CNTT3", "Nhảy", "Nguyễn Văn A", 21, "Nha Trang", "12");
       HocSinh hs2 = new HocSinh("59CNTT3", "Múa", "Trần Thị B", 20, "Quy Nhơn", "34");
       HocSinh hs3 = new HocSinh("59CNTT3", "Hát", "Võ Minh C", 22, "Quảng Bình", "15");
       
       GiaoVien gvcn = new GiaoVien("Mẫu Thiết Kế", "CNTT", "Huỳnh Tuấn Anh", 43, "Nha Trang", "123");
       GiaoVien gv1 = new GiaoVien("Tiếng Anh", "Ngoại ngữ", "Trần Tố Nga", 34, "Nha Trang", "124");
       GiaoVien gv2 = new GiaoVien("Ngôn Ngữ XML", "CNTT", "Thanh Thúy", 30, "Nha Trang", "125");
       
       LopHoc lh = new LopHoc(gvcn);
       lh.themHocSinh(hs1);
       lh.themHocSinh(hs2);
       lh.themHocSinh(hs3);
       
       lh.themGVGD(gv1);
       lh.themGVGD(gv2);
       
       lh.inDSHS();
       lh.inDSGVGD();
    }
    
}
