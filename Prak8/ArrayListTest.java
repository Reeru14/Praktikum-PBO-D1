import java.util.ArrayList;

public class ArrayListTest{
    public static void main(String[] args){
        ArrayList<String> strings = new ArrayList<String>();
        //Menambah ELemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        //Menghapus Elemen
        strings.remove("praktikum");
        //Iterasi
        for(String s : strings){
            System.out.print(s+" ");
        }
    }
}