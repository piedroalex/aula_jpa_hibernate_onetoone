package principal;

import dao.ContaDAO;
import dao.PerfilDAO;
import entities.Conta;
import entities.Perfil;

public class Principal {
	
	public static void main(String[] args) {
		
		PerfilDAO perfilDAO = new PerfilDAO();
		
		Perfil perfil = new Perfil();
		perfil.setDescricao("Administrador");
		
		perfilDAO.salvar(perfil);
		perfil = perfilDAO.buscarPorId(1);

		ContaDAO funcionarioDAO = new ContaDAO();
		
		Conta conta = new Conta();
		conta.setLogin("piedroalex@gmail.com");
		conta.setPerfil(perfil);
		
		funcionarioDAO.salvar(conta);
		
	}
}
