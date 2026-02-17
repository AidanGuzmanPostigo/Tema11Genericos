package ejercicios11Genericos;
public class NumeroDescripcion extends Numero {
	protected String descripcion;
	public NumeroDescripcion(int num){
		super(num);
		generarDescripcion(num);
	}
	protected void generarDescripcion(int num) {
		descripcion = switch (num){
		case 0 -> "CERO";
	    case 1 -> "UNO";
	    case 2 -> "DOS";
	    case 3 -> "TRES";
	    case 4 -> "CUATRO";
	    case 5 -> "CINCO";
	    case 6 -> "SEIS";
	    case 7 -> "SIETE";
	    case 8 -> "OCHO";
	    case 9 -> "NUEVE";
	    default -> "ERROR";
		};
	}
	@Override
	public String toString() {
		return String.format("%s %s", super.toString(),descripcion);
	}
}
