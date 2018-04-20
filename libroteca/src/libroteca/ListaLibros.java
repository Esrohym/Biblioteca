package libroteca;
/**
 * Lista de libro de una biblioteca
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaLibros
{
   
    private Libro primero;

    /**
     * Constructor for objects of class ListaNodos
     */
    public ListaLibros()
    {
       
        primero = null;
    }

   
    // Completar los metodos
    
    // Incluye un nuevo libro en la lista
    public void pon( Libro valor){
        valor.setSiguiente(primero);
        primero=valor;
    }
    
    public boolean estaVacia(){
       return ( primero == null );    
        
    }
    
    // Devuelve un libro que es eliminado de la lista o null si no exite
    public Libro quitar ( int id ) {
    	
    	Libro aux1=primero;
    	Libro aux2=primero.getSiguiente();
    	
    	while (aux2!=null) {
    		
    		//verifica si la id es igual a la id del primer elemento 
    		if(aux1.getId()==id) {
    			
    		     primero=primero.getSiguiente();//elimina el primer elemento de la lista
    		     
    		     return aux1;//retorna el elemento borrado
    			
    		}
    		//
    		else if(aux2.getId()==id) {
    			
    			aux1.setSiguiente(aux2.getSiguiente());//borra el elemtno de la lista apuntando el siguiente de aux1 hacia el siguiente de aux2
    			
    			return aux2;//retorna el elemento borrado
    			}
    			else 
    			{
    			
    				aux1=aux1.getSiguiente();
    				aux2=aux2.getSiguiente();
    			
    			}
    	}
    	
    	return null;
    }
   
    // Devuelve el id del libro o -1 si no esta
    public int buscarId ( String titulo ){
    	
    	Libro aux=primero;
    	
    	while (aux!=null) {
    		
    		if(aux.getTitulo().equalsIgnoreCase(titulo)) {
    			
    			return aux.getId();
    			
    		}
    		else {
    			
    			aux=aux.getSiguiente();
    			
    		}
    		
    	}
        
    return -1;
   }
    // Muestra los libros almacenados
    public void verCatalogo (){
    	
    	Libro aux=primero;
    	
    	while(aux!=null) {
    		
    		System.out.println("["+aux.toString()+"]");
    		
    		aux=aux.getSiguiente();
    	}
    	
    }
         
    

}
