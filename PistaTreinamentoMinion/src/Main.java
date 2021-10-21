import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		
		
		Leitura leia = new Leitura();
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

        }
	}

}
