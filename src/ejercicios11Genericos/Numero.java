package ejercicios11Genericos;
public class Numero{
	protected static int contadorEstatico=0; 
	protected int num, contadorDinamico;
	public Numero (int num) {
		setNum(num);
		contadorDinamico  = ++contadorEstatico;
	}
	public void setNum(int num)  {
		this.num  = num;
	}
	@Override
	public String toString() {
		return String.format("%s%d%s",num,ordenCreacion());
	}
	public String ordenCreacion() {
		return String.format("Mi orden de creación es: %d", contadorDinamico);
	}
} 