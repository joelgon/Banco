/*
	Exercicio de Heramça de class
	Função: Simular conta poupança, rendimentos e taxas
	Class: Aplicação;
	Desenvolvedor: Joel Gonçalves
*/
import java.io.*;
public class Aplicacao{
	
	protected String conta;
	protected String data;
	protected double valor;
	protected double taxa;
	
	//construtor da class Aplicacao
	public Aplicacao(String conta, String data, double valor, double taxa){
		this.conta = conta;
		this.data = data;
		this.valor = valor;
		this.taxa = taxa;
	}
	
	//metodos de acesso
	public void setConta(String conta){
		this.conta = conta;
	}
	
	public void setData(String data){
		this.data = data;
	}
	
	public void setValor(double valor){
		this.valor = valor;
	}
	
	public void setTaxa(double taxa){
		this.taxa = taxa;
	}
	
	public String getConta(){
		return conta;
	}
	
	public String getData(){
		return data;
	}
	
	public double getValor(){
		return valor;
	}
	
	public double getTaxa(){
		return taxa;
	}
	
	public double calcularjuros(){
		double aux;
		aux = valor * taxa;
		return aux;
	}
	
	public double calcularCpmf(){
		return (0.0038 * valor);
	}
}