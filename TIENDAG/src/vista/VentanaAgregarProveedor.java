package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import modelo.GestionCliente;

public class VentanaAgregarProveedor extends JFrame implements ActionListener
{
	private JButton agregar, eliminar, borrar;
	private JLabel labelTitulo, mensaje;
	private JTextField textNIT, textNombre, textDireccion, textTelefono, textCiudad;
	private JLabel NIT, nombre, direccion, telefono, ciudad;
	private DefaultTableModel model;
	private JTable miTabla2 = new JTable();
	
public VentanaAgregarProveedor(){
		
		setSize(500, 500);
		setTitle("¿Desea ser proveedor nuestro?");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		NIT = new JLabel();
		NIT.setText("NIT");
		NIT.setBounds(20, 80, 80, 25);
		add(NIT);
		
		nombre = new JLabel();
		nombre.setText("Nombre");
		nombre.setBounds(20, 120, 80, 25);
		add(nombre);
		
		direccion = new JLabel();
		direccion.setText("Direccion");
		direccion.setBounds(20, 160, 80, 25);
		add(direccion);
		
		telefono = new JLabel();
		telefono.setText("Telefono");
		telefono.setBounds(310, 120, 80, 25);
		add(telefono);
		
		ciudad = new JLabel();
		ciudad.setText("Ciudad");
		ciudad.setBounds(310, 80, 190, 25);
		add(ciudad);
		
		textNIT = new JTextField();
		textNIT.setBounds(85, 80, 80, 25);
		add(textNIT);
		
		textNombre = new JTextField();
		textNombre.setBounds(85, 120, 190, 25);
		add(textNombre);
		
		textCiudad = new JTextField();
		textCiudad.setBounds(365, 80, 80, 25);
		add(textCiudad);
		
		textTelefono = new JTextField();
		textTelefono.setBounds(365, 120, 80, 25);
		add(textTelefono);
		
		textDireccion = new JTextField();
		textDireccion.setBounds(85, 160, 190, 25);
		add(textDireccion);
		
		agregar= new JButton();
		agregar.setText("Agregar");
		agregar.setBounds(50, 230, 80, 23);
		agregar.addActionListener(this);
		
		eliminar= new JButton();
		eliminar.setText("Eliminar");
		eliminar.setBounds(330, 230, 80, 23);
		eliminar.addActionListener(this);
		
		borrar= new JButton();
		borrar.setText("Borrar Lista");
		borrar.setBounds(170, 230, 120, 23);
		borrar.addActionListener(this);
		
		labelTitulo= new JLabel();
		labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 20));
		labelTitulo.setText("Registro de proveedores");
		labelTitulo.setBounds(143, 10, 250, 43);
		
		mensaje= new JLabel();
		mensaje.setBounds(20, 250, 280, 23);
		
		model = new DefaultTableModel();// definimos el objeto tableModel
		miTabla2.setModel(model);
		model.addColumn("NIT");
		model.addColumn("Nombre");
		model.addColumn("Direccion");
		model.addColumn("Telefono");
		model.addColumn("Ciudad");
		
		JScrollPane miBarra2 = new JScrollPane();
		miBarra2.setBounds(40, 300, 400, 130);
		miBarra2.setViewportView(miTabla2);
		
		
		/*Agregamos los componentes al Contenedor*/
		add(labelTitulo);
		add(agregar);
		add(eliminar);
		add(borrar);
		add(mensaje);
		add(miBarra2);
}

	public void actionPerformed(ActionEvent evento) {
			if (evento.getSource()==agregar)
			{
				agregarNombre();
				mensaje.setText("Se agregó un nuevo elemento");
				GestionCliente g = new GestionCliente();
				g.agregar(textNIT.getText(), textNombre.getText(), textDireccion.getText(), textTelefono.getText(), textCiudad.getText());
				System.out.println(g.getLista().size());
				
			}
			if (evento.getSource()==eliminar)
			{
				eliminarNombre(miTabla2.getSelectedRow());
			}
			if (evento.getSource()==borrar)
			{
				borrarLista();
				mensaje.setText("Se borró toda la lista");
			}
		}

	private void borrarLista() {
		// TODO Auto-generated method stub
		
	}

	private void eliminarNombre(int indice) {
		if (indice>=0) {
			model.removeRow(indice);	
			mensaje.setText("Se eliminó un elemento en la posición "+indice);
		}else{
			JOptionPane.showMessageDialog(null, "Debe seleccionar un indice"
					,"Error", JOptionPane.ERROR_MESSAGE);
			
				mensaje.setText("NO se seleccionó ningún elemento");
		}
		
	}
	private void agregarNombre() {
		String NIT = textNIT.getText();
		String nombre = textNombre.getText();
		String direccion = textDireccion.getText();
		String telefono = textTelefono.getText();
		String ciudad = textCiudad.getText();
		Object o [] = {NIT, nombre, direccion, telefono, ciudad};
		
		model.addRow(o);
		limpiar();
	}

	private void limpiar() {
		
		textNIT.setText("");
		textNombre.setText("");
		textDireccion.setText("");
		textTelefono.setText("");
		textCiudad.setText("");
	}
	
	
	}
	
	


