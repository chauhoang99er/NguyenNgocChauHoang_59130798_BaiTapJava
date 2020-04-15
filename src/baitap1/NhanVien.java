/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author Admin
 */
public class NhanVien 
{
    private String ten;
    private int tuoi;
    private String diachi;
    private double tienluong;
    private int tongsogiolam;
    //Constructor khong tham so
    public NhanVien()
    {
    }
    //Constructor co tham so
    public NhanVien(String ten, int tuoi, String diachi, double tienluong, int tongsogiolam)
    {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.tienluong = tienluong;
        this.tongsogiolam = tongsogiolam;
    }
    //Ham get/set
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public double getTienluong() {
        return tienluong;
    }

    public void setTienluong(double tienluong) {
        this.tienluong = tienluong;
    }

    public int getTongsogiolam() {
        return tongsogiolam;
    }

    public void setTongsogiolam(int tongsogiolam) {
        this.tongsogiolam = tongsogiolam;
    }
    //Cac phuong thuc
        public String getThongTin()
    {
        return "Tên: "+ ten +"\n"
                +"Tuổi: " + tuoi+"\n"
                +"Địa chỉ: "+ diachi +"\n"
                +"Tiền lương: "+ tienluong +"\n"
                +"Tổng giờ làm: "+ tongsogiolam +"\n"
                +"Thưởng: " + tinhthuong();  }
 
    public double tinhthuong()
    {
        double thuong;
        if(tongsogiolam >= 200)
            return thuong = tienluong * 20/100;
        else if(tongsogiolam < 200 && tongsogiolam >= 100)
            return thuong = tienluong * 10/100;
        else return thuong = 0;
    }
}
