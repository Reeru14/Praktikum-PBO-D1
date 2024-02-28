package prak2;
public class Garis {
    private Titik a;
    private Titik b;

    public Garis(Titik a, Titik b){
        this.a = a;
        this.b = b;
    }

    public Garis(){
        a = new Titik();
        b = new Titik();
    }

    public Titik geta(){
        return this.a;
    }

    public Titik getb(){
        return this.b;
    }

    public void seta(Titik a){
        this.a = a;
    }

    public void setb(Titik b){
        this.b = b;
    }

    public double getPanjang(){
        return Math.sqrt(Math.pow((b.getAbsis()) - a.getAbsis(),2) + Math.pow((b.getOrdinat()) - a.getOrdinat(),2));
    }

    public double getGradien(){
        return (b.getOrdinat() - a.getOrdinat())/(b.getAbsis() - a.getAbsis());
    }

    public void gettRefleksiY(){
        a.getRefy(this.a);
        b.getRefy(this.b);
    }

    public boolean isTegakLurus(Garis G){
        return G.getGradien() * this.getGradien()  == -1;
    }
}

