import java.util.Vector;

public abstract class Magazin implements IMagazin {
String nume;
double totaltaxa;
Vector<Factura> f = new Vector<Factura>();
Magazin(){
}

public Magazin(String nume,Vector<Factura> f)
{
	this.nume=nume;
	this.f=f;	
}
String afisfarataxe()
{
	return nume;
} 
Vector<Factura> afis()
{
	return f;
}

 public double getTotalFaraTaxe()
{	totaltaxa=0;
	for (int i=0;i<f.size();i++)
	{
		totaltaxa=totaltaxa+f.get(i).getTotalFaraTaxe();
	}
	return totaltaxa;
}

 public double getTotalCuTaxe()
{    totaltaxa=0;
	for (int i=0;i<f.size();i++)
	{
		totaltaxa=totaltaxa+f.get(i).getTotalCuTaxe();
	}
	return totaltaxa;
}

 public double getTotalTaraFaraTaxe(String tara)
{
	totaltaxa=0;
	for (int i=0;i<f.size();i++)
	{
		totaltaxa=totaltaxa+f.get(i).getTotalTaraFaraTaxe(tara);
	}
	return totaltaxa;
}

 public double getTotalTaraCuTaxe(String tara)
{
	totaltaxa=0;
	for (int i=0;i<f.size();i++)
	{
		totaltaxa=totaltaxa+f.get(i).getTotalTaraCuTaxe(tara);
	}
	return totaltaxa;
}

public double TotalCategorie(String categorie)
 {
	 totaltaxa=0;
	 for (int i=0;i<f.size();i++)
		{
			totaltaxa=totaltaxa + f.get(i).TotalCategorie(categorie);
		}
		return totaltaxa;
	 
 }
@Override
public double getTotalCuTaxeScutite() {
	// TODO Auto-generated method stub
	double scutire=0,taxa,rez;
	scutire=calculScutiriTaxe();
	taxa=getTotalCuTaxe();
	rez=taxa-taxa*scutire;
	return rez;
}

public double getTotalTaraCuTaxeScutite(String tara) {
	// TODO Auto-generated method stub
	double scutire=0,taxa,rez;
	scutire=calculScutiriTaxe();
	taxa=getTotalTaraCuTaxe(tara);
	rez=taxa-taxa*scutire;
	return rez;
}

@Override
public abstract double calculScutiriTaxe(); 
	// TODO Auto-generated method stub
	
@Override
public  String toString()
{
	return nume;
}

}


// In aceasta clasa implementez interfata IMagazin . Folosesc un constructor pentru obiecte de tip magazin cu parametrii nume si factura primita ca argument
//  si implementez metodele cerute lasand abstracta metoda calculScutiriTaxe();
