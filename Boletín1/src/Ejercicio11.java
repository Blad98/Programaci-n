
public class Ejercicio11 {

	public static void main(String[] args) {
		double peso = 80.00;
		double altura=1.79;
		double Indice =0.0;
		Indice =peso/(altura*altura);
		
		if(Indice<18.5) {
			System.out.println("Inferior al normal");
         }
		else if (Indice>=18.5 && Indice<=24.99999) {
			System.out.println("normal");
		}
		else if (Indice>=25 && Indice<=29.99999) {
			System.out.println("Superior");
		}
		else {
			System.out.println("Problemas cardiovasculares");
		}
		System.out.println("El IMC ES ="+Indice);
		}
		}
	
		
	                    

