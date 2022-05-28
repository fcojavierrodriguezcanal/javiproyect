package beans;

public class Usuario {
	private String usuario;
	private String contraseña;
	
	//GETTERS AND SETTERS

	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	
	}

	
	//CONSTRUCTOR
	public Usuario(String usuario, String contraseña) {
		super();
		this.usuario = usuario;
		this.contraseña = contraseña;
	}
}
