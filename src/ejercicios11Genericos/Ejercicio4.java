package ejercicios11Genericos;
public class Ejercicio4 {
	public void exercise4() {
		OperaMate<Integer> objeto1 = new OperaMate<Integer>(23);
		OperaMate<Double> objeto2 = new OperaMate<Double>(2.3);
		OperaMate<Double> objeto3 = new OperaMate<Double>(23.3);
		OperaMate<Double> objeto4 = new OperaMate<Double>(233.3);
		System.out.printf("Objeto 1: \nRecíproco:%f\nParte fraccionaria:%.3f\n\n",objeto1.reciproco(),objeto1.fraccion());
		System.out.printf("Objeto 2: \nRecíproco:%f\nParte fraccionaria:%.3f\n\n",objeto2.reciproco(),objeto2.fraccion());
		System.out.printf("Objeto 3: \nRecíproco:%f\nParte fraccionaria:%.3f\n\n",objeto3.reciproco(),objeto3.fraccion());
		System.out.printf("Objeto 4: \nRecíproco:%f\nParte fraccionaria:%.3f\n\n",objeto4.reciproco(),objeto4.fraccion());
	}
	public static void main(String[] args) {
		new Ejercicio4().exercise4();
	}
}