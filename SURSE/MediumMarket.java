import java.io.File;
import java.util.Scanner;
import java.util.Vector;

public class MediumMarket extends Magazin {
	
	String MediumMarket,categorie,nume;
	Vector v= new Vector();
	
	MediumMarket()
	{
		
	}
	
public MediumMarket(String nume,Vector<Factura> f,String MediumMarket,Vector v)
	{
		super(nume,f);
		this.MediumMarket=MediumMarket;
		this.v=v;
	}
	
public double calculScutiriTaxe() {
		double prod=0,prodcom=0;
		for (int i=0;i<v.size();i++)
		{
		categorie= (String) v.get(i);
		prodcom=TotalCategorie(categorie);
		prod=getTotalCuTaxe();
	
		if (prodcom >0.5*prod)
		{	
				return 1.00*1/20;
		}
		
		}
		
		return 0;
	}
	
	public String toString()
	{
		return  MediumMarket;
	}		
}


//Clasa mosteneste clasa magazin .Implementez metodele cerute. Folosesc un constructor ce mosteneste numele si factura si primeste ca argumente
//un vector de categorii si numele MediumMarket.