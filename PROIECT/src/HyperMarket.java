import java.util.Vector;

public class HyperMarket extends Magazin {
	String HyperMarket,nume;
	Vector v=new Vector();
	HyperMarket(){
	}
	
	
	public HyperMarket (String nume,Vector<Factura> f,String HyperMarket,Vector v)
	{
		super(nume,f);
		this.HyperMarket=HyperMarket;
		this.v=v;
	}
	public double calculScutiriTaxe()
	{	double prod=0,fact=0;
		for (int i=0;i<f.size();i++)
		{
			fact=f.get(i).getTotalCuTaxe();
			prod=getTotalCuTaxe();
		
		if (fact>0.1*prod)
		{
			return 1.00*1/100;
		}
		
	}
	return 0;
}
	public String toString()
	{
		return HyperMarket;
	}
}


//Clasa mosteneste clasa magazin .Implementez metodele cerute. Folosesc un constructor ce mosteneste numele si factura.
