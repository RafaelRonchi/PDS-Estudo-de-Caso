package control;

import java.util.ArrayList;


public class UsuarioDAO {

	private static ArrayList<Usuario> usuario = new ArrayList<>();
	private static UsuarioDAO instancia;

	public static ArrayList<Usuario> getUsuario() {
		return usuario;
	}

	public static void setUsuario(ArrayList<Usuario> usuario) {
		UsuarioDAO.usuario = usuario;
	}

	private UsuarioDAO() {
	}

	public ArrayList<Usuario> listarUsuario() {
		return usuario;
	}

	public static UsuarioDAO getInstancia() {

		if (instancia == null) {
			instancia = new UsuarioDAO();
			usuario = new ArrayList<>();
		}

		return instancia;
	}

	public static boolean inserir(Usuario u) {

		for (int i = 0; i < usuario.size(); i++) {
			Usuario antigoUsuario = usuario.get(i);
			if (antigoUsuario.getCpf().equals(u.getCpf())) {
				return false;
			}
		}
		usuario.add(u);
		return true;

	}

	public boolean remover(Usuario u) {
		boolean removido = usuario.remove(u);
		return removido;
	}

	public boolean alterar(Usuario novoUsuario) {
		for (int i = 0; i < usuario.size(); i++) {
			Usuario novoUsuario1 = usuario.get(i);
			if (novoUsuario1.getCpf().equals(novoUsuario1.getCpf())) {
				usuario.set(i, novoUsuario1);
				return true;
			}
		}
		return false;
	}

}
