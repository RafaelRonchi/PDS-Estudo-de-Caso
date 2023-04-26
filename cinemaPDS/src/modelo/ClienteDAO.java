package modelo;
import java.util.ArrayList;


public class ClienteDAO {
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private static ClienteDAO instancia;

	public static ArrayList<Cliente> getCliente() {
		return clientes;
	}


	private ClienteDAO() {
	}

	public ArrayList<Cliente> listar_cliente() {
		return clientes;
	}

	public static ClienteDAO getInstancia() {

		if (instancia == null) {
			instancia = new ClienteDAO();
			clientes = new ArrayList<>();
		}
		
		return instancia;
	}
	
	
	public boolean inserir(Cliente c) {
		if (c != null) {
			clientes.add(c);
			return true;
		
		}
		
		return false;
	}
	
	

}
