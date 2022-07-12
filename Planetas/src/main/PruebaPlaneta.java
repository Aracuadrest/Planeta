package main;

import java.util.Scanner;

import clases.Planeta;
import clases.SistemaSolar;

public class PruebaPlaneta {

	public static void main(String[] args) {
		
		Planeta p1 = new Planeta("Urano",27,86800000000000000000000000d,68300000000000d,50724,300,"GASEOSO",true);
		Planeta p2 = new Planeta("Marte",2,6.41E23,163000000000d,6772,510,"u",true);
	
		SistemaSolar sistema = new SistemaSolar("Sistema Solar");
		Scanner entrada = new Scanner(System.in);
		
		int seguir;
		
		do {
		Planeta p = new Planeta();
		System.out.println("     Creando los planetas");
		System.out.println("-------------------------------");
		System.out.println("Introduce el nombre:");
		String nombre= entrada.nextLine();
		p.setNombre(nombre);
		System.out.println("Introduce la cantida de satélites que tiene:");
		int satelites=entrada.nextInt();
		p.setCantidad_satelites(satelites);
		System.out.println("Introduce la masa en kg:");
		double masa = entrada.nextDouble();
		p.setMasa_kg(masa);
		System.out.println("Introduce el volumen del planeta:");
		double volum=entrada.nextDouble();
		p.setVolumen(volum);
		System.out.println("Introduce el diametro del planeta:");
		int diametro=entrada.nextInt();
		p.setDiametro(diametro);
		System.out.println("Introduce la distancia media con el Sol en millones de km:");
		int distancia=entrada.nextInt();
		p.setDistancia_media_Sol(distancia);
		System.out.println("Introduce el tipo de planeta que es:");
		String tip=entrada.nextLine();
		p.setTipo_planeta(tip);
		sistema.añadirPlaneta(p);
		System.out.println("-------------------------------");
		System.out.println("Quieres introducir más planetas? 1.SI 2.NO");
		 seguir=entrada.nextInt();
		
		}while (seguir==1);
		
		
	
		System.out.println("-------------------------------");
		System.out.println("PLANETA 1:");
		System.out.println(p1);
		System.out.println("-------------------------------");
		System.out.println("PLANETA 2:");
		System.out.println(p2);
	
		System.out.println("-------------------------------");
		System.out.println("La densidad del planeta "+p1.getNombre()+" es: "+p1.densidadPlaneta());
		System.out.println("-------------------------------");
		System.out.println("La densidad del planeta "+p2.getNombre()+" es: "+p2.densidadPlaneta());
		System.out.println("-------------------------------");
		System.out.println("El planeta "+p1.getNombre()+" es exterior?: ");
		System.out.println(p1.esExterior());
		System.out.println("-------------------------------");
		System.out.println("El planeta "+p2.getNombre()+" es exterior?: ");
		System.out.println(p2.esExterior());


		
		

	}

}
