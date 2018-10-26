package prueba;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
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
	
	
	JLabel salario= new JLabel ("Salario:");
	JTextField caja2_1= new JTextField("2,300,000",12);
	JButton boton = new JButton("Modificar");
	
	JTextField caja3_1= new JTextField(12);
	JButton boton1 = new JButton("      Calcular Edad      ");
	
	JTextField caja3_2= new JTextField(12);
	JButton boton2 = new JButton("Calcular Antgüedad ");
	
	JTextField caja3_3= new JTextField(12);
	JButton boton3 = new JButton("Calcular Prestación");
	public ejercicio5(){

		super("Ejercicio5");
		setSize(700,800);
		
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel();
		panel1.setBorder(BorderFactory.createTitledBorder(
		        BorderFactory.createEtchedBorder(), "Datos personales"));
		panel2.setBorder(BorderFactory.createTitledBorder(
		        BorderFactory.createEtchedBorder(), "Salarios"));
	
		panel1.setPreferredSize(new Dimension(700,200));
		panel2.setPreferredSize(new Dimension(700,100));
		panel3.setPreferredSize(new Dimension(700,500));
		panel1.setLayout(new GridLayout(5,1));
	
		JPanel panel1_2= new JPanel();
		JPanel panel1_3= new JPanel();
		JPanel panel1_4= new JPanel();
		JPanel panel1_5= new JPanel();
		SpringLayout layout = new SpringLayout();
		JPanel panel1_1= new JPanel();
		panel1_1.setLayout(layout);
		layout.putConstraint(SpringLayout.WEST, nombre,-700, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH, nombre, 10, SpringLayout.NORTH, this);
		
		layout.putConstraint(SpringLayout.WEST, caja1,100, SpringLayout.EAST, nombre);
		layout.putConstraint(SpringLayout.NORTH, caja1, 10, SpringLayout.NORTH, this);
		panel1_1.add(nombre);
		panel1_1.add(caja1);
		
		panel1_2.setLayout(layout);
		layout.putConstraint(SpringLayout.WEST, apellido,-700, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH, apellido, 10, SpringLayout.NORTH, this);
		
		layout.putConstraint(SpringLayout.WEST, caja2,100, SpringLayout.EAST, apellido);
		layout.putConstraint(SpringLayout.NORTH, caja2, 10, SpringLayout.NORTH, this);
		panel1_2.add(apellido);
		panel1_2.add(caja2);
		
		panel1_3.setLayout(layout);
		layout.putConstraint(SpringLayout.WEST, sexo,-700, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH, sexo, 10, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, caja3,115, SpringLayout.EAST, sexo);
		layout.putConstraint(SpringLayout.NORTH, caja3, 10, SpringLayout.NORTH, this);
		panel1_3.add(sexo);
		panel1_3.add(caja3);
		
		panel1_4.setLayout(layout);
		layout.putConstraint(SpringLayout.WEST, fn,-700, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH, fn, 10, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.EAST, caja4,115, SpringLayout.EAST, fn);
		layout.putConstraint(SpringLayout.NORTH, caja4, 10, SpringLayout.NORTH, this);
		panel1_4.add(fn);
		panel1_4.add(caja4);
		
		panel1_5.setLayout(layout);
		layout.putConstraint(SpringLayout.WEST, fi,-700, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH, fi, 10, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.EAST, caja5,115, SpringLayout.EAST, fn);
		layout.putConstraint(SpringLayout.NORTH, caja5, 10, SpringLayout.NORTH, this);
		panel1_5.add(fi);
		panel1_5.add(caja5);
		
		///////////////

		panel1.add(panel1_1);
		panel1.add(panel1_2);
		panel1.add(panel1_3);
		panel1.add(panel1_4);
		panel1.add(panel1_5);
		
		add(panel1, BorderLayout.NORTH);
		
		panel2.setLayout(new GridLayout(1,1));
		JPanel panel2_1= new JPanel();
		panel2_1.setLayout(layout);
		layout.putConstraint(SpringLayout.WEST, salario,-530, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH, salario, 10, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.EAST, caja2_1,150, SpringLayout.EAST, salario);
		layout.putConstraint(SpringLayout.NORTH, caja2_1, 10, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.EAST, boton,100, SpringLayout.EAST, caja2_1);
		layout.putConstraint(SpringLayout.NORTH, boton, 7, SpringLayout.NORTH, this);
		panel2_1.add(salario);
		panel2_1.add(caja2_1);
		panel2_1.add(boton);
		panel2.add(panel2_1);
		add(panel2,BorderLayout.CENTER);
		GridBagLayout l1=new GridBagLayout();
		JPanel panel3_1=new JPanel();
		JPanel panel3_2=new JPanel();
		panel3_1.setBorder(BorderFactory.createTitledBorder(
		        BorderFactory.createEtchedBorder(), "Calculos:"));
		
		
		panel3_1.setPreferredSize(new Dimension(695,200));
		panel3_2.setPreferredSize(new Dimension(695,200));
		panel3.add(panel3_1);
		panel3_1.setLayout(new GridLayout(3,1));
		
		JPanel panel3_1_1= new JPanel();
		panel3_1_1.setLayout(layout);
		layout.putConstraint(SpringLayout.WEST, boton1,-550, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH,boton1, 10, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.EAST, caja3_1,200, SpringLayout.EAST, boton1);
		layout.putConstraint(SpringLayout.NORTH, caja3_1, 15, SpringLayout.NORTH, this);
		panel3_1_1.add(boton1);
		panel3_1_1.add(caja3_1);
		
		panel3_1.add(panel3_1_1);
		
		JPanel panel3_1_2= new JPanel();
		panel3_1_2.setLayout(layout);
		layout.putConstraint(SpringLayout.WEST, boton2,-550, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH,boton2, 10, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.EAST, caja3_2,200, SpringLayout.EAST, boton1);
		layout.putConstraint(SpringLayout.NORTH, caja3_2, 15, SpringLayout.NORTH, this);
		panel3_1_2.add(boton2);
		panel3_1_2.add(caja3_2);
		
		JPanel panel3_1_3= new JPanel();
		panel3_1_3.setLayout(layout);
		layout.putConstraint(SpringLayout.WEST, boton3,-550, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH,boton3, 10, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.EAST, caja3_3,200, SpringLayout.EAST, boton1);
		layout.putConstraint(SpringLayout.NORTH, caja3_3, 15, SpringLayout.NORTH, this);
		panel3_1_3.add(boton3);
		panel3_1_3.add(caja3_3);
		
		panel3_1.add(panel3_1_3);
		
		panel3_1.add(panel3_1_2);
		panel3.add(panel3_1);
		panel3.add(panel3_2);
		add(panel3,BorderLayout.SOUTH);
		setResizable(false);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}