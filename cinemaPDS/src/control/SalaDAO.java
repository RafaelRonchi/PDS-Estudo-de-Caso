package control;

import java.util.ArrayList;

import Interfaces.ISala;
import modelo.Sala;

public class SalaDAO implements ISala{
	private static ArrayList<Sala> ListSalas;
	private static SalaDAO instanciaSala;
	
	private SalaDAO() {
		
	}

	@Override
	public void criarSala(Sala s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String verSala() {
		// TODO Auto-generated method stub
		return null;
	}

}
