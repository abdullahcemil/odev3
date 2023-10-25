package dateaccess;

import dateaccess.entities.Product;

public class JbdcproductDao implements ProductDao {
    public void add(Product product) {
        // sadece ve sadeve db erişim kodları buraya yazılır..SQL
        System.out.println("JBDC ile veri tabanına eklendi");
    }
}
