package A0;

public class A0_Avion {
	
	// Características generales
	private int ruedas;
	private int trenAterrizaje;
	private int luces;
	private String luzRoja;
	private String luzAzul;
	private String luzBlanca;
	
	// Características propias de cada avión
	
	private String nombre;
	private int largo;
	private int ancho;
	private int  largoAlas;
	private int anchoAlas;
	private String color;
	private int peso;
	private boolean guerra, pasajeros;
	private boolean armamento, rescate;  
	
	// Constructor
	public A0_Avion() {
		
	ruedas = 3;
	trenAterrizaje = 2;
	luces = 10;
	luzBlanca = "blancas";
	luzAzul = "azules";
	luzRoja = "rojas";
	
	}
	
	// Getter de datos generales
	public String datosGenerales(){
		
		return "Los aviones tienen " + ruedas + " ruedas que salen \nde " 
				+ trenAterrizaje  + " trenes de aterrizaje. "
				+ "\nTambién tienen " + luces + " luces de vuelo. "
				+ "\nSus luces son " + luzBlanca + ", " + luzAzul + " y " + luzRoja + ".";			
	}
	
	public void setNombre(String nombreAvion) {
		nombre = nombreAvion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setLargo(int largoAvion) {
		largo = largoAvion;
	}
	
	public int getLargo() {
		return largo;
	}
	
	public void setAncho(int anchoAvion) {
		ancho = anchoAvion;
	}
	
	public int getAncho() {
		return ancho; 
	}
	
	public void setLargoalas(int largoAlas) {
		this.largoAlas = largoAlas;
	}
	
	public int getLargoalas() {
		return largoAlas;
	}
	
	public void setAnchoalas(int anchoAlas) {
		this.anchoAlas = anchoAlas;
	}
	
	public int getAnchoalas() {
		return anchoAlas;
	}
	
	public void setColor(String colorAvion) {
		color = colorAvion;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setPeso(int pesoAvion) {
		peso = pesoAvion;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public void setGuerra(String guerra) {
		if(guerra.equalsIgnoreCase("si")) {
			this.guerra = true;
		}else {
			this.guerra = false;
		}
	}
	
	public String getGuerra() {
		if(guerra==true) {
			return "El avión es de guerra.";
		}else {
			return "El avión es de pasajeros.";
		}
	}
	
	public void setArmamento(String armamento) {
		if(armamento.equalsIgnoreCase("si")) {
			this.armamento = true;			
		}else {
			this.armamento = false;
		}
	}
		
	public String getArmamento() {
		if(armamento==true) {
			return "Tiene Armas de guerra.";
		}else {
			return "No trae armas de guerra.";
		}
	}
	
	public int metPrecio() {
		
		int precioBase = 50000;
		
		if(guerra==true && armamento==true) {
			precioBase += 100000;
		
		}else if(guerra==true && armamento==false) {
			precioBase += 50000;
			
		}else if(guerra==false && armamento==false) {	
			precioBase += 0; 
		}
		
		return precioBase;		
		
	}
}

