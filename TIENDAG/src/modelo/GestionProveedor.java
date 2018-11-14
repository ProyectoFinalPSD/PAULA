package modelo;

import java.util.ArrayList;

public class GestionProveedor {

	private ArrayList<Proveedor>lista;
	private Proveedor prov;
	
	public GestionProveedor()
	{
		lista = new ArrayList<Proveedor>();
	}
	public boolean agregarProveedor(String pNit, String pNombre, String pDireccion, String pTelefono, String pCiudad)
	{
		boolean agregar = false;
		if(agregar == false)
		{
			lista.add(new Proveedor(pNit, pNombre, pDireccion, pTelefono, pCiudad));
			agregar = true;
		}
		return agregar;
	}
	
	public ArrayList<Proveedor> agregar(String pNit, String pNombre, String pDireccion, String pTelefono, String pCiudad)
	{
			Proveedor persona = new Proveedor(pNit, pNombre, pDireccion, pTelefono, pCiudad);
			lista.add(persona);
		
		
		return lista;
	}
	public ArrayList<Proveedor> getLista() {
		return lista;
	}
	public void setLista(ArrayList<Proveedor> lista) {
		this.lista = lista;
	}
	public Proveedor getProv() {
		return prov;
	}
	public void setProv(Proveedor prov) {
		this.prov = prov;
	}
}
