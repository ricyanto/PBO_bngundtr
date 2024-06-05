package week10;

public class Persegi
{
    private int sisi;

    public Persegi(int sisi)
    {
        this.sisi = sisi;
    }

    public int luas()
    {
        return sisi*sisi;
    }
    
    public void keliling()
    {
        System.out.println("Keliling persegi adalah : " + (sisi + sisi + sisi + sisi)); ;
    }

    public int getSisi()
    {
        return this.sisi;
    }


}
