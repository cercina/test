package services;

public class Produit {

	private Integer code;
	private String name;
	private Double price;
	private Integer qte;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getQte() {
		return qte;
	}
	public void setQte(Integer qte) {
		this.qte = qte;
	}
	public Produit(Integer code, String name, Double price, Integer qte) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.qte = qte;
	}
	
	public Produit() {
		
	}
public int test() {
		return 0;
	}
	
	
	
	
	
	
}
