package com.codingdojo;

public class TestGorila {
	
	public static void main(String args[]) {
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
 	}
}
