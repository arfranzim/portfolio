package br.com.portfolio.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.portfolio.models.Projeto;

@Repository
@Transactional
public class ProjetoDAO {
	
	@PersistenceContext
	private EntityManager manager;

	public void gravar(Projeto projeto) {
		manager.persist(projeto);
	}
}
