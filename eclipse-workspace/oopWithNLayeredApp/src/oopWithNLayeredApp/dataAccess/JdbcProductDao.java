package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements IProductDao{
	public void add(Product product) {
		// sadece db erişim kodları buraya yazılır... SQL
		System.out.println("JDBC ile veritabanına eklendi");
	}
	
}
