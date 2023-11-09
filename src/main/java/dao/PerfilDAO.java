package dao;

import javax.persistence.EntityManager;

import entities.Perfil;
import util.HibernateUtil;

public class PerfilDAO {

	public void salvar(Perfil perfil) {
    	EntityManager entityManager = HibernateUtil.getEntityManager();
    	entityManager.getTransaction().begin();
    	entityManager.persist(perfil);
    	entityManager.getTransaction().commit();
    	entityManager.close();
	}
	
	public Perfil buscarPorId(long id) {
    	EntityManager entityManager = HibernateUtil.getEntityManager();
    	Perfil perfil = entityManager.find(Perfil.class, id);
    	entityManager.close();
    	return perfil;
	}
	
}
