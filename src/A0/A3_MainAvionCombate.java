package A0;

public class A3_MainAvionCombate {
	public static void main(String[]args) {
		
		A0_Avion ACombat = new A0_Avion();    
		
		ACombat.setColor("negro");  // ***me falta qe aparezca esto... revisa furgoneta, usovehículo y coche
		
		A2_ArmamentoEspecializado Armas = new A2_ArmamentoEspecializado(10, 2, 4, 2);
			
		System.out.println(ACombat.datosGenerales());
		System.out.println(Armas.dimeArmamento());
		
	}
}
