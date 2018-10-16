import java.util.ArrayList;
import java.util.Vector;

public class Factura {
String denumire,tara,origine,categorie,categorie2;
int cantitate;
double pret,suma=0,totalc=0,totalf=0,taxa,totaltaxa=0,totalfara=0,totalcateg=0;
Produs prod = new Produs();
Vector<ProdusComandat> p =new Vector<ProdusComandat>();
Factura()
{																
	
}
public Factura(String denumire,Vector<ProdusComandat> p )
{
	this.denumire=denumire;
	this.p=p;
	
} 

double getTotalFaraTaxe()
{	totalfara=0;
	for (int i=0;i<p.size();i++)
	{ 	
		suma=0;
 		prod = p.get(i).getProdus();
 		cantitate= (int) p.get(i).getCantitate();
 		pret=(double) prod.getPret();
		suma=suma+(double) pret;
		suma=suma*cantitate;
		totalfara=totalfara+suma;
	}
		return  totalfara;		
}

String afisfarataxe()
{
	return denumire;
}

double getTotalCuTaxe()
{	totaltaxa=0;
	for (int i=0;i<p.size();i++)
	{ 	
		suma=0;
 		prod = p.get(i).getProdus();
 		cantitate= (int) p.get(i).getCantitate();
 		taxa= (double) p.get(i).getTaxa();
 		pret=(double) prod.getPret();
		suma=suma+(double) pret;
		suma=suma*cantitate*(taxa+100)/100;
		totaltaxa=totaltaxa+suma;
	}
		return  totaltaxa;		
}

double getTaxe()
{
	totalc=0;
	totalf=0;
	totalf=getTotalFaraTaxe();
	totalc=getTotalCuTaxe();
	return totalc-totalf;	
}

double getTotalTaraFaraTaxe(String tara)
{   totalfara=0;
	for (int i=0;i<p.size();i++)
	{ 	
		suma=0;
 		prod = p.get(i).getProdus();
 		origine= (String) prod.getTaraOrigine();
 		if (origine.equals(tara))
 		{
 			cantitate= (int) p.get(i).getCantitate();
 			pret=(double) prod.getPret();
 			suma=suma+(double) pret;
 			suma=suma*cantitate;
 			totalfara=totalfara+suma;
 		}		
}
	return  totalfara;
}

double getTotalTaraCuTaxe(String tara)
{	totaltaxa=0;
	for (int i=0;i<p.size();i++)
	{ 	
		suma=0;
 		prod = p.get(i).getProdus();
 		origine= (String) prod.getTaraOrigine();
 		if (origine.equals(tara))
 		{
 			cantitate= (int) p.get(i).getCantitate();
 			taxa= (double) p.get(i).getTaxa();
 			pret=(double) prod.getPret();
 			suma=suma+(double) pret;
 			suma=suma*cantitate*(taxa+100)/100;
 			totaltaxa=totaltaxa+suma;
 		}
	}
	return totaltaxa;
}

double getTaxeTara(String tara)
{	
	
	totalc=0;
	totalf=0;
	totalf=getTotalTaraFaraTaxe(tara);
	totalc=getTotalTaraCuTaxe(tara);
	return totalc-totalf;
}
double TotalCategorie(String categorie)
{	totalcateg=0;
	for (int i=0;i<p.size();i++)
	{ 	
		suma=0;
 		prod = p.get(i).getProdus();
 		categorie2= (String) prod.getCategorie();
 		if (categorie2.equals(categorie))
 		{
 			cantitate= (int) p.get(i).getCantitate();
 			taxa= (double) p.get(i).getTaxa();
 			pret=(double) prod.getPret();
 			suma=suma+(double) pret;
 			suma=suma*cantitate*(taxa+100)/100;
 			totalcateg=totalcateg+suma;
 		}
	}
	return totalcateg;
}
public String toString()
{
	return  denumire + " ";
}
}

// Clasa in care creez obiectele de tip Factura. Ma folosesc vectorul de produse comandate primit ca argument de constructor.
// Implementez metodele cerute si adaug inca una pentru calculul totalurilor produselor in functie de categorie primita ca argument.

