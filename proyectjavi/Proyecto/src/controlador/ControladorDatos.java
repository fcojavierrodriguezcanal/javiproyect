package controlador;

import modelo.Canciones;
import modelo.Usuarios;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import beans.Cancion;
import beans.Usuario;

public class ControladorDatos {

	
	public static ArrayList<Cancion> recargarCanciones() {
		ArrayList<Cancion> canciones = new Canciones().verCanciones();
		return canciones;
	}

		public void crearCancion(Cancion cancion) {
			new Canciones().agregarCancion(cancion);
			JOptionPane.showMessageDialog(null, "Has añadido correctamente la cancion "+ cancion);
		}
		

		public void borrarCancion(int id_cancion) {
			new Canciones().borrarCancion(id_cancion);
			JOptionPane.showMessageDialog(null, "¡Has borrado correctamente el producto!");
		}


		public static void crearUsuario(Usuario usuario) {
			new Usuarios().crearUsuario(usuario);
			JOptionPane.showMessageDialog(null, "Felicidades te creaste un usuario en nuestra aplicacion");
		}

		public void borrarUsuario(String nombre){
			new Usuarios().borrarUsuario(nombre);
			JOptionPane.showMessageDialog(null, "¡Has borrado correctamente el usuario: "+ nombre);
		}

		//CREACION DE FICHERO
		public void crearFicheroCancion(String nombre, int id, String ruta,String artista) {
            new Canciones().crearFichero(nombre, id, ruta, artista);
        }
}
