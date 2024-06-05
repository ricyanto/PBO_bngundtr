package week10;

public class Persegipanj{
    private int panjang;
    private int lebar;

    public Persegipanj(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int luas(){
       return panjang*lebar;
    }

    public void keliling(){
        System.out.println("keliling persegi panjang adalah : " + (panjang + lebar + panjang + lebar));
    }

    public int getpanjang(){
        return this.panjang;
    }

    public int getlebar(){
        return this.lebar;
    }
}