public class CustomerManager {

    BaseDatabaseManager databaseManager; //strateji paterni
    public void getCustomers(){
        databaseManager.getData();

    }
}
