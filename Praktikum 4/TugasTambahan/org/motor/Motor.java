/*
 * Nama      : Muhammad Farhan Hafiz Alkirami
 * NIM       : 24060122140043
 * Tanggal   : 16 Maret 2024
 * Deskripsi : Class Motor berisi konsruktor dan method untuk class turunan dari Kendaraan, yaitu Motor
 * */


package org.motor;

import org.kendaraan.Kendaraan;

public class Motor extends Kendaraan
{
    private double cc;

    public Motor(int cc)
    {
        super("Motor");
        this.cc = cc;
    }

    public double getCc()
    {
        return cc;
    }

    public void setCc(double cc)
    {
        this.cc = cc;
    }

    public void cetakInfo()
    {
        super.cetakInfo();
        System.out.println("Jenis kendaraan: Motor");
        System.out.println("Mesin motor berkapasitas: " + this.getCc() + " cc");
    }

    public double hitungHorsePower(double angka)
    {
        double cc = this.cc;
        return cc / angka;
    }

    @Override
    public void klakson() {
        super.klakson();
        System.out.println("Yang membunyikannya adalah motor!");
    }
}
