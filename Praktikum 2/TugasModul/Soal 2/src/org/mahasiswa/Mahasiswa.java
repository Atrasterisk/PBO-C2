/*
 * Nama      : Muhammad Farhan Hafiz Alkirami
 * NIM       : 24060122140043
 * Tanggal   : 2 Maret 2024
 * Deskripsi : Class Mahasiswa yang berisi konstruktor dan operasi berkait dengan Mahasiswa
 * */

package org.mahasiswa;

import org.orang.Orang;
import org.walimahasiswa.WaliMahasiswa;

public class Mahasiswa extends Orang {
    private String nim;
    private String jurusan;
    private WaliMahasiswa wali;

    public Mahasiswa(String nama, String nik, String nim, String jurusan, WaliMahasiswa wali) {
        super(nama, nik);
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
    }

    public String getNim() {
        return this.nim;
    }

    public String getJurusan() {
        return this.jurusan;
    }

    public WaliMahasiswa getWali() {
        return this.wali;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setWali(WaliMahasiswa wali) {
        this.wali = wali;
    }

    public void cetak() {
        System.out.println("Mahasiswa\nNama     : " + getNama() + "\nNIM      : " + getNim() + "\nJurusan  : " + getJurusan());
        System.out.println("\nWali Mahasiswa\nNama     : " + getWali().getNama() + "\nNomor HP : " + getWali().getNomorHp() + "\nAlamat   : " + getWali().getAlamat());
    }
}
