package polimosphism;

import java.util.Scanner;

public class Mundial_App {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingresa clave del equipo: ");
		String clav=sc.nextLine();
		
		System.out.println("Ingresa nombre del eqipo: ");
		String nom=sc.nextLine();
		
		System.out.println("Ingresa cantidad de jugadores: ");
		int cant=sc.nextInt();
		
		Template<String,Integer,String> equipo1 = new Template<>(nom,cant,clav);

		System.out.println("Nombre del equipo "+equipo1.getvariable1()+"\nCantidad de jugadores: "+equipo1.getvariable2e()
		+"\nClave: "+equipo1.getvariable3());
		sc.close();
	}
}
