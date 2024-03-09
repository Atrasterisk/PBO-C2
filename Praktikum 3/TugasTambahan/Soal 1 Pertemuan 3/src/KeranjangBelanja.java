/*
 * Nama      : Muhammad Farhan Hafiz Alkirami
 * NIM       : 24060122140043
 * Tanggal   : 8 Maret 2024
 * Deskripsi : Class KeranjangBelanja yang berisi konstruktor dan method untuk class KeranjangBelanja
 * */


public class KeranjangBelanja {
    private String[] keranjang;
    private int count;

    public KeranjangBelanja() {
        keranjang = new String[5];
        count = 0;
    }

    public void addItem(String item) {
        assert (count < keranjang.length) : "Keranjang sudah penuh";

        keranjang[count] = item;
        count++;
    }

    public void printItems() {
        for (int i = 0; i < keranjang.length; i++) {
            System.out.println(keranjang[i]);
        }
    }
}
