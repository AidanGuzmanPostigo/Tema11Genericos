package ejercicios11Genericos;
import java.util.Arrays;
public class NumeroComplejo extends NumeroDescripcion{
	protected String aux [];
	public NumeroComplejo(int num){
		super(num);
		generarDescripcion(num);
		aux = new String[2];
		crearAuxiliar(descripcion);
	}
	private void crearAuxiliar(String descripcion) {
		aux[0] = switch (descripcion){
		case "CERO" -> "cero";
	    case "UNO" -> "uno";
	    case "DOS" -> "dos";
	    case "TRES" -> "tres";
	    case "CUATRO" -> "cuatro";
	    case "CINCO" -> "cinco";
	    case "SEIS" -> "seis";
	    case "SIETE" -> "siete";
	    case "OCHO" -> "ocho";
	    case "NUEVE" -> "nueve";
	    default -> "error";
		};
		aux[1] = switch (descripcion){
		case "CERO" -> "Cero";
	    case "UNO" -> "Uno";
	    case "DOS" -> "Dos";
	    case "TRES" -> "Tres";
	    case "CUATRO" -> "Cuatro";
	    case "CINCO" -> "Cinco";
	    case "SEIS" -> "Seis";
	    case "SIETE" -> "Siete";
	    case "OCHO" -> "Ocho";
	    case "NUEVE" -> "Nueve";
	    default -> "error";
		};
	}
	public String obtenerDescripcion(boolean minuscula) {
		if (minuscula) {
			return aux[0];
		} else {
			return aux[1];
		}
	}
	@Override
	public String toString(){
		return String.format("%s %s", super.toString(), Arrays.toString(aux));
	}
}
