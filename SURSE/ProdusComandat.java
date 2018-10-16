
public class ProdusComandat {
private Produs produs;												// Clasa care creeaza obiectele de tip produse comandate folosind un constructor
private double taxa;												// si unde implementez metodele cerute
private int cantitate;

ProdusComandat()
{
	
}
public ProdusComandat(Produs produs,double taxa,int cantitate)
{
	this.produs=produs;
	this.taxa=taxa;
	this.cantitate=cantitate;
}
void setProdus(Produs produs)
{
	this.produs=produs;
}
Produs getProdus()
{
	return this.produs;
}
void setTaxa(double taxa)
{
	this.taxa=taxa;
}
double getTaxa()
{
	return this.taxa;
}
void setCantitate(int cantitate)
{
	this.cantitate=cantitate;
}
int getCantitate()
{
	return this.cantitate;
}
public String toString()
{
	return produs + " " + taxa + " " + cantitate;
}
}
