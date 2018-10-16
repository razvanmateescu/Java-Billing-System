import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.Vector;

public class Citire {
public static void main(String args[]) throws FileNotFoundException , IOException
{	
	Gestiune tmp =Gestiune.getInstance();
	PrintStream fisier=new PrintStream("C:\\Users\\Razvan\\eclipse-workspace\\TemaPOO\\src\\out.txt");
	System.setOut(fisier);
	tmp.factmag();
	fisier.close();
}		 
}



// Clasa in care scriu in fisierul de output folosind Singleton Pattern. 