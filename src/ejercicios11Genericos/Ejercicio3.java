package ejercicios11Genericos;
public class Ejercicio3 {
	public void exercise3() {
		Pareja2<Numero, NumeroSimple> pareja1 = new Pareja2<Numero, NumeroSimple>(new Numero(1), new NumeroSimple(2));
		Pareja2<Vehicle, Vehicle> pareja2 = new Pareja2<Vehicle, Vehicle>(new Vehicle(2,"Azul"),new Vehicle(4,"Verde"));
		Pareja2<String, String> pareja3 = new Pareja2<String, String>("elemento1","elemento2");
		Pareja2<Numero, NumeroComplejo> pareja4 = new Pareja2<Numero, NumeroComplejo>(new Numero(3), new NumeroComplejo(3));
		Pareja2<NumeroSimple, NumeroSimple> pareja5 = new Pareja2<NumeroSimple,NumeroSimple>(new NumeroSimple(5), new NumeroSimple(6));
		System.out.printf("Pareja 1:\n%s\n%s\n\n",pareja1.mostrarTipos(),pareja1.mismoTipo()?"Sí, son el mismo tipo.":"No, no son del mismo tipo.");
		System.out.printf("Pareja 2:\n%s\n%s\n\n",pareja2.mostrarTipos(),pareja2.mismoTipo()?"Sí, son el mismo tipo.":"No, no son del mismo tipo.");
		System.out.printf("Pareja 3:\n%s\n%s\n\n",pareja3.mostrarTipos(),pareja3.mismoTipo()?"Sí, son el mismo tipo.":"No, no son del mismo tipo.");
		System.out.printf("Pareja 4:\n%s\n%s\n\n",pareja4.mostrarTipos(),pareja4.mismoTipo()?"Sí, son el mismo tipo.":"No, no son del mismo tipo.");
		System.out.printf("Pareja 5:\n%s\n%s\n\n",pareja5.mostrarTipos(),pareja5.mismoTipo()?"Sí, son el mismo tipo.":"No, no son del mismo tipo.");
		
	}
	public static void main(String[] args) {
		new Ejercicio3().exercise3();
	}
}