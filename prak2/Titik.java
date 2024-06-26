package prak2;

class Titik{
    private double absis;
    private double ordinat;
    static int counter;

    public Titik(){
        counter++;
        this.absis = 0;
        this.ordinat = 0;

    }
    public Titik(double absis, double ordinat){
        counter++;
        this.absis = absis;
        this.ordinat = ordinat;
    }

    public void setAbsis(double absis){
        this.absis = absis;
    }

    public void setOrdinat(double ordinat){
        this.ordinat = ordinat;
    }

    public double getAbsis(){
        return this.absis;
    }

    public double getOrdinat(){
        return this.ordinat;
    }

    public int getCounter(){
        return counter;
    }

    public double getJarakPusat() {
        return Math.round(Math.sqrt(this.absis*this.absis + this.ordinat * this.ordinat));
    }

    public void refx(Titik t) {
        t.setOrdinat(this.ordinat*-1);;
    }

    public void refy(Titik t) {
        t.setAbsis(this.absis*-1);
    }

    public void getRefx(Titik t) {
        this.setAbsis(t.getAbsis());
        this.setOrdinat(t.getOrdinat()*-1); 
    }

    public void getRefy(Titik t){
        this.setAbsis(t.getAbsis()*-1);
        this.setOrdinat(t.getOrdinat()); 
    }
}