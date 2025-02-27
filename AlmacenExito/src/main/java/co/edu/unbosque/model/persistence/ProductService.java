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

	private List<Product> listaCarne;
	private List<Product> listaJuguete;
	private List<Product> listaLacteo;
	private List<Product> listaRopa;

	@PostConstruct
    public void init() {
       
      
        listaCarne = new ArrayList();
        listaJuguete = new ArrayList();
        listaLacteo = new ArrayList();
        listaRopa = new ArrayList();
       
        listaCarne.add(new Product(1000, "f230fh0g3", "Carne de Res", "Carne de res fresca", "--imagen--", 65, "Accesories", 24, InventoryStatus.INSTOCK, 5));
        
        
        listaRopa.add(new Product(1000, "f230fh0g3", "Bamboo Watch", "Product Description", "bamboo-watch.jpg", 65,
                "Accessories", 24, InventoryStatus.INSTOCK, 5));
        listaRopa.add(new Product(1001, "nvklal433", "Black Watch", "Product Description", "black-watch.jpg", 72,
                "Accessories", 61, InventoryStatus.INSTOCK, 4));
        listaRopa.add(new Product(1002, "zz21cz3c1", "Blue Band", "Product Description", "blue-band.jpg", 79,
                "Fitness", 2, InventoryStatus.LOWSTOCK, 3));
        listaRopa.add(new Product(1003, "244wgerg2", "Blue T-Shirt", "Product Description", "blue-t-shirt.jpg", 29,
                "Clothing", 25, InventoryStatus.INSTOCK, 5));
        listaRopa.add(new Product(1004, "h456wer53", "Bracelet", "Product Description", "bracelet.jpg", 15,
                "Accessories", 73, InventoryStatus.INSTOCK, 4));
        listaRopa.add(new Product(1005, "av2231fwg", "Brown Purse", "Product Description", "brown-purse.jpg", 120,
                "Accessories", 0, InventoryStatus.OUTOFSTOCK, 4));
        listaRopa.add(new Product(1006, "bib36pfvm", "Chakra Bracelet", "Product Description", "chakra-bracelet.jpg", 32,
                "Accessories", 5, InventoryStatus.LOWSTOCK, 3));
    }

	public List<Product> getListaCarne() {
		return new ArrayList<>(listaCarne);
	}

	public List<Product> getListaJuguete() {
		return new ArrayList<>(listaJuguete);
	}

	public List<Product> getListaLacteo() {
		return new ArrayList<>(listaLacteo);
	}

	public List<Product> getListaRopa() {
		return new ArrayList<>(listaRopa);
	}

	public List<Product> getListaCarne(int size) {
		if (size > listaCarne.size()) {
			Random rand = new Random();
			List<Product> randomList = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				int randomIndex = rand.nextInt(listaCarne.size());
				randomList.add(listaCarne.get(randomIndex));
			}
			return randomList;
		}
		else {
			return new ArrayList<>(listaCarne.subList(0, size));
		}
	}
	public List<Product> getListaJuguete(int size) {
		if (size > listaJuguete.size()) {
			Random rand = new Random();
			List<Product> randomList = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				int randomIndex = rand.nextInt(listaJuguete.size());
				randomList.add(listaJuguete.get(randomIndex));
			}
			return randomList;
		}
		else {
			return new ArrayList<>(listaJuguete.subList(0, size));
		}
	}
	
	public List<Product> getListaLacteo(int size) {
		if (size > listaLacteo.size()) {
			Random rand = new Random();
			List<Product> randomList = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				int randomIndex = rand.nextInt(listaLacteo.size());
				randomList.add(listaLacteo.get(randomIndex));
			}
			return randomList;
		}
		else {
			return new ArrayList<>(listaLacteo.subList(0, size));
		}
	}
	
	
	public List<Product> getListaRopa(int size) {
		if (size > listaRopa.size()) {
			Random rand = new Random();
			List<Product> randomList = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				int randomIndex = rand.nextInt(listaRopa.size());
				randomList.add(listaRopa.get(randomIndex));
			}
			return randomList;
		}
		else {
			return new ArrayList<>(listaRopa.subList(0, size));
		}
	}

//	public List<Product> getClonedProducts(int size) {
//		List<Product> results = new ArrayList<>();
//		List<Product> originals = getLista(size);
//		for (Product original : originals) {
//			results.add(original.clone());
//		}
//
//		// make sure to have unique codes
//		for (Product product : results) {
//			product.setCode(UUID.randomUUID().toString().replace("-", "").substring(0, 8));
//		}
//
//		return results;
//	}
}