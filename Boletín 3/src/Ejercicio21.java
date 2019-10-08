import java.util.Scanner; 
public class Ejercicio21 {

	public static void main(String[] args) {
	Scanner sc =new Scanner (System.in);
	int num=0;
	double nota1=0.0;
	double nota2=0.0;
	double nota3=0.0;
	String nombre;
System.out.println("Introduce tu nombre: ");
nombre = sc.nextLine();
System.out.println("Introduce tu numero de alumno: ");	
num = sc.nextInt();
sc.nextLine();
System.out.println("Introduce tu primera nota: ");	
nota1 = sc.nextInt();
sc.nextLine();
System.out.println("Introduce tu segunda nota: ");	
nota2 = sc.nextInt();
sc.nextLine();
System.out.println("Introduce tu tercera nota: ");	
nota3 = sc.nextInt();
sc.nextLine();
	

System.out.println("Alumno:"+num+"-"+nombre);
System.out.println("Notas primera evaluación:"+nota1+"-"+nota2+"-"+nota3);
System.out.println("Media:"+((nota1+nota2+nota3)/3));	
	}
}
