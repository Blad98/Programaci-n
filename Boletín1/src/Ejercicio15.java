
public class Ejercicio15 {

	public static void main(String[] args) {
		double precio= 200.20;
		double iva= 21;
		double ivared =10;
		double ivasred= 4;
		double precioiva =    (precio-(precio*(iva/100)));
		double precioivared = (precio-(precio*(ivared/100)));
		double precioivasred =(precio-(precio*(ivasred/100)));	
		System.out.println("El precio sin IVA es= "+precioiva);
		System.out.println("El precio sin IVA reducido es= "+precioivared);
		System.out.println("El precio sin IVA superreducido es= "+precioivasred);

	}

}
