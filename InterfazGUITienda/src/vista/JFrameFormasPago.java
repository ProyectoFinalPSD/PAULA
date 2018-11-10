package vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class JFrameFormasPago extends JFrame
{
	private FPPanelSeleccion SeleccionPago;
	
	public JFrameFormasPago() 
	{
		setSize(290,150);
		setResizable(false);
		setTitle("FORMAS DE PAGO");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		SeleccionPago = new FPPanelSeleccion();
		add(SeleccionPago);
		}
}