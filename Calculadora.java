import java.util.Scanner;

public class Calculadora {	
	public Calculadora() {
		super();
	}
	public double calcular(double vl1, double vl2, char a) {
		double retorno = 0;
		switch(a) {
		case '+':
			retorno = somar(vl1, vl2);
			break;
		case '-':
			retorno = subtrair(vl1, vl2);
			break;
		case '*':
			retorno = multiplicar(vl1, vl2);
			break;
		case '/':
			retorno = dividir(vl1, vl2);
			break;
		case 'p':
			retorno = potencializar(vl1, vl2);
			break;
		}
		return retorno;
	}
	private  double somar(double vl1, double vl2) {
		double resultado = vl1 + vl2;
		return resultado;
	}
	private double subtrair(double vl1, double vl2) {
		double resultado = vl1 - vl2;
		return resultado;
	}
	private double multiplicar(double vl1, double vl2) {
		double resultado = vl1 * vl2;
		return resultado;
	}
	private double dividir(double vl1, double vl2) {
		double resultado = vl1 / vl2;
		return resultado;
	}
	private double potencializar(double vl1, double vl2) {
		double resultado = (int) Math.pow(vl1, vl2);
		return resultado;
	}
	private double raiz(double indice, double vl2) {
		double resultado = 0;
		if (indice == 2) {
			resultado = Math.sqrt(vl2);
		} else if (indice == 3) {
			resultado = Math.cbrt(vl2);
		} 
		return resultado;
	}
	private boolean primo(int num) {
		int divisores = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				divisores++;
			}
		}
		if (divisores == 2) {
			return true;
		}
		else {
			return false;
		}
	}
	private boolean parImpar(int numero) {
		if (numero % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	private double pi() {
		return Math.PI;
	}
	public boolean getPrimo(int entrada) {
		return primo(entrada);
	}
	public boolean getParImpar(int entrada) {
		return parImpar(entrada);
	}
	public double getRaiz(double indice, double num) {
		return raiz(indice, num);
	}
	public double getPi() {
		return pi();
	}
}
