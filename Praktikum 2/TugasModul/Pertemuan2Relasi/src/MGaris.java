public class MGaris {
    public static void main (String[] args){
        Garis G1, G2;
        Titik titikAwalG1, titikAkhirG1, titikAwalG2, titikAkhirG2;

        titikAwalG1 = new Titik(1, 2);
        titikAkhirG1 = new Titik(4, 6);
        titikAwalG2 = new Titik(2, 3);
        titikAkhirG2 = new Titik(5, 7);

        G1 = new Garis(titikAwalG1, titikAkhirG1);
        G2 = new Garis(titikAwalG2, titikAkhirG2);

        System.out.println("Titik Awal G1: " + G1.getTitikAwal().getAbsis() + ", " + G1.getTitikAwal().getOrdinat());
        System.out.println("Titik Akhir G1: " + G1.getTitikAkhir().getAbsis() + ", " + G1.getTitikAkhir().getOrdinat());
        System.out.println("Titik Awal G2: " + G2.getTitikAwal().getAbsis() + ", " + G2.getTitikAwal().getOrdinat());
        System.out.println("Titik Akhir G2: " + G2.getTitikAkhir().getAbsis() + ", " + G2.getTitikAkhir().getOrdinat());


        System.out.println("Panjang G1: " + G1.getPanjang());
        System.out.println("Panjang G2: " + G2.getPanjang());


        System.out.println("Gradien G1: " + G1.getGradien());
        System.out.println("Gradien G2: " + G2.getGradien());


        System.out.println("G1 tegak lurus terhadap G2: " + G1.isTegakLurus(G2));
    }
}

/*
 * Kesimpulan
 * Tidak jauh berbeda dari sebelumnya, kali ini dilakukan eksperimen terhadap pemanggilan atribut dan method
 * dari objek Garis, dapat disimpulkan bahwa Garis dipengaruhi Titik, sedangkan MGaris dipengaruhi Garis, sehingga
 * Jika access modifier private dipakai di Titik, maka Garis dan MGaris tidak bisa mengakses
 * Jika access modifier private dipakai di Garis, MGaris tidak bisa mengakses
 */