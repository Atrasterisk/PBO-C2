/*
 * Nama      : Muhammad Farhan Hafiz Alkirami
 * NIM       : 24060122140043
 * Tanggal   : 16 Maret 2024
 * Deskripsi : Class Truk yang berisi konsruktor dan method untuk class turunan dari Kendaraan, yaitu Truk
 * */

package org.truk;

import org.kendaraan.Kendaraan;

public class Truk extends Kendaraan
{
    private double kapasitasMuatan, beratMuatan;

    public Truk(double kapasitasMuatan)
    {
        super("Truk");
        this.kapasitasMuatan = kapasitasMuatan;
    }

    public double getKapasitasMuatan()
    {
        return this.kapasitasMuatan;
    }

    public void setKapasitasMuatan()
    {
        this.kapasitasMuatan = kapasitasMuatan;
    }

    public double getBeratMuatan()
    {
        return this.beratMuatan;
    }

    public void setBeratMuatan()
    {
        this.beratMuatan = beratMuatan;
    }

    @Override
    public void cetakInfo()
    {
        super.cetakInfo();
        System.out.println("Jenis kendaraan: Truk");
        System.out.println("Kapasitas truk: " + this.getKapasitasMuatan());
        System.out.println("Berat muatan truk: " + this.getBeratMuatan());
    }

    public void muatBarang(int berat)
    {
        if (this.beratMuatan + berat <= kapasitasMuatan)
        {
            this.beratMuatan += berat;
        }
    }

    public void klakson()
    {
        super.klakson();
        System.out.println("Yang membunyikannya adalah truk!");
    }

}
