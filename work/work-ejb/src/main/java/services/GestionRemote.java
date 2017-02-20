package services;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface GestionRemote {
	
    public void addProduct(Produit p);
	public void removeProduct(Produit p);
	public Produit findProduit(Produit p);
	public List<Produit> getProduits();

}
