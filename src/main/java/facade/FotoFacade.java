package facade;

import java.util.List;

import javax.ejb.Local;

import models.Foto;

@Local
public interface FotoFacade {

	public void create(Foto entity);

	public void edit(Foto entity);

	public void remove(Foto entity);

	public Foto find(Object id);

	public List<Foto> findAll();

	public List<Foto> findRange(int[] range);

	public int count();

}
