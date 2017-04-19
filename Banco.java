/*
	Exercicio de Heramça de class;
	Função: Simular conta poupança, rendimentos e taxas;
	Class: Banco;
	Desenvolvedor: Joel Gonçalves;
*/

import java.io.*;
import java.util.Scanner;
public class Banco{
	public static void main(String[] args){
		Poupanca Poup;
		Ap60dias Ap60;

		Scanner scanner = new Scanner(System.in);
		int op = 0;
		do{
			int flag ;

			System.out.println("Digite 1 para conta Poupanca!");
			System.out.println("Digite 2 para Aplicacao 60 dias!");
			System.out.println("Digite 0 para encerrar!");			
			op = scanner.nextInt();

			switch(op){
				case 1:	
					Poup = new Poupanca("123-4", "29/04/2017", 1000.00, 0.1, "29/04/2017");
					Poup.calcularSaldo();
					System.out.println("O saldo atualizado e: " + Poup.calcularSaldo());
					System.out.println("Digite 1 para sacar \n\n e 0 para finalizar");
					flag = scanner.nextInt();
					
					while(flag < 0 && flag > 1){
						System.out.println("Digite 1 para sacar \n\n e 0 para finalizar");
						flag = scanner.nextInt();
					}

					if(flag == 1){
						Poup.sacar();
					}
				break;

				case 2:
					Ap60 = new Ap60dias("123-4", "29/04/2017", 1000.00, 0.1, 0.038);
					Ap60.calcularsaldo();

					System.out.println("O saldo e: " + Ap60.calcularsaldo());
					System.out.println("Digite 1 para sacar \n\n e 0 para finalizar");
					flag = scanner.nextInt();

					while(flag < 0 && flag > 1){
						System.out.println("Digite 1 para sacar \n\n e 0 para finalizar");
						flag = scanner.nextInt();
					}

					if(flag == 1){
						Ap60.sacar();
					}
				break;
			}
		} 
		while(op != 0);
	}
} 