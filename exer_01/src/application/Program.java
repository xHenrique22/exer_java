package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Rectangle retangulo = new Rectangle();
		System.out.println("Insira a largura: ");
		retangulo.width= sc.nextDouble();
		System.out.println("Insira a altura: ");
		retangulo.height= sc.nextDouble();
		
		System.out.println(retangulo);
		
		
		sc.close();
	}

}
