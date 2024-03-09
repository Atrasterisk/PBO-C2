/*
 * Nama      : Muhammad Farhan Hafiz Alkirami
 * NIM       : 24060122140043
 * Tanggal   : 8 Maret 2024
 * Deskripsi : Class Anggota yang berisi konsruktor dan method untuk class Anggota
 * */


public class Anggota {
    private String nama;
    private Buku[] bukuPinjaman;
    private int jumlahBukuPinjaman;

    public Anggota(String nama) {
        this.nama = nama;
        bukuPinjaman = new Buku[3];
        jumlahBukuPinjaman = 0;
    }

    public String getNama() {
        return nama;
    }

    public Buku[] getBukuPinjaman() {
        return bukuPinjaman;
    }

    public int getJumlahBukuPinjaman() {
        return jumlahBukuPinjaman;
    }

    public void pinjamBuku(Buku buku) throws MaksimumBukuTerpinjamException, BukuTidakTersediaException {
        // TODO 2: Buat kondisi untuk mencegah jumlah buku yang dipinjam melebihi 3 dengan throw keyword
        if (this.jumlahBukuPinjaman >= 3) {
            throw new MaksimumBukuTerpinjamException("Buku yang dipinjam sudah melebihi 3!");
        }
        // TODO 3: Buat kondisi untuk mencegah buku yang tidak tersedia dipinjam dengan throw keyword
        if (buku.isTersedia() == false) {
            throw new BukuTidakTersediaException("Buku sudah tidak tersedia");
        }

        buku.setTersedia(false);
        bukuPinjaman[jumlahBukuPinjaman] = buku;
        jumlahBukuPinjaman++;
    }

}
