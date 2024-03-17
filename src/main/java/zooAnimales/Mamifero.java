package zooAnimales;

import java.util.ArrayList;


public class Mamifero extends Animal {
	private static ArrayList<Mamifero> listado= new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		totalAnimales ++;
		listado.add(this);
	}
	public Mamifero(String nombre, int edad, String habitad, String genero, boolean pelaje, int patas) {
		super( nombre, edad,habitad,genero);
		listado.add(this);
		this.pelaje=pelaje;
		this.patas=patas;
	}
	
	public static int cantidadMamiferos() {
		return listado.size();
	}
	
	public static Mamifero crearCaballo(String nombre,int edad,String genero ){
		caballos++;
		return  new Mamifero(nombre, edad, "pradera", genero, true, 4);
	}
	
	
	public static Mamifero crearLeon(String nombre,int edad,String genero ){
		leones ++;
		return  new Mamifero(nombre, edad, "selva", genero, true, 4);
	}
	
	public boolean getPelaje() {
		return pelaje;
	}
	public int getPatas() {
		return patas;
	}
	
}
