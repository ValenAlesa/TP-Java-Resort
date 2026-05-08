package entities;

public class TipoHabitacion {
	@Override
	public String toString() {
		return "TipoHabitacion [id=" + id + ", nombre=" + nombre + ", capacidad=" + capacidad + ", precioNoche="
				+ precioNoche + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public int getPrecioNoche() {
		return precioNoche;
	}
	public void setPrecioNoche(int precioNoche) {
		this.precioNoche = precioNoche;
	}
	private int id;
	private String nombre;
	private int capacidad;
	private int precioNoche;	
}
