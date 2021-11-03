package taller3.televisores;

public class TV {
	
	private static int numTV;
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	
	public TV (Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
	}
	
	public void setMarca (Marca marca) {
		this.marca = marca;
	}
	
	public Marca getMarca() {
		return marca;
	}
	
	public void setControl (Control control) {
		this.control = control;
	}
	
	public Control getControl() {
		return control;
	}
	
	public void setPrecio (int precio) {
		this.precio = precio;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setVolumen (int volumen) {
		this.volumen = volumen;
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public void setCanal (int canal) {
		this.canal = canal;
	}
	
	public int getCanal() {
		return canal;
	}
	
	public int getNumTV() {
		return numTV;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void turnOn() {
		estado = true;
	}
	
	public void turnOff() {
		estado = false;
	}
	
	public void canalUp() {
		if (estado && canal >= 1 && canal <= 120) {
			canal++;
		}
	}
	
	public void canalDown() {
		if (estado && canal >= 1 && canal <= 120) {
			canal--;
		}
	}
	
	public void volumenUp() {
		if (estado && volumen >= 0 && volumen <= 7) {
			volumen++;
		}
	}
	
	public void volumenDown() {
		if (estado && volumen >= 0 && volumen <= 7) {
			volumen--;
		}
	}
}
