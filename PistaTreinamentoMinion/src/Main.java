public class Main {
	public static void main(String [] args) {
		
		Graph<String> gr = new Graph<String>(null, null);
		gr.adicionarVertice("joao");
		gr.adicionarVertice("maria");
		gr.adicionarVertice("pedro");
		gr.adicionarVertice("creber");
		gr.adicionarVertice("arthur");
		gr.adicionarVertice("heitor");
		gr.adicionarVertice("gabriel");
		gr.adicionarVertice("isadora");
		
		gr.adicionarAresta(3, "joao", "maria");
		gr.adicionarAresta(2, "joao", "pedro");
		gr.adicionarAresta(5, "joao", "arthur");
		gr.adicionarAresta(4, "maria", "arthur");
		gr.adicionarAresta(1, "isadora", "creber");
		gr.adicionarAresta(3, "gabriel", "maria");
		gr.adicionarAresta(2, "heitor", "joao");
		
	gr.buscaEmLargura();
		
		/**Leitura leia = new Leitura();
		int opcao = 0;
        String arq = ("src/casos_cohen/oito_enunciado.txt");
        String arq2 = ("src/casos_cohen/dez.txt");
        String arq3 = ("src/casos_cohen/cem.txt");
        String arq4 = ("src/casos_cohen/cinquenta.txt");
        Scanner sca = new Scanner(System.in);
        System.out.println("escolha opção de arquivo de 1 a 4");
        opcao = sca.nextInt();
        switch (opcao) {
            case 1:
            	leia.readFile(arq);
                break;
            case 2:
            	leia.readFile(arq2);
                break;
            case 3:
            	leia.readFile(arq3);
                break;
            case 4:
            	leia.readFile(arq4);
                break;

            default:
                System.out.println("Opção invalida");

        }**/
	}

}
