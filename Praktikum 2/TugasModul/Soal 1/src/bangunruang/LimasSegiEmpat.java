/*
* Nama      : Muhammad Farhan Hafiz Alkirami
* NIM       : 24060122140043
* Tanggal   : 2 Maret 2024
* Deskripsi : Class Limas Segi Empat yang berisi konstruktor dan operasi berkait dengan Limas Segi Empat
* */

package bangunruang;
import bangundatar.*;
public class LimasSegiEmpat
{
    private BujurSangkar alas;
    private SegitigaSamaSisi sisi;

    private double tinggi;

    public LimasSegiEmpat(double sisiAlas, double tinggi)
    {
        this.alas = new BujurSangkar(sisiAlas);
        this.sisi = new SegitigaSamaSisi(sisiAlas, Math.sqrt(Math.pow((sisiAlas)/2, 2) + Math.pow(tinggi, 2)));
        this.tinggi = tinggi;
    }

    public double hitungVolume()
    {
        double panjangAlas = alas.getPanjangSisi();
        double tinggi = this.tinggi;
        return (panjangAlas * panjangAlas * tinggi)/3;
    }

    public double hitungLuasAlas()
    {
        double panjangSisi = alas.getPanjangSisi();
        double tinggiSegitiga = Math.sqrt(Math.pow((this.alas.getPanjangSisi())/2, 2) + Math.pow(this.tinggi, 2));
        return (panjangSisi * panjangSisi) + 4 * (panjangSisi * tinggiSegitiga) / 2;
    }

}

