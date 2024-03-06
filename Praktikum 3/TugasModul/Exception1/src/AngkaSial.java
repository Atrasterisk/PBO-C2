/*
 * Nama      : Muhammad Farhan Hafiz Alkirami
 * NIM       : 24060122140043
 * Tanggal   : 6 Maret 2024
 * Deskripsi : Class AngkaSial yang berisi program utama yang mengaplikasikan class ExceptionOnArray dan AngkaSialException
 * */

public class AngkaSial
{
    public void cobaAngka(int angka) throws AngkaSialException //Inisiasi AngkaSialException
    {
        if (angka == 13)
        {
            throw new AngkaSialException(); //Membuat objek exception AngkaSialException
        }
        System.out.println(angka + " Bukan angka sial");
    }

    public static void main(String[] args)
    {
        AngkaSial as = new AngkaSial();
        try
        {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase)
        {
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/*
* Ya, baris 12 (yang dimana di code ini terdapat pada line 16) akan tetap dijalankan hingga line 25 di eksekusi karena
* method cobaAngka berada di balok try, dimana tidak akan dilemparkan ke blok catch jika belum menemukan exception
*
* Ya, baris 21 (Dalam code ini berada di line 27) akan dieksekusi dikarenakan adanya objek exception dari blok code try yang
* memiliki class AngkaSialException
* */