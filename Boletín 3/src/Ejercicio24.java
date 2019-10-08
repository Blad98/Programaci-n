import java.util.Scanner; 
public class Ejercicio24 {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
        double a=0.0;
        double b=0.0;
        double c=0.0;
        System.out.println("Introduce a:");
		a = sc.nextInt();
		System.out.println("Introduce b:");
		b = sc.nextInt();
	c= Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
	System.out.println("Hipotenusa:"+c);
	
	}

}
