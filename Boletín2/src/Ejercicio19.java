  import java.util.Scanner; 
public class Ejercicio19 {

	public static void main(String[] args) {
		 Scanner sc =new Scanner (System.in);
		 double x=0.0;
		 double y=0.0;
		 double z=0.0;
		 System.out.println("Calculo de área de triangulo");
		 System.out.println("Introduce la base");
			
         x = sc.nextInt();
	        sc.hasNextLine();
	        while (x==0||x<0) {
		    	   System.out.println("La base no puede ser 0 o negativa \n");
		    	   System.out.println("Introduce la base");
		    	   x = sc.nextInt();
		            sc.hasNextLine();
	        }
	        
	        System.out.println("Introduce la altura");
	        y = sc.nextInt();
	        sc.hasNextLine();
	        while (y==0||y<0) {
		    	   System.out.println("la altura no puede ser 0 o negativa \n");
		    	   System.out.println("Introduce la base");
		    	   y = sc.nextInt();
	        }
	        z=((x*y)/2);
	        System.out.println("El triángulo tiene base "+x+" y altura "+y+ " tiene un área de "+z );
	}

}
