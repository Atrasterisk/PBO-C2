package main;
import bangundatar.*;
import bangunruang.LimasSegiEmpat;

public class MLimasSegiEmpat
{
    public static void main (String[] args)
    {
        LimasSegiEmpat limasSegiEmpat = new LimasSegiEmpat(3, 4);

        System.out.println("Luas permukaan limas segi empat dengan panjang sisi alas 3 satuan dan tinggi 4 satuan: " + limasSegiEmpat.hitungLuasAlas());
        System.out.println("Volume limas segi empat dengan panjang sisi alas 3 satuan dan tinggi 4 satuan: " + limasSegiEmpat.hitungVolume());
    }
}
