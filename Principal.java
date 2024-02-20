import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		boolean condicao = true;
		Scanner entrada = new Scanner(System.in);
		while (condicao) {
			System.out.println("Bem vindo à Calculadora, por favor escolha uma das opções: \n"
					+ "------------------------------- \n"
					+ "| MENU - CALCULADORA           |\n"
					+ "------------------------------- \n"					
					+ "| 1 - Calculadora simples      |\n"
					+ "| 2 - Verificar número primo   |\n"
					+ "| 3 - Verificar par ou ímpar   |\n"	
					+ "| 4 - Valor de PI              |\n"		
					+ "| 5 - Raíz                     |\n"	
					+ "------------------------------- \n"
					+ "| 0 - Sair                     |\n"
					+ "------------------------------- ");
			int inicio = entrada.nextInt();
			if (inicio != 1 && inicio != 2 && inicio != 3 && inicio != 4 && inicio != 5 && inicio != 0) {
				System.out.println("Parece que você não digitou uma opção válida... Tente novamente!");
			} else if (inicio == 0) {
				condicao = false;
				break;
			} else {
				switch (inicio) {
				case 1:
					Calculadora calculadora = new Calculadora();
					System.out.println(
							"\"Você escolheu a opção de calculadora simples... \n Digite o símbolo correspondente a operação desejada: \n somar(+), subtrair(-), multiplicar(*), dividir(/), potencializar(p): ");
					char simbolo = entrada.next().charAt(0);
					if(simbolo == 'p') {
						System.out.println("Digite o valor da base! ");
						double vl1 = entrada.nextDouble();
						System.out.println("Muito bem! Agora digite o valor do expoente! ");
						double vl2 = entrada.nextDouble();
						System.out.println("O resultado do seu cálculo é: " + calculadora.calcular(vl1, vl2, simbolo));
					} else if (simbolo == '+' || simbolo == '-' || simbolo == '*' || simbolo == '/') {
						System.out.println("Muito bem! Digite o primeiro número para calcular! ");
						double vl1 = entrada.nextDouble();
						System.out.println("Muito bem! Agora digite o segundo número para calcular! ");
						double vl2 = entrada.nextDouble();
						System.out.println("O resultado do seu cálculo é: " + calculadora.calcular(vl1, vl2, simbolo));
					} else {
						System.out.println("Parece que você digitou algo errado! Tente novamente! :)");
					}
					break;
				case 2:
					Calculadora calculadora1 = new Calculadora();
					System.out.println("Você escolheu a opção de verificar número primo... \n Agora digite um numero para verificação! ");
					int numero = entrada.nextInt();
					boolean condicao1 = calculadora1.getPrimo(numero);
					if (condicao1 == true) {
						System.out.println(numero + " é um número primo!");
					} else if (condicao1 == false || numero < 2) {
						System.out.println(numero + " não é um número primo!");
					}
					break;
				case 3:
					Calculadora calculadora2 = new Calculadora();
					System.out.println("Você escolheu a opção de verificar par ou impar... \n Para continuar digite o numero a ser verificado! ");
					int num = entrada.nextInt();
					boolean resposta = calculadora2.getParImpar(num);
					if(resposta) {
						System.out.println("O número " + num + " é par!");
					} else {
						System.out.println("O número " + num + " é impar!");
					}
					break;
				case 4:
					Calculadora calculadora3 = new Calculadora();
					System.out.println("Você selecionou a opção de PI... \n O valor de PI é: " + calculadora3.getPi());
					break;
				case 5:
					Calculadora calculadora4 = new Calculadora();
					System.out.println("Você escolheu fazer raíz... \n Para continuar digite (2) para raiz quadrada ou (3) para raíz cúbica: ");
					double indice = entrada.nextDouble();
					if(indice != 2 && indice != 3) {
						System.out.println("Opa! Parece que você digitou algo errado! Tente novamente!");
						break;	
					} else {
						System.out.println("Agora digite o número que gostaria de fazer a raíz " + (int) indice + ": ");
						double numeroRaiz = entrada.nextDouble();
						System.out.println("O resultado de raíz " + (int) indice + " de " + numeroRaiz + " é igual a: " + calculadora4.getRaiz(indice, numeroRaiz));
					}
					break;
				}
			}
		}
		System.out.println("Obrigado por usar nosso programa! Volte sempre!... :D");
		entrada.close();
	}
}
