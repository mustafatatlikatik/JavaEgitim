import matematik.DortIslem;
import matematik.Logaritma;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Adınızı giriniz");

        String isim= scanner.nextLine();

        System.out.println("Merhaba "+isim);

        DortIslem dortIslem= new DortIslem();
        System.out.println(dortIslem.topla(4,5));
        Logaritma logaritma=new Logaritma();

    }
}