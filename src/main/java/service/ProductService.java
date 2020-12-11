package service;

import entities.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService {
    private static Map<Integer, Product> products;

    static {

        products = new HashMap<>();
        products.put(1, new Product(1, "ip5", 20, 55,"green"));
        products.put(2, new Product(2, "ip6", 30, 66,"red"));
        products.put(3, new Product(3, "ip7", 40, 77,"purple"));
        products.put(4, new Product(4, "ip8", 50, 88,"yellow"));
        products.put(5, new Product(5, "ip9", 60, 99,"azure"));
        products.put(6, new Product(6, "ip10", 70, 1010,"white"));
    }

    public List findAll(){
        return new ArrayList<>(products.values());
    }


}
