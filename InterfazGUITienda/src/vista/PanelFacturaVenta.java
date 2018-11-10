package vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class PanelFacturaVenta extends JFrame
{
	private static final long serialVersionUID = 1L;
	private PFVPanelIformacion PFVPanelInfo;
	
	
	public PanelFacturaVenta()
	{
		setSize(450,760);
		setResizable(false);
		setTitle("Factura de venta");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		PFVPanelInfo = new PFVPanelIformacion();
		add(PFVPanelInfo, BorderLayout.NORTH);
		
		
		
		
		
		
		
	}

}
