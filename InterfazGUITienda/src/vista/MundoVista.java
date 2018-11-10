package vista;

public class MundoVista {

	private JFrameFacturaVenta VPFV;
	private JFrameGestionClientes VPGCL;
	private JFrameGestionProveedores VPGP;
	private JFrameGestionProductos VPGPRO;
	private JFrameRegistroTiendaParametros VPRTP;
	private GUI VP;
	private JFrameRegistroCliente VPRCL;
	private JFrameRegistroProducto VPRPRO;
	
	private GPPanelRegistroProveedores VPRP; //AGREGADO*

	public MundoVista()
	{
	
		VPRPRO = new JFrameRegistroProducto();
		VPRCL = new JFrameRegistroCliente();
		VP = new GUI();
		VPRP = new GPPanelRegistroProveedores();
		VPFV =  new JFrameFacturaVenta();
		VPGCL = new JFrameGestionClientes();
		VPGP =  new JFrameGestionProveedores();
		VPGPRO =  new JFrameGestionProductos();
		VPRTP = new JFrameRegistroTiendaParametros();
	}

	public JFrameRegistroProducto getVPRPRO() {
		return VPRPRO;
	}

	public void setVPRPRO(JFrameRegistroProducto vPRPRO) {
		VPRPRO = vPRPRO;
	}

	public JFrameRegistroCliente getVPRCL() {
		return VPRCL;
	}

	public void setVPRCL(JFrameRegistroCliente vPRCL) {
		VPRCL = vPRCL;
	}

	public GPPanelRegistroProveedores getVPRP() {
		return VPRP;
	}

	public void setVPRP(GPPanelRegistroProveedores vPRP) {
		VPRP = vPRP;
	}

	public JFrameFacturaVenta getVPFV() 
	{
		return VPFV;
	}

	public void setVPFV(JFrameFacturaVenta vPFV) 
	{
		VPFV = vPFV;
	}

	public JFrameGestionClientes getVPGCL() 
	{
		return VPGCL;
	}

	public void setVPGCL(JFrameGestionClientes vPGCL)
	{
		VPGCL = vPGCL;
	}

	public JFrameGestionProveedores getVPGP() 
	{
		return VPGP;
	}

	public void setVPGP(JFrameGestionProveedores vPGP) 
	{
		VPGP = vPGP;
	}

	public JFrameGestionProductos getVPGPRO() 
	{
		return VPGPRO;
	}

	public void setVPGPRO(JFrameGestionProductos vPGPRO) 
	{
		VPGPRO = vPGPRO;
	}

	public JFrameRegistroTiendaParametros getVPRTP() 
	{
		return VPRTP;
	}

	public void setVPRTP(JFrameRegistroTiendaParametros vPRTP) 
	{
		VPRTP = vPRTP;
	}

	public GUI getVP() {
		return VP;
	}

	public void setVP(GUI vP) {
		VP = vP;
	}

}
