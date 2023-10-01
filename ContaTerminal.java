package Desafio;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Por favor,digite o numero!");
		int numero = entrada.nextInt();
		
		entrada.nextLine();//Consumir a quebra de linha deixada pelo método nextInt()
		System.out.println("Por favor,digite a agencia!");
		String agencia = entrada.nextLine ();
		
		System.out.println("Por favor,digite o nome do cliente!");
		String nomeCliente = entrada.nextLine ();
		
		System.out.println("Por favor,digite o saldo!");
		float saldo = entrada.nextFloat();
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
		 
	}
}
