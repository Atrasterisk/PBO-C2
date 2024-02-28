/**
 * File     	: MTitik.java		28/02/24
 * Nama penulis : Muhamad Farhan Hafiz Alkirami
 * NIM          : 24060122140043
 * Deskripsi 	: Kelas yang berisi driver dari Titik
 **/


public class MTitik
{
    public static void main(String[] args)
    {
        Titik t1, t2, t3;

        t1 = new Titik();
        t2 = new Titik();
        t3 = new Titik(5,6);

        t1.setAbsis(1);
        t1.setOrdinat(2);
        t2.setAbsis(3);
        t2.setOrdinat(4);

        System.out.println("Jumlah objek titik: " + Titik.getCounterTitik() );
        System.out.println("t1 = (" + t1.getAbsis() + "," + t1.getOrdinat() + ")" );
        System.out.println("t2 = (" + t2.getAbsis() + "," + t2.getOrdinat() + ")" );
        System.out.println("t3 = (" + t3.getAbsis() + "," + t3.getOrdinat() + ")" );

        t1.getRefleksiX(t1);
        t2.getRefleksiY(t2);
        System.out.println("Refleksi sumbu-X pada titik t1 = (" + t1.getAbsis() + "," + t1.getOrdinat() + ")" );
        System.out.println("Refleksi sumbu-Y pada titik t2 = (" + t2.getAbsis() + "," + t2.getOrdinat() + ")" );
        System.out.println("Jarak titik t3 ke (0,0) adalah = " + t1.getJarakPusat(t3));
    }
}

/*
* Kesimpulan
* Access modifier Titik berpengaruh pada hasil main pada MTitik
* Jika konstruktornya private, maka konstruktornya tidak bisa diakses, mengakibatkan objek tidak terbentuk
* Jika atributnya private, maka atribut objek Titik yang telah dibuat tidak bisa diakses melalui MTitik
* Jika methodnya private, maka method tersebut tidak bisa dipanggil melalui luar class Titik
*/