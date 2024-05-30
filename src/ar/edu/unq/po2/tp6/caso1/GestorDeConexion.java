package ar.edu.unq.po2.tp6.caso1;

public class GestorDeConexion {
	private IServidor servidor;
	
	public GestorDeConexion(IServidor servidor) {
		this.servidor = servidor;
	}
	
	public void conectar(String nombre, String contraseña) {
		servidor.conectar(nombre, contraseña);
	}
	
}
