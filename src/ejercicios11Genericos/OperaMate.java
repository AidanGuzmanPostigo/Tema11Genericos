package ejercicios11Genericos;

public class OperaMate<E extends Number> {
	private E element;
	public OperaMate(E element) {
		this.element = element;
	}
	public double reciproco() {
		return 1 / element.doubleValue();
	}
	public double fraccion() {
		return element.doubleValue() - element.intValue();
	}
}
