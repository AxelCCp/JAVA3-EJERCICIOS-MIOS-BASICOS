package A0;

//Equipamiento especializado en aire - aire:

public class A2_ArmamentoEspecializado extends A0_Avion {
	
	private int misilAireAire;
	private int modoFantasma;
	private int ca�on;
	private int laser;
	
	public A2_ArmamentoEspecializado(int misilAireAire, int modoFantasma, int ca�on, int laser) {
		
		super(); //se llama al constructor de A0_Avion, para darle un estado inicial a ArmamentoEspecializado.
		
		this.misilAireAire = misilAireAire;
		this.modoFantasma = modoFantasma;
		this.ca�on = ca�on;
		this.laser = laser;
		
	}
	
	public String dimeArmamento() {
		return "El avi�n tiene: " 
				
				+ "\nMisiles Aire-aire... "+ misilAireAire 
				+ "\nModos fantasma... " + modoFantasma 
				+ "\nCa�ones..." + ca�on 
				+ "\nCa�ones laser..." + laser; 
	}
	
	
	
	
	

}
