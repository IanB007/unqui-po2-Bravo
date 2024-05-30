package ar.edu.unq.po2.tp6.caso1;

import java.util.ArrayList;

public class ClienteEMail {
	
	 //ServidorPop servidor; viola el Principio de Inversión de Dependencias;
	 IServidor servidor;
	 String nombreUsuario;
	 String passusuario;
	 ArrayList<Correo> inbox;
	 private ArrayList<Correo> borrados;
	
	//Crea el mail del cliente.
	public ClienteEMail(ServidorPop servidor, String nombreUsuario, String pass){
		this.servidor=servidor;
		this.nombreUsuario=nombreUsuario;
		this.passusuario=pass;
		this.inbox = new ArrayList<Correo>();
		this.borrados = new ArrayList<Correo>();
		//this.conectar(); //viola el principio de Responsabilidad Unica ya que el Email no deberia de hacer la conexion...
	}
	
	//Envia al servidor con el que lo vamos a conectar el metodo conectar.
	//Viola el Principio de Inversión de Dependencias, servidor deberia ser de tipo IServidor(interfaz) no de tipo ServidorPop
	/*public void conectar(){
		this.servidor.conectar(this.nombreUsuario,this.passusuario);
	}*/
	
	//Borra un corredo de la casilla inbox y de la casilla de borrados.
	public void borrarCorreo(Correo correo){
		this.inbox.remove(correo);
		this.borrados.remove(correo); //PODRIA SER ---> eliminarBorrado(correo);
	}
	
	//Cuenta los correos en la casilla de borrados.
	public int contarBorrados(){
		return this.borrados.size();
	}
	
	//Cuenta los correos de la casilla inbox.
	public int contarInbox(){
		return this.inbox.size();
	}
	
	//Elimina de la casilla de borrados el correo dado.
	public void eliminarBorrado(Correo correo){
		this.borrados.remove(correo);
	}
	
	public void recibirNuevos(){
		this.servidor.recibirNuevos(this.nombreUsuario, this.passusuario);
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		// se hace en otro lado GestorDeConexion gestor = new GestorDeConexion(servidor); //Para delegar responsabilidad y no violar el SRP;
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		this.servidor.enviar(correo);
	}

}
