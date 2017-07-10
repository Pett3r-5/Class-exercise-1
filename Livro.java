
public class Livro extends Arte {
	private int numPaginas;
	private String editora;
	public Livro(String nome, String autor, int numPaginas, String editora) {
		super(nome, autor);
		this.numPaginas = numPaginas;
		this.editora = editora;
		
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora (String editora) {
		this.editora = editora;
	}

	
	public String toString(){
	   return "Nome da obra: "+nome+", nome do autor: "+autor+", número de páginas: "+numPaginas+", editora: "+editora;
	   }
	

}
