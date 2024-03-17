package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal {
	
	private static ArrayList<Anfibio> listado= new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	
	public Anfibio() {
		listado.add(this);
	}
	public Anfibio(String nombre, int edad, String habitad, String genero, String colorPiel, boolean venenoso) {
		super( nombre, edad,habitad,genero);
		listado.add(this);
		this.colorPiel=colorPiel;
		this.venenoso=venenoso;
	}
	
	public static ArrayList<Anfibio> getListado() {
		return listado;
	}
	public static void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado = listado;
	}
	public static int cantidadAnfibios() {
		return listado.size();
	}
	
	public static Anfibio crearRana(String nombre,int edad,String genero ){
		ranas++;
		return  new Anfibio(nombre, edad, "selva", genero, "rojo", true);
	}
	
	
	public static Anfibio crearSalamandra(String nombre,int edad,String genero ){
		salamandras ++;
		return  new Anfibio(nombre, edad, "selvastatic ", genero, "negro y amarillo", false);
	}
	public String getColorPiel() {
		return colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	public String movimiento() {
		return "saltar";
	}

}