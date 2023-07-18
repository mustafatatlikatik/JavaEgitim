public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        System.out.println("Eleman sayısı =" + mesaj.length()); // Bu fonksiyon bize eleman sayısını verir
        System.out.println("5. eleman =" + mesaj.charAt(4)); // İndex 0'dan başladığı için 4 yazdık
        System.out.println(mesaj.concat(" Yaşasın!!!")); // Concat string ifadeye ekleme yapıyor ama tek seferlik
        System.out.println(mesaj.startsWith("B")); // String ifade B ile başlıyor mu doğru yanlış sorusunu soruyor
        System.out.println(mesaj.endsWith("B")); // String ifade B ile bitiyor mu doğru yanlış sorusunu soruyor
        char[] karakterker= new char[5];
        mesaj.getChars(0,5,karakterker,0);
        System.out.println(karakterker);
        System.out.println(mesaj.indexOf("av")); // Mesajın içindeki kaçıncı değer olduğunu söylüyor
        System.out.println(mesaj.lastIndexOf("a")); // Mesajın içindeki değerin kaçıncı olduğuna tersten bakıyor

    }
}