
import java.util.Comparator;

public class Compara implements Comparator {
	public int compare(Object o1,Object o2)
	{
		Magazin m1= (Magazin) o1;
		Magazin m2= (Magazin) o2;
		return Double.compare(m1.getTotalFaraTaxe(),m2.getTotalFaraTaxe());
		
	}
}

//clasa in care folosesc un comparator pt a afisa in ordine crescatoare magazinele