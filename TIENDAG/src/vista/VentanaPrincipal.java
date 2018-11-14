package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import modelo.Cliente;
import modelo.GestionCliente;

public class VentanaPrincipal extends JFrame implements ActionListener {
	
	private JButton agregar, eliminar, borrar;/*declaramos el objeto Boton*/
	private JLabel labelTitulo, mensaje;
	private JTextField textCed, textNombre, textDireccion, textTelefono,
			textCorreo;
	private JLabel cedula, nombre, direccion, telefono, correo;
	private DefaultTableModel model;
	private JTable miTabla2 = new JTable();// creamos la instancia de la tabla
	
	
	public VentanaPrincipal(){
		
		setSize(480, 500);
		setTitle("CoDejaVu : Componentes JTable");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		
		
		cedula = new JLabel();
		cedula.setText("Cedula");
		cedula.setBounds(20, 80, 80, 25);
		add(cedula);

		nombre = new JLabel();
		nombre.setText("Nombre");
		nombre.setBounds(20, 120, 80, 25);
		add(nombre);

		telefono = new JLabel();
		telefono.setText("Telefono");
		telefono.setBounds(285, 160, 80, 25);
		add(telefono);

		direccion = new JLabel();
		direccion .setText("Direccion");
		direccion .setBounds(285, 120, 80, 25);
		add(direccion);

		correo = new JLabel();
		correo.setText("Correo");
		correo.setBounds(20, 160, 80, 25);
		add(correo);

		textCed = new JTextField();
		textCed.setBounds(80, 80, 80, 25);
		add(textCed);

		textNombre = new JTextField();
		textNombre.setBounds(80, 120, 190, 25);
		add(textNombre);

		textTelefono = new JTextField();
		textTelefono.setBounds(340, 160, 80, 25);
		add(textTelefono);

		textDireccion = new JTextField();
		textDireccion.setBounds(340, 120, 80, 25);
		add(textDireccion);

		textCorreo = new JTextField();
		textCorreo.setBounds(80, 160, 190, 25);
		add(textCorreo);

		
		
		/*Propiedades del boton, lo instanciamos, posicionamos y
		 * activamos los eventos*/
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
		
		/*Propiedades del Label, lo instanciamos, posicionamos y
		 * activamos los eventos*/
		labelTitulo= new JLabel();
		labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 20));
		labelTitulo.setText("Registro de Clientes");
		labelTitulo.setBounds(143, 10, 180, 43);
		
		mensaje= new JLabel();
		mensaje.setBounds(20, 250, 280, 23);
		
		model = new DefaultTableModel();// definimos el objeto tableModel
		miTabla2.setModel(model);
		model.addColumn("Nº Documento");
		model.addColumn("Nombre");
		model.addColumn("Direccion");
		model.addColumn("Correo");
		model.addColumn("Telefono");

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
		//add(scrollLista);
		//contenedor.add(botonCam);

	
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource()==agregar)
		{
			agregarNombre();
			mensaje.setText("Se agregó un nuevo elemento");
			GestionCliente g = new GestionCliente();
			g.agregar(textCed.getText(), textNombre.getText(), textDireccion.getText(), textCorreo.getText(), textTelefono.getText());
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

	private void agregarNombre() {
		String cedula =textCed.getText();
		String nombre=textNombre.getText();
		String direccion =textDireccion.getText();
		String correo=textCorreo.getText();
		String telefono=textTelefono.getText();
		Object[] o = {cedula, nombre, direccion, correo, telefono};
		model.addRow(o);
		//listaNombres.setModel(modelo);
		limpiar();
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
	
	private void borrarLista() {
		//model.clear();
	}
	public void limpiar() {
		textCed.setText("");
		textNombre.setText("");
		textDireccion.setText("");
		textTelefono.setText("");
		textCorreo.setText("");
	}

}
