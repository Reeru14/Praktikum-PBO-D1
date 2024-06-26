public class Lingkaran extends Bangundatar{
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    public double hitungKeliling(){
        return 2 * Math.PI * jejari;
    }
}
