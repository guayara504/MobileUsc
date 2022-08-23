import java.util.Scanner;

/**
 * 
 */

/**
 * @author Study
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner se =  new Scanner(System.in);
		System.out.println("Ingre el nombre de la persona: ");
		Persona p = new Persona();
		System.out.println("Ingrese el nombre:");
		p.setNombre(se.nextLine());
		System.out.println("Ingrese la altura en metros: ");
		p.setAltura(se.nextDouble());
		System.out.println("Ingrese el peso en kg: ");
		p.setPeso(se.nextDouble());
		Operacion o= new Operacion();
		o.calcularImc(p);
	}

}
