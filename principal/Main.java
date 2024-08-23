package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entidade.Conta;
import entidade.ContaCorrente;
import entidade.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
				
		List<Conta> lista = new ArrayList< >();				
				
		
		System.out.println("Qual seu nome ");
		String nome = scn.nextLine();
		
		System.out.println("Qual o numero da sua conta ");
		int numero = scn.nextInt();
		
		System.out.println("Você quer utilizar: /n  1 - Conta Corrente/n 2 - Conta Poupança");
		int conta = scn.nextInt();
		
		double limite;
		double saldo = 0;
		
		if(conta == 1) {
			System.out.println("Qual o limite da conta: ");
			limite = scn.nextDouble();
			
			Conta c = new ContaCorrente(nome, conta, saldo, limite);
			lista.add(c);
		}
		else {
			Conta d = new ContaPoupanca(nome, conta, saldo);
			lista.add(d);
		}
		System.out.println(lista);
	}

}
