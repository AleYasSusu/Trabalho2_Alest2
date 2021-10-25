import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
	public static void main(String[] args) {

		Graph<String> gr = new Graph<String>(null, null);
		
		String[] aux;
		String nome_arquivo = "dez";
		if (args.length > 0)
			nome_arquivo = args[0];

		Path path1 = Paths.get(nome_arquivo + ".txt");

		try (BufferedReader reader = Files.newBufferedReader(path1, Charset.defaultCharset())) {
			String line;
			reader.readLine();
			while ((line = reader.readLine()) != null) {


				aux = line.split(" -> ");
				gr.adicionarVertice(aux[0]);
				gr.adicionarVertice(aux[1]);
				gr.adicionarAresta(aux[0], aux[1]);

			}

		} catch (IOException e) {
			System.err.format("Erro na leitura do arquivo: ", e);
		}
	}
}
