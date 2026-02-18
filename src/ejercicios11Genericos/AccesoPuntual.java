package ejercicios11Genericos;

public class AccesoPuntual<T extends Number> {
	private Bono bono;
	private T precioPorActividad;
	private int numeroActividades;
	public AccesoPuntual(Bono bono, T precioPorActividad, int numeroActividades) {
		this.bono = bono;
		this.precioPorActividad  = precioPorActividad;
		this.numeroActividades = numeroActividades;
	}
	public Bono getBono() {
		return bono;
	}
	public T getPrecioPorActividad() {
		return precioPorActividad;
	}
	public int getNumeroActividades() {
		return numeroActividades;
	}
	public double calcularPrecio() {
		return bono.calculo(precioPorActividad.doubleValue(), numeroActividades);
	}
	@Override
	public String toString() {
		return String.format("Bono: %s Precio por actividad: %.2f Número de actividades: %d Precio total: %.2f", (getBono().name().charAt(0)+getBono().name().substring(1).toLowerCase()),getPrecioPorActividad().doubleValue(),getNumeroActividades(), calcularPrecio());
	}
}
