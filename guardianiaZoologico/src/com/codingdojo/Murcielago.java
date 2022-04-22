package com.codingdojo;

public class Murcielago extends Mamifero {
	//definiendo los atributos 
	private String nombre;
	//definiendo los constructores 
	public Murcielago(String nombre) {
		super(300);
		this.nombre=nombre;
	}
	//definiendo getter y setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//definiendo los metodos 
	public void volar() {
		System.out.println("GIIAAA!!!! GIIIAAA!!!!.....");
		setNivelDeEnergia(getNivelDeEnergia() - 50);
		System.out.println("El nivel de energia : " + getNivelDeEnergia());
	}
	
	public void comerHumanos(){
		System.out.println("Se comio a un humanoo WAUWAUAWUAJAJAJA");
		setNivelDeEnergia(getNivelDeEnergia() + 25);
		System.out.println("El nivel de energia : " + getNivelDeEnergia());
	}
	
	public void atacarPueblo() {
		System.out.println("Pueblo en llamas CORRANNN!!!!");
		setNivelDeEnergia(getNivelDeEnergia() - 100);
		System.out.println("El nivel de energia : " + getNivelDeEnergia());
	}
}
