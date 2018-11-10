package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class GPROPanelBotonesProducto extends JPanel
{
	private JButton crear, actualizar, borrar;
	public static final String CREAR = "CREAR";
	public static final String ACTUALIZAR = "ACTUALIZAR";
	public static final String BORRAR = "BORRAR";

	public GPROPanelBotonesProducto()
	{
		setLayout(new GridLayout(3,1));

		crear = new JButton("CREAR PRODUCTO");
		crear.setActionCommand(CREAR);

		actualizar = new JButton("ACTUALIZAR PRODUCTO");
		actualizar.setActionCommand(ACTUALIZAR);

		borrar = new JButton("BORRAR PRODUCTO");
		borrar.setActionCommand(BORRAR);

		add(crear);
		add(actualizar);
		add(borrar);		
	}

	public JButton getCrear() {
		return crear;
	}

	public void setCrear(JButton crear) {
		this.crear = crear;
	}

	public JButton getActualizar() {
		return actualizar;
	}

	public void setActualizar(JButton actualizar) {
		this.actualizar = actualizar;
	}

	public JButton getBorrar() {
		return borrar;
	}

	public void setBorrar(JButton borrar) {
		this.borrar = borrar;
	}
}

	