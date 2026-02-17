package ejercicios11Genericos;
public class Ejercicio2 {
	public void exercise2() {
		Pareja<String, Integer> pareja1 = new Pareja<String, Integer>("caja1",2);
		Pareja<Vehicle, Vehicle> pareja2 = new Pareja<Vehicle, Vehicle>(new Vehicle(2,"Azul"),new Vehicle(4,"Verde"));
		Pareja<String, String> pareja3 = new Pareja<String, String>("elemento1","elemento2");
		Pareja<Person, Vehicle> pareja4 = new Pareja<Person, Vehicle>(new Person("Pepe",28,1.68f,"Fontanero",1500f),new Vehicle(2,"rojo"));
		System.out.printf("Pareja 1:\n%s\n%s\n\n",pareja1.mostrarTipos(),pareja1.mismoTipo()?"Sí, son el mismo tipo.":"No, no son del mismo tipo.");
		System.out.printf("Pareja 2:\n%s\n%s\n\n",pareja2.mostrarTipos(),pareja2.mismoTipo()?"Sí, son el mismo tipo.":"No, no son del mismo tipo.");
		System.out.printf("Pareja 3:\n%s\n%s\n\n",pareja3.mostrarTipos(),pareja3.mismoTipo()?"Sí, son el mismo tipo.":"No, no son del mismo tipo.");
		System.out.printf("Pareja 4:\n%s\n%s\n\n",pareja4.mostrarTipos(),pareja4.mismoTipo()?"Sí, son el mismo tipo.":"No, no son del mismo tipo.");
		
	}
	public static void main(String[] args) {
		new Ejercicio2().exercise2();
	}
}