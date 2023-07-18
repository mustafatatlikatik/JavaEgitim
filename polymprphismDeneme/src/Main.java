import java.util.logging.Logger;

public class Main { //polymorphism çok biçimlilik demektir
    public static void main(String[] args) {
        /*BaseLogger[] loggers=new BaseLogger[]{new FileLogger(),new EmailLogger(),new DataBaseLogger(),new ConsoleLogger()};
        for (BaseLogger logger : loggers){
            logger.Log("Log mesajı");
        }*/
        CustomerManager customerManager=new CustomerManager((new FileLogger()));
        customerManager.add();
    }
}