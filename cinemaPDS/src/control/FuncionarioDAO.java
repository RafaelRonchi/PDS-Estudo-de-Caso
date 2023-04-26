package control;

import java.util.ArrayList;

import modelo.Cliente;

public class FuncionarioDAO {

	
	private static ArrayList<Funcionario> funcionario = new ArrayList<>();
	private static FuncionarioDAO instancia;

	public static ArrayList<Funcionario> getFuncionario() {
		return funcionario;
	}

	public static void setfuncionario(ArrayList<Funcionario> funcionario) {
	FuncionarioDAO.funcionario = funcionario;
	}

	private FuncionarioDAO() {
	}

	public ArrayList<Funcionario> listarFuncionario() {
		return funcionario;
	}

	public static FuncionarioDAO getInstancia() {

		if (instancia == null) {
			instancia = new FuncionarioDAO();
			funcionario = new ArrayList<>();
		}

		return instancia;
	}
	public boolean inserir(Funcionario p) {
		Long cpf = p.getCpf();
		if(cpf != null){
				funcionario.add(p);
				return true;
		}
		return false;
}
	public boolean remover(Funcionario f) {
	    boolean removido = funcionario.remove(f);
	    return removido;
	}
	public boolean alterar(Funcionario novoFuncionario) {
	    for (int i = 0; i < funcionario.size(); i++) {
	        Funcionario antigoFuncionario = funcionario.get(i);
	        if (antigoFuncionario.getCpf().equals(novoFuncionario.getCpf())) {
	            funcionario.set(i, novoFuncionario);
	            return true;
	        }
	    }
	    return false;
	}


	}



