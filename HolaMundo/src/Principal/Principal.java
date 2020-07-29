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
	
	public static void segundoMensaje() {
		System.out.println("Segundo mensaje");
	}
	
	public static void suma() {
		System.out.println("En este metodo se va a desarrollar una suma");
	}
	
	public static String mensajePorParametro(String mensaje) {
		return mensaje;
	}
	
	/**
	 * Metodo que sumara dos numeros enteros
	 * @param n1
	 * @param n2
	 * @return Valor entero que devolvera la suma de dos numeros
	 */
	public static int suma(int n1,int n2) {
		return n1+n2;
	}
	
	public static String holaMundo(){
		return "Hola mundo";
	}

}
