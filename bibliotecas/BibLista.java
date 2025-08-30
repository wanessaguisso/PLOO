package bibliotecas;


import java.util.List;
import java.util.Scanner;

public class BibLista {
	private static Scanner scan = new Scanner(System.in);
	
	public static void preencher(List<Integer> lista) {
		int tam, num;
		
		System.out.println("Entre com o tamanho da lista");
		tam = scan.nextInt();
		for (int i=0; i<tam; i++) {
			num = (int)(Math.random()*50+1);
			lista.add(num);
		}
	}
	
	public static void ler(List<Integer> lista) {
		int tam, num;
		
		System.out.println("Entre com o tamanho da lista");
		tam = scan.nextInt();
		for (int i=0; i<tam; i++) {
			System.out.println("Entre comum inteiro");
			num = scan.nextInt();
			lista.add(num);
		}
	}
}
