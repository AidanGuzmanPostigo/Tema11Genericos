package ejercicios11Genericos;
public class Caja<E> {
	private E element;
	public Caja(E element) {
		setElement(element);
	}
	public E getElement(){
		return element;
	}
	public void setElement(E element) {
		this.element = element;
	}
	@Override
	public String toString() {
		return String.format("El tipo de E es %s y su valor %s.", element.getClass().getSimpleName(), getElement());
	}
}
