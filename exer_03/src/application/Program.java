package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

	public class Program {
	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);
	        Student stu = new Student();
	        Locale.setDefault(Locale.US);

	        System.out.print("Nome: ");
	        stu.nome  = entrada.nextLine();
	        System.out.print("Nota primeiro trimestre: ");
	        stu.nota1 = entrada.nextDouble();
	        System.out.print("Nota segundo trimestre: ");
	        stu.nota2 = entrada.nextDouble();
	        System.out.print("Nota terceiro trimestre: ");
	        stu.nota3 = entrada.nextDouble();

	        System.out.printf("Notal FINAL = %.2f%n", stu.total());


	        if (stu.total() >= 60.00) {
	            System.out.println("Passou");
	        } else {
	            System.out.printf("Reprovado %nFalta %.2f Pontos", stu.missing());
	        }
	        entrada.close();

	    }
		
}
