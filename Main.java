package prak2;

public class Main {

    public static void main(String[] args) {
        Titik titik1 = new Titik();
        Titik titik2 = new Titik();
        Titik titik3 = new Titik(5,6);
        Titik titik4 = new Titik();
        

        titik1.setAbsis(1);
        titik1.setOrdinat(2);

        titik2.setAbsis(3);
        titik2.setOrdinat(4);
        
        System.out.println("Titik1 = (" + titik1.getAbsis() + ", " + titik1.getOrdinat() + ")");
        System.out.println("Titik2 = (" + titik2.getAbsis() + ", " + titik2.getOrdinat() + ")");
        System.out.println("Titik2 = (" + titik3.getAbsis() + ", " + titik3.getOrdinat() + ")");
        System.out.println("Jumlah objek titik : " + titik3.getCounter());

        System.out.println("Jarak ke Titik Pusat = " + titik1.getJarakPusat());

        titik4.getRefx(titik1);
        System.out.println("Hasil Refleksi terhadap sumbu x : (" + titik4.getAbsis() + ", " + titik4.getOrdinat() + ")");
        

        Garis G1 = new Garis(titik1, titik2);
        Garis G2 = new Garis(titik3, titik4);

        // getPanjang
        System.out.println("Gradien G1 = " + G1.getGradien());
        System.out.println("Gradien G2 = " + G2.getGradien());
        System.out.print("\n");

        // getRefleksiY
        G1.gettRefleksiY();
        G2.gettRefleksiY();
        System.out.println("Refleksi Terhadap Y");
        System.out.println("Titik pada G1 = ((" + G1.geta().getOrdinat() + ", " + G1.geta().getAbsis() + "), (" + G1.getb().getOrdinat() + ", " + G1.getb().getAbsis() + "))");
        System.out.println("Titik pada G2 = ((" + G2.geta().getOrdinat() + ", " + G2.geta().getAbsis() + "), (" + G2.getb().getOrdinat() + ", " + G2.getb().getAbsis() + "))");

        // isTegakLurus
        if(G1.isTegakLurus(G2)){
            System.out.println("G1 tegak lurus dengan G2");
        } else {
            System.out.println("G1 tidak tegak lurus dengan G2");
        }

    }
}