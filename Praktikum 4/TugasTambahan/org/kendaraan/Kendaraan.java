/*
 * Nama      : Muhammad Farhan Hafiz Alkirami
 * NIM       : 24060122140043
 * Tanggal   : 16 Maret 2024
 * Deskripsi : Class Kendaraan yang berisi konsruktor dan method untuk class Kendaran
 * */

package org.kendaraan;

public class Kendaraan
{
    protected String nama;
    protected double kecepatan;

    public Kendaraan(String nama)
    {
        this.nama = nama;
        this.kecepatan = 0;
    }

    public String getNama()
    {
        return nama;
    }

    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan)
    {
        this.kecepatan = kecepatan;
    }

    public void cetakInfo()
    {
        System.out.println("Nama Kendaraan: " + this.getNama());
        System.out.println("Kecepatan Kendaraan: " + this.getKecepatan());
    }

    public void gas(int kecepatan, int durasi)
    {
        this.kecepatan += kecepatan * durasi;
    }

    public void berhenti()
    {
        this.kecepatan = 0;
    }

    public void klakson()
    {
        System.out.println("Klakson berbunyi");
    }
}
