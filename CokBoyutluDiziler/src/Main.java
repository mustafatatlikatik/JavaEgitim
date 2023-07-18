public class Main {
    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];
        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Tekirdağ";
        sehirler[0][2] = "Bursa";
        sehirler[1][0] = "Eskişehir";
        sehirler[1][1] = "Ankara";
        sehirler[1][2] = "Yozgat";
        sehirler[2][0] = "Malatya";
        sehirler[2][1] = "Gaziantep";
        sehirler[2][2] = "Hatay";
        for (int i = 0; i < 3; i++) {
            System.out.println("--------------------"); //Bölgeleri ayırdık
            for (int j = 0; j < 3; j++) {
                System.out.println(sehirler[i][j]);
            }
        }

    }
}