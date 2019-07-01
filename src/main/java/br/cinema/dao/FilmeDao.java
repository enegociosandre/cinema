package br.cinema.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.cinema.model.Filme;

@Repository
public class FilmeDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public void save(Filme filme) {
		em.persist(filme);
	}
	public List<Filme> findAll(){
		return em.createQuery("select f from Filme f", Filme.class).getResultList();
	}
}
