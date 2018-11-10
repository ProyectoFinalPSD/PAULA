package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FPPanelSeleccion extends JPanel
{
	private JCheckBox efectivo,cuotas;

	public FPPanelSeleccion()
	{
		setLayout(new GridLayout(2,1));
		
		efectivo =  new JCheckBox("EFECTIVO");
		cuotas =  new JCheckBox("CUOTAS");
		
		add(efectivo);
		add(cuotas);
	}
}