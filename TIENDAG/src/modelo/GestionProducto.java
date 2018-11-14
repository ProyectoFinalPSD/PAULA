package modelo;

import java.util.ArrayList;

public class GestionProducto
{

	private ArrayList<Producto> lista;
	private Producto producto;

	public GestionProducto()
	{
		lista = new ArrayList<Producto>();
	}
	public boolean agregarProducto(String Pcodigo, String PnompreProducto,String PprecioCompra,String PprecioVenta, String Nit)
	{
		boolean agregar = false;

		if(agregar == false) 
		{
			lista.add(new Producto(Pcodigo, PnompreProducto, PprecioCompra, PprecioVenta, Nit));
			agregar = true;
		}
		return agregar;
	}
	public ArrayList<Producto> getLista() {
		return lista;
	}
	public void setLista(ArrayList<Producto> lista) {
		this.lista = lista;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public ArrayList<Producto> agregar(String Pcodigo, String PnompreProducto,String PprecioCompra,String PprecioVenta, String Nit)
	{
		Producto productos = new Producto(Pcodigo, PnompreProducto, PprecioCompra, PprecioVenta, Nit);
		lista.add(productos);


		return lista;
	}
}
