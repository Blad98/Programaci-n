import java.util.Scanner; 
public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		String Nombre;
		String NIF;
		String Calle;
		double Pdescuento =0.0;
		double Total=0.0;
		
		String Concepto;
		double cantidad= 0.0;
		double Precio = 0.0;
		double Importe =0.0;
		String Concepto1;
		double cantidad1= 0.0;
		double Precio1 = 0.0;
		double Importe1 =0.0;
		String Concepto2;
		double cantidad2= 0.0;
		double Precio2 = 0.0;
		double Importe2 =0.0;
		String Concepto3;
		double cantidad3= 0.0;
		double Precio3 = 0.0;
		double Importe3 =0.0;
		String Concepto4;
		double cantidad4= 0.0;
		double Precio4 = 0.0;
		double Importe4 =0.0;
		
		System.out.println("Introduce nombre:");
		Nombre = sc.nextLine();
		System.out.println("Introduce NIF:");
		NIF = sc.nextLine();
		System.out.println("Introduce calle:");
		Calle = sc.nextLine();
		System.out.println("Introduce descuento:");
		Pdescuento = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Introduce el concepto 1:");
		Concepto = sc.nextLine();
		System.out.println("Introduce la cantidad 1:");
		cantidad = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Introduce precio 1:");
		Precio = sc.nextInt();
		sc.nextLine();
		
		
		
		System.out.println("Introduce el concepto 2:");
		Concepto1 = sc.nextLine();
		
		System.out.println("Introduce la cantidad 2:");
		cantidad1 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Introduce precio 2:");
		Precio1 = sc.nextInt();
		sc.nextLine();
		
		
		
		System.out.println("Introduce el concepto 3:");
		Concepto2 = sc.nextLine();
		
		System.out.println("Introduce la cantidad 3:");
		cantidad2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Introduce precio 3:");
		Precio2 = sc.nextInt();
		sc.nextLine();
		
		
		System.out.println("Introduce el concepto 4:");
		Concepto3 = sc.nextLine();
		
		System.out.println("Introduce la cantidad 4:");
		cantidad3 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Introduce precio 4:");
		Precio3 = sc.nextInt();
		sc.nextLine();
		
		
		
		System.out.println("Introduce el concepto 5:");
		Concepto4 = sc.nextLine();
		
		System.out.println("Introduce la cantidad 5:");
		cantidad4 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Introduce precio 5:");
		Precio4 = sc.nextInt();
		sc.nextLine();
		
		
		System.out.println("NIF:"+NIF);
		System.out.println("\nNombre:"+Nombre);
		System.out.println("\nCalle :"+Calle );
		Importe=Precio*cantidad;
		System.out.println("\nConcepto:"+Concepto+" "+"Cantidad "+cantidad+" "+"Precio "+Precio+" "+"Importe "+Importe);
		Importe1=Precio1*cantidad1;
		 System.out.println("\n \t -----------------------------------------------------------");
		System.out.println("Concepto:"+Concepto1+" "+"Cantidad "+cantidad1+" "+"Precio "+Precio1+" "+"Importe "+Importe1);
		Importe2=Precio2*cantidad2;
		 System.out.println("\n \t -----------------------------------------------------------");
		System.out.println("Concepto:"+Concepto2+" "+"Cantidad "+cantidad2+" "+"Precio "+Precio2+" "+"Importe "+Importe2);
		Importe3=Precio3*cantidad3;
		 System.out.println("\n \t -----------------------------------------------------------");
		System.out.println("Concepto:"+Concepto3+" "+"Cantidad "+cantidad3+" "+"Precio "+Precio3+" "+"Importe "+Importe3);
		Importe4=Precio4*cantidad4;
		 System.out.println("\n \t -----------------------------------------------------------");
		System.out.println("Concepto:"+Concepto4+" "+"Cantidad "+cantidad4+" "+"Precio "+Precio4+" "+"Importe "+Importe4);
	    Total=Importe+Importe1+Importe2+Importe3+Importe4;
	    System.out.println("\n \t -----------------------------------------------------------");
	    System.out.println("\tTota:"+Total);
	    System.out.println("\tDescuento: "+Pdescuento+"%");
	    System.out.println("\tTotal con descuento:"+(Total-(Total*(Pdescuento/100))));
	}
	
	
	
	
	
	

}
