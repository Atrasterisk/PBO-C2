/**
 * File     	: Titik.java		28/02/24
 * Nama penulis : Muhammad Farhan Hafiz Alkirami
 * NIM          : 24060122140043
 * Deskripsi 	: Kelas yang berisi main dari Titik
 **/

public class Titik
{
    private double absis, ordinat;
    static double counterTitik;

    public Titik()
    {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    public Titik(double abs, double ord)
    {
        this.absis = abs;
        this.ordinat = ord;
        counterTitik++;
    }

    public void setAbsis(double abs)
    {
        absis = abs;
    }

    public void setOrdinat(double ord)
    {
        ordinat = ord;
    }

    public double getAbsis()
    {
        return absis;
    }

    public double getOrdinat()
    {
        return ordinat;
    }

    public static double getCounterTitik()
    {
        return counterTitik;
    }

    public double getJarakPusat(Titik t) {
        return Math.sqrt(Math.pow(t.absis, 2) + Math.pow(t.ordinat, 2));
    }

    private void refleksiX(Titik t) {
        double ordinat = t.getOrdinat();
        ordinat = ordinat * -1;
        t.setOrdinat(ordinat);
    }

    public void refleksiY(Titik t) {
        double absis = t.getAbsis();
        absis = absis * -1;
        t.setAbsis(absis);
    }

   public void getRefleksiX(Titik t){
        refleksiX(t);
   }

    public void getRefleksiY(Titik t){
        refleksiY(t);
    }

}