package A1_WordPirata;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class A0_WordPirata {
	public static void main(String[]args) {
		MarcoApp miMarco = new MarcoApp();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
			
	}
}


class MarcoApp extends JFrame{
	public MarcoApp() {
		
		setTitle("Word Pirata");
		setBounds(30,10,1300,750);
		LaminaApp lamina = new LaminaApp();
		add(lamina); 
	
		Toolkit objToolkit = Toolkit.getDefaultToolkit();
		Image iconoMarco = objToolkit.getImage("C:/Users/Fantasma/Downloads/150-iconos-gif/icon_wand.gif");
		setIconImage(iconoMarco);
	}
}

 //CLASE LAMINAAPP:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
class LaminaApp extends JPanel{	
	
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonAzul = new JButton("Azul");
	JButton botonVerde = new JButton("Verde");
	JButton nuevaVentana = new JButton("New");
	
	//CONSTRUCTOR LAMINAAPP
	public LaminaApp() {	
		add(botonAmarillo);
		add(botonAzul);
		add(botonVerde);
		add(nuevaVentana);
		ColorDeFondo amarillo = new ColorDeFondo(Color.YELLOW); 
		ColorDeFondo azul = new ColorDeFondo(Color.BLUE); 
		ColorDeFondo verde = new ColorDeFondo(Color.GREEN);
		botonAmarillo.addActionListener(amarillo);
		botonAzul.addActionListener(azul);
		botonVerde.addActionListener(verde);
	}
	
	//IMAGEN APP:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		File imagenDireccion = new File("C:/Users/Fantasma/Pictures/IMAGENES/06892cc040cdff7c5b0f229a460a34bd.jpg");
		try {
			imagenA = ImageIO.read(imagenDireccion);
		} catch (IOException e) {
			System.out.println("No se encontró la imagen");
			e.printStackTrace();
		}
		g.drawImage(imagenA,1,1,null);			
	}

	
	//CLASE INTERNA COLORDEFONDO::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
	private class ColorDeFondo implements ActionListener{
		public ColorDeFondo(Color c) {
			colorFondo=c;
		}
		public void actionPerformed(ActionEvent e) {	
			setBackground(colorFondo);
		}
		//VARIABLES 
		private Color colorFondo;
	}
	
	//CLASE INTERNA DE VENTANASEMERGENTES
	private class Emergente implements ActionListener{public void actionPerformed(ActionEvent f) {}}
	
	//CLASE INTERNA NUEVASVENTANAS
	private class NuevaVentana extends JFrame{
		public void NuevaVentana(JButton nuevaVentana) {
			
		}
	}
	
	
	//VARIABLES DE CAMPO::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
	private Image imagenA;
}

