
public class Aresta<TIPO> {
	
	private Vertex<TIPO> inicio;
	private Vertex<TIPO> fim;

	public Aresta( Vertex<TIPO> inicio, Vertex<TIPO> fim) {

		
		this.inicio = inicio;
		this.fim = fim;
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
