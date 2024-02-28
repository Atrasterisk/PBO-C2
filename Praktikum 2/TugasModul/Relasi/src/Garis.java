public class Garis {
    private Titik titikAwal, titikAkhir;

    public Garis(){
        this.titikAwal = new Titik();
        this.titikAkhir = new Titik();
    }

    public Garis(Titik a, Titik b){
        this.titikAwal = a;
        this.titikAkhir = b;
    }

    public void setTitikAwal(double abs, double ord){
        titikAwal.setAbsis(abs);
        titikAwal.setOrdinat(ord);
    }

    public void setTitikAkhir(double abs, double ord){
        titikAkhir.setAbsis(abs);
        titikAkhir.setOrdinat(ord);
    }

    public Titik getTitikAwal(){
        return titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public double getPanjang() {
        return Math.sqrt(Math.pow(titikAkhir.getAbsis() - titikAwal.getAbsis(), 2) + Math.pow(titikAkhir.getOrdinat() - titikAwal.getOrdinat(), 2));
    }

    public double getGradien() {
        double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();

        return deltaY / deltaX;
    }

    public boolean isTegakLurus(Garis garisLainnya){
        double gradienAsal = this.getGradien();
        double gradienLainnya = garisLainnya.getGradien();

        return gradienAsal * gradienLainnya == -1;
    }
}