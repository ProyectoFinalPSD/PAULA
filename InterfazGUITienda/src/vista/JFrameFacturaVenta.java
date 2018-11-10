package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class JFrameFacturaVenta extends JFrame
{
	private static final long serialVersionUID = 1L;
	private FVPanelInfoCliente PFVPanelInfo;
	private FVPanelCantidadProducto PFVPanelProducto;
	private FVPanelBtnCompraProducto PFVPanelBotones;
	private FVPanelTablaProductos PFVPanelListadoPro;
	
	
	public JFrameFacturaVenta()
	{
		setSize(550,700);
		setResizable(false);
		setTitle("FACTURA DE VENTA");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		PFVPanelInfo = new FVPanelInfoCliente();
		add(PFVPanelInfo, BorderLayout.NORTH);
		
		PFVPanelProducto = new FVPanelCantidadProducto();
		add(PFVPanelProducto, BorderLayout.WEST);
		
		PFVPanelBotones =  new FVPanelBtnCompraProducto();
		add(PFVPanelBotones, BorderLayout.SOUTH);
		
		PFVPanelListadoPro = new FVPanelTablaProductos();
		add(PFVPanelListadoPro, BorderLayout.CENTER);		
	}


	public FVPanelInfoCliente getPFVPanelInfo() {
		return PFVPanelInfo;
	}


	public void setPFVPanelInfo(FVPanelInfoCliente pFVPanelInfo) {
		PFVPanelInfo = pFVPanelInfo;
	}


	public FVPanelCantidadProducto getPFVPanelProducto() {
		return PFVPanelProducto;
	}


	public void setPFVPanelProducto(FVPanelCantidadProducto pFVPanelProducto) {
		PFVPanelProducto = pFVPanelProducto;
	}


	public FVPanelBtnCompraProducto getPFVPanelBotones() {
		return PFVPanelBotones;
	}


	public void setPFVPanelBotones(FVPanelBtnCompraProducto pFVPanelBotones) {
		PFVPanelBotones = pFVPanelBotones;
	}


	public FVPanelTablaProductos getPFVPanelListadoPro() {
		return PFVPanelListadoPro;
	}


	public void setPFVPanelListadoPro(FVPanelTablaProductos pFVPanelListadoPro) {
		PFVPanelListadoPro = pFVPanelListadoPro;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
