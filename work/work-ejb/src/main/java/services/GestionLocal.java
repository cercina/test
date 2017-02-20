package services;

import java.util.List;

import javax.ejb.Local;

@Local
public interface GestionLocal {
	
    public void addProduct(Produit p);
	public void removeProduct(Produit p);
	public Produit findProduit(Produit p);
	public List<Produit> getProduits();

}
