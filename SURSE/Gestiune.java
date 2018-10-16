import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Vector;

public class Gestiune {
	private Gestiune() { }
	 
	 private static Gestiune singleton = new Gestiune( );
	 
	 public static Gestiune getInstance( ) {
	      return singleton;
	   }
	 
	ArrayList<Produs> produ = new ArrayList<Produs>();
	TreeMap<String,TreeMap<String,Double>> taxa = new TreeMap<String,TreeMap<String,Double>>();
	ArrayList<Magazin> magaz= new ArrayList<Magazin>();
	TreeMap<String,Double> categorie = new TreeMap<String,Double>();
	Vector tari= new Vector();
	public Vector gest(String fisierMap) throws FileNotFoundException
	{
	Vector vcateg=new Vector();
	Vector vtara=new Vector();
	String cuvant2,cuvant,cuv,orig;
	int i,j,k=0;
	Scanner sc2=new  Scanner(new File(fisierMap));
	 sc2.nextLine();
	 Scanner sc=new Scanner(new File(fisierMap));
	 cuv=sc.nextLine();
	 Scanner sc3=new Scanner(cuv);
	 sc3.next();
	 while (sc3.hasNext())
	 {	
		 cuvant=sc3.next();
		 vtara.add(cuvant);
		 
	 }
	 	 while (sc2.hasNextLine())
	 {	
		 cuvant2=sc2.nextLine();
		 Scanner scna2=new Scanner(cuvant2);
		 cuvant=scna2.next();
		 vcateg.add(cuvant);
	 }
	 	 for (i=0;i<vtara.size();i++) 
	 	 {
		 sc=new Scanner(new File(fisierMap));
		 sc.nextLine();
		 sc.next();
		 TreeMap<String,Double> categorie = new TreeMap<String,Double>();
		 for (j=0;j<vcateg.size();j++)
	 {		k=0;
			 while (k<i)
			 {
				 sc.nextDouble();
				 k++;
			 }
			 categorie.put((String) vcateg.get(j), sc.nextDouble());
			 if (sc.hasNext())
			 {
			 sc.nextLine();
			 if (sc.hasNext())
			 {
			 sc.next();
			 }
			 }
			
	 }	
		 taxa.put((String)  vtara.get(i),categorie);
	 	 }
	 for (Map.Entry<String,TreeMap<String,Double>> entry : taxa.entrySet() )
	 {		orig= entry.getKey();
	 		tari.add(orig);	
	 }  
	 return(tari);
	}
	
public void dictionar(String fisierMap) throws FileNotFoundException
{
	Vector vcateg=new Vector();
	Vector vtara=new Vector();
	String cuvant2,cuvant,cuv,orig;
	int i,j,k=0;
	Scanner sc2=new  Scanner(new File(fisierMap));
	 sc2.nextLine();
	 Scanner sc=new Scanner(new File(fisierMap));
	 cuv=sc.nextLine();
	 Scanner sc3=new Scanner(cuv);
	 sc3.next();
	 while (sc3.hasNext())
	 {	
		 cuvant=sc3.next();
		 vtara.add(cuvant);
	 }
	 	 while (sc2.hasNextLine())
	 {	
		 cuvant2=sc2.nextLine();
		 Scanner scna2=new Scanner(cuvant2);
		 cuvant=scna2.next();
		 vcateg.add(cuvant);
	 }
	 	 for (i=0;i<vtara.size();i++) 
	 	 {
		 sc=new Scanner(new File(fisierMap));
		 sc.nextLine();
		 sc.next();
		 TreeMap<String,Double> categorie = new TreeMap<String,Double>();
		 for (j=0;j<vcateg.size();j++)
	 {		k=0;
			 while (k<i)
			 {
				 sc.nextDouble();
				 k++;
			 }
			 categorie.put((String) vcateg.get(j), sc.nextDouble());
			 if (sc.hasNext())
			 {
			 sc.nextLine();
			 if (sc.hasNext())
			 {
			 sc.next();
			 }
			 }		
	 }	
		 taxa.put((String)  vtara.get(i),categorie);
	 	 }
	 for (Map.Entry<String,TreeMap<String,Double>> entry : taxa.entrySet() )
	 {		orig= entry.getKey();
	 		tari.add(orig);
		 System.out.println(entry.getKey() + " " + entry.getValue());
	 }  
	}
	
	
	public void produse(String fisierPr) throws FileNotFoundException
	{
		 	int i;
			String cuvant;
			String cuv;
			String denumire=null;
			String origine=null;
			String categorie;
			double pret;
			Produs p;
			Vector vtara=new Vector();
			 Scanner sc = new Scanner(new File(fisierPr));
			 sc.next();
			 sc.next();
			 cuvant=sc.nextLine();
			 Scanner scna = new Scanner(cuvant); 
			 while (scna.hasNext())
			 {	
				 cuvant=scna.next();
				 vtara.add(cuvant);
			 }
			 while (sc.hasNextLine()) 
			 {	 cuv=sc.nextLine();
				 Scanner scn =new Scanner(cuv);
				 denumire=scn.next();
				 categorie=scn.next();
				 i=0;
			 while (scn.hasNext())
			 {	
				origine= (String) vtara.get(i);
				pret=scn.nextDouble();
				p= new Produs(denumire,categorie,origine,pret);
				produ.add(p);
				i++;
			 }			
	}
			 	for (i=0;i<produ.size();i++)
			 	{
			 		System.out.println(produ.get(i));
			 	}
}
	
	public void factura(String prod, String taxe,String facturi) throws FileNotFoundException
	{
		int i,j,k,cantitate;
		String cuvant,cuvant2,cuvant3,cuvant4,cuv;
		String denumire=null,numefact="";
		String origine=null,tara;
		String categorie;
		double pret,taxa;
		Produs p;
		ProdusComandat pc;
		Vector vprod=new Vector();
		Vector vtaxe=new Vector();
		Vector taraorig=new Vector();
		Vector denumiri= new Vector();
		Vector origini= new Vector();
		Vector categorii= new Vector();
		 Scanner sc = new Scanner(new File(prod));
		 sc.next();
		 sc.next();
		 cuvant=sc.nextLine();
		 Scanner scna = new Scanner(cuvant);
		 while (scna.hasNext())
		 {	
			 cuvant=scna.next();
			 vprod.add(cuvant);
		 }
		 Scanner sc2=new  Scanner(new File(taxe));
		 sc2.next();
		 cuvant2=sc2.nextLine();
		 Scanner scna2=new Scanner(cuvant2);
		 while (scna2.hasNext())
		 {	
			 cuvant2=scna2.next();
			 vtaxe.add(cuvant2);
		 }
		 sc=new Scanner(new File(facturi));
		 cuv=sc.nextLine();
		 while(sc.hasNextLine())
		 {
			 if (cuv.contains("Magazin"))
			 {	
			 Scanner sc4=new Scanner(cuv).useDelimiter(":");
			 sc4.next();
			 }
			 cuv=sc.nextLine();
			 while (cuv.isEmpty())
			 {
				 cuv=sc.nextLine();	 
			 } 
			 if (cuv.contains("Magazin"))
			 {	
				 sc.nextLine();
				 cuv=sc.nextLine();	 
			 }
			 Vector<ProdusComandat> prodcom= new Vector<ProdusComandat>();
			 while(!cuv.contains("Magazin"))	 
			 {
				while (cuv.isEmpty())
				 {
					 cuv=sc.nextLine();	
				 } 
			 	Scanner scn=new Scanner(cuv);
				cuvant=scn.next();
				if (cuvant.contains("Factura"))
				{    
					numefact=cuvant;
					sc.nextLine();
					cuv=sc.nextLine();	
				}
					Scanner ss=new Scanner(cuv);
					denumire=ss.next();
					origine=ss.next();
					cantitate=ss.nextInt();
				    scna = new Scanner(new File(prod));
				    scna.nextLine();
				    sc2=new  Scanner(new File(taxe));
	            	sc2.nextLine();
				    while(scna.hasNextLine())
				    {
				    cuvant3=scna.nextLine();
				    Scanner s=new Scanner(cuvant3);
				    if (s.next().equals(denumire))
				    {
				    	categorie=s.next();   
				    for (i=0;i<vprod.size();i++)
				    {	j=0;
				    	tara=(String) vprod.get(i);
				    	
	                    if (origine.equals(tara))
	                    {   
	                    	while(j<i)
	                    	{
	                   		s.next();
	                   		j++;
	                    	}
	                    	pret=s.nextDouble();                 	
	                    	p= new Produs(denumire,categorie,origine,pret);                    	
	                    	while(sc2.hasNextLine())
	                    	{
	                    		cuvant4=sc2.nextLine();
	                    		Scanner s2=new Scanner(cuvant4);
	                    	
	                    	if (s2.next().equals(categorie))
	                    	{
	                    		for (k=0;k<vtaxe.size();k++)
	                    		{
	                    			j=0;
	                    			tara=(String) vprod.get(k);
	                    			if(origine.equals(tara))
	                    			{
	                    				while (j<k)
	                    				{
	                    					s2.next();
	                    					j++;
	                    				}
	                    				taxa=s2.nextDouble();
	                    				pc = new ProdusComandat(p,taxa,cantitate);
	                    				prodcom.add(pc);
	                    				denumiri.add(denumire);
	                    				origini.add(origine);
	                    				categorii.add(cantitate);
	                    			}
	                    		}		
	                    	}
	                    	}     	
	                    }
				   }
				    }   		    
				    }  
				    if(!sc.hasNextLine())
				    {	
				    	System.out.println(numefact);
				    	for (i=0;i<denumiri.size();i++)
				    	{
				    		System.out.print(denumiri.get(i)+ " ");
				    		System.out.print(origini.get(i)+ " ");
				    		System.out.println(categorii.get(i)+ " ");
				    	}
				    		System.out.printf("%n");
				    	denumiri=new Vector();
						origini=new Vector();
						categorii=new Vector();
				    	break;
				    }
				    	cuv=sc.nextLine();
				    	if (cuv.isEmpty())
				    	{
				    		cuv=sc.nextLine();
				    		System.out.println(numefact);
				    		for (i=0;i<denumiri.size();i++)
					    	{
					    		System.out.print(denumiri.get(i)+ " ");
					    		System.out.print(origini.get(i)+ " ");
					    		System.out.println(categorii.get(i)+ " ");
					    	}
				    			System.out.printf("%n");
				    	prodcom= new Vector<ProdusComandat>();
				    	denumiri=new Vector();
						origini=new Vector();
						categorii=new Vector();	
				    	} 	 
				    }	 
		 }
		 
	}

			public void factmag() throws FileNotFoundException
		{
			int i,j,k,cantitate;
			String cuvant,cuvant2,cuvant3,cuvant4;
			String cuv;
			String denumire=null,numefact="";
			String origine=null,tara,taraorigine;
			String categorie,numemag=null,tipmag=null;
			 ArrayList<Magazin> magaz2 = new ArrayList<Magazin>();
			double pret,taxa;
			Produs p;
			ProdusComandat pc;
			Factura factura,factura2;
			Magazin g,magazin;
			Vector vprod=new Vector();
			Vector vtaxe=new Vector();
			Vector vcateg=new Vector();
			Vector<Factura> fact2= new Vector<Factura>();
			Vector<Factura> fact3= new Vector<Factura>();
			 Scanner sc = new Scanner(new File("C:\\Users\\Razvan\\eclipse-workspace\\TemaPOO\\src\\produse.txt"));
			 sc.next();
			 sc.next();
			 cuvant=sc.nextLine();
			 Scanner scna = new Scanner(cuvant);
			 while (scna.hasNext())
			 {	
				 cuvant=scna.next();
				 vprod.add(cuvant);
			 }
			 Scanner sc2=new  Scanner(new File("C:\\Users\\Razvan\\eclipse-workspace\\TemaPOO\\src\\taxe.txt"));
			 sc2.next();
			 cuvant2=sc2.nextLine();
			 Scanner scna2=new Scanner(cuvant2);
			 while (scna2.hasNext())
			 {	
				 cuvant2=scna2.next();
				 vtaxe.add(cuvant2);
			 }
			 sc=new Scanner(new File("C:\\Users\\Razvan\\eclipse-workspace\\TemaPOO\\src\\taxe.txt"));
			 sc.nextLine();
			 while(sc.hasNextLine())
			 {
				 cuvant=sc.next();
				 vcateg.add(cuvant);
				 sc.nextLine();
			 }
			 sc=new Scanner(new File("C:\\Users\\Razvan\\eclipse-workspace\\TemaPOO\\src\\facturi.txt"));
			 cuv=sc.nextLine();
			 while(sc.hasNextLine())
			 {	
				 if (cuv.contains("Magazin"))
				 {	 
				 Scanner sc4=new Scanner(cuv).useDelimiter(":");
				 sc4.next();
				tipmag=sc4.next();
				 numemag=sc4.next();
				 }
				 cuv=sc.nextLine();
				 while (cuv.isEmpty())
				 {
					 cuv=sc.nextLine();
					 
				 } 
				 if (cuv.contains("Magazin"))
				 {	
					 sc.nextLine();
					 cuv=sc.nextLine();	 
				 }
				 Vector<ProdusComandat> prodcom= new Vector<ProdusComandat>();
				 fact2 = new Vector<Factura>();
				 factura2 =new Factura();
				 while(!cuv.contains("Magazin"))	 
				 {
					while (cuv.isEmpty())
					 {
						 cuv=sc.nextLine();
						
					 } 
				 	Scanner scn=new Scanner(cuv);
					cuvant=scn.next();
					if (cuvant.contains("Factura"))
					{   
						numefact=cuvant;
						sc.nextLine();	
						cuv=sc.nextLine();	
					}
						Scanner ss=new Scanner(cuv);
						denumire=ss.next();
						origine=ss.next();
						cantitate=ss.nextInt();
					    scna = new Scanner(new File("C:\\Users\\Razvan\\eclipse-workspace\\TemaPOO\\src\\produse.txt"));
					    scna.nextLine();
					    sc2=new  Scanner(new File("C:\\Users\\Razvan\\eclipse-workspace\\TemaPOO\\src\\taxe.txt"));
		            	sc2.nextLine();
					    while(scna.hasNextLine())
					    {
					    cuvant3=scna.nextLine();
					    Scanner s=new Scanner(cuvant3);
					    if (s.next().equals(denumire))
					    {
					    	categorie=s.next();   
					    for (i=0;i<vprod.size();i++)
					    {	j=0;
					    	tara=(String) vprod.get(i);
					    	
		                    if (origine.equals(tara))
		                    {   
		                    	while(j<i)
		                    	{
		                   		s.next();
		                   		j++;
		                    	}
		                    	pret=s.nextDouble();                 	
		                    	p= new Produs(denumire,categorie,origine,pret);                    	
		                    	while(sc2.hasNextLine())
		                    	{
		                    		cuvant4=sc2.nextLine();
		                    		Scanner s2=new Scanner(cuvant4);
		                    	if (s2.next().equals(categorie))
		                    	{
		                    		for (k=0;k<vtaxe.size();k++)
		                    		{
		                    			j=0;
		                    			tara=(String) vprod.get(k);
		                    			if(origine.equals(tara))
		                    			{
		                    				while (j<k)
		                    				{
		                    					s2.next();
		                    					j++;
		                    				}
		                    				taxa=s2.nextDouble();
		                    				pc = new ProdusComandat(p,taxa,cantitate);
		                    				prodcom.add(pc);
		                    			}
		                    		}      		
		                    	}
		                    	}    	
		                    }
					   }
					    } 		    
					    }  
					    if(!sc.hasNextLine())
					    {	
					    	factura2=new Factura(numefact,prodcom);
					    	fact2.add(factura2);
					    	break;
					    }
					        cuv=sc.nextLine();
					    	if (cuv.isEmpty())
					    	{
					    		cuv=sc.nextLine();
					    		factura2=new Factura(numefact,prodcom);
					    		fact2.add(factura2);
					    		prodcom= new Vector<ProdusComandat>();	
					    	} 	 
					    }	 
				 if(tipmag.equals("MediumMarket"))
				 {	
					 MagazinFactory factory= new MagazinFactory();
					 g=factory.makeMagazin(numemag,fact2,tipmag,vcateg);
					 magaz.add(g);
				 } 
				
				 if(tipmag.equals("MiniMarket"))
				 {
					 MagazinFactory factory= new MagazinFactory();
					 g=factory.makeMagazin(numemag,fact2,tipmag,vtaxe);
					 magaz.add(g);	 
				}
				 if(tipmag.equals("HyperMarket"))
				 {
					 MagazinFactory factory= new MagazinFactory();
					 g=factory.makeMagazin(numemag,fact2,tipmag,vtaxe);
					 magaz.add(g);	 
			 }
		}
			 
DecimalFormat df = new DecimalFormat("#.####");	 
 Collections.sort(magaz,new Compara());			 
			 for (i=0;i<magaz.size();i++)
			 {
					 if (magaz.get(i).toString().equals("MiniMarket"))
					 {
						magaz2.add(magaz.get(i));	
					 } 
				 }	
			  
			 for (i=0;i<magaz.size();i++)
			 {	 
					 if (magaz.get(i).toString().equals("MediumMarket"))
					 {
						magaz2.add(magaz.get(i));
						
			     	 } 
				 } 
	       
			 
			  for (i=0;i<magaz.size();i++)
			 {
				
					 if (magaz.get(i).toString().equals("HyperMarket"))
					 {
						magaz2.add(magaz.get(i));		
			     	 }
				 
				 }
			  int ok1=0,ok2=0,ok3=0;
			  Gestiune temp =Gestiune.getInstance();
			  Vector tari2=temp.gest("D:\\taxe.txt");
			 for (i=0;i<magaz2.size();i++)
			 {
				
				 magazin=magaz2.get(i);
				 if (magazin.toString().equals("MiniMarket") && ok1==0)
				 {
				 System.out.println(magazin.toString());
				 ok1=1;
				 }
				 if (magazin.toString().equals("MediumMarket") && ok2==0)
				 {
				 System.out.println(magazin.toString());
				 ok2=1;
				 }
				 if (magazin.toString().equals("HyperMarket") && ok3==0)
				 {
				 System.out.println(magazin.toString());
				 ok3=1;
				 }
				 System.out.println(magazin.afisfarataxe());
				 System.out.printf("%n");
				 System.out.print("Total" + " ");	 
				 System.out.print(df.format(magazin.getTotalFaraTaxe()) + " ");
				 System.out.print(df.format(magazin.getTotalCuTaxe()) + " ");
				 System.out.println(df.format(magazin.getTotalCuTaxeScutite()));
				 System.out.printf("%n");
				 System.out.println("Tara");
				 for (j=0;j<tari2.size();j++)	 
				 {	  
					 taraorigine= (String) tari2.get(j);
					 System.out.print(taraorigine + " ");
					 System.out.print(df.format(magazin.getTotalTaraFaraTaxe(taraorigine)) + " ");
					 if(magazin.getTotalTaraFaraTaxe(taraorigine)!=0)
					 {
					 System.out.print(df.format(magazin.getTotalTaraCuTaxe(taraorigine)) + " ");
					 System.out.println(df.format(magazin.getTotalTaraCuTaxeScutite(taraorigine)));
					 }
					 if(magazin.getTotalTaraFaraTaxe(taraorigine)==0)
					 {
						 System.out.printf("%n");
					 }
				 }
				 System.out.printf("%n");  
				 fact3=magazin.afis();
				 Collections.sort(fact3,new Comparafact());
				 for (k=0;k<fact3.size();k++)
				 {	
					 factura=fact3.get(k);
					 System.out.println(factura.toString());
					 System.out.printf("%n");
					 System.out.print("Total" + " ");
					 System.out.print(df.format(factura.getTotalFaraTaxe()) + " ");
					 System.out.println(df.format(factura.getTotalCuTaxe()) + " ");
					 System.out.printf("%n");
					 System.out.println("Tara");
					 for (j=0;j<tari2.size();j++)
					 {
						 taraorigine= (String) tari2.get(j);
						 System.out.print(taraorigine + " ");
						 System.out.print(df.format(factura.getTotalTaraFaraTaxe(taraorigine)) + " ");
						 if(factura.getTotalTaraFaraTaxe(taraorigine)!=0)
						 {
						 System.out.println(df.format(factura.getTotalTaraCuTaxe(taraorigine)));
						 }
						 if(factura.getTotalTaraFaraTaxe(taraorigine)==0)
						 {	 
							 System.out.printf("%n");
						 }	
					 } 
					 System.out.printf("%n"); 
				 }	 
			 }		
	}
}


// Clasa in care retin lista de obiecte produs,magazin si taxele ca dictionar de perechi.
// De asemenea aici compun afisarea prin apelul functiilor din clasele magazin si factura.