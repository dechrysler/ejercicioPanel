package prueba;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class ejercicio5 extends JFrame{
	
	public static void main(String []agrs) {
		new ejercicio5();
	}

	JLabel nombre= new JLabel ("Nombre:");
	JTextField caja1= new JTextField("Pedro",12);
	JLabel apellido= new JLabel ("Apellido:");
	JTextField caja2= new JTextField("Motallana",12);
	JLabel sexo= new JLabel ("Sexo:");
	JTextField caja3= new JTextField("m",1);
	JLabel fn= new JLabel ("Fecha de Nacimiento:");
	JTextField caja4= new JTextField("16-6-1982",8);
	JLabel fi= new JLabel ("Fecha de Ingreso:");
	JTextField caja5= new JTextField("5-4-1997",8);
	
	public ejercicio5(){

		super("Ejercicio5");
		setSize(700,800);
		
		String crearPanel1[]= {"nombre","apellido","sexo","fn","fi"};
		
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		
		panel1.setBorder(BorderFactory.createTitledBorder(
		        BorderFactory.createEtchedBorder(), "Datos personales"));
		panel2.setBorder(BorderFactory.createTitledBorder(
		        BorderFactory.createEtchedBorder(), "Salarios"));
	
		panel1.setPreferredSize(new Dimension(700,300));
		
		panel1.setLayout(new GridLayout(5,1));
		JPanel panel1_1= new JPanel();
		JPanel panel1_2= new JPanel();
		JPanel panel1_3= new JPanel();
		JPanel panel1_4= new JPanel();
		JPanel panel1_5= new JPanel();
		SpringLayout layout = new SpringLayout();
		panel1_1.setLayout(layout);
		panel1_2.setLayout(layout);
		panel1_3.setLayout(layout);
		panel1_4.setLayout(layout);
		panel1_5.setLayout(layout);
		for(int i=0;i<5;i++) { 
			layout.putConstraint(SpringLayout.WEST, nombre,10, SpringLayout.EAST, this);
			layout.putConstraint(SpringLayout.NORTH, nombre, 10, SpringLayout.NORTH, this);
		}
		
		
		
		panel1_1.setBackground(Color.RED);
		
		
	
		panel1_2.setBackground(Color.GREEN);
		
		panel1_3.setBackground(Color.BLUE);
	
		/////////////////////////
		
		panel1_4.setBackground(Color.GRAY);
		panel1_4.add(fn);
		panel1_4.add(caja4);
		///////////////

		panel1.add(panel1_1);
		panel1.add(panel1_2);
		panel1.add(panel1_3);
		panel1.add(panel1_4);
		
		
		add(panel1, BorderLayout.NORTH);
		add(panel2,BorderLayout.CENTER);
		
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}