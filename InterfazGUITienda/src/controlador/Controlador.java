package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import modelo.ModProveedor;
import modelo.Mundo;
import vista.GPPanelRegistroProveedores;
import vista.GUI;
import vista.JFrameRegistroTiendaParametros;
import vista.MundoVista;
import vista.JFrameGestionProveedores;
//import vista.Ventana;

public class Controlador implements ActionListener {

	private GUI v;
	private Mundo m;
	private MundoVista munVista;
	
	/*private JFrameGestionProveedores j;
	private GPPanelRegistroProveedores jp;
	private JFrameRegistroTiendaParametros gui1;*/

	public Controlador()
	{
		v = new GUI();
		munVista = new MundoVista();
		m = new Mundo();
		
		/*j = new JFrameGestionProveedores(); 
		jp = new GPPanelRegistroProveedores();
		gui1 = new JFrameRegistroTiendaParametros();*/
		
		
		v.setVisible(true);
		/*j.setVisible(false);
		jp.setVisible(false);*/
		
		
		
		//gui1.getPom1().getBtnAgregar().addActionListener(this);
		//v.getPo().getBtnDatos().addActionListener(this);
		//j.getPanelBotones().getCrear().addActionListener(this);
		//jp.getBtnAgregar().addActionListener(this);
		//v.getPanel().getBtnAgregar().addActionListener(this);
		
		//Crear proveedor
		v.getPo().getBtnProv().addActionListener(this);
		munVista.getVPGP().getPanelBotones().getCrear().addActionListener(this);
		munVista.getVPRP().getBtnAgregar().addActionListener(this);
		
		//Crear Cliente
		v.getPg().getBtnGeneral().addActionListener(this);
		munVista.getVPFV().getPFVPanelInfo().getCliente().addActionListener(this);
		munVista.getVPGCL().getPanelBotones().getCrear().addActionListener(this);
		
		//Crear Producto
		v.getPo().getBtnProd().addActionListener(this);
		munVista.getVPGPRO().getPanelBotones().getCrear().addActionListener(this);
		munVista.getVPRPRO().getAgregarProducto().addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e)
	{
		 if(e.getActionCommand().equals(v.getPo().PROV))
		{
			munVista.getVPGP().setVisible(true);
			v.setVisible(false);
			
		}
		else if(e.getActionCommand().equals( munVista.getVPGP().getPanelBotones().CREAR))
		{
			munVista.getVPRP().setVisible(true);
		}
		else if(e.getActionCommand().equals(munVista.getVPRP().AGREGAR))
		{
			String NIT = munVista.getVPRP().getNIT().getText();
			String tel =  munVista.getVPRP().getTel().getText();
			String nombre =  munVista.getVPRP().getNom().getText();
			String direccion =  munVista.getVPRP().getAdress().getText();
			String ciudad =  munVista.getVPRP().getCiudad_().getText();
			
			m.getModprov().agregarProveedor(NIT, nombre, direccion, tel, ciudad);
			
		}
		 
		 
		else if(e.getActionCommand().equals(v.getPo().PROD))
		{
			munVista.getVPGPRO().setVisible(true);
			v.setVisible(false);
		}
		else if(e.getActionCommand().equals(munVista.getVPGPRO().getPanelBotones().CREAR))
		{
			munVista.getVPGPRO().setVisible(true);
		}
		else if (e.getActionCommand().equals(munVista.getVPRPRO().AGREGAR_PRODUCTO))
		{
			String codigo = munVista.getVPRPRO().getNombre().getText();
			String nombre = munVista.getVPRPRO().getNombre().getText();
			String NIT = munVista.getVPRPRO().getNIT().getText();
			String precioCompra = munVista.getVPRPRO().getPrecio_Compra().getText();
			String precioVenta = munVista.getVPRPRO().getPrecio_Venta().getText();
			
			m.getModprod().crearProducto(codigo, nombre, precioCompra, precioVenta, NIT);
			
		}
		 
		 
		else if(e.getActionCommand().equals(munVista.getVP().getPg().BUTG))
		{
			munVista.getVPFV().setVisible(true);
			v.setVisible(false);
		}
		else if(e.getActionCommand().equals(munVista.getVPFV().getPFVPanelInfo().CLIENTE)) 
		{
			munVista.getVPGCL().setVisible(true);	
			munVista.getVPFV().setVisible(false);
		}
		else if(e.getActionCommand().equals(munVista.getVPGCL().getPanelBotones().CREAR))
		{
			munVista.getVPRCL().setVisible(true);		
			munVista.getVPGCL().setVisible(false);
		}
		else if(e.getActionCommand().equals(munVista.getVPRCL().AGREGAR_CLIENTE))
		{
			String cedula = munVista.getVPRCL().getCe().getText();
			String nombre = munVista.getVPRCL().getNom().getText();
			String direccion = munVista.getVPRCL().getDir().getText();
			String telefono = munVista.getVPRCL().getTel().getText();
			String correoElectronico = munVista.getVPRCL().getcE().getText();
			
			m.getModCl().agregarCliente(cedula, nombre, direccion, telefono, correoElectronico);	
		}
	
	}
	
	
	
	
	
	}

	
		/*if (e.getActionCommand().equals(v.getPo().DATOS)) 
		{
			gui1.setVisible(true);
		}
		else if(e.getActionCommand().equals(gui1.getPom1().AGREGAR))
		{
			m.getModdat().crearCarpeta(gui1.getPe().getTxtNT().getText());
			m.getModdat().crearArchivos(gui1.getPe().getTxtNT().getText(), gui1.getPe().getTxtTipoC().getText(),gui1.getPe().getTxtNIT().getText(),  gui1.getPe().getTxtCOrigen().getText(), gui1.getPe().getTxtIVa().getText(), gui1.getPe().getTxtTasaInteres().getText(), gui1.getPe().getTxtNBanco().getText(), gui1.getPe().getTxtNumCuenta().getText(), gui1.getPe().getTxtNGerente().getText());
			gui1.setVisible(false);
		}
		*/

	
	

