import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Leitura {

	public boolean readFile(String nomeArq) {
        Path path1 = Paths.get(nomeArq);

        try (BufferedReader reader = Files.newBufferedReader(path1, Charset.forName("utf8"))) {
            String linha = null;

            while ((linha = reader.readLine()) != null) {
               
//colocar a rotina para salvar os dados
                

            }
        } catch (IOException x) {
            System.err.format("Erro de E/S: %s%n", x);
        }

        return true;
    }




    }
