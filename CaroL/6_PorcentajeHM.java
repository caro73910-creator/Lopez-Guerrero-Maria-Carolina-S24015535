import java.util.Scanner;
	public class PorcentajeHM{
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		int hombres, mujeres, todes;
		double porcentajeH, porcentajeM;
		System.out.println("Se calculara el porcentaje de hombres y mujeres");
		System.out.println("¿Cuantos hombres hay?");
		hombres = sc.nextInt();
		System.out.println("¿Cuantas mujeres hay?");
		mujeres = sc.nextInt();
		todes = hombres + mujeres;
		porcentajeH = (hombres * 100) / todes;
		porcentajeM = (mujeres * 100) / todes;
		System.out.println("El porcentaje de hombres es: " + porcentajeH);
		System.out.println("El porcentaje de mujeres es: " + porcentajeM);
		}
	}