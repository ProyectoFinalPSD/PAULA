package vista;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class JFrameRegistroProducto extends JFrame
{

	private   static   final   long serialVersionUID =   1L ;
	private JLabel codigo, nombreP, NITProv,precioCompra,precioVenta;
	private JTextField codigoP, nombre, NIT, precio_Compra, precio_Venta;
	private JButton agregarProducto;
	public static final String AGREGAR_PRODUCTO =  "AGREGAR PRODUCTO";

	
	
	public JFrameRegistroProducto()
	{
		setSize(500,400);
		setResizable(false);
		setTitle("REGISTRO PRODUCTO");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		TitledBorder titulo = BorderFactory.createTitledBorder("Ingrese el producto");
		titulo.setTitleColor(Color.BLACK);
		
		codigo = new JLabel("Codigo producto: ");
		codigoP = new JTextField();
		codigoP.setBackground ( Color.WHITE );
		codigoP.setForeground ( Color.BLACK );
		
		nombreP = new JLabel("Nombre del producto: ");
		nombre = new JTextField();
		nombre.setBackground ( Color.WHITE );
		nombre.setForeground ( Color.BLACK );
		
		NITProv = new JLabel("NIT del proveedor del producto: ");
		NIT = new JTextField();
		
		precioCompra = new JLabel("Precio de compra: ");
		precio_Compra = new JTextField();
		
		precioVenta = new JLabel("Precio de venta");
		precio_Venta = new JTextField();
		
		agregarProducto = new JButton("Agregar producto");
		agregarProducto.setActionCommand(AGREGAR_PRODUCTO);
	}



	public JLabel getCodigo() {
		return codigo;
	}



	public void setCodigo(JLabel codigo) {
		this.codigo = codigo;
	}



	public JLabel getNombreP() {
		return nombreP;
	}



	public void setNombreP(JLabel nombreP) {
		this.nombreP = nombreP;
	}



	public JLabel getNITProv() {
		return NITProv;
	}



	public void setNITProv(JLabel nITProv) {
		NITProv = nITProv;
	}



	public JLabel getPrecioCompra() {
		return precioCompra;
	}



	public void setPrecioCompra(JLabel precioCompra) {
		this.precioCompra = precioCompra;
	}



	public JLabel getPrecioVenta() {
		return precioVenta;
	}



	public void setPrecioVenta(JLabel precioVenta) {
		this.precioVenta = precioVenta;
	}



	public JTextField getCodigoP() {
		return codigoP;
	}



	public void setCodigoP(JTextField codigoP) {
		this.codigoP = codigoP;
	}



	public JTextField getNombre() {
		return nombre;
	}



	public void setNombre(JTextField nombre) {
		this.nombre = nombre;
	}



	public JTextField getNIT() {
		return NIT;
	}



	public void setNIT(JTextField nIT) {
		NIT = nIT;
	}



	public JTextField getPrecio_Compra() {
		return precio_Compra;
	}



	public void setPrecio_Compra(JTextField precio_Compra) {
		this.precio_Compra = precio_Compra;
	}



	public JTextField getPrecio_Venta() {
		return precio_Venta;
	}



	public void setPrecio_Venta(JTextField precio_Venta) {
		this.precio_Venta = precio_Venta;
	}



	public JButton getAgregarProducto() {
		return agregarProducto;
	}



	public void setAgregarProducto(JButton agregarProducto) {
		this.agregarProducto = agregarProducto;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
