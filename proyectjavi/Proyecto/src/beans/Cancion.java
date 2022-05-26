package beans;

public class Cancion {
	private String Nombre;
	private int id_cancion;
	private String artista;
	private String ruta;
	//GETTERS AND SETTERS
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getId_cancion() {
		return id_cancion;
	}
	public void setId_cancion(int id_cancion) {
		this.id_cancion = id_cancion;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getRuta() {
		return ruta;
	}
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	//CONSTRUCTOR
	public Cancion(String nombre, int id_cancion, String artista, String ruta) {
		super();
		Nombre = nombre;
		this.id_cancion = id_cancion;
		this.artista = artista;
		this.ruta = ruta;
	}
	
}
