package bangundatar;
import poligon.Poligon;

public class SegitigaSamaSisi extends Poligon
{
    private double panjangAlas;
    private double tinggi;

    public SegitigaSamaSisi(double panjangAlas, double tinggi)
    {
        this.jumlahSisi = 3;
        this.panjangAlas = panjangAlas;
        this.tinggi = tinggi;
    }
    public double hitungLuas()
    {
        return (panjangAlas * tinggi)/2;
    }

    public double getPanjangSisiSegitiga()
    {
        return Math.sqrt(Math.pow((panjangAlas/2),2) + Math.pow(tinggi, 2));
    }
}