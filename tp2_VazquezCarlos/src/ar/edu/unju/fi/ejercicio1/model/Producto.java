package ar.edu.unju.fi.ejercicio1.model;

public class Producto {
	
	private int codigo;
	private String descripcion;
	private double precioUnitario;
	private OrigenFabricacion origenfab;
	private Categoria categoria;
	
	
	public Producto() {
		
	}

	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public double getPrecioUnitario() {
		return precioUnitario;
	}


	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}


	public OrigenFabricacion getOrigenfab() {
		return origenfab;
	}


	public void setOrigenfab(OrigenFabricacion origenfab) {
		this.origenfab = origenfab;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	
}
