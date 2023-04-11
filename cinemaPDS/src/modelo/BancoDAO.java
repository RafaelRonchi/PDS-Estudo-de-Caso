package modelo;

public class BancoDAO {
		private Boolean[][] bancos;
		private BancoDAO instancia;
		
		public BancoDAO() {
			// TODO Auto-generated constructor stub
		}
		
		public Boolean[][] getBancos() {
			return bancos;
		}
		
		public void setBancos(Boolean[][] bancos) {
			this.bancos = bancos;
		}
		public Boolean[][] listarBancos() {
			return bancos;
		}
		public BancoDAO getInstancia() {
			if(instancia == null) {
				instancia = new BancoDAO();
			}
			return instancia;
		}	
	
}
