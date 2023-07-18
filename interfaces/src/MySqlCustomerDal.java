public class MySqlCustomerDal implements ICustomerDal, IRepository{ // Dal data access layer demek
    @Override
    public void Add() {
        System.out.println("MySql Eklendi");
    }
}
