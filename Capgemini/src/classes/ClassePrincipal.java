package classes;

import java.util.Scanner;



public class ClassePrincipal {

	public static void main(String[] args) {
		// Classe principal
		

		
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
		
		System.out.println("Reposta da Solução 1:");		
		
		for (int i = 0; i < altura; i++) {
			String saida = " ".repeat(altura - i -1) + "*".repeat(i + 1);
			System.out.println(saida);
			
		
		}
		System.out.println("\n");
		System.out.println("------------------------------------------| FIM QUESTÃO 1  | -------------------------------------------");
		System.out.println("\n\n");
		
		while (true) {
			System.out.println("-------------------------------------");
			System.out.println("Digite c p/ continuar?:");
			String continuar = entrada.next().toUpperCase();
			
			if (continuar.equals("C")) {
				break;
			}else {
				System.out.println("-------------------------------------");
				System.out.println("Valor inválido:");
			}
			
		}
		
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
		//System.out.println("Digite sua senha");
		
		String senha = entrada.next();
		
		//String senha = JOptionPane.showInputDialog("Digite sua senha");

		if (temSeis(senha) == false) {
		} 
		else if (temMaiuscula(senha) == false) {
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("[X]Sua senha não tem uma letra maiúscula. É necessário acrescentar!");
			System.out.println("------------------------------------------------------------------------------------------------------------------");
		} 
		else if (temMinuscula(senha) == false) {
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("[X]Sua senha não tem uma letra minúscula. É necessário acrescentar!");
			System.out.println("------------------------------------------------------------------------------------------------------------------");
		} 
		else if (temDigito(senha) == false) {
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("[X]Sua senha falta um dígito. É necessário acrescentar!");
			System.out.println("------------------------------------------------------------------------------------------------------------------");
		} 
		else if (temEspecial(senha) == false) {
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("[X]Sua senha não tem um caractere especial. É necessário acrescentar!");
			System.out.println("------------------------------------------------------------------------------------------------------------------");
		} 
		else {
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("[OK]Parabéns !. Sua senha segue todos os padrões exigidos! [SENHA FORTE].");
			System.out.println("------------------------------------------------------------------------------------------------------------------");
		}

	}

	static boolean temSeis(String senha) {
		
		// Verifica se a string senha é maior que 6, se não conta quantos caracteres faltam.
		if (senha.length() < 6) {
			int resultado = 6 - senha.length();
			//System.out.println(resultado);
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("[X]Sua senha não pode ter menos que 6 caracteres.");
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("Acrescente " + resultado + " caractere entre letras maiúscula, minúscula, e números para que sua senha seja forte.");
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			//return false;
		}
		return true;
	}

	static boolean temMaiuscula(String senha) {
		// 
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

	static boolean temMinuscula(String senha) {

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

	static boolean temDigito(String senha) {
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

	static boolean temEspecial(String senha) {
		for (int i = 0; i < senha.length(); i++) {
			if (senha.contains("!") || senha.contains("@") || senha.contains("#") || senha.contains("$")
					|| senha.contains("%") || senha.contains("^") || senha.contains("&") || senha.contains("*")
					|| senha.contains("(") || senha.contains(")") || senha.contains("-") || senha.contains("+")) {
				return true;
			}
		}
		return false;
		
		
		
		

	    
		
		
		//System.out.println("FIM SEGUNDO BLOCO");
	}

}
