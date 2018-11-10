package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class FVPanelInfoCliente extends JPanel 
{
	private static final long serialVersionUID = 1L;
	private Calendar calendario;
	private JTextField espacioFecha, espacioNumFactura,eC,eN,eD,eT,eCE;
	private JLabel fecha, numFactura,cedula,nombre,direccion, telefono,correoElectronico;
	private JButton cliente;
	public static final String CLIENTE = "CLIENTE";

	public FVPanelInfoCliente()
	{
		setLayout(new GridLayout(3,5));

		calendario = Calendar.getInstance();

		fecha =  new JLabel("FECHA: ");
		espacioFecha =  new JTextField();
		espacioFecha.setBackground(Color.WHITE);
		espacioFecha.setForeground(Color.BLACK);

		numFactura = new JLabel("# FACTURA: ");
		espacioNumFactura =  new JTextField();
		espacioNumFactura.setBackground(Color.WHITE);
		espacioNumFactura.setForeground(Color.BLACK);

		cliente = new JButton("Cliente");
		cliente.setActionCommand(CLIENTE);

		cedula =  new JLabel("Cedula");
		eC =  new JTextField();
		eC.setBackground(Color.WHITE);
		eC.setForeground(Color.BLACK);

		nombre = new JLabel("Nombre");
		eN =  new JTextField();
		eN.setBackground(Color.WHITE);
		eN.setForeground(Color.BLACK);

		direccion =  new JLabel("Dirección");
		eD =  new JTextField();
		eD.setBackground(Color.WHITE);
		eD.setForeground(Color.BLACK);

		telefono =  new JLabel("Teléfono");
		eT =  new JTextField();
		eT.setBackground(Color.WHITE);
		eT.setForeground(Color.BLACK);

		correoElectronico =  new JLabel("Correo Electrónico");
		eCE =  new JTextField();
		eCE.setBackground(Color.WHITE);
		eCE.setForeground(Color.BLACK);
		
		add(fecha);
		add(espacioFecha);
		add(numFactura);
		add(espacioNumFactura);
		add(cliente);		
		add(cedula);		
		add(nombre);		
		add(direccion);		
		add(telefono);		
		add(correoElectronico);
		add(eC);
		add(eN);
		add(eD);
		add(eT);
		add(eCE);
	}

	public Calendar getCalendario() {
		return calendario;
	}

	public void setCalendario(Calendar calendario) {
		this.calendario = calendario;
	}

	public JTextField getEspacioFecha() {
		return espacioFecha;
	}

	public void setEspacioFecha(JTextField espacioFecha) {
		this.espacioFecha = espacioFecha;
	}

	public JTextField getEspacioNumFactura() {
		return espacioNumFactura;
	}

	public void setEspacioNumFactura(JTextField espacioNumFactura) {
		this.espacioNumFactura = espacioNumFactura;
	}

	public JTextField geteC() {
		return eC;
	}

	public void seteC(JTextField eC) {
		this.eC = eC;
	}

	public JTextField geteN() {
		return eN;
	}

	public void seteN(JTextField eN) {
		this.eN = eN;
	}

	public JTextField geteD() {
		return eD;
	}

	public void seteD(JTextField eD) {
		this.eD = eD;
	}

	public JTextField geteT() {
		return eT;
	}

	public void seteT(JTextField eT) {
		this.eT = eT;
	}

	public JTextField geteCE() {
		return eCE;
	}

	public void seteCE(JTextField eCE) {
		this.eCE = eCE;
	}

	public JLabel getFecha() {
		return fecha;
	}

	public void setFecha(JLabel fecha) {
		this.fecha = fecha;
	}

	public JLabel getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(JLabel numFactura) {
		this.numFactura = numFactura;
	}

	public JLabel getCedula() {
		return cedula;
	}

	public void setCedula(JLabel cedula) {
		this.cedula = cedula;
	}

	public JLabel getNombre() {
		return nombre;
	}

	public void setNombre(JLabel nombre) {
		this.nombre = nombre;
	}

	public JLabel getDireccion() {
		return direccion;
	}

	public void setDireccion(JLabel direccion) {
		this.direccion = direccion;
	}

	public JLabel getTelefono() {
		return telefono;
	}

	public void setTelefono(JLabel telefono) {
		this.telefono = telefono;
	}

	public JLabel getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(JLabel correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public JButton getCliente() {
		return cliente;
	}

	public void setCliente(JButton cliente) {
		this.cliente = cliente;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static String getCliente1() {
		return CLIENTE;
	}

}
