package controlador;

import vista.VentanaAgregarProducto;
import vista.VentanaAgregarProveedor;
import vista.VentanaPrincipal;

public class Controlador {

	VentanaPrincipal miVentanaPrincipal;
	VentanaAgregarProveedor ventanaAgregarProv;
	VentanaAgregarProducto ventanaAgregarProducto;
	/*Instanciamos el objeto*/
	public Controlador()
	{
	miVentanaPrincipal= new VentanaPrincipal();
	/*Hacemos que se cargue la ventana*/
	miVentanaPrincipal.setVisible(true);
	
	
	ventanaAgregarProv = new VentanaAgregarProveedor();
	ventanaAgregarProv.setVisible(true);
	
	ventanaAgregarProducto = new VentanaAgregarProducto();
	ventanaAgregarProducto.setVisible(true);
	}
}
