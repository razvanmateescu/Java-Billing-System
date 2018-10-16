import java.io.File;
import java.util.Scanner;
import java.util.Vector;

public class MiniMarket extends Magazin {
	String MiniMarket,nume,tari;
	Vector v=new Vector();
	
MiniMarket()
{
	
}
public MiniMarket(String nume,Vector<Factura> f,String MiniMarket,Vector v)
{
	super(nume,f);
	this.MiniMarket=MiniMarket;
	this.v=v;
}

  



public double calculScutiriTaxe() {
	double prod=0,prodcom=0;
	for (int i=0;i<v.size();i++)
	{
	tari= (String) v.get(i);
	prodcom=getTotalTaraCuTaxe(tari);
	prod=getTotalCuTaxe();
	
	
	if (prodcom >0.5*prod)
	{	
		
		return 1.00*1/10;

	}
	
	}

	return 0;
}
public String toString()
{
	return MiniMarket; 
}		
}

// Clasa mosteneste clasa magazin .Implementez metodele cerute. Folosesc un constructor ce mosteneste numele si factura si primeste ca argumente
// un vector de tari si numele MiniMarket.
