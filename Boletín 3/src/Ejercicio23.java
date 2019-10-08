import java.util.Scanner; 
public class Ejercicio23 {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
        int a=0;
        int b=0;
        int c=0;
        double x1=0.0;
		double x2=0.0;
		System.out.println("Introduce a:");
		a = sc.nextInt();
		System.out.println("Introduce b:");
		b = sc.nextInt();
		System.out.println("Introduce c:");
		c = sc.nextInt();
		
		
   x1=((-b+(Math.sqrt((b^2)-(4*a*c))))/(2*a));
   x2=((-b-(Math.sqrt((b^2)-(4*a*c))))/(2*a));
 System.out.println("Las soluciones son"+" "+x1+" "+"y"+" "+x2);
	
	
	
	}

}
