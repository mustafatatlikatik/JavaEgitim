import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Harfi giriniz");
        char harf;
        harf = input.next().charAt(0); // String ifade yazılırsa sadece ilk harfi değer alıyor
        System.out.println(harf);
        String a =String.valueOf(harf).toUpperCase();
        switch (a){
            case "A","E","I","İ","O","Ö","U","Ü":

                System.out.println("Sesli Harftir");
                break;
            default:
                System.out.println("Sessiz Harftir");


        }

    }
}