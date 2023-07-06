package Interfaces;

import java.util.ArrayList;

import modelo.Funcionario;

public interface IFuncionario {
	public ArrayList<Funcionario> listarFuncionario();
	public boolean inserir(Funcionario p);
	public boolean remover(Funcionario f);
	public boolean alterar(Funcionario novoFuncionario);
}
