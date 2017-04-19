/*
	Exercicio de Heramça de class
	Função: Simular conta poupança, rendimentos e taxas
	Class: Ap60dias;
	Desenvolvedor: Joel Gonçalves
*/

import java.io.*;
import java.util.Scanner;
public class Ap60dias extends Aplicacao{
	private double iof;
	Scanner scanner = new Scanner(System.in);

	//construtor da class
	public Ap60dias (String conta, String data, double valor, double taxa, double iof){
		super(conta, data, valor, taxa);
		this.iof = iof;
	}
	
	//metodos de acesso
	public void setIof(double iof){
		this.iof = iof;
	}
	
	public double getIof(){
		return iof;
	}
	
	public double calcularsaldo(){
		double aux;
		aux = valor + (valor * taxa) - calcularCpmf() - (valor *iof);
		return aux;
	}

	public void sacar(){
		System.out.println("Digite o valor desejado: ");
		double d = scanner.nextDouble();
		valor = calcularsaldo() - d;
		System.out.println("O saldo atualizado e: " + valor);
	}
}