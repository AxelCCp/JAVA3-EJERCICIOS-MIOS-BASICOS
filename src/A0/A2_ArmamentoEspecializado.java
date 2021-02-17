package A0;

//Equipamiento especializado en aire - aire:

public class A2_ArmamentoEspecializado extends A0_Avion {
	
	private int misilAireAire;
	private int modoFantasma;
	private int cañon;
	private int laser;
	
	public A2_ArmamentoEspecializado(int misilAireAire, int modoFantasma, int cañon, int laser) {
		
		super(); //se llama al constructor de A0_Avion, para darle un estado inicial a ArmamentoEspecializado.
		
		this.misilAireAire = misilAireAire;
		this.modoFantasma = modoFantasma;
		this.cañon = cañon;
		this.laser = laser;
		
	}
	
	public String dimeArmamento() {
		return "El avión tiene: " 
				
				+ "\nMisiles Aire-aire... "+ misilAireAire 
				+ "\nModos fantasma... " + modoFantasma 
				+ "\nCañones..." + cañon 
				+ "\nCañones laser..." + laser; 
	}
	
	
	
	
	

}
