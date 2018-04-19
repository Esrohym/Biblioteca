package libroteca;
/**
 * Clase de libro.
 * 
 * @author (Alberto) 
 * @version (1.0)
 */
public class Libro
{
    
    private int id; // Identificador o clave del libro
    private String titulo;
    private String autor;
    private Genero genero;
    private int edicion;
    
    private Libro siguiente;

    /**
     * Constructor for objects of class Libro
     */
    public Libro( int id, String titulo, String autor, Genero genero, int edicion)
    {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.edicion = edicion;
        this.siguiente = null;
    }
    
    public String toString(){
        return titulo+", "+autor+", "+ genero +", "+ edicion + ".";
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public int getEdicion() {
		return edicion;
	}

	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}

	public Libro getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Libro siguiente) {
		this.siguiente = siguiente;
	}

}
