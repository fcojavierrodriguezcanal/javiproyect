package modelo;

import bbdd.Conexion;
import beans.Cancion;
import beans.Usuario;

import java.io.FileWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Canciones {
	
	//CREACION

	public void agregarCancion(Cancion cancion) {		
		int id_cancion = cancion.getId_cancion();;
		String nombre = cancion.getNombre();;
		String artista = cancion.getArtista();
		String ruta=cancion.getRuta();

			

		Conexion.ejecutarUpdate("INSERT INTO CANCION VALUES ('"+nombre+"', '"+id_cancion+"', '"+artista+"', '"+ruta+"');");	
	}
	

	public ArrayList<Cancion> verCanciones(){

		
		ArrayList<Cancion> canciones = new ArrayList<Cancion>();
		ResultSet resultado = Conexion.ejecutarSentencia("SELECT * FROM CANCION;");
		
		try {
			while(resultado.next()) {
				int id_cancion = resultado.getInt("id_cancion");
				String nombre = resultado.getString("nombre");
				String artista = resultado.getString("artista");
				String ruta = resultado.getString("ruta");
				
				canciones.add(new Cancion(nombre, id_cancion, artista, ruta));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return canciones;
	}

	//BORRAR CANCION
		public void borrarCancion(int id_cancion) {
			Conexion.ejecutarUpdate("DELETE FROM CANCIONES WHERE id_cancion="+id_cancion+";");
		}
	
	//CREACION DE FICHERO
		public void crearFichero(String nombre, int id, String ruta,String artista) {
	        FileWriter fichero = null;

	        try {
	            fichero = new FileWriter(nombre+"nuevaCancion.txt");

	            fichero.write("Nombre: " + nombre + "\nid: " + id+ "\nruta: "+ruta+"\nartista: "+artista);
	            fichero.close();

	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }

	
	
	
	
	
	
	
}