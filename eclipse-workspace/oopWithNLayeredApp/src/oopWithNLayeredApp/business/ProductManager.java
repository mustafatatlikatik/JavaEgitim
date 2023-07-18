package oopWithNLayeredApp.business;


import oopWithNLayeredApp.core.logging.ILogger;
import oopWithNLayeredApp.dataAccess.IProductDao;

import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private IProductDao productDao;
	private ILogger[] loggers;
	
	
	public ProductManager(IProductDao productDao , ILogger[] loggers) {
		this.loggers=loggers;
		this.productDao = productDao;
	}



	public void add(Product product) throws Exception {
		//iş kuralları
		if (product.getUnitPrice()<10) {
			throw new Exception("Ürün fiyatı 10dan küçük olamaz");
		}
		
		productDao.add(product);
		
		for (ILogger logger : loggers) { // [db,mail]
			logger.log(product.getName());
		}
	}
}
