package ejercicios11Genericos;
public class Ejercicio1 {
	public void exercise1() {
		Caja<String> caja1 = new Caja<String>("caja1");
		Caja<Vehicle> caja2 = new Caja<Vehicle>(new Vehicle(2,"Azul"));
		Caja<Vehicle> caja3 = new Caja<Vehicle>(new Vehicle(4,"Verde"));
		Caja<Person> caja4 = new Caja<Person>(new Person("Pepe",28,1.68f,"Fontanero",1500f));
		System.out.println(caja1);
		System.out.println(caja2);
		System.out.println(caja3);
		System.out.println(caja4);
	}
	public static void main(String[] args) {
		new Ejercicio1().exercise1();
	}
}