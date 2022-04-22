package com.codingdojo;

public class Mamifero {
	//definiendo los atributos
	private int nivelDeEnergia;
	//definiendo el constructor
	public Mamifero(int nivelDeEnergia) {
		this.nivelDeEnergia = nivelDeEnergia;
	}
	//definiendo los getter y setter
	public int getNivelDeEnergia() {
		return nivelDeEnergia;
	}
	public void setNivelDeEnergia(int nivelDeEnergia) {
		this.nivelDeEnergia = nivelDeEnergia;
	}
	//definiendo el metodo mostrar energia
	
	public int mostrarEnergia() {
		System.out.println("El nivel de energia es: " + getNivelDeEnergia());
		return getNivelDeEnergia();
	}
}
