package clases;

public class Planeta {
	
	private String nombre;
	private int cantidad_satelites;
	private double masa_kg;
	private double volumen;
	private int diametro;
	private int distancia_media_Sol;
	private String tipo_planeta;
	private boolean observable;
	
	
	// Constructor sin parámetros
	public Planeta() {
		this.nombre = "";
		this.cantidad_satelites = 0;
		this.masa_kg = 0;
		this.volumen = 0;
		this.diametro = 0;
		this.distancia_media_Sol = 0;
		this.tipo_planeta = "TERRESTRE";
		this.observable = false;
	}
	// Constructor con todos los parámetros
	public Planeta(String nombre, int cantidad_satelites, double masa_kg, double volumen, int diametro,
			int distancia_media_Sol, String tipo, boolean observable) {
		super();
		this.nombre = nombre;
		this.cantidad_satelites = cantidad_satelites;
		this.masa_kg = masa_kg;
		this.volumen = volumen;
		this.diametro = diametro;
		this.distancia_media_Sol = distancia_media_Sol;
		this.observable = observable;
		this.tipo_planeta=compruebaTipo(tipo);
		/*if (this.tipo_planeta.equals("GASEOSO") || this.tipo_planeta.equals("TERRESTRE") || this.tipo_planeta.equals("ENANO")) {
			this.tipo_planeta=tipo_planeta;
		}else {
			this.tipo_planeta= "TERRESTRE";
		}*/
	}
	
		/* Se puede hacer con switch case:
		 * String compruebaTipo(String tipo){
		 * switch(tipo){
		 * 	case "ENANO":
		 * 		return "ENANO";
		 * 	case "GASEOSO":
		 * 		return "GASEOSO";
		 * 	default:
		 * 		return "TERRESTRE";
		 * }
		 * }
		 * 	this.tipo=compruebaTipo(tipo);
		 */
	// Método para comprobar tipo
	public String compruebaTipo(String tipo) {
		this.tipo_planeta=tipo;
		if (this.tipo_planeta.equals("GASEOSO") || this.tipo_planeta.equals("TERRESTRE") || this.tipo_planeta.equals("ENANO")) {
			return tipo;
		}else {
			return "TERRESTRE";
		}
		
	}
		
	// Constructor de copia
		
	public Planeta(Planeta p) {
		super();
		this.nombre = p.nombre;
		this.cantidad_satelites = p.cantidad_satelites;
		this.masa_kg = p.masa_kg;
		this.volumen = p.volumen;
		this.diametro = p.diametro;
		this.distancia_media_Sol = p.distancia_media_Sol;
		this.tipo_planeta = p.tipo_planeta;
		this.observable = p.observable;
	}
	
	// Método toString
	@Override
	public String toString() {
		return "Planeta [nombre=" + nombre + ", cantidad_satelites=" + cantidad_satelites + ", masa_kg=" + masa_kg
				+ ", volumen=" + volumen + ", diametro=" + diametro + ", distancia_media_Sol=" + distancia_media_Sol
				+ ", tipo_planeta=" + tipo_planeta + ", observable=" + observable + "]";
	}
	// Getters y setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidad_satelites() {
		return cantidad_satelites;
	}
	public void setCantidad_satelites(int cantidad_satelites) {
		this.cantidad_satelites = cantidad_satelites;
	}
	public double getMasa_kg() {
		return masa_kg;
	}
	public void setMasa_kg(double masa_kg) {
		this.masa_kg = masa_kg;
	}
	public double getVolumen() {
		return volumen;
	}
	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}
	public int getDiametro() {
		return diametro;
	}
	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}
	public int getDistancia_media_Sol() {
		return distancia_media_Sol;
	}
	public void setDistancia_media_Sol(int distancia_media_Sol) {
		this.distancia_media_Sol = distancia_media_Sol;
	}
	public String getTipo_planeta() {
		return tipo_planeta;
	}
	public void setTipo_planeta(String tipo_planeta) {
		this.tipo_planeta = tipo_planeta;
	}
	public boolean isObservable() {
		return observable;
	}
	public void setObservable(boolean observable) {
		this.observable = observable;
	}
	
	// Método densidad
		public double densidadPlaneta() {
			return this.masa_kg/this.volumen;
		}
		
	// Método si un planeta es exterior.
		public boolean esExterior() {
			double exterior = 3.4*149597870;
			if (this.distancia_media_Sol*1000000>(int)exterior) {
				return true;
			}
			return false;
		}
		
	
	
	
	
	

}
