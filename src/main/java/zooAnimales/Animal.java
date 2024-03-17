package zooAnimales;

import gestion.Zona;

public class Animal {
	
	static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal(){
		totalAnimales ++;
	}
	
	public Animal(String nombre, int edad, String habitad, String genero){
		this.nombre=nombre;
		this.edad=edad;
		this.habitat=habitad;
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
		if(zona== null) {
		return "Mi nombre es " +this.getNombre() +" tengo una edad de " + this.getEdad() + "habito en" + this.getHabitat() + " y mi genero es" + this.getGenero();
		}
		else {return "Mi nombre es " +this.getNombre() +" tengo una edad de " + this.getEdad() + "habito en" + this.getHabitat() + " y mi genero es" + this.getGenero() + ", lazona en la que me ubico es "+ this.zona.getNombre()+", en el "+ this.zona.getZoo();}
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

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitad) {
		this.habitat = habitad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}
	
}