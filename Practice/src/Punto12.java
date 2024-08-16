import java.util.Hashtable;

public class Punto12 {

	public static void main(String[] args) {

	        Hashtable<String, String> agendaTelefonos = new Hashtable<>();

	        agendaTelefonos.put("Juan", "555-1234");
	        agendaTelefonos.put("Laura", "555-5678");
	        agendaTelefonos.put("Carlos", "555-8765");

	        System.out.println("Teléfono de Juan: " + agendaTelefonos.get("Juan"));
	        System.out.println("Teléfono de Laura: " + agendaTelefonos.get("Laura"));
	        System.out.println("Teléfono de Carlos: " + agendaTelefonos.get("Carlos"));

	        System.out.println("");
	        
	        Hashtable<String, Double> preciosProductos = new Hashtable<>();

	        preciosProductos.put("Pan", 1.50);
	        preciosProductos.put("Leche", 0.99);
	        preciosProductos.put("Queso", 3.75);

	        System.out.println("Precio del Pan: $" + preciosProductos.get("Pan"));
	        System.out.println("Precio de la Leche: $" + preciosProductos.get("Leche"));
	        System.out.println("Precio del Queso: $" + preciosProductos.get("Queso"));
	        
	        
	        System.out.println("");
	        
	        Hashtable<String, String> diccionario = new Hashtable<>();

	        diccionario.put("Hello", "Hola");
	        diccionario.put("Play", "Jugar");
	        diccionario.put("Book", "Libro");

	        System.out.println("Traducción de 'Hello': " + diccionario.get("Hello"));
	        System.out.println("Traducción de 'Play': " + diccionario.get("Play"));
	        System.out.println("Traducción de 'Book': " + diccionario.get("Book"));
	}

}
