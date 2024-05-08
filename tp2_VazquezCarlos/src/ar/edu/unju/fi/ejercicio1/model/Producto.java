package ar.edu.unju.fi.ejercicio1.model;

public class Producto {
	private int codigo;
	private String descripcion;
	private double preciouni;
	private OrigenDeFabricacion origenfab;
	private Categoria categoria;
	private boolean estado;
	public int getCodigo() {
		return codigo;
		
	}
	
	public Producto() {
		
	}

	public Producto(int codigo, String descripcion, double preciouni, OrigenDeFabricacion origenfab,
			Categoria categoria, boolean estado) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.preciouni = preciouni;
		this.origenfab = origenfab;
		this.categoria = categoria;
		this.estado = estado;
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
	public double getPreciouni() {
		return preciouni;
	}
	public void setPreciouni(double preciouni) {
		this.preciouni = preciouni;
	}
	public OrigenDeFabricacion getOrigenfab() {
		return origenfab;
	}
	public void setOrigenfab(OrigenDeFabricacion origenfab) {
		this.origenfab = origenfab;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	

	
	
}
