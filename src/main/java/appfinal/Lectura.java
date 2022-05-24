package appfinal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Heroe;

public class Lectura {

	public static void main(String[] args) {
		
		// Permite realizar operaciones con la BD
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("delphos");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		//Se crea la Query a partir de la NamedQuery de la clase Vehículo
		Query q = em.createNamedQuery("Heroe.findAll");
		
		// Se ejecuta la consulta con getResultList haciendo un casting
		List<Heroe> listaHeroes = (List<Heroe>) q.getResultList();
		
		//Se imprime
		for (Heroe h : listaHeroes) {
			System.out.println(h);
		}
		
		//Se cierra el EntityManager
		em.close();
	}

}
