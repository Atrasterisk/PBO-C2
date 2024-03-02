/*
 * Nama      : Muhammad Farhan Hafiz Alkirami
 * NIM       : 24060122140043
 * Tanggal   : 2 Maret 2024
 * Deskripsi : Class yang berisi program utama berkaitan dengan Limas Segi Empat
 * */


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
