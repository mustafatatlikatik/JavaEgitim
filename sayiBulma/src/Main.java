import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sayial = new Scanner(System.in);
        System.out.println("Sayıyı girin");
        int[] sayilar = new int[]{1,2,7,8,4,6};
        int aranacak= sayial.nextInt();
        boolean varMi=false ;
        for (int sayi : sayilar){
            if (sayi==aranacak){
                varMi=true;
            }

        }
        if (varMi){
            System.out.println("Sayı var");
        }
        else {
            System.out.println("Sayı yok");
        }

    }
}