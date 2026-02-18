package ejercicios11Genericos;
public class Ejercicio5 {
	public void exercise5() {
		AccesoPuntual<Double> a1 = new AccesoPuntual<Double>(Bono.COMPLETO,4.53,5);
		AccesoPuntual<Double> a2 = new AccesoPuntual<Double>(Bono.NORMAL,4.53,5);
		AccesoPuntual<Double> a3 = new AccesoPuntual<Double>(Bono.MINIMO,4.53,5);
		AccesoPuntual<Integer> a4 = new AccesoPuntual<Integer>(Bono.COMPLETO,4,5);
		AccesoPuntual<Integer> a5 = new AccesoPuntual<Integer>(Bono.NORMAL,4,5);
		AccesoPuntual<Integer> a6 = new AccesoPuntual<Integer>(Bono.MINIMO,4,5);
		System.out.println("Accesos puntuales con Double:");
		System.out.printf("\n%s\n%s\n%s\n\n",a1,a2,a3);
		System.out.println("Accesos puntuales con Integer:");
		System.out.printf("\n%s\n%s\n%s\n\n",a4,a5,a6);
	}
	public static void main(String[] args) {
		new Ejercicio5().exercise5();
	}
}