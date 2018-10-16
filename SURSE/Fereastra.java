import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.EventObject;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class Fereastra extends JFrame implements ActionListener {
	public Button b = new Button (" Close ");
	public Button b2 = new Button ("taxe.txt");
	public Button b3=  new Button ("produse.txt");
	public Button b4=  new Button ("facturi.txt");
	public Button b5=  new Button ("gestiune");
	public Gestiune gest= Gestiune.getInstance();
	public Fereastra(String titlu)
	{
		super ( titlu );
		setLayout (new FlowLayout ());
		setMinimumSize(new Dimension(500, 500));	
		b.addActionListener ( new ActionListener() {
			@Override
			public void actionPerformed ( ActionEvent e )
			{
				dispose();
			}
		});	
		b2.addActionListener ( new ActionListener() {
			@Override
			public void actionPerformed ( ActionEvent ae )
			{
				  
				JFileChooser fileChooser = new JFileChooser();
				int returnValue = fileChooser.showOpenDialog(null);
				if (returnValue == JFileChooser.APPROVE_OPTION) 
				{
				  File selectedFile = fileChooser.getSelectedFile();
				  b2.setBackground(Color.green);  
				}	  
			}
		});
		
		b3.addActionListener ( new ActionListener() {
			@Override
			public void actionPerformed ( ActionEvent ae )
			{
				  
				JFileChooser fileChooser = new JFileChooser();
				int returnValue = fileChooser.showOpenDialog(null);
				if (returnValue == JFileChooser.APPROVE_OPTION) 
				{
				  File selectedFile = fileChooser.getSelectedFile();
				  b3.setBackground(Color.green);  
				}	  
			}
		});
		
		b4.addActionListener ( new ActionListener() {
			@Override
			public void actionPerformed ( ActionEvent ae )
			{
				JFileChooser fileChooser = new JFileChooser();
				int returnValue = fileChooser.showOpenDialog(null);
				if (returnValue == JFileChooser.APPROVE_OPTION) 
				{
					File selectedFile = fileChooser.getSelectedFile();
					b4.setBackground(Color.green);	  
				}	  
			}
		});
		
		b5.addActionListener ( new ActionListener() {
			@Override
			public void actionPerformed ( ActionEvent ae )
			{	Vector gest=new Vector();
			Gestiune tmp =Gestiune.getInstance();
			PrintStream fisier;
			try {
				fisier = new PrintStream("C:\\Users\\Razvan\\eclipse-workspace\\TemaPOO\\src\\out2.txt");
				System.setOut(fisier);
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
					try {
					System.out.println("Produse");
					System.out.printf("%n");
					tmp.produse("C:\\Users\\Razvan\\eclipse-workspace\\TemaPOO\\src\\produse.txt");
					System.out.printf("%n");
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} 
				try {
					System.out.println("Taxe");
					System.out.printf("%n");
					tmp.dictionar("C:\\Users\\Razvan\\eclipse-workspace\\TemaPOO\\src\\taxe.txt");
					System.out.printf("%n");
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} 	
				try {
					System.out.println("Facturi");
					System.out.printf("%n");
					tmp.factura("C:\\Users\\Razvan\\eclipse-workspace\\TemaPOO\\src\\produse.txt", "C:\\Users\\Razvan\\eclipse-workspace\\TemaPOO\\src\\taxe.txt", "C:\\Users\\Razvan\\eclipse-workspace\\TemaPOO\\src\\facturi.txt");
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} 
					
				 b5.setBackground(Color.green);
				  
				}	
		});
		
		add (b);
		pack ();
		show ();
		add (b2);
		pack ();
		show ();
		add (b3);
		pack ();
		show ();
		add (b4);
		pack ();
		show ();
		add (b5);
		pack ();
		show ();
		b.setBounds(160,60,150,40);
		b.setFont(new Font("Arial", Font.PLAIN, 30));
		b2.setBounds(160,120,150,40);
		b2.setFont(new Font("Arial", Font.PLAIN, 30));
		b3.setBounds(160,180,150,40);
		b3.setFont(new Font("Arial", Font.PLAIN, 30));
		b4.setBounds(160,240,150,40);
		b4.setFont(new Font("Arial", Font.PLAIN, 30));
		b5.setBounds(160,300,150,40);
		b5.setFont(new Font("Arial", Font.PLAIN, 30));
		b.setBackground(Color.red);
		b2.setBackground(Color.red);
		b3.setBackground(Color.red);
		b4.setBackground(Color.red);
		b5.setBackground(Color.red);
		getContentPane().setBackground(Color.blue);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

// Creez interfata grafica cu butoanele de inchidere de  incarcare a fisierelor si de afisare a continutului celor 3 fisiere in cel de output