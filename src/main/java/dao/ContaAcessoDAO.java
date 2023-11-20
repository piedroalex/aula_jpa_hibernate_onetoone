package dao;

import javax.persistence.EntityManager;

import entities.ContaAcesso;
import util.HibernateUtil;

/**
 * @author Pedro Alex
 */
public class ContaAcessoDAO {

	public void salvar(ContaAcesso conta) {    	
    	EntityManager entityManager = HibernateUtil.getEntityManager();
    	try {
	    	entityManager.getTransaction().begin();
	    	entityManager.persist(conta);
	    	entityManager.getTransaction().commit();
	    	System.out.println("Conta de acesso salva com sucesso!");
    	} catch (Exception e) {
        	entityManager.getTransaction().rollback();
	    	System.out.println("Erro ao salvar a conta de acesso!");
            e.printStackTrace();
        } finally {
        	entityManager.close();			
		}
	}
	
}
