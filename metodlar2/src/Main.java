public class Main {
    public static void main(String[] args) {
        int sayi = topla(11,15);
        System.out.println(sayi);
        String sehir = sehir();
        System.out.println(sehir);
        int toplam = topla2(1,2,3,4,5,6);
        System.out.println(toplam);
    }
    public static void ekle(){
        System.out.println("Eklendi");

    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static void guncelle(){
        System.out.println("Güncellendi");
    }
    public static int topla (int sayi1 ,int sayi2){
        return sayi1+sayi2;
    }
    public static int topla2 (int... sayilar){ // 3 nokta dizi gibi aışıyor ve veriable arguments deniyor
        int toplam=0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;

    }
    public static String sehir(){
        return "Eskişehir";
    }
}