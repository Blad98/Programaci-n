import java.util.Scanner; 
public class Ejercicio16 {

	public static void main(String[] args) {
		 double x =0.0;
         double y=0.0;
         double suma= 0.0;
         double resta=0.0;
         double mult=0.0;
         double coc=0.0;
        		 
        		 
        Scanner sc =new Scanner (System.in);
             
        System.out.println("Introduce el primer valor");
	
           x = sc.nextInt();
	        sc.hasNextLine();
	
	    System.out.println("Introduce el segundo valor");
	
	   
	       y = sc.nextInt();
	       while (y==0) {
	    	   System.out.println("El segundo valor no puede ser 0 \n");
	    	   System.out.println("Introduce el segundo valor");
	    		 y = sc.nextInt();
	       }
	       
	    	   
	       
	       suma=x+y;
	       resta=x-y;
	       mult=x*y;
	       coc=x/y;
	       
	    	
	       System.out.println("Los valores introducidos son "+x+" y "+y);
	       System.out.println("\n  \t      Suma     Resta     Multiplicación      División    ");
	       System.out.println("\n \t -----------------------------------------------------------");
	       System.out.println("\n  \t       "+suma+"      "+ resta +"          "+mult+"             "+coc);
	       System.out.println("\n \t -----------------------------------------------------------");
	       
	       
	    	
	    	   
	    	   
	    	   
	       
	    	
	      
	    	   }
	
	
	}


