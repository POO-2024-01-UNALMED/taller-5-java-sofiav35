package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
	
	private static ArrayList<Anfibio> listado= new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	
	public Anfibio() {
		totalAnimales ++;
		listado.add (this);
	}
	public Anfibio(String nombre, int edad, String habitad, String genero, String colorPiel, boolean venenoso) {
		super( nombre, edad,habitad,genero);
		listado.add(this);
		this.colorPiel=colorPiel;
		this.venenoso=venenoso;
	}
	
	public static int cantidadAnfibios() {
		return listado.size();
	}
	
	public static Anfibio crearRanas(String nombre,int edad,String genero ){
		ranas++;
		return  new Anfibio(nombre, edad, "selva", genero, "rojo", true);
	}
	
	
	public static Anfibio crearSalamandras(String nombre,int edad,String genero ){
		salamandras ++;
		return  new Anfibio(nombre, edad, "selvastatic ", genero, "negro y amarillo", false);
	}
	
	public String getColorPiel() {
		return colorPiel;
	}
	public boolean getVenenoso() {
		return venenoso;
	}

}