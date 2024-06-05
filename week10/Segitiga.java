package week10;

public class Segitiga
{
    private int alas;
    private int tinggi;
    private int sisi;
    
    public Segitiga (int alas, int tinggi, int sisi)
    {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }

    public void luas()
    {
        System.out.println("luas segitiga dengan alas "+alas+" dan tinggi "+tinggi+" adalah" +(alas*tinggi)/2);
    }
    
    public  void keliling()
    {
        System.out.println("Keliling segitiganya adalah : " + (sisi + sisi + sisi));  

    }

    public int tinggi()
    {
        return tinggi;
    }
}
