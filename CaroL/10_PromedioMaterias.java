import java.util.Scanner;
	public class PromedioMaterias{
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		double mat1,mat2, mat3, promG, prom;
		System.out.println("Se calculara promedio general y promedio obtenido de 3 materias");
		System.out.println("¿Cual fue la calificación de la primer materia?");
		mat1 = sc.nextDouble();
		System.out.println("¿Cual fue la calificación de la segunda materia?");
		mat2 = sc.nextDouble();
		System.out.println("¿Cual fue la calificación de la tercera materia?");
		mat3 = sc.nextDouble();
		promG = (mat1 + mat2 + mat3) / 3;
		System.out.println("Su promedio gereral es: " + promG);
		}
	}