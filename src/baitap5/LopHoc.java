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
public class LopHoc 
{
    private final QLDS dshs;
    private final QLDS dsgvgd;
    private final GiaoVien gvcn;
    
    public LopHoc(GiaoVien gvcn)
    {
        this.gvcn = gvcn;
        dshs = new QLDS();
        dsgvgd = new QLDS();
    }
    
    public void themHocSinh (HocSinh hs)
    {
        dshs.them(hs);
    }
    
    public void themGVGD (GiaoVien gv)
    {
        dsgvgd.them(gv);
    }
    
    public void inDSHS ()
    {
        dshs.inDS();
    }
    
    public void inDSGVGD ()
    {
        dsgvgd.inDS();
    }
}
