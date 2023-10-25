import business.ProductManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import dateaccess.HibernateProductDao;
import dateaccess.JbdcproductDao;

public class Main {
    public static void main(String[] args) throws Exception {



        Product product1 = new Product(1,"Iphone Xr",10000);
        Logger[] loggers = new Logger[]{new DatabaseLogger(), new FileLogger()}
        ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
        productManager.add(product1);
    }
}