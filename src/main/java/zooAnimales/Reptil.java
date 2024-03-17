package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
	private static ArrayList<Reptil> listado= new ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	
	public Reptil() {
		totalAnimales ++;
		listado.add (this);
	}
	public Reptil(String nombre, int edad, String habitad, String genero, String colorEscamas, int largoCola) {
		super( nombre, edad,habitad,genero);
		listado.add(this);
		this.colorEscamas=colorEscamas;
		this.largoCola=largoCola;
	}
	
	public static int cantidadReptiles() {
		return listado.size();
	}
	
	public static Reptil crearIguanas(String nombre,int edad,String genero ){
		iguanas++;
		return  new Reptil(nombre, edad, "humedal", genero, "verde", 3);
	}
	
	
	public static Reptil crearSerpientes(String nombre,int edad,String genero ){
		serpientes ++;
		return  new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	public int getLargoCola() {
		return largoCola;
	}
}