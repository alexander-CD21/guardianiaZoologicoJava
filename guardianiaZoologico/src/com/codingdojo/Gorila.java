package com.codingdojo;

public class Gorila extends Mamifero {
	//definiendo los atributos
	private String nombre;

	//definiendo el constructor
	public Gorila(int nivelDeEnergia, String nombre) {
		super(nivelDeEnergia);
		this.nombre = nombre;
	}
	
	//definiendo los getter y setter 

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//definiendo los metodos de gorila 
	//definiendo el metodo lanzarAlgo()

	public void lanzarAlgo() {
		System.out.println("El gorila arrojo algo ...");
		setNivelDeEnergia( getNivelDeEnergia() -  5 );
		System.out.println("El nivel de energia : " + getNivelDeEnergia());
	}
	
	public void comerBananas() {
		System.out.println("El gorila esta comiendo ...");
		setNivelDeEnergia( getNivelDeEnergia() + 10 );
		System.out.println("El nivel de energia : " + getNivelDeEnergia());
	}
	
	public void escalar() {
		System.out.println("El gorila ha trepado un arbol ...");
		setNivelDeEnergia( getNivelDeEnergia() - 10 );
		System.out.println("El nivel de energia : " + getNivelDeEnergia());
	}
}
