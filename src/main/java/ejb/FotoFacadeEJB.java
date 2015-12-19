package ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import facade.AbstractFacade;
import facade.FotoFacade;
import models.Foto;

@Stateless
public class FotoFacadeEJB extends AbstractFacade<Foto> implements FotoFacade {
	
	
	@PersistenceContext(unitName = "thinkINK")
	private EntityManager em;
	
	public FotoFacadeEJB() {
		super(Foto.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return this.em;
	}

}
