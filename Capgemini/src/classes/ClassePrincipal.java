package classes;

import java.util.Scanner;



public class ClassePrincipal {

	public static void main(String[] args) {
		// Todas as quest�es est�o inseridas diretamente na classe principal.
		

		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println("---------------------------------------| ENUNCIADO QUEST�O 1  | ----------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------------------");
		
		System.out.println("\n");
		System.out.println("Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espa�os. \nA base e altura da escada devem ser iguais ao valor de n. A �ltima linha n�o deve conter nenhum espa�o.\r\n"
				+ "");
		System.out.println("EXEMPLO:\n\nEntrada:\nn=6\n\nSa�da:\n*\n**\n***\n****\n*****\n******");
		
		System.out.println("\n");
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println("----------------------------------------| SOLU��O QUEST�O 1  | -----------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------------------");
		
		System.out.println("\n");
		System.out.println("Para a base e a altura da escada. Digite um n�mero?:");
		
		int altura = entrada.nextInt();
		
		System.out.println("\n");
		System.out.println("-------------------------------------");
		System.out.println("Voc� digitou o n�mero: " + altura);
		System.out.println("-------------------------------------");
		
		System.out.println("Reposta da Solu��o 1:");		
		
		for (int i = 0; i < altura; i++) {
			String saida = " ".repeat(altura - i -1) + "*".repeat(i + 1);
			System.out.println(saida);
			
		
		}
		System.out.println("\n");
		System.out.println("------------------------------------------| FIM QUEST�O 1  | -------------------------------------------");
		System.out.println("\n\n");
		
		while (true) {
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("Vamos ao Enunciado e solu��o da 2� Quest�o. - Digite c p/ continuar?:");
			String continuar = entrada.next().toUpperCase();
			
			if (continuar.equals("C")) {
				break;
			}else {
				System.out.println("------------------------------------------------------------------------------------------------------------------");
				System.out.println("Valor inv�lido:");
			}
			
		}
		
		while (true) {
			System.out.println("--------------------------------------------------------------------------------------------------------");
			System.out.println("---------------------------------------| ENUNCIADO QUEST�O 2  | ----------------------------------------");
			System.out.println("--------------------------------------------------------------------------------------------------------");
			
			System.out.println("\n");
			System.out.println("D�bora se inscreveu em uma rede social para se manter em contato com seus amigos. A p�gina de cadastro \nexigia o preenchimento dos campos de nome e senha, por�m a senha precisa ser forte. O site considera uma \nsenha forte quando ela satisfaz os seguintes crit�rios:");
			System.out.println("\n");
			System.out.println("Possui no m�nimo 6 caracteres.\r\n"
					+ "Cont�m no m�nimo 1 digito.\r\n"
					+ "Cont�m no m�nimo 1 letra em min�sculo.\r\n"
					+ "Cont�m no m�nimo 1 letra em mai�sculo.\r\n"
					+ "Cont�m no m�nimo 1 caractere especial. Os caracteres especiais s�o: !@#$%^&*()-+");
			System.out.println("\n\n");
			System.out.println("--------------------------------------------------------------------------------------------------------");
			System.out.println("----------------------------------------| SOLU��O QUEST�O 2  | -----------------------------------------");
			System.out.println("--------------------------------------------------------------------------------------------------------");
			
			

			
			System.out.println("Digite uma senha a ser cadastrada?:");

			
			String senha = entrada.next();
			
			System.out.println("\n");
			System.out.println("-------------------------------------");
			System.out.println("Voc� digitou a senha: " + senha);
			System.out.println("-------------------------------------");
			
			

			if (temSeis(senha) == false) {
			} 
			else if (Maiuscula(senha) == false) {
				System.out.println("------------------------------------------------------------------------------------------------------------------");
				System.out.println("[X]Sua senha n�o tem uma letra mai�scula. � necess�rio acrescentar!");
				System.out.println("------------------------------------------------------------------------------------------------------------------");
			} 
			else if (Minuscula(senha) == false) {
				System.out.println("------------------------------------------------------------------------------------------------------------------");
				System.out.println("[X]Sua senha n�o tem uma letra min�scula. � necess�rio acrescentar!");
				System.out.println("------------------------------------------------------------------------------------------------------------------");
			} 
			else if (Digito(senha) == false) {
				System.out.println("------------------------------------------------------------------------------------------------------------------");
				System.out.println("[X]Sua senha falta um d�gito. � necess�rio acrescentar!");
				System.out.println("------------------------------------------------------------------------------------------------------------------");
			} 
			else if (Especial(senha) == false) {
				System.out.println("------------------------------------------------------------------------------------------------------------------");
				System.out.println("[X]Sua senha n�o tem um caractere especial. � necess�rio acrescentar!");
				System.out.println("------------------------------------------------------------------------------------------------------------------");
			} 
			else {
				System.out.println("------------------------------------------------------------------------------------------------------------------");
				System.out.println("[OK]Parab�ns !. Sua senha segue todos os padr�es exigidos! [SENHA FORTE].");
				System.out.println("------------------------------------------------------------------------------------------------------------------");
				System.out.println("\n");
				break;
			}
			
			
			while (true) {
				System.out.println("------------------------------------------------------------------------------------------------------------------");
				System.out.println("� necess�rio que voc� cadastre uma senha FORTE - Digite c p/ continuar?:");
				String continuar = entrada.next().toUpperCase();
				
				if (continuar.equals("C")) {
					break;
				}else {
					System.out.println("------------------------------------------------------------------------------------------------------------------");
					System.out.println("Valor inv�lido:");
				}
				
			}

		}
		
		
		System.out.println("\n");
		System.out.println("------------------------------------------| FIM QUEST�O 2  | -------------------------------------------");
		System.out.println("\n\n");
		
		
		while (true) {
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("Vamos ao Enunciado e solu��o da 3� Quest�o. - Digite c p/ continuar?:");
			String continuar = entrada.next().toUpperCase();
			
			if (continuar.equals("C")) {
				break;
			}else {
				System.out.println("------------------------------------------------------------------------------------------------------------------");
				System.out.println("Valor inv�lido:");
			}
			
		}
		
		
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println("---------------------------------------| ENUNCIADO QUEST�O 3  | ----------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println("\n");
		System.out.println("Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser \nrealocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que encontre o n�mero \nde pares de substrings que s�o anagramas.\r\n"
				+ "Exemplo:\r\n"
				+ "Exemplo 1)\r\n"
				+ "Entrada:\r\n"
				+ "ovo\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Sa�da:\r\n"
				+ "3\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Explica��o:\r\n"
				+ "A lista de todos os anagramas pares s�o: [o, o], [ov, vo] que est�o nas posi��es \n[[0, 2], [0, 1], [1, 2]] respectivamente. \r\n"
				+ "");
		
		System.out.println("Exemplo 2)\r\n"
				+ "Entrada:\r\n"
				+ "ifailuhkqq\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Sa�da:\r\n"
				+ "3\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Explica��o:\r\n"
				+ "A lista de todos os anagramas pares s�o: [i, i], [q, q] e [ifa, fai] que est�o nas posi��es \n[[0, 3]], [[8, 9]] e [[0, 1, 2], [1, 2, 3]].\r\n"
				+ "");
		
		System.out.println("\n");
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println("----------------------------------------| SOLU��O QUEST�O 3  | -----------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------------------");
		

		System.out.println("\n");
		
		System.out.println("Digite uma Palavra?:");
		
		
		
		String palavra = entrada.next();
		
		System.out.println("-------------------------------------");
		System.out.println("Voc� digitou a palavra: " + palavra);
		System.out.println("-------------------------------------");
		
		System.out.println("Reposta da Solu��o 3:");
		
		String convertPalvra =  Integer.toString(anagramas(palavra));
		
		System.out.println(convertPalvra);

		
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("------------------------------------------| FIM QUEST�O 3  | -------------------------------------------");
		System.out.println("\n\n");
		
		
				
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println("----------------------------------------- | FIM DOS DESAFIOS | -----------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println("\n");

		

	}
	

	private static boolean Minuscula(String senha) {

		int cont = 0;
		for (int i = 0; i < senha.length(); i++) {
			if (!Character.isLowerCase(senha.charAt(i))) {
				cont++;
				if (cont == senha.length()) {
					return false;
				}
			}
		}
		return true;
	}

	private static boolean Especial(String senha) {
		for (int i = 0; i < senha.length(); i++) {
			if (senha.contains("!") || senha.contains("@") || senha.contains("#") || senha.contains("$")
					|| senha.contains("%") || senha.contains("^") || senha.contains("&") || senha.contains("*")
					|| senha.contains("(") || senha.contains(")") || senha.contains("-") || senha.contains("+")) {
				return true;
			}
		}
		return false;

	}

	private static boolean Digito(String senha) {
		int cont = 0;
		for (int i = 0; i < senha.length(); i++) {
			if (!Character.isDigit(senha.charAt(i))) {
				cont++;
				if (cont == senha.length()) {
					return false;
				}
			}
		}
		return true;
	}

	private static boolean Maiuscula(String senha) {
		int cont = 0;
		for (int i = 0; i < senha.length(); i++) {
			if (!Character.isUpperCase(senha.charAt(i))) {
				cont++;
				if (cont == senha.length()) {
					return false;
				}
			}
		}
		return true;
	}

	private static boolean temSeis(String senha) {
		
		if (senha.length() < 6) {
			int resultado = 6 - senha.length();

			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("[X]Sua senha n�o pode ter menos que 6 caracteres. [No momento sua senha � considerada: FRACA!]");
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("Acrescente ao menos " + resultado + " caractere's entre letras mai�scula, min�scula, caractere especial e n�meros para que sua \nsenha seja FORTE.");
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			//return false;
		}
		return true;
	}
	
	static int anagramas(String palavra) {
		int anagramas = 0;
		int cont = 0;
		
		// Convers�o para array de char
		
		char[] array = palavra.toCharArray();

		for (int i = 0; i < array.length; i++) {
			String pos1 = Character.toString(array[i]);
			char posicao1 = pos1.charAt(0);
			cont = 0;
			for (int j = 0; j < array.length; j++) {
				String pos2 = Character.toString(array[j]);
				char posicao2 = pos2.charAt(0);
				
				// S� add no contador se a posi��o 1 for igual o da posi��o 2
				
				if (posicao1 == posicao2) {
				cont++;
				}
				
				
				
				
				
				if(cont >= 2) {
					anagramas++;
					cont = 0;
					
					
					
					if (i + 1 != j) {
						anagramas++;
					}
				}
				
			}
		}
		
		
		
		return anagramas/2;
	}

	
	

}


