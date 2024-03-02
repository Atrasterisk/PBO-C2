/*
 * Nama      : Muhammad Farhan Hafiz Alkirami
 * NIM       : 24060122140043
 * Tanggal   : 2 Maret 2024
 * Deskripsi : Class Orang yang berisi konstruktor dan operasi berkait dengan Orang
 * */

package org.orang;
public class Orang
{
    protected String nama;
    protected String nik;

    public Orang(){
        this.nama = "";
        this.nik = "";
    }
    public Orang(String nama, String nik)
    {
        this.nama = nama;
        this.nik = nik;
    }

    public String getNama()
    {
        return nama;
    }
    public String getNik()
    {
        return nik;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setNik(String nik){
        this.nik = nik;
    }
}
