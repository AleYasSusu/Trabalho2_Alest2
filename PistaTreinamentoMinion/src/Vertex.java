import java.util.ArrayList;

public class Vertex<TIPO> {
	private TIPO dado;
	private ArrayList<Aresta<TIPO>> arestaEntrada;

	private ArrayList<Aresta<TIPO>>  arestaSaida;

	public Vertex(TIPO valor) {
		this.dado = valor;
		this.arestaSaida = new ArrayList<Aresta<TIPO>>();
		this.arestaEntrada = new ArrayList<Aresta<TIPO>>();
	}

	public TIPO getDado() {
		return dado;
	}

	public void setDado(TIPO dado) {
		this.dado = dado;
	}

	
	public void adicioarArestaEntrada(Aresta<TIPO> aresta) {
		this.arestaEntrada.add(aresta);
		
	}
	
	
	public ArrayList<Aresta<TIPO>> getArestaEntrada() {
		return arestaEntrada;
	}

	

	public ArrayList<Aresta<TIPO>> getArestaSaida() {
		return arestaSaida;
	}

	

	public void adicioarArestaSaida(Aresta<TIPO> aresta) {
		this.arestaSaida.add(aresta);
		
	}
	
}
