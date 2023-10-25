package dateaccess;

public class HibernateProductDao implements ProductDao {
    public void add(Product product) {
        // sadece ve sadeve db erişim kodları buraya yazılır..SQL
        System.out.println("Hibernate ile veri tabanına eklendi");
    }
}
