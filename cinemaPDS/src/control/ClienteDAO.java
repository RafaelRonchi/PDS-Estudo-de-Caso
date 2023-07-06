package control;

import java.util.ArrayList;

import Interfaces.ICliente;
import modelo.Usuario;

public class ClienteDAO implements ICliente {
    private static ClienteDAO instancia;
    private static Usuario[][] matrizUsuarios = new Usuario[10][10];
    private static Usuario[][] matrizUsuariosA2 = new Usuario[10][10];
    private static Usuario[][] matrizUsuariosB1 = new Usuario[10][10];
    private static Usuario[][] matrizUsuariosB2 = new Usuario[10][10];
    private static Usuario[][] matrizUsuariosC1 = new Usuario[10][10];
    private static Usuario[][] matrizUsuariosC2 = new Usuario[10][10];
    

    private ClienteDAO() {
    }

    public static ClienteDAO getInstancia() {
        if (instancia == null) {
            instancia = new ClienteDAO();
        }
        return instancia;
    }

    public boolean inserir(Usuario u, Integer i, Integer j, Integer salaN) {
    	switch (salaN) {
		case 1: {
			if (matrizUsuarios[i][j] == null) {
	               matrizUsuarios[i][j] = u;
	              return true;            
	    	}
			break;
		}
		case 2: {
			
			if (matrizUsuariosA2[i][j] == null) {
	               matrizUsuariosA2[i][j] = u;
	              return true;            
	    	}
			break;
		}
		case 3: {
			
			if (matrizUsuariosB1[i][j] == null) {
	               matrizUsuariosB1[i][j] = u;
	              return true;            
	    	}
			break;
		}
		case 4: {
			if (matrizUsuariosB2[i][j] == null) {
	               matrizUsuariosB2[i][j] = u;
	              return true;            
	    	} 
			break;
		}
		case 5: {
			if (matrizUsuariosC1[i][j] == null) {
	               matrizUsuariosC1[i][j] = u;
	              return true;            
	    	}
			break;
		}
		case 6: {
			if (matrizUsuariosC2[i][j] == null) {
	               matrizUsuariosC2[i][j] = u;
	              return true;            
	    	}
			break;
		}
    	
    }
		return false;
    }

    public boolean remover(Usuario usua, Integer i, Integer j, Integer salaN) {
                switch (salaN) {
        		case 1: {
        			if (matrizUsuarios[i][j] != null && matrizUsuarios[i][j].getCpf().equals(usua.getCpf()) && matrizUsuarios[i][j].getNome().equals(usua.getNome())) {
                        matrizUsuarios[i][j] = null;
                       return true;
                    }
        			break;
        		}
        		case 2: {
        			if (matrizUsuariosA2[i][j] != null && matrizUsuariosA2[i][j].getCpf().equals(usua.getCpf()) && matrizUsuariosA2[i][j].getNome().equals(usua.getNome())) {
                        matrizUsuariosA2[i][j] = null;
                       return true;
                    }
        			break;
        		}
        		case 3: {
        			if (matrizUsuariosB1[i][j] != null && matrizUsuariosB1[i][j].getCpf().equals(usua.getCpf()) && matrizUsuariosB1[i][j].getNome().equals(usua.getNome())) {
                        matrizUsuariosB1[i][j] = null;
                       return true;
                    }
        			break;
        		}
        		case 4: {
        			if (matrizUsuariosB2[i][j] != null && matrizUsuariosB2[i][j].getCpf().equals(usua.getCpf()) && matrizUsuariosB2[i][j].getNome().equals(usua.getNome())) {
                        matrizUsuariosB2[i][j] = null;
                       return true;
                    }
        			break;
        		}
        		case 5: {
        			if (matrizUsuariosC1[i][j] != null && matrizUsuariosC1[i][j].getCpf().equals(usua.getCpf()) && matrizUsuariosC1[i][j].getNome().equals(usua.getNome())) {
                        matrizUsuariosC1[i][j] = null;
                       return true;
                    }
        			break;
        		}
        		case 6: {
        			if (matrizUsuariosC2[i][j] != null && matrizUsuariosC2[i][j].getCpf().equals(usua.getCpf()) && matrizUsuariosC2[i][j].getNome().equals(usua.getNome())) {
                        matrizUsuariosC2[i][j] = null;
                       return true;
                    }
        			break;
        		}
            	
            }
                     
        return false;
    }

    public boolean alterar(Usuario novoUsuario, Integer i, Integer j, Integer salaN) {
                switch (salaN) {
        		case 1: {
        			if (matrizUsuarios[i][j] != null && matrizUsuarios[i][j].getCpf().equals(novoUsuario.getCpf())) {
                        matrizUsuarios[i][j].setNome(novoUsuario.getNome());
                        matrizUsuarios[i][j].setPrecoIngresso(novoUsuario.getPrecoIngresso());
                        return true;
                    }
        			break;
        		}
        		case 2: {
        			if (matrizUsuariosA2[i][j] != null && matrizUsuariosA2[i][j].getCpf().equals(novoUsuario.getCpf())) {
                        matrizUsuariosA2[i][j].setNome(novoUsuario.getNome());
                        matrizUsuariosA2[i][j].setPrecoIngresso(novoUsuario.getPrecoIngresso());
                        return true;
                    }
        			break;
        		}
        		case 3: {
        			if (matrizUsuariosB1[i][j] != null && matrizUsuariosB1[i][j].getCpf().equals(novoUsuario.getCpf())) {
                        matrizUsuariosB1[i][j].setNome(novoUsuario.getNome());
                        matrizUsuariosB1[i][j].setPrecoIngresso(novoUsuario.getPrecoIngresso());
                        return true;
                    }
        			break;
        		}
        		case 4: {
        			if (matrizUsuariosB2[i][j] != null && matrizUsuariosB2[i][j].getCpf().equals(novoUsuario.getCpf())) {
                        matrizUsuariosB2[i][j].setNome(novoUsuario.getNome());
                        matrizUsuariosB2[i][j].setPrecoIngresso(novoUsuario.getPrecoIngresso());
                        return true;
                    }
        			break;
        		}
        		case 5: {
        			if (matrizUsuariosC1[i][j] != null && matrizUsuariosC1[i][j].getCpf().equals(novoUsuario.getCpf())) {
                        matrizUsuariosC1[i][j].setNome(novoUsuario.getNome());
                        matrizUsuariosC1[i][j].setPrecoIngresso(novoUsuario.getPrecoIngresso());
                        return true;
                    }
        			break;
        		}
        		case 6: {
        			if (matrizUsuariosC2[i][j] != null && matrizUsuariosC2[i][j].getCpf().equals(novoUsuario.getCpf())) {
                        matrizUsuariosC2[i][j].setNome(novoUsuario.getNome());
                        matrizUsuariosC2[i][j].setPrecoIngresso(novoUsuario.getPrecoIngresso());
                        return true;
                    }
        			break;
        		}
            	
            }
                
        return false;
    }

    public static Usuario listarUsuarios(Integer i, Integer j, Integer salaN) {
    	switch (salaN) {
		case 1: {
			return  matrizUsuarios[i][j];
		}
		case 2: {
			return  matrizUsuariosA2[i][j];
		}
		case 3: {
			return  matrizUsuariosB1[i][j];
		}
		case 4: {
			return  matrizUsuariosB2[i][j];
		}
		case 5: {
			return  matrizUsuariosC1[i][j];
		}
		case 6: {
			return  matrizUsuariosC2[i][j];
		}
    	
    }
		return null;
        
    }
}
