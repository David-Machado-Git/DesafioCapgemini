package classes;

import java.util.Scanner;



public class ClassePrincipal {

	public static void main(String[] args) {
		// Todas as questões estão inseridas diretamente na classe principal.
		

		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println("---------------------------------------| ENUNCIADO QUESTÃO 1  | ----------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------------------");
		
		System.out.println("\n");
		System.out.println("Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. \nA base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.\r\n"
				+ "");
		System.out.println("EXEMPLO:\n\nEntrada:\nn=6\n\nSaída:\n*\n**\n***\n****\n*****\n******");
		
		System.out.println("\n");
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println("----------------------------------------| SOLUÇÃO QUESTÃO 1  | -----------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------------------");
		
		System.out.println("\n");
		System.out.println("Para a base e a altura da escada. Digite um número?:");
		
		int altura = entrada.nextInt();
		
		System.out.println("\n");
		System.out.println("-------------------------------------");
		System.out.println("Você digitou o número: " + altura);
		System.out.println("-------------------------------------");
		
		System.out.println("Reposta da Solução 1:");		
		
		for (int i = 0; i < altura; i++) {
			String saida = " ".repeat(altura - i -1) + "*".repeat(i + 1);
			System.out.println(saida);
			
		
		}
		System.out.println("\n");
		System.out.println("------------------------------------------| FIM QUESTÃO 1  | -------------------------------------------");
		System.out.println("\n\n");
		
		while (true) {
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("Vamos ao Enunciado e solução da 2º Questão. - Digite c p/ continuar?:");
			String continuar = entrada.next().toUpperCase();
			
			if (continuar.equals("C")) {
				break;
			}else {
				System.out.println("------------------------------------------------------------------------------------------------------------------");
				System.out.println("Valor inválido:");
			}
			
		}
		
		while (true) {
			System.out.println("--------------------------------------------------------------------------------------------------------");
			System.out.println("---------------------------------------| ENUNCIADO QUESTÃO 2  | ----------------------------------------");
			System.out.println("--------------------------------------------------------------------------------------------------------");
			
			System.out.println("\n");
			System.out.println("Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A página de cadastro \nexigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. O site considera uma \nsenha forte quando ela satisfaz os seguintes critérios:");
			System.out.println("\n");
			System.out.println("Possui no mínimo 6 caracteres.\r\n"
					+ "Contém no mínimo 1 digito.\r\n"
					+ "Contém no mínimo 1 letra em minúsculo.\r\n"
					+ "Contém no mínimo 1 letra em maiúsculo.\r\n"
					+ "Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+");
			System.out.println("\n\n");
			System.out.println("--------------------------------------------------------------------------------------------------------");
			System.out.println("----------------------------------------| SOLUÇÃO QUESTÃO 2  | -----------------------------------------");
			System.out.println("--------------------------------------------------------------------------------------------------------");
			
			

			
			System.out.println("Digite uma senha a ser cadastrada?:");

			
			String senha = entrada.next();
			
			System.out.println("\n");
			System.out.println("-------------------------------------");
			System.out.println("Você digitou a senha: " + senha);
			System.out.println("-------------------------------------");
			
			

			if (temSeis(senha) == false) {
			} 
			else if (Maiuscula(senha) == false) {
				System.out.println("------------------------------------------------------------------------------------------------------------------");
				System.out.println("[X]Sua senha não tem uma letra maiúscula. É necessário acrescentar!");
				System.out.println("------------------------------------------------------------------------------------------------------------------");
			} 
			else if (Minuscula(senha) == false) {
				System.out.println("------------------------------------------------------------------------------------------------------------------");
				System.out.println("[X]Sua senha não tem uma letra minúscula. É necessário acrescentar!");
				System.out.println("------------------------------------------------------------------------------------------------------------------");
			} 
			else if (Digito(senha) == false) {
				System.out.println("------------------------------------------------------------------------------------------------------------------");
				System.out.println("[X]Sua senha falta um dígito. É necessário acrescentar!");
				System.out.println("------------------------------------------------------------------------------------------------------------------");
			} 
			else if (Especial(senha) == false) {
				System.out.println("------------------------------------------------------------------------------------------------------------------");
				System.out.println("[X]Sua senha não tem um caractere especial. É necessário acrescentar!");
				System.out.println("------------------------------------------------------------------------------------------------------------------");
			} 
			else {
				System.out.println("------------------------------------------------------------------------------------------------------------------");
				System.out.println("[OK]Parabéns !. Sua senha segue todos os padrões exigidos! [SENHA FORTE].");
				System.out.println("------------------------------------------------------------------------------------------------------------------");
				System.out.println("\n");
				break;
			}
			
			
			while (true) {
				System.out.println("------------------------------------------------------------------------------------------------------------------");
				System.out.println("É necessário que você cadastre uma senha FORTE - Digite c p/ continuar?:");
				String continuar = entrada.next().toUpperCase();
				
				if (continuar.equals("C")) {
					break;
				}else {
					System.out.println("------------------------------------------------------------------------------------------------------------------");
					System.out.println("Valor inválido:");
				}
				
			}

		}
		
		
		System.out.println("\n");
		System.out.println("------------------------------------------| FIM QUESTÃO 2  | -------------------------------------------");
		System.out.println("\n\n");
		
		
		while (true) {
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("Vamos ao Enunciado e solução da 3º Questão. - Digite c p/ continuar?:");
			String continuar = entrada.next().toUpperCase();
			
			if (continuar.equals("C")) {
				break;
			}else {
				System.out.println("------------------------------------------------------------------------------------------------------------------");
				System.out.println("Valor inválido:");
			}
			
		}
		
		
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println("---------------------------------------| ENUNCIADO QUESTÃO 3  | ----------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println("\n");
		System.out.println("Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser \nrealocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que encontre o número \nde pares de substrings que são anagramas.\r\n"
				+ "Exemplo:\r\n"
				+ "Exemplo 1)\r\n"
				+ "Entrada:\r\n"
				+ "ovo\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Saída:\r\n"
				+ "3\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Explicação:\r\n"
				+ "A lista de todos os anagramas pares são: [o, o], [ov, vo] que estão nas posições \n[[0, 2], [0, 1], [1, 2]] respectivamente. \r\n"
				+ "");
		
		System.out.println("Exemplo 2)\r\n"
				+ "Entrada:\r\n"
				+ "ifailuhkqq\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Saída:\r\n"
				+ "3\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Explicação:\r\n"
				+ "A lista de todos os anagramas pares são: [i, i], [q, q] e [ifa, fai] que estão nas posições \n[[0, 3]], [[8, 9]] e [[0, 1, 2], [1, 2, 3]].\r\n"
				+ "");
		
		System.out.println("\n");
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println("----------------------------------------| SOLUÇÃO QUESTÃO 3  | -----------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------------------");
		

		System.out.println("\n");
		
		System.out.println("Digite uma Palavra?:");
		
		
		
		String palavra = entrada.next();
		
		System.out.println("-------------------------------------");
		System.out.println("Você digitou a palavra: " + palavra);
		System.out.println("-------------------------------------");
		
		System.out.println("Reposta da Solução 3:");
		
		String convertPalvra =  Integer.toString(anagramas(palavra));
		
		System.out.println(convertPalvra);

		
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("------------------------------------------| FIM QUESTÃO 3  | -------------------------------------------");
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
			System.out.println("[X]Sua senha não pode ter menos que 6 caracteres. [No momento sua senha é considerada: FRACA!]");
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("Acrescente ao menos " + resultado + " caractere's entre letras maiúscula, minúscula, caractere especial e números para que sua \nsenha seja FORTE.");
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			//return false;
		}
		return true;
	}
	
	static int anagramas(String palavra) {
		int anagramas = 0;
		int cont = 0;
		
		// Conversão para array de char
		
		char[] array = palavra.toCharArray();

		for (int i = 0; i < array.length; i++) {
			String pos1 = Character.toString(array[i]);
			char posicao1 = pos1.charAt(0);
			cont = 0;
			for (int j = 0; j < array.length; j++) {
				String pos2 = Character.toString(array[j]);
				char posicao2 = pos2.charAt(0);
				
				// Só add no contador se a posição 1 for igual o da posição 2
				
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


