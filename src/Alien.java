public class Alien {
	
	public Alien(){
		
	}
	public Alien(String nombre,Especie queEspecie){
		this.nombre=nombre;
		this.queEspecie=queEspecie;
		
	}
	public Alien(String nombre){
		super();
		this.nombre=nombre;
	}


	public Alien(String nombre, Especie queEspecie, Planeta origen) {
		super();
		this.nombre = nombre;
		this.queEspecie = queEspecie;
		this.origen = origen;
	}

	private String nombre;
	private int idAlien;
	private Especie queEspecie;
	private Planeta origen;
	
 
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getIdAlien() {
		return idAlien;
	}
	public void setIdAlien(int idAlien) {
		this.idAlien = idAlien;
	}
	public Especie getQueEspecie() {
		return queEspecie;
	}
	public void setQueEspecie(Especie queEspecie) {
		this.queEspecie = queEspecie;
	}
	public Planeta getOrigen() {
		return origen;
	}
	public void setOrigen(Planeta origen) {
		this.origen = origen;
	}

public void escupirBaba(int minutos){
	
}
public String toString(){
	return nombre;
	
}
}
