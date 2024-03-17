package gestion;

import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
	
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales= new ArrayList<Animal>();
	
	public Zona() {
		}
	public Zona(String nombre, Zoologico zoo) {
		this.nombre=nombre;
		this.zoo=zoo;
	}
	
	public void agregarAnimales(Animal nuevoAnimal) {
		animales.add(nuevoAnimal);
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}
	
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public Zoologico getZoologico(){
		return zoo;
	}
	public void setZoologio(Zoologico zoo) {
		this.zoo=zoo;
	}
	
}
