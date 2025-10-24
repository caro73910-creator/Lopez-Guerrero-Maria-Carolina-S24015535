import java.util.Scanner;
	public class IngrementoCapital{
	public static void main (String[] args){
	Scanner sc = new Scanner (System.in);
	double capital, incremento;
	System.out.println("Se calculara el incremento de su capital del mes ");
	System.out.println("¿Cuanto fue el capital invertido este mes?");
	capital = sc.nextDouble();
	incremento = (.02 * capital);
	System.out.println("El ingremento del mes es: " + incremento);
	}
}