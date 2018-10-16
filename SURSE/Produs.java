
public class Produs {
	private String denumire;
	private String categorie;
	private String taraOrigine;											// Clasa care creeaza obiectele de tip produs,in care implementez metodele cerute 
	private double pret;												// si un constructor de produs
	Produs(){
	}
	
	public Produs(String denumire, String categorie,String taraOrigine,double pret)
	{
		this.denumire=denumire;
		this.categorie=categorie;
		this.taraOrigine=taraOrigine;
		this.pret=pret;
	}
	void setDenumire(String denumire)
	{
		this.denumire=denumire;
	}
	String getDenumire()
	{
		return this.denumire;
	}
	void setCategorie(String categorie)
	{
		this.categorie=categorie;
	}
	String getCategorie()
	{
		return this.categorie;
		
	}
	void setTaraOrigine(String taraOrigine)
	{
		this.taraOrigine=taraOrigine;
	}
	String getTaraOrigine()
	{
	return this.taraOrigine;
	}
	void setPret(double pret)
	{
		this.pret=pret;
	}
	double getPret()
	{
		return this.pret;
	}
	 public String toString()
	 {
		 return this.denumire + " " + this.categorie + " " + this.taraOrigine + " " +this.pret + " ";
	 }
}