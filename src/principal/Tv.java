package principal;

public class Tv {
	private int volumen = 1;
	private Marca marca;
	private boolean estaEncendido;
	
	public Tv(Marca marca, boolean estaEncendido) {
		this.marca = marca;
		this.estaEncendido = estaEncendido;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		if(!esVolumenValido(volumen)) return;
		
		this.volumen = volumen;
	}
	
	private boolean esVolumenValido(int volumen) {
		if(volumen < 0) return false;
		if(volumen > 7) return false;
		
		return true;
	}
}
