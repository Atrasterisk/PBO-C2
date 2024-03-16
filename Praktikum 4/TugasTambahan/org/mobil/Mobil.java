/*
 * Nama      : Muhammad Farhan Hafiz Alkirami
 * NIM       : 24060122140043
 * Tanggal   : 16 Maret 2024
 * Deskripsi : Class Mobil yang berisi konsruktor dan method untuk class turunan dari Kendaraan, yaitu Mobil
 * */

package org.mobil;

import org.kendaraan.Kendaraan;

public class Mobil extends Kendaraan
{
    private double jumlahPintu;

    public Mobil(double jumlahPintu)
    {
        super("Mobil");
        this.jumlahPintu = jumlahPintu;
    }

    public double getJumlahPintu()
    {
        return this.jumlahPintu;
    }

    public void setJumlahPintu(double jumlahPintu)
    {
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void cetakInfo()
    {
        super.cetakInfo();
        System.out.println("Jenis kendaraan: Mobil");
        System.out.println("Jumlah pintu mobil: " + getJumlahPintu());
    }

    public void bukaPintu(double nomorPintu)
    {
        if(nomorPintu < this.jumlahPintu)
        {
            System.out.println("Pintu ke-" + nomorPintu + " terbuka");
        }
    }

    public void klakson()
    {
        super.klakson();
        System.out.println("Yang membunyikannya adalah mobil!");
    }
}
