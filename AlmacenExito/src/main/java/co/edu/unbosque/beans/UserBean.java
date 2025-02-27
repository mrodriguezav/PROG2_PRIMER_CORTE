package co.edu.unbosque.beans;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.primefaces.model.ResponsiveOption;

import co.edu.unbosque.model.Product;
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
	private String nombre;
	private String contrasenia;
	private UsuarioDAO uDAO;
	private LocalDate date;
	private List<Product> products;
	private List<ResponsiveOption> responsiveOptions;
    private List<String> productos;
    private Product selectedProduct;
    
    @Inject
    private ProductService service;
    
    

    @PostConstruct
    public void init() {
        products = service.getProducts(6);
        responsiveOptions = new ArrayList<>();
        responsiveOptions.add(new ResponsiveOption("1024px", 3, 3));
        responsiveOptions.add(new ResponsiveOption("768px", 2, 2));
        responsiveOptions.add(new ResponsiveOption("560px", 1, 1));
        productos = new ArrayList<>();
        productos.add("ropa1.jpg");
        productos.add("ropa2.png");
        productos.add("ropa3.jpg");
        productos.add("ropa4.jpg");
    }
    
    

	public UserBean() {
		uDAO = new UsuarioDAO();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public UsuarioDAO getuDAO() {
		return uDAO;
	}

	public void setuDAO(UsuarioDAO uDAO) {
		this.uDAO = uDAO;
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
	    
	public List<String> getProductos() {
		return productos;
	}

	public void setProductos(List<String> productos) {
		this.productos = productos;
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
	
	public void guardar() {
		System.out.println(nombre);
		System.out.println(contrasenia);
		uDAO.crear(new UsuarioDTO(nombre, contrasenia));
		
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
