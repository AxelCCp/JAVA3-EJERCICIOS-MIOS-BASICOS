package A0;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class A1_MainAvion {
	public static void main(String[]args) {
		
		
	
		A0_Avion objAvion = new A0_Avion();
		System.out.println(objAvion.datosGenerales());
		
		
		Scanner objSc = new Scanner(System.in);
		
		
		objAvion.setNombre(JOptionPane.showInputDialog("Cuál es el nombre del avión?"));
		System.out.println("El nombre del avión es: " + objAvion.getNombre());
		
		String txtlargoAvion = JOptionPane.showInputDialog("Cuál es el largo del avión (metros)?");
		int largoAvion = (int)Integer.parseInt(txtlargoAvion);
		objAvion.setLargo(largoAvion);
		System.out.println("El largo del avión es: " + objAvion.getLargo() + " [Metros]");
		
		String txtanchoAvion = JOptionPane.showInputDialog("Cuál es el ancho del avión?");
		int anchoAvion = (int)Integer.parseInt(txtanchoAvion);
		objAvion.setAncho(anchoAvion);
		System.out.println("El ancho del avión es: " + objAvion.getAncho() + " [Metros]");
		
		String txtlargoAlas = JOptionPane.showInputDialog("Cuál es el largo de las alas?");
		int largoAlas = (int)Integer.parseInt(txtlargoAlas);
		objAvion.setLargoalas(largoAlas);
		System.out.println("El largo de las alas es: " + objAvion.getLargoalas() + " [Metros]");
		
		String txtanchoAlas = JOptionPane.showInputDialog("Cuál es el ancho de las alas?");
		int anchoAlas = (int)Integer.parseInt(txtanchoAlas);
		objAvion.setAnchoalas(anchoAlas);
		System.out.println("El Ancho de las alas es " + objAvion.getAnchoalas() + " [Metros]");
		
		objAvion.setColor(JOptionPane.showInputDialog("Cuál es el Color del Avión?"));
		System.out.println("El Color del Avión es: " + objAvion.getColor());
		
		System.out.println("\nAhora ingresa el peso del avión por la consola");
		
		System.out.println("Cuál es el peso del avión? [KG]");
		objAvion.setPeso(objSc.nextInt());
		
		System.out.println("El peso del Avión es: " + objAvion.getPeso() + " Kilogramos");
		
		double pesoToneladas = objAvion.getPeso()/1000;
		
		System.out.println("Equivalente a " + pesoToneladas + "[TONELADAS]");
		
		objAvion.setGuerra(JOptionPane.showInputDialog("El Avión es de guerra? Sí o No?: "));
		System.out.println(objAvion.getGuerra());
		
		objAvion.setArmamento(JOptionPane.showInputDialog("El Avión tiene armamento? Sí o No?: "));
		System.out.println(objAvion.getArmamento());
		
		System.out.println("\nEl precio del Avión es: " + objAvion.metPrecio() + " [USD]");
		
		
		
	
	}
}




