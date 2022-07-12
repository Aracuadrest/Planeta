package main;

import java.util.Scanner;

import clases.Planeta;
import clases.SistemaSolar;

public class PruebaSistemaSolar {

	public static void main(String[] args) {
		SistemaSolar sistema = new SistemaSolar("Sistema Solar");
		
		Planeta p1 = new Planeta("Urano",27,86800000000000000000000000d,68300000000000d,
				50724,300,"GASEOSO",true);
		
		System.out.println("añadiendo Urano a la lista");
		sistema.añadirPlaneta(p1);
		
		p1 = new Planeta("Marte",2,6.41E23,163000000000d,6772,510,"u",true);

		System.out.println("añadiendo Marte a la lista");
		sistema.añadirPlaneta(p1);
		
		System.out.println("El sistema es: \n"+sistema);
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce nombre del planeta a buscar:");
		String nombre=teclado.nextLine();
		
		Planeta buscar = new Planeta();
		buscar.setNombre(nombre);
		p1= sistema.buscarPlaneta(buscar);
		
		if (p1!=null) {
		System.out.println("Datos: "+buscar);
	} else {
		System.out.println("Planeta no encontrado");
	}
		
		System.out.println("El planeta más denso es: "+sistema.planetaMasDenso());
		
		System.out.println("La masa media de todos los planetas del sistema solar es: "+sistema.masaMediaPlanetas());
		
	}

}
