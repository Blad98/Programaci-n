import java.util.Scanner; 
public class Ejercicio17 {

	public static void main(String[] args) {
		double MB =0.0;
		double b = 0.0;
		double kb =0.0;
		double GB =0.0;
		double TB =0.0;
		
		
		 
		Scanner sc =new Scanner (System.in);
		System.out.println("Introduce el valor en megabytes");
		 MB = sc.nextInt();
		 
		 kb=MB*1024;
		 b=kb*1024;
		 GB=MB/1024;
		 TB=GB/1024;
		 
		 System.out.println("\n \t byte   Kylobyte   Megabyte   Gigabyte   Terabyte");
		 System.out.println("\n \t -----------------------------------------------------------");
		 System.out.println("\n  \t "+b+"  "+ kb +"    "+MB+"   "+GB+"  "+TB);
		 System.out.println("\n \t -----------------------------------------------------------");
	}

}
