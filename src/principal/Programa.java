package principal;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a frase: ");
		String frase = sc.nextLine();
		
		System.out.println("A frase digitada foi: " +"'"+ frase + "'");
		
		sc.close();
	}

}
