
public class Escultura extends Arte {
	private String material;
	private double altura;
	
	public Escultura(String nome, String autor, String material, double altura) {
		super(nome, autor);
		this.material = material;
		this.altura = altura;
		
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double Altura) {
		this.altura = altura;
	}
	
	
	public String toString(){
	   return "Nome da escultura: "+nome+", nome do autor: "+autor+", material utilizado: "+material+", altura da escultura: "+altura;
	   }
	

}
