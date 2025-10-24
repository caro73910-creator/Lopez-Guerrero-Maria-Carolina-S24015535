import java.util.Scanner;
	public class Edad{
		public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		int edad, año;
		System.out.println("Para calcular la edad mencione su año de nacimiento");
		año = sc.nextInt();
		edad = 2025 - año;
		System.out.println("Su edad es: " + edad);
		}
	}