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

public class VentanaAgregarProducto extends JFrame implements ActionListener{

	private JButton agregar, eliminar, borrar;
	private JLabel labelTitulo, mensaje;
	private JTextField textCodigo, textNomProducto, textPrecioCompra, textPrecioVenta, textNit;
	private JLabel Codigo, nomProducto, precio_compra, precio_venta, nit;
	private DefaultTableModel model;
	private JTable miTabla2 = new JTable();// creamos la instancia de la tabla
	
	
	public VentanaAgregarProducto(){
		
		setSize(480, 500);
		setTitle("Registrese aquí");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		nomProducto = new JLabel();
		nomProducto.setText("Nombre");
		nomProducto.setBounds(15, 80, 80, 25);
		add(nomProducto);
		
		Codigo = new JLabel();
		Codigo.setText("Codigo");
		Codigo.setBounds(15, 115, 80, 25);
		add(Codigo);
		
		precio_compra = new JLabel();
		precio_compra.setText("Precio de compra");
		precio_compra.setBounds(245, 120, 190, 25);
		add(precio_compra);
		
		precio_venta = new JLabel();
		precio_venta.setText("Precio de venta");
		precio_venta.setBounds(245, 80, 100, 25);
		add(precio_venta);
		
		nit = new JLabel();
		nit.setText("NIT");  
		nit.setBounds(15, 148, 120, 25);
		add(nit);
		
		textNomProducto = new JTextField();
		textNomProducto.setBounds(80, 80, 140, 25);
		add(textNomProducto);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(80, 115, 90, 25);
		add(textCodigo);
		
		textPrecioCompra = new JTextField();
		textPrecioCompra.setBounds(355, 120, 80, 25);
		add(textPrecioCompra);
		
		textPrecioVenta = new JTextField();
		textPrecioVenta.setBounds(355, 80, 80, 25);
		add(textPrecioVenta);
		
		textNit = new JTextField();
		textNit.setBounds(80, 150, 80, 25);
		add(textNit);
		
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
		labelTitulo.setText("Registro de Productos");
		labelTitulo.setBounds(143, 10, 200, 43);
		
		mensaje= new JLabel();
		mensaje.setBounds(20, 250, 280, 23);
		
		model = new DefaultTableModel();// definimos el objeto tableModel
		miTabla2.setModel(model);
		model.addColumn("Nombre");
		model.addColumn("Codigo");
		model.addColumn("Precio compra");
		model.addColumn("Precio Venta");
		model.addColumn("NIT");
		
		JScrollPane miBarra2 = new JScrollPane();
		miBarra2.setBounds(15, 300, 450, 130);
		miBarra2.setViewportView(miTabla2);
		
		
		/*Agregamos los componentes al Contenedor*/
		add(labelTitulo);
		add(agregar);
		add(eliminar);
		add(borrar);
		add(mensaje);
		add(miBarra2);
		
}


	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource()==agregar)
		{
			agregarNombre();
			mensaje.setText("Se agregó un nuevo elemento");
			GestionCliente g = new GestionCliente();
			g.agregar(textNomProducto.getText(), textCodigo.getText(), textPrecioCompra.getText(), textPrecioVenta.getText(), textNit.getText());
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
		String nombre =textNomProducto.getText();
		String codigo=textCodigo.getText();
		String precioCompra =textPrecioCompra.getText();
		String precioventa=textPrecioVenta.getText();
		String NIT=textNit.getText();
		Object[] o = {nombre, codigo, precioCompra, precioventa, NIT};
		model.addRow(o);
		
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
		textNomProducto.setText("");
		textCodigo.setText("");
		textPrecioCompra.setText("");
		textPrecioVenta.setText("");
		textNit.setText("");
	}

	}
