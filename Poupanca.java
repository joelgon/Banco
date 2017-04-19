/*
	Exercicio de Heramça de class
	Função: Simular conta poupança, rendimentos e taxas
	Class: Poupança;
	Desenvolvedor: Joel Gonçalves
*/

import java.io.*;
import java.util.Scanner;
public class Poupanca extends Aplicacao{
	private String dia;
	
	Scanner scanner = new Scanner(System.in);

	//Construtor da class
	public Poupanca(String conta, String data, double valor, double taxa, String dia){
		super(conta, data, valor, taxa);
		this.dia = dia;
	}
	
	public void setDia(String dia){
		this.dia = dia;
	}
	
	public String getDia(){
		return dia;
	}
	
	public double calcularSaldo(){
		double aux;
		aux = valor + (valor*taxa) - calcularCpmf();
		return aux;
	}

	public void sacar(){
		if(data.equals(dia)){
			System.out.println("Digite o valor desejado");
			double d = scanner.nextDouble();
			valor = calcularSaldo() - d;
			System.out.println("O saldo atualizado e: " + valor);
		}
		else{
			System.out.println("Impossivel sacar.");
		}
	}
}