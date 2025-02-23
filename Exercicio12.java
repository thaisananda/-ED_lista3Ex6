package Exercicios;

import javax.swing.JOptionPane;

import controller.Controller12;

public class Exercicio12 {
	
	public static void main(String[] args) {
		
		Controller12 SerieFatorial = new Controller12();
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro: "));
			
		double resultado = SerieFatorial.SerieFatorial(n); 
        
		System.out.println(resultado);
	}

}
