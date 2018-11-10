package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class JFrameRegistroTiendaParametros extends JFrame
{

	private static final long serialVersionUID = 1L;
	private RegistroTiendaPanelDatos pe;
	private RegistroTiendaPanelBotonesDatos pom1;
	
	public JFrameRegistroTiendaParametros()
	{			
		setLayout(new BorderLayout());
		setSize(700,500);
		setResizable(false);
		setTitle("Titulo Vetana");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		
		pe = new RegistroTiendaPanelDatos();
		pom1 = new RegistroTiendaPanelBotonesDatos();
		
		add(pe);
		add(pom1, BorderLayout.SOUTH);
		
		
	}


	public RegistroTiendaPanelDatos getPe() {
		return pe;
	}


	public void setPe(RegistroTiendaPanelDatos pe) {
		this.pe = pe;
	}


	public RegistroTiendaPanelBotonesDatos getPom1() {
		return pom1;
	}


	public void setPom1(RegistroTiendaPanelBotonesDatos pom1) {
		this.pom1 = pom1;
	}
	
		
	
	

}
