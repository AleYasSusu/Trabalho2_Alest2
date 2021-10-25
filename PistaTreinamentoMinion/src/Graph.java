
import java.util.ArrayList;
import java.util.Iterator;

public class Graph<TIPO> {
private ArrayList<Vertex<TIPO>> vertices;
private ArrayList<Aresta<TIPO>> arestas;




public Graph(ArrayList<TIPO> vertices, ArrayList<TIPO> arestas) {
	super();
	this.vertices = new ArrayList<Vertex<TIPO>>();
	this.arestas =  new ArrayList<Aresta<TIPO>>();;
}

public void adicionarAresta(TIPO dadoInicio, TIPO dadoFim) {
	Vertex<TIPO> inicio = this.getVertex(dadoInicio);
	Vertex<TIPO> fim = this.getVertex(dadoFim);
	Aresta<TIPO> aresta = new Aresta<TIPO>( inicio, fim);
	inicio.adicioarArestaSaida(aresta);
	fim.adicioarArestaEntrada(aresta);
}

public void adicionarVertice(TIPO dado) {
	Vertex<TIPO> newVertex = new Vertex<TIPO>(dado);
	this.vertices.add(newVertex);
}

public Vertex<TIPO> getVertex(TIPO dado){
	Vertex<TIPO> vertex = null;
	
	for(int i=0;i<this.vertices.size(); i++) {
		if (this.vertices.get(i).getDado().equals(dado)) {
			vertex=this.vertices.get(i);
			break;
		}
		
	}
	return vertex;
		
	}

public void buscaEmLargura() {
	ArrayList<Vertex<TIPO>> marcados = new ArrayList<Vertex<TIPO>>();
	ArrayList<Vertex<TIPO>> fila = new ArrayList<Vertex<TIPO>>();
	Vertex<TIPO> atual = this.vertices.get(0);
	marcados.add(atual);
	System.out.println(atual.getDado());
	fila.add(atual);
	while(fila.size() > 0) {
		Vertex<TIPO> visitado = fila.get(0);
		for(int i = 0; i < visitado.getArestaSaida().size();i++) {
			Vertex<TIPO> proximo = visitado.getArestaSaida().get(i).getFim();
			if(!marcados.contains(proximo)) {
				marcados.add(proximo);
				System.out.println(proximo.getDado());
				fila.add(proximo);
				
			}
		}
		fila.remove(0);
	}
}
} 




