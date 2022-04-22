package com.codingdojo;

public class TestGorila {
	
	public static void main(String args[]) {
		//GORILA GIGANTE
		System.out.println("GORILA GIGANTE !!!!!!!!!!111");
		Gorila gorila1 = new Gorila(100,"martin");
		//el gorila arroja 2 veces algo
		gorila1.lanzarAlgo();
		gorila1.lanzarAlgo();
		gorila1.lanzarAlgo();
		//el gorila come 2 veces
		gorila1.comerBananas();
		gorila1.comerBananas();
		//el gorila trepa una vez 
		gorila1.escalar();
		
		//DEFINIENDO AL MURCIELAGO GIGANTE
		System.out.println("MURCIELAGO GIGANTE !!!!!!!!!!!!!!");
		Murcielago murcielago1 = new Murcielago("Batman");
		//ataca tres pueblos 
		murcielago1.atacarPueblo();
		murcielago1.atacarPueblo();
		murcielago1.atacarPueblo();
		//coma dos humanos
		murcielago1.comerHumanos();
		murcielago1.comerHumanos();
		//vuele dos veces 
		murcielago1.volar();
		murcielago1.volar();
 	}
}
