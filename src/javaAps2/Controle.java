package javaAps2;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Controle {
	static public  Pessoas[] vPessoa = new Pessoas[10];
	static public int indPessoa = 0;
	public static void main(String[] args)throws FileNotFoundException{
		File file = new File("D:/algoritimos2/APS2/javaAps2/src/javaAps2/participantes.csv");
 		Scanner sc = new Scanner(file);
 		while (sc.hasNextLine()){
 		String listaPessoas[] = sc.nextLine().split(",");
 		cadastroPessoas(listaPessoas[0],listaPessoas[1]);
 		}
 		ListaPessoas();
	}
	private static void cadastroPessoas(String nome, String email) {
		if(indPessoa < vPessoa.length){
			vPessoa[indPessoa] = new Pessoas(nome,email);
			indPessoa++;
		}
	}
		
	private static void ListaPessoas() {
		System.out.println("Lista de Participantes: ");
		for(int k=0 ; k < indPessoa ; k++)
			System.out.println(" Nome: "+vPessoa[k].getNome()+"  E-mail: "+vPessoa[k].getEmail());
	}
	
	
	 
}
