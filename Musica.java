
public class Musica extends Arte {
	private String gravadora;
	private double duracao;
	
	public Musica(String nome, String autor, String gravadora, double duracao) {
		super(nome,autor);
		this.gravadora = gravadora;
		this.duracao = duracao;
	}

	public String getGravadora() {
		return gravadora;
	}

	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	public String toString(){
	   return "Nome da obra: "+nome+", nome do autor: "+autor+", gravadora: "+gravadora+", duração da música: "+duracao;
	   }
}
