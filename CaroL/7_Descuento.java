import java.util.Scanner;
	public class Descuento{
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		double total, descuento, pago;
		System.out.println("En cada compra se realizara el descuento del 15%");
		System.out.println("¿Cuanto fue el total de su compra?");
		total = sc.nextDouble();
		descuento = (.15 * total);
		pago = total - descuento;
		System.out.println("El total a pagar es: " + pago);
		}
	}