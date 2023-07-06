package control;

import java.util.ArrayList;

import Interfaces.IFuncionario;
import modelo.Funcionario;

public class FuncionarioDAO implements IFuncionario{

	private static ArrayList<Funcionario> funcionario = new ArrayList<>();
	private static FuncionarioDAO instancia;

	private FuncionarioDAO() {
	}
	
	public static FuncionarioDAO getInstancia() {
		
		if (instancia == null) {
			instancia = new FuncionarioDAO();
			funcionario = new ArrayList<>();
		}
		
		return instancia;
	}
	
	@Override
	public ArrayList<Funcionario> listarFuncionario() {
		return funcionario;
	}
	
	@Override
	public boolean inserir(Funcionario p) {

		for (Funcionario funcionario2 : funcionario) {
			if(funcionario2.getCpf().equals(p.getCpf())) {
				return false;
			}
		}
			
		
		funcionario.add(p);
		return true;

	}
	@Override
	public boolean remover(Funcionario f) {
	    for (Funcionario funcionario2 : funcionario) {
	        if (f.getCpf().equals(funcionario2.getCpf()) && f.getNome().equals(funcionario2.getNome())) {
	            funcionario.remove(funcionario2);
	            return true;
	        }
	    }
	    return false;
	}

	@Override
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
