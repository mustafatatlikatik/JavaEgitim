import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();

    }
    public static void sayiBulmaca(){
        Scanner sayial = new Scanner(System.in);
        System.out.println("Sayıyı girin");
        int[] sayilar = new int[]{1,2,7,8,4,6};
        int aranacak= sayial.nextInt();
        boolean varMi=false ;
        for (int sayi : sayilar){
            if (sayi == aranacak) {
                varMi = true;
                break;
            }

        }
        if (varMi){
            mesajVer("Sayı var : "+aranacak);
        }
        else {
            mesajVer("Sayı yok : "+aranacak);
        }
    }
    // camel casing başı küçük sonrası büyük yazım şeki
    public static void mesajVer(String mesaj){ // parametreli metod deniyor
        System.out.println(mesaj);
    }
}