package ejercicios11Genericos;
public enum Bono implements IBono{
	MINIMO{
		@Override
		public double calculo(double precioPorActividad, int numeroActividades){
			return (precioPorActividad*(1.00/3.00))*numeroActividades;
		}
	},
	NORMAL{
		@Override
		public double calculo(double precioPorActividad, int numeroActividades){
			return (precioPorActividad*0.5)*numeroActividades;
		}
	},
	COMPLETO{
		@Override
		public double calculo(double precioPorActividad, int numeroActividades){
			return (precioPorActividad - ((precioPorActividad - (int) precioPorActividad)*2)) * numeroActividades;
		}
	}
}
