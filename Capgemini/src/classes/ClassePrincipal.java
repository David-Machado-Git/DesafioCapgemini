package classes;

import java.util.Scanner;



public class ClassePrincipal {

	public static void main(String[] args) {
		// Classe principal
		

		
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
		
		System.out.println("Reposta da Solu��o 1:");		
		
		for (int i = 0; i < altura; i++) {
			String saida = " ".repeat(altura - i -1) + "*".repeat(i + 1);
			System.out.println(saida);
			
		
		}
		System.out.println("\n");
		System.out.println("------------------------------------------| FIM QUEST�O 1  | -------------------------------------------");
		System.out.println("\n\n");
		
		while (true) {
			System.out.println("-------------------------------------");
			System.out.println("Digite c p/ continuar?:");
			String continuar = entrada.next().toUpperCase();
			
			if (continuar.equals("C")) {
				break;
			}else {
				System.out.println("-------------------------------------");
				System.out.println("Valor inv�lido:");
			}
			
		}
		
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
		//System.out.println("Digite sua senha");
		
		String senha = entrada.next();
		
		//String senha = JOptionPane.showInputDialog("Digite sua senha");

		if (temSeis(senha) == false) {
		} 
		else if (temMaiuscula(senha) == false) {
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("[X]Sua senha n�o tem uma letra mai�scula. � necess�rio acrescentar!");
			System.out.println("------------------------------------------------------------------------------------------------------------------");
		} 
		else if (temMinuscula(senha) == false) {
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("[X]Sua senha n�o tem uma letra min�scula. � necess�rio acrescentar!");
			System.out.println("------------------------------------------------------------------------------------------------------------------");
		} 
		else if (temDigito(senha) == false) {
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("[X]Sua senha falta um d�gito. � necess�rio acrescentar!");
			System.out.println("------------------------------------------------------------------------------------------------------------------");
		} 
		else if (temEspecial(senha) == false) {
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("[X]Sua senha n�o tem um caractere especial. � necess�rio acrescentar!");
			System.out.println("------------------------------------------------------------------------------------------------------------------");
		} 
		else {
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("[OK]Parab�ns !. Sua senha segue todos os padr�es exigidos! [SENHA FORTE].");
			System.out.println("------------------------------------------------------------------------------------------------------------------");
		}

	}

	static boolean temSeis(String senha) {
		
		// Verifica se a string senha � maior que 6, se n�o conta quantos caracteres faltam.
		if (senha.length() < 6) {
			int resultado = 6 - senha.length();
			//System.out.println(resultado);
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("[X]Sua senha n�o pode ter menos que 6 caracteres.");
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println("Acrescente " + resultado + " caractere entre letras mai�scula, min�scula, e n�meros para que sua senha seja forte.");
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
