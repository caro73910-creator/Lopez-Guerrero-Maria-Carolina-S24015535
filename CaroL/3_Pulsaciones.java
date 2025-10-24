import java.util.Scanner;
public class Pulsaciones{
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
  		int pul, edad;
  		System.out.println("Se calculara sus pulsaciones dentro de 10 segundos de ejercicio"); 
  		System.out.println("¿Cual es su edad? ");
  		edad = sc.nextInt();
  		pul = (220 - edad)/10; 
  		System.out.println("Sus pulsaciones son: " + pul);
  	}
 }