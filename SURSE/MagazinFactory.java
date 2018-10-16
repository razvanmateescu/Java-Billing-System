import java.util.Vector;

public class MagazinFactory {
	
	public Magazin makeMagazin(String nume,Vector<Factura> f,String tipmag,Vector v)
	{
		
		if (tipmag.equals("MiniMarket"))
		{
			return new MiniMarket(nume,f,tipmag,v);
		}
		if (tipmag.equals("MediumMarket"))
		{
			return new MediumMarket(nume,f,tipmag,v);
		}
		if (tipmag.equals("HyperMarket"))
		{
			return new HyperMarket(nume,f,tipmag,v);
		}
	return null;	
		
	}
	
}

// in aceasta clasa implementez factory patern pentru crearea celor 3 tipuri de magazine.