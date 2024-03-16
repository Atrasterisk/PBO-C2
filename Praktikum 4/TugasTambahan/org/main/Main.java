/*
 * Nama      : Muhammad Farhan Hafiz Alkirami
 * NIM       : 24060122140043
 * Tanggal   : 16 Maret 2024
 * Deskripsi : Implementasi class Kendaraan beserta subclassnya
 * */

package org.main;

import org.kendaraan.Kendaraan;
import org.mobil.Mobil;
import org.truk.Truk;
import org.motor.Motor;

public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil(4);
        mobil1.setKecepatan(30);
        mobil1.cetakInfo();
        mobil1.bukaPintu(2);
        mobil1.klakson();

        System.out.println();

        Truk truk1 = new Truk(5000);
        truk1.gas(30,5);
        truk1.cetakInfo();
        truk1.muatBarang(3000);
        System.out.println("\nMelakukan method muatBarang dan berhenti\n");
        truk1.berhenti();
        truk1.cetakInfo();
        truk1.klakson();

        System.out.println();

        Motor motor1 = new Motor(150);
        motor1.gas(20,3);
        motor1.cetakInfo();
        double horsePower = motor1.hitungHorsePower(1.5);
        System.out.println("Horsepower motor: " + horsePower);
        motor1.klakson();
    }
}

