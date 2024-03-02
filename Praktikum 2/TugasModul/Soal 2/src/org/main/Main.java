/*
 * Nama      : Muhammad Farhan Hafiz Alkirami
 * NIM       : 24060122140043
 * Tanggal   : 2 Maret 2024
 * Deskripsi : Class Main yang berisi program utama yang mengaplikasikan class Orang, Mahasiswa dan WaliMahasiswa
 * */

package org.main;

import org.walimahasiswa.WaliMahasiswa;
import org.mahasiswa.Mahasiswa;

public class Main {
    public static void main(String[] args) {
        WaliMahasiswa wali = new WaliMahasiswa("Farhan", "12345", "123456789", "Temcy");

        Mahasiswa mahasiswa = new Mahasiswa("Hafiz", "54321", "20210001", "Informatika", wali);

        mahasiswa.cetak();
    }
}