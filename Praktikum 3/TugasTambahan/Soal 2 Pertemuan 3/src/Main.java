/*
 * Nama      : Muhammad Farhan Hafiz Alkirami
 * NIM       : 24060122140043
 * Tanggal   : 8 Maret 2024
 * Deskripsi : Class yang berisi program utama berkaitan dengan Buku dan Anggota, mengecek exception menggunakan try catch
 * */

public class Main {
    public static void main(String[] args) {
        Anggota anggota = new Anggota("Farhan Hafiz");
        Buku buku1 = new Buku("Overlord");
        Buku buku2 = new Buku("Shangri-La Frontier");
        Buku buku3 = new Buku("Mahouka Koukou no Rettousei");
        Buku buku4 = new Buku("To Aru Majutsu no Index");

        try {
            anggota.pinjamBuku(buku1);
            anggota.pinjamBuku(buku2);

            //anggota.pinjamBuku(buku2);

            anggota.pinjamBuku(buku3);
            anggota.pinjamBuku(buku4);

        } catch (MaksimumBukuTerpinjamException mbte) {
            System.out.println(mbte.getMessage());
            System.out.println("Anda sudah tidak bisa melakukan peminjaman buku sekarang");
        } catch (BukuTidakTersediaException btte) {
            System.out.println(btte.getMessage());
            System.out.println("Silakan meminjam buku yang tersedia");
        }
    }
}
