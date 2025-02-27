package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import co.edu.unbosque.model.InventoryStatus;
import co.edu.unbosque.model.Product;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@Named
@ApplicationScoped
public class ProductService {

    private List<Product> products;

    @PostConstruct
    public void init() {
        products = new ArrayList<>();
        products.add(new Product(1000, "f230fh0g3", "Conjunto juvenil", "lindo", "ropa1.jpg", 65,
                "Accessories", 24, InventoryStatus.INSTOCK, 5));
        products.add(new Product(1000, "f230fh0g3", "Chal beige", "Product Description", "ropa2.jpg", 65,
                "Accessories", 24, InventoryStatus.INSTOCK, 5));
        products.add(new  Product(1001, "nvklal433", "Camisa básica gris", "Product Description", "ropa3.jpg", 72,
                "Accessories", 61, InventoryStatus.INSTOCK, 4));
        products.add(new Product(1001, "nvklal433", "Camisas para hombre", "Product Description", "ropa4.jpg", 72,
                "Accessories", 61, InventoryStatus.INSTOCK, 4));
        products.add(new Product(1001, "nvklal433", "Pantalón para dama", "Product Description", "ropa5.jpg", 72,
                "Accessories", 61, InventoryStatus.INSTOCK, 4));
        products.add(new Product(1001, "nvklal433", "Falda elegante para dama", "Product Description", "ropa6.jpg", 72,
                "Accessories", 61, InventoryStatus.INSTOCK, 4));
      
      
       
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public List<Product> getProducts(int size) {

        if (size > products.size()) {
            Random rand = new Random();

            List<Product> randomList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                int randomIndex = rand.nextInt(products.size());
                randomList.add(products.get(randomIndex));
            }

            return randomList;
        }

        else {
            return new ArrayList<>(products.subList(0, size));
        }

    }

    public List<Product> getClonedProducts(int size) {
        List<Product> results = new ArrayList<>();
        List<Product> originals = getProducts(size);
        for (Product original : originals) {
            results.add(original.clone());
        }

        // make sure to have unique codes
        for (Product product : results) {
            product.setCode(UUID.randomUUID().toString().replace("-", "").substring(0, 8));
        }

        return results;
    }
}