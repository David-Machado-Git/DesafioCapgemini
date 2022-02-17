package questoes;

import java.util.Scanner;





public class Questao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
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

	}

}
