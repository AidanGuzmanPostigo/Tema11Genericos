package ejercicios11Genericos;

public class Pareja2<E, T extends E> {
	private E element1;
	private T element2;
	public Pareja2(E element1, T element2) {
		this.element1 = element1;
		this.element2 = element2;
	}
	public E getElement1() {
		return element1;
	}
	public T getElement2() {
		return element2;
	}
	public String mostrarTipos() {
		return String.format("El elemento 1 es de tipo %s y el elemento 2 es de tipo %s",element1.getClass(), element2.getClass());
	}
	public boolean mismoTipo() {
		if (element1.getClass() == element2.getClass()) {
			return true;
		}
		return false;
	}
}
