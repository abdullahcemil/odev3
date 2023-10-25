package business;

import core.logging.Logger;
import dateaccess.HibernateProductDao;
import dateaccess.JbdcproductDao;
import dateaccess.ProductDao;
import dateaccess.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;

    }

    public void add(Product product) throws Exception {
        // iş kuralları
        if (product.getUnitPrice() < 10) {
            throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
        }
        //ProductDao jbdcproductDao = new JbdcproductDao();
        productDao.add(product);
        for (Logger logger : loggers) {//[db,mail]
         logger.log(product.getName());
        }


    }
}
