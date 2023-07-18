public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int sonuc = dortIslem.Topla(3,4);
        System.out.println(sonuc);
        int sonuc1=dortIslem.Cikar(5,7);
        System.out.println(sonuc1);
        int sonuc2=dortIslem.Carp(5,3);
        System.out.println(sonuc2);
        int sonuc3=dortIslem.Bolme(15,3);
        System.out.println(sonuc3);


    }
}