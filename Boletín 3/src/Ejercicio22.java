import java.util.Scanner; 
public class Ejercicio22 {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
        double salario=0.0;
        double retencion=0.0;
        String NIF;
        String Nombre;
        String fecha;
        String fecha2;
        String fecha3;
        String calle;
        System.out.println("Introduce la fecha en formato DD/MM/AAAA");
        fecha= sc.next();
        fecha2=sc.next();
        fecha3=sc.next();
        sc.nextLine();
        System.out.println("Introduce NIF");
        NIF =sc.nextLine();
        System.out.println("Introduce Salario");
        salario= sc.nextInt();
        System.out.println("Introduce Retención");
        retencion= sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce Nombre");
        Nombre= sc.nextLine();
        System.out.println("Introduce Calle");
        calle= sc.nextLine();
        
        System.out.println("\n \t INFORME DEL TRABAJADOR");
        System.out.println("\n \t -----------------------------------------------------------");
        System.out.println("\n \t NOMBRE..................:"+Nombre);
        System.out.println("\n \t  CALLE..................:"+calle+"\n");
        System.out.println("\n \t NOMBRE..................:"+Nombre);
        System.out.println("\n \t NIF......................:"+NIF);
        System.out.println("\n \t NIF.....................:"+fecha+"/"+fecha2+"/"+fecha3+"\n");
        System.out.println("\n \t Salario....................:"+salario);
        System.out.println("\n \t Retencion....................:"+retencion);
        System.out.println("\n \t Salario Neto..................:"+(salario-(salario*(retencion/100))));;
        
        
        
        
        
        
	}

}
