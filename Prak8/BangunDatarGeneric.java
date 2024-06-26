public class BangunDatarGeneric<T extends Bangundatar> {
    private T bangunDatar;

    public void set(T tipebangunDatar){
        this.bangunDatar = tipebangunDatar;
    }

    public T get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}
