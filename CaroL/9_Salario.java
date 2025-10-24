import java.util.Scanner;
  	public class Salario{
  	public static void main (String[] args){
  		Scanner sc = new Scanner(System.in);
  		System.out.println("Se calculara su nuevo salario con incremento del 25%"); 
  		System.out.println("¿Cual era su salario anterior? ");
  		int salario = sc.nextInt();
		int nSalario = salario + (salario * 25 / 100);
		System.out.println("Nuevo salario:" + nSalario);		
 	}
  }