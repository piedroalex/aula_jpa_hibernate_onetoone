package principal;

import dao.ContaAcessoDAO;
import dao.PessoaDAO;
import entities.ContaAcesso;
import entities.Pessoa;

/**
 * @author Pedro Alex
 */
public class Principal {
	
	public static void main(String[] args) {
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Pedro");
		
		pessoaDAO.salvar(pessoa);
		pessoa = pessoaDAO.buscarPorNome("Pedro");

		ContaAcessoDAO contaAcessoDAO = new ContaAcessoDAO();
		
		ContaAcesso contaAcesso = new ContaAcesso();
		contaAcesso.setLogin("piedroalex@gmail.com");
		contaAcesso.setPessoa(pessoa);
		
		contaAcessoDAO.salvar(contaAcesso);
		
	}
}
