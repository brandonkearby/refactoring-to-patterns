package refactorings;

import javax.management.Query;
import java.awt.*;

/**
 * @author Brandon Kearby
 *         January 05, 2016
 */
public interface ProductService {

    List<Product> getProductsByColor(Color color);
    List<Product> getProductsByColorAndSize(Color color, long size);
    List<Product> getProductsByColorAndSizeName(Color color, long size, String name);
    List<Product> getProductsByColorAndSizeVersion(Color color, long size, String name, Integer version);


    List<Product> getProducts(ProductQuery query);
}
