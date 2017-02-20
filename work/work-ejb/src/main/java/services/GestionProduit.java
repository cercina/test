package services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateful;


@Stateful
public class GestionProduit  implements GestionLocal,GestionRemote{

	List<Produit> produits;
	
	 public GestionProduit() {
		// TODO Auto-generated constructor stub
		 produits =  new ArrayList<>();
	}
	
	@Override
	public List<Produit> getProduits() {
		// TODO Auto-generated method stub
		return produits;
	}

	@Override
	public void addProduct(Produit p) {
		// TODO Auto-generated method stub
		produits.add(p);
		
	}

	@Override
	public void removeProduct(Produit p) {
		// TODO Auto-generated method stub
		produits.remove(p);
	}

	@Override
	public Produit findProduit(Produit p) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
