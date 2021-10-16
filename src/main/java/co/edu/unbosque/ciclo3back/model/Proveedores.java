package co.edu.unbosque.ciclo3back.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Proveedores {
	
	@Id
	private int nitproveedor;
	private String ciudad_proveedor;
	private String direccion_proveedor;
	private String nombre_proveedor;
	private String telefono_proveedor;
	
	
	public int getNit_proveedor() {
		return nitproveedor;
	}
	public void setNit_proveedor(int nitproveedor) {
		this.nitproveedor = nitproveedor;
	}
	public String getNombre_proveedor() {
		return nombre_proveedor;
	}
	public void setNombre_proveedor(String nombre_proveedor) {
		this.nombre_proveedor = nombre_proveedor;
	}
	public String getCiudad_proveedor() {
		return ciudad_proveedor;
	}
	public void setCiudad_proveedor(String ciudad_proveedor) {
		this.ciudad_proveedor = ciudad_proveedor;
	}
	public String getDireccion_proveedor() {
		return direccion_proveedor;
	}
	public void setDireccion_cliente(String direccion_proveedor) {
		this.direccion_proveedor = direccion_proveedor;
	}
	public String getTelefono_proveedor() {
		return telefono_proveedor;
	}
	public void setTelefono_cliente(String telefono_proveedor) {
		this.telefono_proveedor = telefono_proveedor;
	}
	
}
