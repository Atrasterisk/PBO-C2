/*
 * Nama      : Muhammad Farhan Hafiz Alkirami
 * NIM       : 24060122140043
 * Tanggal   : 2 Maret 2024
 * Deskripsi : Class WaliMahasiswa yang berisi konstruktor dan operasi berkait dengan WaliMahasiswa
 * */

package org.walimahasiswa;
import org.orang.Orang;

public class WaliMahasiswa extends Orang{
    private String nomorHp;
    private String alamat;

    public WaliMahasiswa(String nama, String nik, String nomorHp, String alamat)
    {
        super(nama, nik); // Memakai super untuk memanggil konstruktor dari class induk
        this.nomorHp = nomorHp;
        this.alamat = alamat;
    }

    public String getNomorHp()
    {
        return this.nomorHp;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setNomorHp(String nomorHp) {
        this.nomorHp =  nomorHp;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}