package Interfaces;

import modelo.Usuario;

public interface ICliente {
	public boolean inserir(Usuario u, Integer i, Integer j, Integer salaN);

    public boolean remover(Usuario usua, Integer i, Integer j, Integer salaN);

    public boolean alterar(Usuario novoUsuario, Integer i, Integer j, Integer salaN);

    public static Usuario listarUsuarios(Integer i, Integer j, Integer salaN) {
		return null;
	}
}
