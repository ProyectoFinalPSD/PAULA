package vista;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Calendar;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class PFVPanelIformacion extends JPanel 
{
	private static final long serialVersionUID = 1L;
	private Calendar calendario;
	private JTextField espacioFecha, espacioNumFactura;
	private JLabel fecha, numFactura;
	private JButton cliente;
	private static final String CLIENTE = "CLIENTE";
	private JTable table;
	
	public PFVPanelIformacion()
	{
		setLayout(new GridLayout(3,1));
		
		calendario = Calendar.getInstance();

		fecha =  new JLabel();
		fecha.setText("FECHA: ");
		
		espacioFecha =  new JTextField();
		espacioFecha.setBackground(Color.WHITE);
		espacioFecha.setForeground(Color.BLACK);
		
		numFactura = new JLabel();
		numFactura.setText("# FACTURA");
		
		espacioNumFactura =  new JTextField();
		espacioNumFactura.setBackground(Color.WHITE);
		espacioNumFactura.setForeground(Color.BLACK);
		
		cliente = new JButton("Cliente");
		cliente.setActionCommand(CLIENTE);
		
		table = new JTable();
		DefaultTableModel modelo = (DefaultTableModel)table.getModel();
		modelo.addColumn("Cedula");
		modelo.addColumn("Nombre");
		modelo.addColumn("Direccion");
		modelo.addColumn("telefono");
		modelo.addColumn("correo");
		
		Object [] fila = new Object[5];
		fila[0] = "dato columna 1";
		fila[0] = "dato columna 1";
		fila[0] = "dato columna 1";
		fila[0] = "dato columna 1";
		fila[1] = "dato columna 3";
		modelo.addRow ( fila ); // Añade una fila al final
		table.setSize(new Dimension(450, 10));
		
		add(fecha);
		add(espacioFecha);
		add(numFactura);
		add(espacioNumFactura);
		add(table);
		
		
		 

		
		
	}

}
