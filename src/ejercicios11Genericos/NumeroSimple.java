package ejercicios11Genericos;
public class NumeroSimple extends Numero{
	public NumeroSimple(int num) {
		super(num);
	}
	public void incremento() {
		num++;
		if (num > 9) {
			num = 0;
		}
	}
}