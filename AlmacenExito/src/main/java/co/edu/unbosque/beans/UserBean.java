package co.edu.unbosque.beans;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.primefaces.model.ResponsiveOption;

import co.edu.unbosque.model.Carne;
import co.edu.unbosque.model.Juguete;
import co.edu.unbosque.model.Lacteo;
import co.edu.unbosque.model.Product;
import co.edu.unbosque.model.Ropa;
import co.edu.unbosque.model.Product;
import co.edu.unbosque.model.UsuarioDTO;
import co.edu.unbosque.model.persistence.ProductService;
import co.edu.unbosque.model.persistence.UsuarioDAO;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.bean.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named("userBean")
@RequestScoped
public class UserBean { // Este es el bean de la logica de la pagina de usuarios
//Se Recomienda crear un atributo para cada input del front
	private LocalDate date;
	private List<Product> products;
	private List<ResponsiveOption> responsiveOptions;
    private List<Product> listaRopa;
    private List<Product> listaCarne;
    private List<Product> listaJuguete;
    private List<Product> listaLacteo;
    private Product selectedProduct;
    
    @Inject
    private ProductService service;
    
    

    @PostConstruct
    public void init() {
        products = service.getListaCarne(6);
        
        listaRopa = service.getListaRopa();
        listaCarne = service.getListaCarne();
        listaJuguete = service.getListaJuguete();
        listaLacteo = service.getListaLacteo();
        
       
    }
    
    

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	 public List<Product> getProducts() {
	        return products;
	    }

	public void setService(ProductService service) {
	    this.service = service;
	}
	 

	public Product getSelectedProduct() {
		return selectedProduct;
	}

	public void setSelectedProduct(Product selectedProduct) {
		this.selectedProduct = selectedProduct;
	}

	public List<ResponsiveOption> getResponsiveOptions() {
		return responsiveOptions;
	}

	public void setResponsiveOptions(List<ResponsiveOption> responsiveOptions) {
		this.responsiveOptions = responsiveOptions;
	}
	
	public List<Product> getListaRopa() {
		return listaRopa;
	}



	public void setListaRopa(List<Product> listaRopa) {
		this.listaRopa = listaRopa;
	}



	public List<Product> getListaCarne() {
		return listaCarne;
	}



	public void setListaCarne(List<Product> listaCarne) {
		this.listaCarne = listaCarne;
	}



	public List<Product> getListaJuguete() {
		return listaJuguete;
	}



	public void setListaJuguete(List<Product> listaJuguete) {
		this.listaJuguete = listaJuguete;
	}



	public List<Product> getListaLacteo() {
		return listaLacteo;
	}



	public void setListaLacteo(List<Product> listaLacteo) {
		this.listaLacteo = listaLacteo;
	}



	public ProductService getService() {
		return service;
	}



	public void setProducts(List<Product> products) {
		this.products = products;
	}



	public void guardar() {
		System.out.println(nombre);
		System.out.println(contrasenia);
		uDAO.crear(new UsuarioDTO(nombre, contrasenia));
		
	}
	
	public void guardarCarne() {
		
	}

	public void eliminar() {
		this.nombre = "";
		this.contrasenia= "";
	}
	
	public void eliminarProducto() {
        products.remove(selectedProduct);
        selectedProduct = null;
    }



	
	

}
