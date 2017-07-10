
public class Arte {
	protected String nome, autor;
	
	public Arte(String nome, String autor) {
		
		this.nome = nome;
		this.autor = autor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String toString(){
	   return "Nome da obra: "+nome+", número do autor: "+autor;
	   }
	
	
}

