package control;

import java.util.ArrayList;

public class UsuarioDAO {
    private static UsuarioDAO instancia;
    private static Usuario[][] matrizUsuarios = new Usuario[10][10];
	private String sala;
	private String sessao;
    

    private UsuarioDAO() {
    }

    public static UsuarioDAO getInstancia() {
        if (instancia == null) {
            instancia = new UsuarioDAO();
        }
        return instancia;
    }

    public boolean inserir(String sessao,String sala,Usuario u, Integer i, Integer j) {
        this.sala = sala;
        this.sessao = sessao;
    	if (matrizUsuarios[i][j] == null) {
               matrizUsuarios[i][j] = u;
              return true;
                
            
        } else {
        return false;
    }
        
    }

    public boolean remover(Usuario usua, Integer i, Integer j) {
                if (matrizUsuarios[i][j] != null && matrizUsuarios[i][j].getCpf().equals(usua.getCpf()) && matrizUsuarios[i][j].getNome().equals(usua.getNome())) {
                    matrizUsuarios[i][j] = null;
                   return true;
            
        }
        return false;
    }

    public boolean alterar(Usuario novoUsuario, Integer i, Integer j) {
       
                if (matrizUsuarios[i][j] != null && matrizUsuarios[i][j].getCpf().equals(novoUsuario.getCpf())) {
                    matrizUsuarios[i][j].setNome(novoUsuario.getNome());
                    return true;
                
 
        }
        return false;
    }

    public static Usuario listarUsuarios(Integer i, Integer j) {
        return  matrizUsuarios[i][j];
        
    }
}
