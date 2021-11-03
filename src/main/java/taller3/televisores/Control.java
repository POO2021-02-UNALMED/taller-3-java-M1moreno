package taller3.televisores;

public class Control {
	
	private TV tv;
	
	public void setTV (TV tv) {
		this.tv = tv;
	}
	
	public TV getTV() {
		this.enlazar(tv);
		return tv;
	}
	
	public void enlazar (TV tv) {
		tv.setControl(this);
		this.setTV(tv);
	}
	
	public void turnOn() {
		tv.turnOn();;
	}
	
	public void turnOff() {
		tv.turnOff();;
	}
	
	public void canalUp() {
		tv.canalUp();
	}
	
	public void canalDown() {
		tv.canalDown();
	}
	
	public void volumenUp() {
		tv.volumenUp();
	}
	
	public void volumenDown() {
		tv.volumenDown();
	}
	
	public void setCanal (int canal) {
		tv.setCanal(canal);;
	}
}
