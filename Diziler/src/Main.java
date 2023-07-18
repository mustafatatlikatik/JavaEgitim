import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Bilge"; //Diziler 0'dan başlar
        ogrenciler[1] = "Okan";
        ogrenciler[2] = "Berk";
        ogrenciler[3] = "Yasin";
        for (int i = 0; i < ogrenciler.length; i++) { //length eleman sayısı demek
            System.out.println(ogrenciler[i]);
        }
        System.out.println("----------------------------"); //Döngüler arasında çizgi çektik
        for (String ogrenci : ogrenciler) { //Bu şekilde de öğrencileri yazdırabiliriz
            System.out.println(ogrenci);
        }

    }
}