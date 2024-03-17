package zooAnimales;
import java.util.Arrays;

import gestion.Zona;
import gestion.Zoologico;

public class Animal {
	
	static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitad;
	private String genero;
	private Zona[] zona;
	
	public Animal(){
		totalAnimales ++;
	}
	
	public Animal(String nombre, int edad, String habitad, String genero){
		this.nombre=nombre;
		this.edad=edad;
		this.habitad=habitad;
		this.genero=genero;
		totalAnimales ++;
	}
	
	public String movimiento(){
	    if(this instanceof Anfibio){
	    	return "saltar";
	    	}
	    else if(this instanceof Ave){
	    	return "volar";
	    	}
	    else if(this instanceof Reptil){
	    	return "reptar";
	    	}
	    else if(this instanceof Pez){
	    	return "nadar";
	    	}
	    else return "desplazarse";
	}
	
	
	public static String totalPorTipo(){ 
		return "Mamiferos: " + Mamifero.cantidadMamiferos()+ "\n"+"Aves: " + Ave.cantidadAves()+ "\n"+"Reptiles: "+Reptil.cantidadReptiles()+"\n"+"Peces: "+Pez.cantidadPeces()+"\n"+"Anfibios: "+Anfibio.cantidadAnfibios();
	}

	@Override
	public String toString() {
		return "Mi nombre es " +nombre +" tengo una edad de " + edad + "habito en" + habitad + " y mi genero es" + genero;
	}

	public static int getTotalAnimales() {
		return totalAnimales;
	}

	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getHabitad() {
		return habitad;
	}

	public void setHabitad(String habitad) {
		this.habitad = habitad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Zona[] getZona() {
		return zona;
	}

	public void setZona(Zona[] zona) {
		this.zona = zona;
	}
	
}