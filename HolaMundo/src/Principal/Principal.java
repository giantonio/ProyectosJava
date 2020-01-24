package Principal;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mensaje="Segundo mensaje del proyecto Hola mundo";
		
		mensajeBienvenida();
		
		System.out.println(mensajePorParametro(mensaje));
		

	}
	
	/**
	 * Muestra por pantalla un mensaje
	 */
	public static void mensajeBienvenida() {
		System.out.println("Primer mensaje del proyecto Hola mundo");
	}
	
	public static String mensajePorParametro(String mensaje) {
		return mensaje;
	}

}
