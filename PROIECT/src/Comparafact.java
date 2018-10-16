import java.util.Comparator;

public class Comparafact implements Comparator {
	
	public int compare(Object o1,Object o2)
	{
		Factura f1= (Factura) o1;
		Factura f2= (Factura) o2;
		return Double.compare(f1.getTotalFaraTaxe(),f2.getTotalFaraTaxe());
	}
}
//clasa in care folosesc un comparator pt a afisa in ordine crescatoare facturile