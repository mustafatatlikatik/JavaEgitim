import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args){
        int total = 0;
        BufferedReader reader = null;
        try {
             reader = new BufferedReader(new FileReader("C:\\Users\\musta\\JavaEğitim\\readingFileDemo\\src\\sayilar.txt"));
             String line = null;
             while ((line=reader.readLine())!=null){
                 total+=Integer.valueOf(line);
             }
             System.out.println("Toplam = "+total);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                reader.close();
            }catch (Exception exception){

            }

        }
    }
}