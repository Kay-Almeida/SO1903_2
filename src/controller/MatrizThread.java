package controller;

public class MatrizThread extends Thread{
	
	int soma; 
	int vetor [] = new int [5]; 
	int i;

	
	public MatrizThread (int soma, int[] vetor, int i) {
		this.soma = soma; 
		this.vetor = vetor; 
		this.i = i; 
	}
	
	public void run() {
		for(int p=0; p<vetor.length; p++) {
			soma = soma + vetor[p]; 
		}
		System.out.println("Linha: "+ i + " Resultado da soma: "+ soma);	
	}
	
}
