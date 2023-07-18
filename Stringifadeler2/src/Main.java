public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);
        System.out.println(mesaj.replace(' ','-')); // Boşlukları - ile değiştiriyor
        String yenimesaj = mesaj.replace(' ','-'); // -'lı olarak kaydetmek için yeni string ifade oluşturduk
        System.out.println(yenimesaj);
        System.out.println(yenimesaj.substring(4,10)); // Belirli indexleri veriyor
        System.out.println(mesaj.substring(4,10)); // Belirli indexleri veriyor
        for (String kelimeler :mesaj.split(" ") ){ // Split fonksiyonuı boşluktan sonra ayırmaya yarıyor
            System.out.println(kelimeler);
        }
        System.out.println(mesaj.toLowerCase()); // Büyük harfleri küçültüyor
        System.out.println(mesaj.toUpperCase()); // Küçük harfleri büyültüyor
        String boslukmesaj = "     Bugün hava çok güzel.      ";
        System.out.println(boslukmesaj);
        System.out.println(boslukmesaj.trim()); // Trim fonksiyonu başındaki ve sonundaki boşlukları siliyor veri uyuşmazlığında kullanılır
    }
}