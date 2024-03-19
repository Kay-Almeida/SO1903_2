package view;

import controller.MatrizThread;

public class Principal {
	public static void main(String[] args) {
		
		int matriz [] [] = new int [3] [5]; 
		int soma = 0; 
		int vetor0 [] = new int [5]; 
		int vetor1 [] = new int [5]; 
		int vetor2 [] = new int [5]; 
		int l;
		
	    int max = 100;
	    int min = 1;
	    int range = max - min + 1;
		
		for(l=0; l<3; l++) {
			for(int c=0; c<5; c++) {
				matriz [l] [c] = (int) (Math.random() * range) + min;  
				switch (l) {
				case 0: {
					vetor0 [c] = matriz [l] [c];
					break;
				}
				case 1: {
					vetor1 [c] = matriz [l] [c];
					break;
				}
				case 2: {
					vetor2 [c] = matriz [l] [c];
					break;
				}	
				}
				System.out.print(matriz[l][c] + " ");
			}
			System.out.println();
		}
			for (int i = 0; i<3; i++) {
				switch (i) {
				case 0: {
					Thread matrizThread = new MatrizThread(soma, vetor0, i); 
					matrizThread.start();
					break;
				}
				case 1: {
					Thread matrizThread = new MatrizThread(soma, vetor1, i); 
					matrizThread.start();
					break;
				}
				case 2: {
					Thread matrizThread = new MatrizThread(soma, vetor2, i); 
					matrizThread.start();
					break;
				}
			}
		}	
	}
	}
