public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager(); // burası önemli
        customerManager.databaseManager=new MySqlDatabaseManager(); // configürasyon burdan değişebilir
        customerManager.getCustomers();
        
    }
}