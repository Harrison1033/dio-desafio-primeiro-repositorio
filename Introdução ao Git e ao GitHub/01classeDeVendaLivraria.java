package projeto;
//Programa para desenvolvimento 
import java.util.*;
public class Less5 {
//Classe de vendas para uma livraria 
	public static void main(String[] args) {
		float val, soma = 0;
		int op1, op2 = 0, op;
		String prod;
		Scanner sc;
		try {
			System.out.println("Sistema de controle:" + "\nGostaria de iniciar?" + "\n(0) Sim\n(1) Não");
			sc = new Scanner(System.in);
			op1 = sc.nextInt();
			
			if (op1 == 0) {
				//colocar um if encapsulando esse while, if e switch para iniciar um programa ou não.
				while (op2 == 0) {
					System.out.println("Digite o nome do produto:");
					sc = new Scanner(System.in);
					prod = sc.next();
					System.out.println("Digite o valor do produto:");
					sc = new Scanner(System.in);
					val = sc.nextFloat();
					System.out.println("Gostaria de adicionar mais algum produto?" + "\n(0) Sim\n(1) Não");
					sc = new Scanner(System.in);
					op2 = sc.nextInt();
					//Aqui coloco o incremeno do valor (com erro pois só se soma uma vez)
					soma = soma + val;
					
				}if (op2 == 1) {
					System.out.println("Qual a forma de pagamento?");
					System.out.println("(0) A vista\n(1) Cartão 1X\n(2) Cartão 2X\n(3) Cartão 3X\n(4) Cartão 4X");
					sc = new Scanner(System.in);
					op = sc.nextInt();
					switch (op) {
					case 0:
						System.out.println("O valor é: " + soma + "\nPagando a vista ficará: " + (soma - (soma * 0.1)));break;
					case 1:
						System.out.println("O valor é: " + soma + "\nPagando em 1X no cartão: " + (soma-(soma*0.05)));break;
					case 2:
						System.out.println("O valor é: "+soma+"\nPagando em 2X no cartão: " +(soma));break;
					case 3:
						System.out.println("O valor é: "+soma+"\nPagando em 3X no cartão: "+(soma+(soma*0.05)));break;
					case 4:
						System.out.println("O valor é: "+soma+"\nPagando em 4X no cartão: "+(soma+(soma*0.06)));break;
					}
				}
			}
			else if (op1 == 1) {
				System.out.println("Fim do programa");
			}
			else {
				System.out.println("Opção inválida, digite 0 ou 1");
			}
				System.out.println("R$: " + soma);				
				
		//Finalização do programa com o Scanner para não dar erro no código e fim do try	
		}catch(NumberFormatException e ) {
			System.out.println("Houve um erro no parâmetro");
		}
	}
		
	}
