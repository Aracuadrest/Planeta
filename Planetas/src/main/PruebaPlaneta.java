package main;

import clases.Planeta;

public class PruebaPlaneta {

	public static void main(String[] args) {
		
		Planeta p1 = new Planeta("Urano",27,86800000000000000000000000d,68300000000000d,50724,300,"GASEOSO",true);
		Planeta p2 = new Planeta("Marte",2,6567.66,163000000000d,6772,510,"u",true);
		
		System.out.println("     Creando los planetas");
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
