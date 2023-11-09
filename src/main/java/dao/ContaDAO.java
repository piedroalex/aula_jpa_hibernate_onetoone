package dao;

import javax.persistence.EntityManager;

import entities.Conta;
import util.HibernateUtil;

public class ContaDAO {

	public void salvar(Conta conta) {
    	EntityManager entityManager = HibernateUtil.getEntityManager();

    	entityManager.getTransaction().begin();
    	entityManager.persist(conta);
    	entityManager.getTransaction().commit();

    	entityManager.close();
	}
	
}
