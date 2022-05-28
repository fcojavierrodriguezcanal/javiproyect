package modelo;

import bbdd.Conexion;
import beans.Usuario;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.xdevapi.Statement;

public class Usuarios {
	
//CREACION
	public void crearUsuario(Usuario usuario) {

		String nombre = usuario.getUsuario();
		String contrasena = usuario.getContraseña();
		
		Conexion.ejecutarUpdate("INSERT INTO USUARIO (usuario, contrasena)"+ "VALUES ('"+nombre+"','"+contrasena+"');");
	}
	
	

//BORRAR USUARIO
	public void borrarUsuario(String nombre) {
		Conexion.ejecutarUpdate("DELETE FROM LOGIN WHERE usuario="+nombre+";");
	}
}
	
	

	
	