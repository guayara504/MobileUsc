
public class Operacion {

	public void calcularImc(Persona p) {
		System.out.println("El imc de "+p.getNombre()+" es: "+(p.getPeso()/p.getAltura()*p.getAltura()));
	}
}
