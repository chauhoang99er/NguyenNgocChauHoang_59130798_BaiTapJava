/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap5;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Admin
 */
public class QLDS implements IQLDS
{
    List<CaNhan> arr;
    
    public QLDS()
    {
        arr = new ArrayList<>();
    }

    @Override
    public void them(CaNhan p) 
    {
        arr.add(p);
    }

    @Override
    public void xoa(String ten) 
    {
        arr.removeIf(i -> i.getHoTen().equals(ten) );
    }

    @Override
    public void inDS() 
    {
        for (int i = 0; i < arr.size(); i++)
        {
            System.out.println("Ca Nhan" + (i+1)+ ": \n" + arr.get(i).HienThiTT());
        }
    }
}
