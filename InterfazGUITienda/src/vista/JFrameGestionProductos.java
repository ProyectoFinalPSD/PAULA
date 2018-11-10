package vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class JFrameGestionProductos extends JFrame
{
	private GPROPanelBotonesProducto panelBotones;
	private GPROPanelListaProducto panelLista;
	
	public JFrameGestionProductos()
	{
		setSize(500,400);
		setResizable(false);
		setTitle("GESTIÓN DE PRODUCTOS");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		panelBotones =  new GPROPanelBotonesProducto();
		add(panelBotones , BorderLayout.EAST);
		
		panelLista = new GPROPanelListaProducto();
		add(panelLista, BorderLayout.CENTER);		
	}

	public GPROPanelBotonesProducto getPanelBotones() {
		return panelBotones;
	}

	public void setPanelBotones(GPROPanelBotonesProducto panelBotones) {
		this.panelBotones = panelBotones;
	}

	public GPROPanelListaProducto getPanelLista() {
		return panelLista;
	}

	public void setPanelLista(GPROPanelListaProducto panelLista) {
		this.panelLista = panelLista;
	}
}