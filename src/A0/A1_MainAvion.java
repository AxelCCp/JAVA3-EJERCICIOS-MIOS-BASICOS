package A0;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class A1_MainAvion {
	public static void main(String[]args) {
		
		
	
		A0_Avion objAvion = new A0_Avion();
		System.out.println(objAvion.datosGenerales());
		
		
		Scanner objSc = new Scanner(System.in);
		
		
		objAvion.setNombre(JOptionPane.showInputDialog("Cu�l es el nombre del avi�n?"));
		System.out.println("El nombre del avi�n es: " + objAvion.getNombre());
		
		String txtlargoAvion = JOptionPane.showInputDialog("Cu�l es el largo del avi�n (metros)?");
		int largoAvion = (int)Integer.parseInt(txtlargoAvion);
		objAvion.setLargo(largoAvion);
		System.out.println("El largo del avi�n es: " + objAvion.getLargo() + " [Metros]");
		
		String txtanchoAvion = JOptionPane.showInputDialog("Cu�l es el ancho del avi�n?");
		int anchoAvion = (int)Integer.parseInt(txtanchoAvion);
		objAvion.setAncho(anchoAvion);
		System.out.println("El ancho del avi�n es: " + objAvion.getAncho() + " [Metros]");
		
		String txtlargoAlas = JOptionPane.showInputDialog("Cu�l es el largo de las alas?");
		int largoAlas = (int)Integer.parseInt(txtlargoAlas);
		objAvion.setLargoalas(largoAlas);
		System.out.println("El largo de las alas es: " + objAvion.getLargoalas() + " [Metros]");
		
		String txtanchoAlas = JOptionPane.showInputDialog("Cu�l es el ancho de las alas?");
		int anchoAlas = (int)Integer.parseInt(txtanchoAlas);
		objAvion.setAnchoalas(anchoAlas);
		System.out.println("El Ancho de las alas es " + objAvion.getAnchoalas() + " [Metros]");
		
		objAvion.setColor(JOptionPane.showInputDialog("Cu�l es el Color del Avi�n?"));
		System.out.println("El Color del Avi�n es: " + objAvion.getColor());
		
		System.out.println("\nAhora ingresa el peso del avi�n por la consola");
		
		System.out.println("Cu�l es el peso del avi�n? [KG]");
		objAvion.setPeso(objSc.nextInt());
		
		System.out.println("El peso del Avi�n es: " + objAvion.getPeso() + " Kilogramos");
		
		double pesoToneladas = objAvion.getPeso()/1000;
		
		System.out.println("Equivalente a " + pesoToneladas + "[TONELADAS]");
		
		objAvion.setGuerra(JOptionPane.showInputDialog("El Avi�n es de guerra? S� o No?: "));
		System.out.println(objAvion.getGuerra());
		
		objAvion.setArmamento(JOptionPane.showInputDialog("El Avi�n tiene armamento? S� o No?: "));
		System.out.println(objAvion.getArmamento());
		
		System.out.println("\nEl precio del Avi�n es: " + objAvion.metPrecio() + " [USD]");
		
		
		
	
	}
}




