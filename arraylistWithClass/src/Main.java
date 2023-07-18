import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers= new ArrayList<Customer>();
        Customer mustafa = new Customer(1,"Mustafa","Tatlıkatık");
        customers.add(mustafa);
        customers.add(new Customer(2,"Okan","Şatlı"));
        customers.add(new Customer(3,"Berkcan","Temel"));
        customers.add(new Customer(4,"Yasin","Solak"));
        /*customers.remove(2); // index ile kaldırabiliriz
        customers.remove(mustafa); // bu şekilde yukarıda ayrıca tanımlayıp da kaldırabiliriz*/

        for (Customer customer:customers){
            System.out.println(customer.id + " " + customer.firstName +" " + customer.lastName.toUpperCase());
        }

    }
}