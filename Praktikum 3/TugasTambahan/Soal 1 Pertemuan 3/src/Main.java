public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();
        keranjang.addItem("Buku");
        keranjang.addItem("Pensil");
        keranjang.addItem("Penghapus");
        keranjang.addItem("Penggaris");
        keranjang.addItem("Meja Lipat");
        // Mencoba menambahkan item ketujuh, yang seharusnya gagal karena keranjang sudah penuh
        keranjang.addItem("Cermin");
        keranjang.printItems();
    }
}