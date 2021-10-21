
public class Aresta<TIPO> {
	private int peso;
	private Vertex<TIPO> inicio;
	private Vertex<TIPO> fim;

	public Aresta(int peso, Vertex<TIPO> inicio, Vertex<TIPO> fim) {

		this.peso = peso;
		this.inicio = inicio;
		this.fim = fim;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public Vertex<TIPO> getInicio() {
		return inicio;
	}

	public void setInicio(Vertex<TIPO> inicio) {
		this.inicio = inicio;
	}

	public Vertex<TIPO> getFim() {
		return fim;
	}

	public void setFim(Vertex<TIPO> fim) {
		this.fim = fim;
	}

}
