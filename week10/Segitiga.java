package poly;

public class Segitiga extends BangunDatar {
    private int alas;
    private int tinggi;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public void luas() {
        float luas = 0.5f * alas * tinggi;
        System.out.println("Luas Segitiga: " + luas);
    }

    @Override
    public void keliling() {
        // Menghitung panjang sisi miring segitiga siku-siku
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        double keliling = alas + tinggi + sisiMiring;
        System.out.println("Keliling Segitiga: " + keliling);
    }
}
