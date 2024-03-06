/*
 * Nama      : Muhammad Farhan Hafiz Alkirami
 * NIM       : 24060122140043
 * Tanggal   : 6 Maret 2024
 * Deskripsi : Class Asersi2 yang berisi program engaplikasikan class Lingkaran di dalamnya, serta melakukan asersi
 * */
class Lingkaran
{
    private double jariJari;
    public Lingkaran(double jariJari)
    {
        this.jariJari = jariJari;
    }

    public double hitungKeliling()
    {
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args)
    {
        double jariJari = 0;
        assert (jariJari > 0) : "jari-jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}

/*
* Secara konsep, yang kurang tepat pada program Asersi2 di atas yakni penggunaan asersi seharusnya digunakan untuk
* memvalidasi kondisi yang seharusnya selalu benar di saat pembangunan atau pengembangan kode untuk keperluan debugging,
* bukan untuk memvalidasi input dari pengguna atau keadaan yang dapat berubah selama eksekusi program.
* */